grammar lo17SqlGrammar;

SELECT : 'vouloir' | 'afficher' | 'trouver' | 'recuperer' | 'donner' | 'quel'
;

COUNT : 'combien' | 'nombre'
;

ARTICLE : 'article'
;

BULLETIN : 'bulletin'
;

TITRE	: 'titre' | 'sujet'
;

TEXTE: 'texte'
;

RUBRIQUE: 'catégorie' | 'rubrique' | 'thème'
;

AUTEUR: 'auteur' | 'écrire' | 'auteur avoir écrire'
;

DATE: 'quand' | 'quel date' | 'publier' | 'paraître' | 'paru'
;

CONJET : 'et'
;

CONJOU : 'ou'
;

POINT : '.'
;

MOT : 'mot' | 'contenir' | 'parler' | 'traiter'
;
 
WS  : (' ' |'\t' | '\r' | 'je' | 'qui' | 'dont') {skip();} | '\n' 
;

VAR : ('A'..'Z' | 'a'..'z'|'\u00a0'..'\u00ff')(('a'..'z')|('0'..'9')|'-'|('\u00a0'..'\u00ff'))+
;

listerequetes returns [String sql = ""]
	@init	{Arbre lr_arbre;}: 
		r = requete POINT
			{
				lr_arbre = $r.req_arbre;
				sql = lr_arbre.sortArbre();
			}
;

requete returns [Arbre req_arbre = new Arbre("")]
	@init {Arbre ps_arbre;} :
	// 
	SELECT ARTICLE MOT ps=params {
		req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
		req_arbre.ajouteFils(new Arbre("","article"));
		req_arbre.ajouteFils(new Arbre("","FROM titreresume"));
		req_arbre.ajouteFils(new Arbre("","WHERE"));
		ps_arbre = $ps.les_pars_arbre;
		req_arbre.ajouteFils(ps_arbre);
	}
	| SELECT ARTICLE MOT ps=params {
		req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
		req_arbre.ajouteFils(new Arbre("","article"));
		req_arbre.ajouteFils(new Arbre("","FROM titreresume"));
		req_arbre.ajouteFils(new Arbre("","WHERE"));
		ps_arbre = $ps.les_pars_arbre;
		req_arbre.ajouteFils(ps_arbre);
	}
;

params returns [Arbre les_pars_arbre = new Arbre("")]
	@init	{Arbre par1_arbre, par2_arbre;} : 
		par1 = param 
			{
				par1_arbre = $par1.lepar_arbre;
				les_pars_arbre.ajouteFils(par1_arbre);
			}
		(CONJOU par2 = param
			{
				par2_arbre = $par2.lepar_arbre;
				les_pars_arbre.ajouteFils(new Arbre("", "OR"));
				les_pars_arbre.ajouteFils(par2_arbre);
			}
		| CONJET par2 = param
			{
				par2_arbre = $par2.lepar_arbre;
				les_pars_arbre.ajouteFils(new Arbre("", "AND"));
				les_pars_arbre.ajouteFils(par2_arbre);
			}
		)*
;

param returns [Arbre lepar_arbre = new Arbre("")] :
	a = VAR
		{ lepar_arbre.ajouteFils(new Arbre("mot =", "'"+a.getText()+"'"));}
;

