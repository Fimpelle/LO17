grammar lo17SqlGrammar;

SELECT : 'vouloir' | 'afficher' | 'trouve' | 'recuperer' | 'donner' | 'quel'
;

EVERY : 'tous'
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

RUBRIQUE: 'categorie' | 'rubrique' | 'theme'
;

AUTEUR: 'auteur' | 'ecrire' | 'auteur avoir ecrire'
;

DATE: 'quand' | 'quel date' | 'publi' | 'paraitre' | 'paru'
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

ANNEE  	:  ('0'..'9')('0'..'9')('0'..'9')('0'..'9')
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
	SELECT? ARTICLE MOT ps=paramsMot {
		req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
		req_arbre.ajouteFils(new Arbre("","fichier"));
		req_arbre.ajouteFils(new Arbre("","FROM titretext"));
		req_arbre.ajouteFils(new Arbre("","WHERE"));
		ps_arbre = $ps.les_pars_arbre;
		req_arbre.ajouteFils(ps_arbre);
	}
	// Je veux les bulletins qui parlent de X
	| SELECT? BULLETIN MOT ps=paramsMot {
		req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
		req_arbre.ajouteFils(new Arbre("","numero"));
		req_arbre.ajouteFils(new Arbre("","FROM titretext"));
		req_arbre.ajouteFils(new Arbre("","WHERE"));
		ps_arbre = $ps.les_pars_arbre;
		req_arbre.ajouteFils(ps_arbre);
	}
	// nomber d'articles contenant le mot X
	| SELECT? COUNT ARTICLE MOT ps=paramsMot {
		req_arbre.ajouteFils(new Arbre("","SELECT COUNT(DISTINCT fichier)"));
		req_arbre.ajouteFils(new Arbre("","FROM titretext"));
		req_arbre.ajouteFils(new Arbre("","WHERE"));
		ps_arbre = $ps.les_pars_arbre;
		req_arbre.ajouteFils(ps_arbre);
	}  
	// nombre de bulletins contenant le mot X
	| SELECT? COUNT BULLETIN MOT ps=paramsMot {
		req_arbre.ajouteFils(new Arbre("","SELECT COUNT(DISTINCT numero)"));
		req_arbre.ajouteFils(new Arbre("","FROM titretext"));
		req_arbre.ajouteFils(new Arbre("","WHERE"));
		ps_arbre = $ps.les_pars_arbre;
		req_arbre.ajouteFils(ps_arbre);
	}
	// Quels sont les articles qui ont pour sujet X
	| SELECT? ARTICLE TITRE ps=paramsMot {
		req_arbre.ajouteFils(new Arbre("","SELECT"));
		req_arbre.ajouteFils(new Arbre("","fichier"));
		req_arbre.ajouteFils(new Arbre("","FROM titre"));
		req_arbre.ajouteFils(new Arbre("","WHERE"));
		ps_arbre = $ps.les_pars_arbre;
		req_arbre.ajouteFils(ps_arbre);
	}
	// Je veux (tous) les articles
	| SELECT? EVERY? ARTICLE {
		req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
		req_arbre.ajouteFils(new Arbre("","fichier"));
		req_arbre.ajouteFils(new Arbre("","FROM numero"));
	}
	// Je veux (tous) les bulletins
	| SELECT? EVERY? BULLETIN {
		req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
		req_arbre.ajouteFils(new Arbre("","numero"));
		req_arbre.ajouteFils(new Arbre("","FROM numero"));
	}
	// Je veux tous les articles écrits en (telle année)
	| SELECT? ARTICLE AUTEUR ps=paramsAnnee {
		req_arbre.ajouteFils(new Arbre("","SELECT"));
		req_arbre.ajouteFils(new Arbre("","fichier"));
		req_arbre.ajouteFils(new Arbre("","FROM date"));
		req_arbre.ajouteFils(new Arbre("","WHERE"));
		ps_arbre = $ps.les_pars_arbre;
		req_arbre.ajouteFils(ps_arbre);
	}
	// Je veux tous les bulletins écrits en (telle année)
	| SELECT? BULLETIN AUTEUR ps=paramsAnnee {
		req_arbre.ajouteFils(new Arbre("","SELECT"));
		req_arbre.ajouteFils(new Arbre("","numero"));
		req_arbre.ajouteFils(new Arbre("","FROM date"));
		req_arbre.ajouteFils(new Arbre("","WHERE"));
		ps_arbre = $ps.les_pars_arbre;
		req_arbre.ajouteFils(ps_arbre);
	}
	// Je veux tous les articles écrits entre (telle année) et (telle autre année)
	| SELECT? ARTICLE AUTEUR 'entre' annee1=paramAnneeBetween annee2=paramAnneeBetween{
		req_arbre.ajouteFils(new Arbre("","SELECT"));
		req_arbre.ajouteFils(new Arbre("","fichier"));
		req_arbre.ajouteFils(new Arbre("","FROM date"));
		req_arbre.ajouteFils(new Arbre("","WHERE annee BETWEEN"));
		ps_arbre = $annee1.lepar_arbre;
		req_arbre.ajouteFils(ps_arbre);
		req_arbre.ajouteFils(new Arbre("","AND"));
		ps_arbre = $annee2.lepar_arbre;
		req_arbre.ajouteFils(ps_arbre);
	}
	// Je veux tous les bulletins écrits entre (telle année) et (telle autre année)
	| SELECT? BULLETIN AUTEUR 'entre' annee1=paramAnneeBetween annee2=paramAnneeBetween{
		req_arbre.ajouteFils(new Arbre("","SELECT"));
		req_arbre.ajouteFils(new Arbre("","numero"));
		req_arbre.ajouteFils(new Arbre("","FROM date"));
		req_arbre.ajouteFils(new Arbre("","WHERE annee BETWEEN"));
		ps_arbre = $annee1.lepar_arbre;
		req_arbre.ajouteFils(ps_arbre);
		req_arbre.ajouteFils(new Arbre("","AND"));
		ps_arbre = $annee2.lepar_arbre;
		req_arbre.ajouteFils(ps_arbre);
	}
