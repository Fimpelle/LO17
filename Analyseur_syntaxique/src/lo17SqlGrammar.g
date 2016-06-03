grammar lo17SqlGrammar;

SELECT : 'vouloir' | 'afficher' | 'trouve' | 'recuperer' | 'donner' | 'quel'
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

MOT : 'mot' | 'contenir' | 'parler' | 'trait'
;
 
WS  : (' ' |'\t' | '\r' | 'je' | 'qui' | 'dont') {skip();} | '\n' 
;

VAR : ('A'..'Z' | 'a'..'z'|'\u00a0'..'\u00ff')(('a'..'z')|('0'..'9')|'-'|('\u00a0'..'\u00ff'))+
;

listerequetes returns [String sql = ""]
	@init	{Arbre lr_arbre;}: 
		r = requete
			{
				lr_arbre = $r.req_arbre;
				sql = lr_arbre.sortArbre();
			}
;

requete returns [Arbre req_arbre = new Arbre("")]
	@init {Arbre ps_arbre;} :
	
	// Je veux les articles qui parlent de X
	SELECT? ARTICLE MOT ps=params {
		req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
		req_arbre.ajouteFils(new Arbre("","fichier"));
		req_arbre.ajouteFils(new Arbre("","FROM titretext"));
		req_arbre.ajouteFils(new Arbre("","WHERE"));
		ps_arbre = $ps.les_pars_arbre;
		req_arbre.ajouteFils(ps_arbre);
	}
	// Je veux les bulletins qui parlent de X
	| SELECT? BULLETIN MOT ps=params {
		req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
		req_arbre.ajouteFils(new Arbre("","numero"));
		req_arbre.ajouteFils(new Arbre("","FROM titretext"));
		req_arbre.ajouteFils(new Arbre("","WHERE"));
		ps_arbre = $ps.les_pars_arbre;
		req_arbre.ajouteFils(ps_arbre);
	}
	// nomber d'articles contenant le mot X
	| SELECT? COUNT ARTICLE MOT ps=params {
		req_arbre.ajouteFils(new Arbre("","SELECT COUNT(DISTINCT fichier)"));
		req_arbre.ajouteFils(new Arbre("","FROM titretext"));
		req_arbre.ajouteFils(new Arbre("","WHERE"));
		ps_arbre = $ps.les_pars_arbre;
		req_arbre.ajouteFils(ps_arbre);
	}  
	// nombre de bulletins contenant le mot X
	| SELECT? COUNT BULLETIN MOT ps=params {
		req_arbre.ajouteFils(new Arbre("","SELECT COUNT(DISTINCT numero)"));
		req_arbre.ajouteFils(new Arbre("","FROM titretext"));
		req_arbre.ajouteFils(new Arbre("","WHERE"));
		ps_arbre = $ps.les_pars_arbre;
		req_arbre.ajouteFils(ps_arbre);
	}
	// Quels sont les articles qui ont pour sujet X
	| SELECT? ARTICLE TITRE ps=params {
		req_arbre.ajouteFils(new Arbre("","SELECT"));
		req_arbre.ajouteFils(new Arbre("","fichier"));
		req_arbre.ajouteFils(new Arbre("","FROM titre"));
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