;

paramsMot returns [Arbre les_pars_arbre = new Arbre("")]
	@init	{Arbre par1_arbre, par2_arbre;} : 
		par1 = paramMot 
			{
				par1_arbre = $par1.lepar_arbre;
				les_pars_arbre.ajouteFils(par1_arbre);
			}
		(CONJOU par2 = paramMot
			{
				par2_arbre = $par2.lepar_arbre;
				les_pars_arbre.ajouteFils(new Arbre("", "OR"));
				les_pars_arbre.ajouteFils(par2_arbre);
			}
		| CONJET par2 = paramMot
			{
				par2_arbre = $par2.lepar_arbre;
				les_pars_arbre.ajouteFils(new Arbre("", "AND"));
				les_pars_arbre.ajouteFils(par2_arbre);
			}
		)*
;

paramMot returns [Arbre lepar_arbre = new Arbre("")] :
	a = VAR
		{ lepar_arbre.ajouteFils(new Arbre("mot =", "'"+a.getText()+"'"));}
;


paramsAnnee returns [Arbre les_pars_arbre = new Arbre("")]
	@init	{Arbre par1_arbre, par2_arbre;} : 
		par1 = paramAnnee 
			{
				par1_arbre = $par1.lepar_arbre;
				les_pars_arbre.ajouteFils(par1_arbre);
			}
		(CONJOU par2 = paramAnnee
			{
				par2_arbre = $par2.lepar_arbre;
				les_pars_arbre.ajouteFils(new Arbre("", "OR"));
				les_pars_arbre.ajouteFils(par2_arbre);
			}
		| CONJET par2 = paramAnnee
			{
				par2_arbre = $par2.lepar_arbre;
				les_pars_arbre.ajouteFils(new Arbre("", "AND"));
				les_pars_arbre.ajouteFils(par2_arbre);
			}
		)*
;

paramAnnee returns [Arbre lepar_arbre = new Arbre("")] :
	a = ANNEE
		{ lepar_arbre.ajouteFils(new Arbre("annee =", "'"+a.getText()+"'"));}
;

paramAnneeBetween returns [Arbre lepar_arbre = new Arbre("")] :
	a = ANNEE
		{ lepar_arbre.ajouteFils(new Arbre("'"+a.getText()+"'"));}
;