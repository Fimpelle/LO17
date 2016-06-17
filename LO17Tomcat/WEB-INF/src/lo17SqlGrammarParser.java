// $ANTLR 3.5.1 C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g 2016-06-17 12:35:22

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class lo17SqlGrammarParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ANNEE", "ARTICLE", "AUTEUR", 
		"AVOIR", "BULLETIN", "CONJET", "CONJOU", "COUNT", "DATE", "ENTRE", "EVERY", 
		"MOT", "RUBRIQUE", "SELECT", "TEXTE", "TITRE", "VAR", "WS"
	};
	public static final int EOF=-1;
	public static final int ANNEE=4;
	public static final int ARTICLE=5;
	public static final int AUTEUR=6;
	public static final int AVOIR=7;
	public static final int BULLETIN=8;
	public static final int CONJET=9;
	public static final int CONJOU=10;
	public static final int COUNT=11;
	public static final int DATE=12;
	public static final int ENTRE=13;
	public static final int EVERY=14;
	public static final int MOT=15;
	public static final int RUBRIQUE=16;
	public static final int SELECT=17;
	public static final int TEXTE=18;
	public static final int TITRE=19;
	public static final int VAR=20;
	public static final int WS=21;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public lo17SqlGrammarParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public lo17SqlGrammarParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return lo17SqlGrammarParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g"; }



	// $ANTLR start "listerequetes"
	// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:57:1: listerequetes returns [String sql = \"\"] : r= requete ;
	public final String listerequetes() throws RecognitionException {
		String sql =  "";


		Arbre r =null;

		Arbre lr_arbre;
		try {
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:58:25: (r= requete )
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:59:3: r= requete
			{
			pushFollow(FOLLOW_requete_in_listerequetes357);
			r=requete();
			state._fsp--;


							lr_arbre = r;
							sql = lr_arbre.sortArbre();
						
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return sql;
	}
	// $ANTLR end "listerequetes"



	// $ANTLR start "requete"
	// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:66:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( SELECT )* ( ARTICLE ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | RUBRIQUE ARTICLE ( AVOIR )? MOT ps= paramsMot | BULLETIN ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ARTICLE ( AVOIR )? ( TITRE ps= paramsMot ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( AVOIR )? TITRE ps= paramsMot ) | BULLETIN ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ARTICLE ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | BULLETIN ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ARTICLE ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | BULLETIN ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ARTICLE ( AVOIR )? MOT ps= paramsMot | ARTICLE ( AVOIR )? RUBRIQUE MOT ps= paramsRubrique | BULLETIN ( AVOIR )? RUBRIQUE MOT ps= paramsRubrique | BULLETIN ( AVOIR )? MOT ps= paramsMot | COUNT ARTICLE ( AVOIR )? MOT ps= paramsMot | COUNT BULLETIN ( AVOIR )? MOT ps= paramsMot | ARTICLE ( AVOIR )? TITRE ps= paramsMot | ( EVERY )? ARTICLE | ( EVERY )? BULLETIN | ARTICLE ( AVOIR )? AUTEUR ps= paramsAnnee | BULLETIN ( AVOIR )? AUTEUR ps= paramsAnnee | ARTICLE ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | BULLETIN ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ) ;
	public final Arbre requete() throws RecognitionException {
		Arbre req_arbre =  new Arbre("");


		Arbre ps =null;
		Arbre psAnnee =null;
		Arbre annee1 =null;
		Arbre annee2 =null;

		Arbre ps_arbre;
		try {
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:67:26: ( ( SELECT )* ( ARTICLE ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | RUBRIQUE ARTICLE ( AVOIR )? MOT ps= paramsMot | BULLETIN ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ARTICLE ( AVOIR )? ( TITRE ps= paramsMot ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( AVOIR )? TITRE ps= paramsMot ) | BULLETIN ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ARTICLE ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | BULLETIN ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ARTICLE ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | BULLETIN ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ARTICLE ( AVOIR )? MOT ps= paramsMot | ARTICLE ( AVOIR )? RUBRIQUE MOT ps= paramsRubrique | BULLETIN ( AVOIR )? RUBRIQUE MOT ps= paramsRubrique | BULLETIN ( AVOIR )? MOT ps= paramsMot | COUNT ARTICLE ( AVOIR )? MOT ps= paramsMot | COUNT BULLETIN ( AVOIR )? MOT ps= paramsMot | ARTICLE ( AVOIR )? TITRE ps= paramsMot | ( EVERY )? ARTICLE | ( EVERY )? BULLETIN | ARTICLE ( AVOIR )? AUTEUR ps= paramsAnnee | BULLETIN ( AVOIR )? AUTEUR ps= paramsAnnee | ARTICLE ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | BULLETIN ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ) )
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:79:2: ( SELECT )* ( ARTICLE ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | RUBRIQUE ARTICLE ( AVOIR )? MOT ps= paramsMot | BULLETIN ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ARTICLE ( AVOIR )? ( TITRE ps= paramsMot ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( AVOIR )? TITRE ps= paramsMot ) | BULLETIN ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ARTICLE ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | BULLETIN ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ARTICLE ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | BULLETIN ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ARTICLE ( AVOIR )? MOT ps= paramsMot | ARTICLE ( AVOIR )? RUBRIQUE MOT ps= paramsRubrique | BULLETIN ( AVOIR )? RUBRIQUE MOT ps= paramsRubrique | BULLETIN ( AVOIR )? MOT ps= paramsMot | COUNT ARTICLE ( AVOIR )? MOT ps= paramsMot | COUNT BULLETIN ( AVOIR )? MOT ps= paramsMot | ARTICLE ( AVOIR )? TITRE ps= paramsMot | ( EVERY )? ARTICLE | ( EVERY )? BULLETIN | ARTICLE ( AVOIR )? AUTEUR ps= paramsAnnee | BULLETIN ( AVOIR )? AUTEUR ps= paramsAnnee | ARTICLE ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | BULLETIN ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween )
			{
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:79:2: ( SELECT )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==SELECT) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:79:2: SELECT
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete404); 
					}
					break;

				default :
					break loop1;
				}
			}

			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:79:10: ( ARTICLE ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | RUBRIQUE ARTICLE ( AVOIR )? MOT ps= paramsMot | BULLETIN ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ARTICLE ( AVOIR )? ( TITRE ps= paramsMot ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( AVOIR )? TITRE ps= paramsMot ) | BULLETIN ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ARTICLE ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | BULLETIN ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ARTICLE ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | BULLETIN ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ARTICLE ( AVOIR )? MOT ps= paramsMot | ARTICLE ( AVOIR )? RUBRIQUE MOT ps= paramsRubrique | BULLETIN ( AVOIR )? RUBRIQUE MOT ps= paramsRubrique | BULLETIN ( AVOIR )? MOT ps= paramsMot | COUNT ARTICLE ( AVOIR )? MOT ps= paramsMot | COUNT BULLETIN ( AVOIR )? MOT ps= paramsMot | ARTICLE ( AVOIR )? TITRE ps= paramsMot | ( EVERY )? ARTICLE | ( EVERY )? BULLETIN | ARTICLE ( AVOIR )? AUTEUR ps= paramsAnnee | BULLETIN ( AVOIR )? AUTEUR ps= paramsAnnee | ARTICLE ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | BULLETIN ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween )
			int alt62=22;
			alt62 = dfa62.predict(input);
			switch (alt62) {
				case 1 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:79:11: ARTICLE ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot )
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete408); 
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:79:19: ( AVOIR )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==AVOIR) ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:79:19: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete410); 
							}
							break;

					}

					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:79:26: ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot )
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==TITRE) ) {
						alt7=1;
					}
					else if ( (LA7_0==AUTEUR) ) {
						alt7=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 7, 0, input);
						throw nvae;
					}

					switch (alt7) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:79:27: TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee
							{
							match(input,TITRE,FOLLOW_TITRE_in_requete414); 
							pushFollow(FOLLOW_paramsMot_in_requete418);
							ps=paramsMot();
							state._fsp--;

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:79:46: ( CONJET )?
							int alt3=2;
							int LA3_0 = input.LA(1);
							if ( (LA3_0==CONJET) ) {
								alt3=1;
							}
							switch (alt3) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:79:46: CONJET
									{
									match(input,CONJET,FOLLOW_CONJET_in_requete420); 
									}
									break;

							}

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:79:54: ( AVOIR )?
							int alt4=2;
							int LA4_0 = input.LA(1);
							if ( (LA4_0==AVOIR) ) {
								alt4=1;
							}
							switch (alt4) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:79:54: AVOIR
									{
									match(input,AVOIR,FOLLOW_AVOIR_in_requete423); 
									}
									break;

							}

							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete426); 
							pushFollow(FOLLOW_paramsAnnee_in_requete430);
							psAnnee=paramsAnnee();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:79:90: AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot
							{
							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete434); 
							pushFollow(FOLLOW_paramsAnnee_in_requete438);
							psAnnee=paramsAnnee();
							state._fsp--;

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:79:117: ( CONJET )?
							int alt5=2;
							int LA5_0 = input.LA(1);
							if ( (LA5_0==CONJET) ) {
								alt5=1;
							}
							switch (alt5) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:79:117: CONJET
									{
									match(input,CONJET,FOLLOW_CONJET_in_requete440); 
									}
									break;

							}

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:79:125: ( AVOIR )?
							int alt6=2;
							int LA6_0 = input.LA(1);
							if ( (LA6_0==AVOIR) ) {
								alt6=1;
							}
							switch (alt6) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:79:125: AVOIR
									{
									match(input,AVOIR,FOLLOW_AVOIR_in_requete443); 
									}
									break;

							}

							match(input,TITRE,FOLLOW_TITRE_in_requete446); 
							pushFollow(FOLLOW_paramsMot_in_requete450);
							ps=paramsMot();
							state._fsp--;

							}
							break;

					}


							req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
							req_arbre.ajouteFils(new Arbre("","titre.fichier"));
							req_arbre.ajouteFils(new Arbre("","FROM date"));
							req_arbre.ajouteFils(new Arbre("","JOIN titre ON date.fichier = titre.fichier"));
							req_arbre.ajouteFils(new Arbre("","WHERE"));
							ps_arbre = ps;
							req_arbre.ajouteFils(ps_arbre);
							req_arbre.ajouteFils(new Arbre("","AND"));
							ps_arbre = psAnnee;
							req_arbre.ajouteFils(ps_arbre);
						
					}
					break;
				case 2 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:91:4: RUBRIQUE ARTICLE ( AVOIR )? MOT ps= paramsMot
					{
					match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete458); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete460); 
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:91:21: ( AVOIR )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==AVOIR) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:91:21: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete462); 
							}
							break;

					}

					match(input,MOT,FOLLOW_MOT_in_requete465); 
					pushFollow(FOLLOW_paramsMot_in_requete469);
					ps=paramsMot();
					state._fsp--;


							req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT rubrique"));
							req_arbre.ajouteFils(new Arbre("","FROM titretext"));
							req_arbre.ajouteFils(new Arbre("","WHERE"));
							ps_arbre = ps;
							req_arbre.ajouteFils(ps_arbre);
						
					}
					break;
				case 3 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:101:4: BULLETIN ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot )
					{
					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete482); 
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:101:13: ( AVOIR )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==AVOIR) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:101:13: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete484); 
							}
							break;

					}

					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:101:20: ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot )
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==TITRE) ) {
						alt14=1;
					}
					else if ( (LA14_0==AUTEUR) ) {
						alt14=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 14, 0, input);
						throw nvae;
					}

					switch (alt14) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:101:21: TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee
							{
							match(input,TITRE,FOLLOW_TITRE_in_requete488); 
							pushFollow(FOLLOW_paramsMot_in_requete492);
							ps=paramsMot();
							state._fsp--;

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:101:40: ( CONJET )?
							int alt10=2;
							int LA10_0 = input.LA(1);
							if ( (LA10_0==CONJET) ) {
								alt10=1;
							}
							switch (alt10) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:101:40: CONJET
									{
									match(input,CONJET,FOLLOW_CONJET_in_requete494); 
									}
									break;

							}

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:101:48: ( AVOIR )?
							int alt11=2;
							int LA11_0 = input.LA(1);
							if ( (LA11_0==AVOIR) ) {
								alt11=1;
							}
							switch (alt11) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:101:48: AVOIR
									{
									match(input,AVOIR,FOLLOW_AVOIR_in_requete497); 
									}
									break;

							}

							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete500); 
							pushFollow(FOLLOW_paramsAnnee_in_requete504);
							psAnnee=paramsAnnee();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:101:84: AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot
							{
							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete508); 
							pushFollow(FOLLOW_paramsAnnee_in_requete512);
							psAnnee=paramsAnnee();
							state._fsp--;

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:101:111: ( CONJET )?
							int alt12=2;
							int LA12_0 = input.LA(1);
							if ( (LA12_0==CONJET) ) {
								alt12=1;
							}
							switch (alt12) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:101:111: CONJET
									{
									match(input,CONJET,FOLLOW_CONJET_in_requete514); 
									}
									break;

							}

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:101:119: ( AVOIR )?
							int alt13=2;
							int LA13_0 = input.LA(1);
							if ( (LA13_0==AVOIR) ) {
								alt13=1;
							}
							switch (alt13) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:101:119: AVOIR
									{
									match(input,AVOIR,FOLLOW_AVOIR_in_requete517); 
									}
									break;

							}

							match(input,TITRE,FOLLOW_TITRE_in_requete520); 
							pushFollow(FOLLOW_paramsMot_in_requete524);
							ps=paramsMot();
							state._fsp--;

							}
							break;

					}


							req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
							req_arbre.ajouteFils(new Arbre("","titre.fichier"));
							req_arbre.ajouteFils(new Arbre("","FROM date"));
							req_arbre.ajouteFils(new Arbre("","JOIN titre ON date.fichier = titre.fichier"));
							req_arbre.ajouteFils(new Arbre("","WHERE"));
							ps_arbre = ps;
							req_arbre.ajouteFils(ps_arbre);
							req_arbre.ajouteFils(new Arbre("","AND"));
							ps_arbre = psAnnee;
							req_arbre.ajouteFils(ps_arbre);
						
					}
					break;
				case 4 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:116:4: ARTICLE ( AVOIR )? ( TITRE ps= paramsMot ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( AVOIR )? TITRE ps= paramsMot )
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete538); 
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:116:12: ( AVOIR )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==AVOIR) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:116:12: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete540); 
							}
							break;

					}

					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:116:19: ( TITRE ps= paramsMot ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( AVOIR )? TITRE ps= paramsMot )
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==TITRE) ) {
						alt18=1;
					}
					else if ( (LA18_0==AUTEUR) ) {
						alt18=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 18, 0, input);
						throw nvae;
					}

					switch (alt18) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:116:20: TITRE ps= paramsMot ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween
							{
							match(input,TITRE,FOLLOW_TITRE_in_requete544); 
							pushFollow(FOLLOW_paramsMot_in_requete548);
							ps=paramsMot();
							state._fsp--;

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:116:39: ( AVOIR )?
							int alt16=2;
							int LA16_0 = input.LA(1);
							if ( (LA16_0==AVOIR) ) {
								alt16=1;
							}
							switch (alt16) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:116:39: AVOIR
									{
									match(input,AVOIR,FOLLOW_AVOIR_in_requete550); 
									}
									break;

							}

							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete553); 
							match(input,ENTRE,FOLLOW_ENTRE_in_requete555); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete559);
							annee1=paramAnneeBetween();
							state._fsp--;

							match(input,CONJET,FOLLOW_CONJET_in_requete561); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete565);
							annee2=paramAnneeBetween();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:116:118: AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( AVOIR )? TITRE ps= paramsMot
							{
							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete569); 
							match(input,ENTRE,FOLLOW_ENTRE_in_requete571); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete575);
							annee1=paramAnneeBetween();
							state._fsp--;

							match(input,CONJET,FOLLOW_CONJET_in_requete577); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete581);
							annee2=paramAnneeBetween();
							state._fsp--;

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:116:188: ( AVOIR )?
							int alt17=2;
							int LA17_0 = input.LA(1);
							if ( (LA17_0==AVOIR) ) {
								alt17=1;
							}
							switch (alt17) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:116:188: AVOIR
									{
									match(input,AVOIR,FOLLOW_AVOIR_in_requete583); 
									}
									break;

							}

							match(input,TITRE,FOLLOW_TITRE_in_requete586); 
							pushFollow(FOLLOW_paramsMot_in_requete590);
							ps=paramsMot();
							state._fsp--;

							}
							break;

					}


							req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
							req_arbre.ajouteFils(new Arbre("","titre.fichier"));
							req_arbre.ajouteFils(new Arbre("","FROM date"));
							req_arbre.ajouteFils(new Arbre("","JOIN titre ON date.fichier = titre.fichier"));
							req_arbre.ajouteFils(new Arbre("","WHERE"));
							ps_arbre = ps;
							req_arbre.ajouteFils(ps_arbre);
							req_arbre.ajouteFils(new Arbre("","AND annee BETWEEN"));
							ps_arbre = annee1;
							req_arbre.ajouteFils(ps_arbre);
							req_arbre.ajouteFils(new Arbre("","AND"));
							ps_arbre = annee2;
							req_arbre.ajouteFils(ps_arbre);
						
					}
					break;
				case 5 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:134:4: BULLETIN ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? TITRE ps= paramsMot )
					{
					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete604); 
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:134:13: ( AVOIR )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==AVOIR) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:134:13: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete606); 
							}
							break;

					}

					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:134:20: ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? TITRE ps= paramsMot )
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==TITRE) ) {
						alt24=1;
					}
					else if ( (LA24_0==AUTEUR) ) {
						alt24=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 24, 0, input);
						throw nvae;
					}

					switch (alt24) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:134:21: TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween
							{
							match(input,TITRE,FOLLOW_TITRE_in_requete610); 
							pushFollow(FOLLOW_paramsMot_in_requete614);
							ps=paramsMot();
							state._fsp--;

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:134:40: ( CONJET )?
							int alt20=2;
							int LA20_0 = input.LA(1);
							if ( (LA20_0==CONJET) ) {
								alt20=1;
							}
							switch (alt20) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:134:40: CONJET
									{
									match(input,CONJET,FOLLOW_CONJET_in_requete616); 
									}
									break;

							}

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:134:48: ( AVOIR )?
							int alt21=2;
							int LA21_0 = input.LA(1);
							if ( (LA21_0==AVOIR) ) {
								alt21=1;
							}
							switch (alt21) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:134:48: AVOIR
									{
									match(input,AVOIR,FOLLOW_AVOIR_in_requete619); 
									}
									break;

							}

							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete622); 
							match(input,ENTRE,FOLLOW_ENTRE_in_requete624); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete628);
							annee1=paramAnneeBetween();
							state._fsp--;

							match(input,CONJET,FOLLOW_CONJET_in_requete630); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete634);
							annee2=paramAnneeBetween();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:134:127: AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? TITRE ps= paramsMot
							{
							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete638); 
							match(input,ENTRE,FOLLOW_ENTRE_in_requete640); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete644);
							annee1=paramAnneeBetween();
							state._fsp--;

							match(input,CONJET,FOLLOW_CONJET_in_requete646); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete650);
							annee2=paramAnneeBetween();
							state._fsp--;

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:134:197: ( CONJET )?
							int alt22=2;
							int LA22_0 = input.LA(1);
							if ( (LA22_0==CONJET) ) {
								alt22=1;
							}
							switch (alt22) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:134:197: CONJET
									{
									match(input,CONJET,FOLLOW_CONJET_in_requete652); 
									}
									break;

							}

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:134:205: ( AVOIR )?
							int alt23=2;
							int LA23_0 = input.LA(1);
							if ( (LA23_0==AVOIR) ) {
								alt23=1;
							}
							switch (alt23) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:134:205: AVOIR
									{
									match(input,AVOIR,FOLLOW_AVOIR_in_requete655); 
									}
									break;

							}

							match(input,TITRE,FOLLOW_TITRE_in_requete658); 
							pushFollow(FOLLOW_paramsMot_in_requete662);
							ps=paramsMot();
							state._fsp--;

							}
							break;

					}


							req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
							req_arbre.ajouteFils(new Arbre("","titre.fichier"));
							req_arbre.ajouteFils(new Arbre("","FROM date"));
							req_arbre.ajouteFils(new Arbre("","JOIN titre ON date.fichier = titre.fichier"));
							req_arbre.ajouteFils(new Arbre("","WHERE"));
							ps_arbre = ps;
							req_arbre.ajouteFils(ps_arbre);
							req_arbre.ajouteFils(new Arbre("","AND annee BETWEEN"));
							ps_arbre = annee1;
							req_arbre.ajouteFils(ps_arbre);
							req_arbre.ajouteFils(new Arbre("","AND"));
							ps_arbre = annee2;
							req_arbre.ajouteFils(ps_arbre);
						
					}
					break;
				case 6 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:156:4: ARTICLE ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot )
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete684); 
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:156:12: ( AVOIR )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==AVOIR) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:156:12: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete686); 
							}
							break;

					}

					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:156:19: ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot )
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==MOT) ) {
						alt30=1;
					}
					else if ( (LA30_0==AUTEUR) ) {
						alt30=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 30, 0, input);
						throw nvae;
					}

					switch (alt30) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:156:20: MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee
							{
							match(input,MOT,FOLLOW_MOT_in_requete690); 
							pushFollow(FOLLOW_paramsMot_in_requete694);
							ps=paramsMot();
							state._fsp--;

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:156:37: ( CONJET )?
							int alt26=2;
							int LA26_0 = input.LA(1);
							if ( (LA26_0==CONJET) ) {
								alt26=1;
							}
							switch (alt26) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:156:37: CONJET
									{
									match(input,CONJET,FOLLOW_CONJET_in_requete696); 
									}
									break;

							}

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:156:45: ( AVOIR )?
							int alt27=2;
							int LA27_0 = input.LA(1);
							if ( (LA27_0==AVOIR) ) {
								alt27=1;
							}
							switch (alt27) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:156:45: AVOIR
									{
									match(input,AVOIR,FOLLOW_AVOIR_in_requete699); 
									}
									break;

							}

							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete702); 
							pushFollow(FOLLOW_paramsAnnee_in_requete706);
							psAnnee=paramsAnnee();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:156:81: AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot
							{
							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete710); 
							pushFollow(FOLLOW_paramsAnnee_in_requete714);
							psAnnee=paramsAnnee();
							state._fsp--;

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:156:108: ( CONJET )?
							int alt28=2;
							int LA28_0 = input.LA(1);
							if ( (LA28_0==CONJET) ) {
								alt28=1;
							}
							switch (alt28) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:156:108: CONJET
									{
									match(input,CONJET,FOLLOW_CONJET_in_requete716); 
									}
									break;

							}

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:156:116: ( AVOIR )?
							int alt29=2;
							int LA29_0 = input.LA(1);
							if ( (LA29_0==AVOIR) ) {
								alt29=1;
							}
							switch (alt29) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:156:116: AVOIR
									{
									match(input,AVOIR,FOLLOW_AVOIR_in_requete719); 
									}
									break;

							}

							match(input,MOT,FOLLOW_MOT_in_requete722); 
							pushFollow(FOLLOW_paramsMot_in_requete726);
							ps=paramsMot();
							state._fsp--;

							}
							break;

					}


							req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
							req_arbre.ajouteFils(new Arbre("","titretext.fichier"));
							req_arbre.ajouteFils(new Arbre("","FROM date"));
							req_arbre.ajouteFils(new Arbre("","JOIN titretext ON date.fichier = titretext.fichier"));
							req_arbre.ajouteFils(new Arbre("","WHERE"));
							ps_arbre = ps;
							req_arbre.ajouteFils(ps_arbre);
							req_arbre.ajouteFils(new Arbre("","AND"));
							ps_arbre = psAnnee;
							req_arbre.ajouteFils(ps_arbre);
						
					}
					break;
				case 7 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:171:4: BULLETIN ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot )
					{
					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete740); 
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:171:13: ( AVOIR )?
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==AVOIR) ) {
						alt31=1;
					}
					switch (alt31) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:171:13: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete742); 
							}
							break;

					}

					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:171:20: ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot )
					int alt36=2;
					int LA36_0 = input.LA(1);
					if ( (LA36_0==MOT) ) {
						alt36=1;
					}
					else if ( (LA36_0==AUTEUR) ) {
						alt36=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 36, 0, input);
						throw nvae;
					}

					switch (alt36) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:171:21: MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee
							{
							match(input,MOT,FOLLOW_MOT_in_requete746); 
							pushFollow(FOLLOW_paramsMot_in_requete750);
							ps=paramsMot();
							state._fsp--;

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:171:38: ( CONJET )?
							int alt32=2;
							int LA32_0 = input.LA(1);
							if ( (LA32_0==CONJET) ) {
								alt32=1;
							}
							switch (alt32) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:171:38: CONJET
									{
									match(input,CONJET,FOLLOW_CONJET_in_requete752); 
									}
									break;

							}

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:171:46: ( AVOIR )?
							int alt33=2;
							int LA33_0 = input.LA(1);
							if ( (LA33_0==AVOIR) ) {
								alt33=1;
							}
							switch (alt33) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:171:46: AVOIR
									{
									match(input,AVOIR,FOLLOW_AVOIR_in_requete755); 
									}
									break;

							}

							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete758); 
							pushFollow(FOLLOW_paramsAnnee_in_requete762);
							psAnnee=paramsAnnee();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:171:82: AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot
							{
							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete766); 
							pushFollow(FOLLOW_paramsAnnee_in_requete770);
							psAnnee=paramsAnnee();
							state._fsp--;

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:171:109: ( CONJET )?
							int alt34=2;
							int LA34_0 = input.LA(1);
							if ( (LA34_0==CONJET) ) {
								alt34=1;
							}
							switch (alt34) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:171:109: CONJET
									{
									match(input,CONJET,FOLLOW_CONJET_in_requete772); 
									}
									break;

							}

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:171:117: ( AVOIR )?
							int alt35=2;
							int LA35_0 = input.LA(1);
							if ( (LA35_0==AVOIR) ) {
								alt35=1;
							}
							switch (alt35) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:171:117: AVOIR
									{
									match(input,AVOIR,FOLLOW_AVOIR_in_requete775); 
									}
									break;

							}

							match(input,MOT,FOLLOW_MOT_in_requete778); 
							pushFollow(FOLLOW_paramsMot_in_requete782);
							ps=paramsMot();
							state._fsp--;

							}
							break;

					}


							req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
							req_arbre.ajouteFils(new Arbre("","titretext.fichier"));
							req_arbre.ajouteFils(new Arbre("","FROM date"));
							req_arbre.ajouteFils(new Arbre("","JOIN titretext ON date.fichier = titretext.fichier"));
							req_arbre.ajouteFils(new Arbre("","WHERE"));
							ps_arbre = ps;
							req_arbre.ajouteFils(ps_arbre);
							req_arbre.ajouteFils(new Arbre("","AND"));
							ps_arbre = psAnnee;
							req_arbre.ajouteFils(ps_arbre);
						
					}
					break;
				case 8 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:186:4: ARTICLE ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot )
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete796); 
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:186:12: ( AVOIR )?
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0==AVOIR) ) {
						alt37=1;
					}
					switch (alt37) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:186:12: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete798); 
							}
							break;

					}

					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:186:19: ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot )
					int alt42=2;
					int LA42_0 = input.LA(1);
					if ( (LA42_0==MOT) ) {
						alt42=1;
					}
					else if ( (LA42_0==AUTEUR) ) {
						alt42=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 42, 0, input);
						throw nvae;
					}

					switch (alt42) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:186:20: MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween
							{
							match(input,MOT,FOLLOW_MOT_in_requete802); 
							pushFollow(FOLLOW_paramsMot_in_requete806);
							ps=paramsMot();
							state._fsp--;

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:186:37: ( CONJET )?
							int alt38=2;
							int LA38_0 = input.LA(1);
							if ( (LA38_0==CONJET) ) {
								alt38=1;
							}
							switch (alt38) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:186:37: CONJET
									{
									match(input,CONJET,FOLLOW_CONJET_in_requete808); 
									}
									break;

							}

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:186:45: ( AVOIR )?
							int alt39=2;
							int LA39_0 = input.LA(1);
							if ( (LA39_0==AVOIR) ) {
								alt39=1;
							}
							switch (alt39) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:186:45: AVOIR
									{
									match(input,AVOIR,FOLLOW_AVOIR_in_requete811); 
									}
									break;

							}

							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete814); 
							match(input,ENTRE,FOLLOW_ENTRE_in_requete816); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete820);
							annee1=paramAnneeBetween();
							state._fsp--;

							match(input,CONJET,FOLLOW_CONJET_in_requete822); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete826);
							annee2=paramAnneeBetween();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:186:124: AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot
							{
							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete830); 
							match(input,ENTRE,FOLLOW_ENTRE_in_requete832); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete836);
							annee1=paramAnneeBetween();
							state._fsp--;

							match(input,CONJET,FOLLOW_CONJET_in_requete838); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete842);
							annee2=paramAnneeBetween();
							state._fsp--;

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:186:194: ( CONJET )?
							int alt40=2;
							int LA40_0 = input.LA(1);
							if ( (LA40_0==CONJET) ) {
								alt40=1;
							}
							switch (alt40) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:186:194: CONJET
									{
									match(input,CONJET,FOLLOW_CONJET_in_requete844); 
									}
									break;

							}

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:186:202: ( AVOIR )?
							int alt41=2;
							int LA41_0 = input.LA(1);
							if ( (LA41_0==AVOIR) ) {
								alt41=1;
							}
							switch (alt41) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:186:202: AVOIR
									{
									match(input,AVOIR,FOLLOW_AVOIR_in_requete847); 
									}
									break;

							}

							match(input,MOT,FOLLOW_MOT_in_requete850); 
							pushFollow(FOLLOW_paramsMot_in_requete854);
							ps=paramsMot();
							state._fsp--;

							}
							break;

					}


							req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
							req_arbre.ajouteFils(new Arbre("","titretext.fichier"));
							req_arbre.ajouteFils(new Arbre("","FROM date"));
							req_arbre.ajouteFils(new Arbre("","JOIN titretext ON date.fichier = titretext.fichier"));
							req_arbre.ajouteFils(new Arbre("","WHERE"));
							ps_arbre = ps;
							req_arbre.ajouteFils(ps_arbre);
							req_arbre.ajouteFils(new Arbre("","AND annee BETWEEN"));
							ps_arbre = annee1;
							req_arbre.ajouteFils(ps_arbre);
							req_arbre.ajouteFils(new Arbre("","AND"));
							ps_arbre = annee2;
							req_arbre.ajouteFils(ps_arbre);
						
					}
					break;
				case 9 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:204:4: BULLETIN ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot )
					{
					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete868); 
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:204:13: ( AVOIR )?
					int alt43=2;
					int LA43_0 = input.LA(1);
					if ( (LA43_0==AVOIR) ) {
						alt43=1;
					}
					switch (alt43) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:204:13: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete870); 
							}
							break;

					}

					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:204:20: ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot )
					int alt48=2;
					int LA48_0 = input.LA(1);
					if ( (LA48_0==MOT) ) {
						alt48=1;
					}
					else if ( (LA48_0==AUTEUR) ) {
						alt48=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 48, 0, input);
						throw nvae;
					}

					switch (alt48) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:204:21: MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween
							{
							match(input,MOT,FOLLOW_MOT_in_requete874); 
							pushFollow(FOLLOW_paramsMot_in_requete878);
							ps=paramsMot();
							state._fsp--;

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:204:38: ( CONJET )?
							int alt44=2;
							int LA44_0 = input.LA(1);
							if ( (LA44_0==CONJET) ) {
								alt44=1;
							}
							switch (alt44) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:204:38: CONJET
									{
									match(input,CONJET,FOLLOW_CONJET_in_requete880); 
									}
									break;

							}

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:204:46: ( AVOIR )?
							int alt45=2;
							int LA45_0 = input.LA(1);
							if ( (LA45_0==AVOIR) ) {
								alt45=1;
							}
							switch (alt45) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:204:46: AVOIR
									{
									match(input,AVOIR,FOLLOW_AVOIR_in_requete883); 
									}
									break;

							}

							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete886); 
							match(input,ENTRE,FOLLOW_ENTRE_in_requete888); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete892);
							annee1=paramAnneeBetween();
							state._fsp--;

							match(input,CONJET,FOLLOW_CONJET_in_requete894); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete898);
							annee2=paramAnneeBetween();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:204:125: AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot
							{
							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete902); 
							match(input,ENTRE,FOLLOW_ENTRE_in_requete904); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete908);
							annee1=paramAnneeBetween();
							state._fsp--;

							match(input,CONJET,FOLLOW_CONJET_in_requete910); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete914);
							annee2=paramAnneeBetween();
							state._fsp--;

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:204:195: ( CONJET )?
							int alt46=2;
							int LA46_0 = input.LA(1);
							if ( (LA46_0==CONJET) ) {
								alt46=1;
							}
							switch (alt46) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:204:195: CONJET
									{
									match(input,CONJET,FOLLOW_CONJET_in_requete916); 
									}
									break;

							}

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:204:203: ( AVOIR )?
							int alt47=2;
							int LA47_0 = input.LA(1);
							if ( (LA47_0==AVOIR) ) {
								alt47=1;
							}
							switch (alt47) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:204:203: AVOIR
									{
									match(input,AVOIR,FOLLOW_AVOIR_in_requete919); 
									}
									break;

							}

							match(input,MOT,FOLLOW_MOT_in_requete922); 
							pushFollow(FOLLOW_paramsMot_in_requete926);
							ps=paramsMot();
							state._fsp--;

							}
							break;

					}


							req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
							req_arbre.ajouteFils(new Arbre("","titretext.fichier"));
							req_arbre.ajouteFils(new Arbre("","FROM date"));
							req_arbre.ajouteFils(new Arbre("","JOIN titretext ON date.fichier = titretext.fichier"));
							req_arbre.ajouteFils(new Arbre("","WHERE"));
							ps_arbre = ps;
							req_arbre.ajouteFils(ps_arbre);
							req_arbre.ajouteFils(new Arbre("","AND annee BETWEEN"));
							ps_arbre = annee1;
							req_arbre.ajouteFils(ps_arbre);
							req_arbre.ajouteFils(new Arbre("","AND"));
							ps_arbre = annee2;
							req_arbre.ajouteFils(ps_arbre);
						
					}
					break;
				case 10 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:224:4: ARTICLE ( AVOIR )? MOT ps= paramsMot
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete944); 
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:224:12: ( AVOIR )?
					int alt49=2;
					int LA49_0 = input.LA(1);
					if ( (LA49_0==AVOIR) ) {
						alt49=1;
					}
					switch (alt49) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:224:12: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete946); 
							}
							break;

					}

					match(input,MOT,FOLLOW_MOT_in_requete949); 
					pushFollow(FOLLOW_paramsMot_in_requete953);
					ps=paramsMot();
					state._fsp--;


							req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
							req_arbre.ajouteFils(new Arbre("","fichier"));
							req_arbre.ajouteFils(new Arbre("","FROM titretext"));
							req_arbre.ajouteFils(new Arbre("","WHERE"));
							ps_arbre = ps;
							req_arbre.ajouteFils(ps_arbre);
						
					}
					break;
				case 11 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:232:4: ARTICLE ( AVOIR )? RUBRIQUE MOT ps= paramsRubrique
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete960); 
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:232:12: ( AVOIR )?
					int alt50=2;
					int LA50_0 = input.LA(1);
					if ( (LA50_0==AVOIR) ) {
						alt50=1;
					}
					switch (alt50) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:232:12: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete962); 
							}
							break;

					}

					match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete965); 
					match(input,MOT,FOLLOW_MOT_in_requete967); 
					pushFollow(FOLLOW_paramsRubrique_in_requete971);
					ps=paramsRubrique();
					state._fsp--;


							req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
							req_arbre.ajouteFils(new Arbre("","fichier"));
							req_arbre.ajouteFils(new Arbre("","FROM rubrique"));
							req_arbre.ajouteFils(new Arbre("","WHERE"));
							ps_arbre = ps;
							req_arbre.ajouteFils(ps_arbre);
						
					}
					break;
				case 12 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:240:4: BULLETIN ( AVOIR )? RUBRIQUE MOT ps= paramsRubrique
					{
					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete978); 
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:240:13: ( AVOIR )?
					int alt51=2;
					int LA51_0 = input.LA(1);
					if ( (LA51_0==AVOIR) ) {
						alt51=1;
					}
					switch (alt51) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:240:13: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete980); 
							}
							break;

					}

					match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete983); 
					match(input,MOT,FOLLOW_MOT_in_requete985); 
					pushFollow(FOLLOW_paramsRubrique_in_requete989);
					ps=paramsRubrique();
					state._fsp--;


							req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
							req_arbre.ajouteFils(new Arbre("","numero"));
							req_arbre.ajouteFils(new Arbre("","FROM rubrique"));
							req_arbre.ajouteFils(new Arbre("","WHERE"));
							ps_arbre = ps;
							req_arbre.ajouteFils(ps_arbre);
						
					}
					break;
				case 13 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:249:4: BULLETIN ( AVOIR )? MOT ps= paramsMot
					{
					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete998); 
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:249:13: ( AVOIR )?
					int alt52=2;
					int LA52_0 = input.LA(1);
					if ( (LA52_0==AVOIR) ) {
						alt52=1;
					}
					switch (alt52) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:249:13: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete1000); 
							}
							break;

					}

					match(input,MOT,FOLLOW_MOT_in_requete1003); 
					pushFollow(FOLLOW_paramsMot_in_requete1007);
					ps=paramsMot();
					state._fsp--;


							req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
							req_arbre.ajouteFils(new Arbre("","numero"));
							req_arbre.ajouteFils(new Arbre("","FROM titretext"));
							req_arbre.ajouteFils(new Arbre("","WHERE"));
							ps_arbre = ps;
							req_arbre.ajouteFils(ps_arbre);
						
					}
					break;
				case 14 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:258:4: COUNT ARTICLE ( AVOIR )? MOT ps= paramsMot
					{
					match(input,COUNT,FOLLOW_COUNT_in_requete1016); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1018); 
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:258:18: ( AVOIR )?
					int alt53=2;
					int LA53_0 = input.LA(1);
					if ( (LA53_0==AVOIR) ) {
						alt53=1;
					}
					switch (alt53) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:258:18: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete1020); 
							}
							break;

					}

					match(input,MOT,FOLLOW_MOT_in_requete1023); 
					pushFollow(FOLLOW_paramsMot_in_requete1027);
					ps=paramsMot();
					state._fsp--;


							req_arbre.ajouteFils(new Arbre("","SELECT COUNT(DISTINCT fichier)"));
							req_arbre.ajouteFils(new Arbre("","FROM titretext"));
							req_arbre.ajouteFils(new Arbre("","WHERE"));
							ps_arbre = ps;
							req_arbre.ajouteFils(ps_arbre);
						
					}
					break;
				case 15 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:266:4: COUNT BULLETIN ( AVOIR )? MOT ps= paramsMot
					{
					match(input,COUNT,FOLLOW_COUNT_in_requete1038); 
					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete1040); 
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:266:19: ( AVOIR )?
					int alt54=2;
					int LA54_0 = input.LA(1);
					if ( (LA54_0==AVOIR) ) {
						alt54=1;
					}
					switch (alt54) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:266:19: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete1042); 
							}
							break;

					}

					match(input,MOT,FOLLOW_MOT_in_requete1045); 
					pushFollow(FOLLOW_paramsMot_in_requete1049);
					ps=paramsMot();
					state._fsp--;


							req_arbre.ajouteFils(new Arbre("","SELECT COUNT(DISTINCT numero)"));
							req_arbre.ajouteFils(new Arbre("","FROM titretext"));
							req_arbre.ajouteFils(new Arbre("","WHERE"));
							ps_arbre = ps;
							req_arbre.ajouteFils(ps_arbre);
						
					}
					break;
				case 16 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:274:4: ARTICLE ( AVOIR )? TITRE ps= paramsMot
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1058); 
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:274:12: ( AVOIR )?
					int alt55=2;
					int LA55_0 = input.LA(1);
					if ( (LA55_0==AVOIR) ) {
						alt55=1;
					}
					switch (alt55) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:274:12: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete1060); 
							}
							break;

					}

					match(input,TITRE,FOLLOW_TITRE_in_requete1063); 
					pushFollow(FOLLOW_paramsMot_in_requete1067);
					ps=paramsMot();
					state._fsp--;


							req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
							req_arbre.ajouteFils(new Arbre("","fichier"));
							req_arbre.ajouteFils(new Arbre("","FROM titre"));
							req_arbre.ajouteFils(new Arbre("","WHERE"));
							ps_arbre = ps;
							req_arbre.ajouteFils(ps_arbre);
						
					}
					break;
				case 17 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:283:4: ( EVERY )? ARTICLE
					{
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:283:4: ( EVERY )?
					int alt56=2;
					int LA56_0 = input.LA(1);
					if ( (LA56_0==EVERY) ) {
						alt56=1;
					}
					switch (alt56) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:283:4: EVERY
							{
							match(input,EVERY,FOLLOW_EVERY_in_requete1076); 
							}
							break;

					}

					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1079); 

							req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
							req_arbre.ajouteFils(new Arbre("","fichier"));
							req_arbre.ajouteFils(new Arbre("","FROM numero"));
						
					}
					break;
				case 18 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:289:4: ( EVERY )? BULLETIN
					{
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:289:4: ( EVERY )?
					int alt57=2;
					int LA57_0 = input.LA(1);
					if ( (LA57_0==EVERY) ) {
						alt57=1;
					}
					switch (alt57) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:289:4: EVERY
							{
							match(input,EVERY,FOLLOW_EVERY_in_requete1088); 
							}
							break;

					}

					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete1091); 

							req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
							req_arbre.ajouteFils(new Arbre("","numero"));
							req_arbre.ajouteFils(new Arbre("","FROM numero"));
						
					}
					break;
				case 19 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:295:4: ARTICLE ( AVOIR )? AUTEUR ps= paramsAnnee
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1100); 
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:295:12: ( AVOIR )?
					int alt58=2;
					int LA58_0 = input.LA(1);
					if ( (LA58_0==AVOIR) ) {
						alt58=1;
					}
					switch (alt58) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:295:12: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete1102); 
							}
							break;

					}

					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1105); 
					pushFollow(FOLLOW_paramsAnnee_in_requete1109);
					ps=paramsAnnee();
					state._fsp--;


							req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
							req_arbre.ajouteFils(new Arbre("","fichier"));
							req_arbre.ajouteFils(new Arbre("","FROM date"));
							req_arbre.ajouteFils(new Arbre("","WHERE"));
							ps_arbre = ps;
							req_arbre.ajouteFils(ps_arbre);
						
					}
					break;
				case 20 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:304:4: BULLETIN ( AVOIR )? AUTEUR ps= paramsAnnee
					{
					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete1118); 
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:304:13: ( AVOIR )?
					int alt59=2;
					int LA59_0 = input.LA(1);
					if ( (LA59_0==AVOIR) ) {
						alt59=1;
					}
					switch (alt59) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:304:13: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete1120); 
							}
							break;

					}

					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1123); 
					pushFollow(FOLLOW_paramsAnnee_in_requete1127);
					ps=paramsAnnee();
					state._fsp--;


							req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
							req_arbre.ajouteFils(new Arbre("","numero"));
							req_arbre.ajouteFils(new Arbre("","FROM date"));
							req_arbre.ajouteFils(new Arbre("","WHERE"));
							ps_arbre = ps;
							req_arbre.ajouteFils(ps_arbre);
						
					}
					break;
				case 21 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:313:4: ARTICLE ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1136); 
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:313:12: ( AVOIR )?
					int alt60=2;
					int LA60_0 = input.LA(1);
					if ( (LA60_0==AVOIR) ) {
						alt60=1;
					}
					switch (alt60) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:313:12: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete1138); 
							}
							break;

					}

					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1141); 
					match(input,ENTRE,FOLLOW_ENTRE_in_requete1143); 
					pushFollow(FOLLOW_paramAnneeBetween_in_requete1147);
					annee1=paramAnneeBetween();
					state._fsp--;

					match(input,CONJET,FOLLOW_CONJET_in_requete1149); 
					pushFollow(FOLLOW_paramAnneeBetween_in_requete1153);
					annee2=paramAnneeBetween();
					state._fsp--;


							req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
							req_arbre.ajouteFils(new Arbre("","fichier"));
							req_arbre.ajouteFils(new Arbre("","FROM date"));
							req_arbre.ajouteFils(new Arbre("","WHERE annee BETWEEN"));
							ps_arbre = annee1;
							req_arbre.ajouteFils(ps_arbre);
							req_arbre.ajouteFils(new Arbre("","AND"));
							ps_arbre = annee2;
							req_arbre.ajouteFils(ps_arbre);
						
					}
					break;
				case 22 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:325:4: BULLETIN ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween
					{
					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete1161); 
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:325:13: ( AVOIR )?
					int alt61=2;
					int LA61_0 = input.LA(1);
					if ( (LA61_0==AVOIR) ) {
						alt61=1;
					}
					switch (alt61) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:325:13: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete1163); 
							}
							break;

					}

					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1166); 
					match(input,ENTRE,FOLLOW_ENTRE_in_requete1168); 
					pushFollow(FOLLOW_paramAnneeBetween_in_requete1172);
					annee1=paramAnneeBetween();
					state._fsp--;

					match(input,CONJET,FOLLOW_CONJET_in_requete1174); 
					pushFollow(FOLLOW_paramAnneeBetween_in_requete1178);
					annee2=paramAnneeBetween();
					state._fsp--;


							req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
							req_arbre.ajouteFils(new Arbre("","numero"));
							req_arbre.ajouteFils(new Arbre("","FROM date"));
							req_arbre.ajouteFils(new Arbre("","WHERE annee BETWEEN"));
							ps_arbre = annee1;
							req_arbre.ajouteFils(ps_arbre);
							req_arbre.ajouteFils(new Arbre("","AND"));
							ps_arbre = annee2;
							req_arbre.ajouteFils(ps_arbre);
						
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return req_arbre;
	}
	// $ANTLR end "requete"



	// $ANTLR start "paramsMot"
	// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:339:1: paramsMot returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= paramMot ( CONJOU par2= paramMot | ( CONJET )? par2= paramMot )* ;
	public final Arbre paramsMot() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:340:40: (par1= paramMot ( CONJOU par2= paramMot | ( CONJET )? par2= paramMot )* )
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:341:3: par1= paramMot ( CONJOU par2= paramMot | ( CONJET )? par2= paramMot )*
			{
			pushFollow(FOLLOW_paramMot_in_paramsMot1208);
			par1=paramMot();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:346:3: ( CONJOU par2= paramMot | ( CONJET )? par2= paramMot )*
			loop64:
			while (true) {
				int alt64=3;
				switch ( input.LA(1) ) {
				case CONJET:
					{
					int LA64_1 = input.LA(2);
					if ( (LA64_1==VAR) ) {
						alt64=2;
					}

					}
					break;
				case CONJOU:
					{
					alt64=1;
					}
					break;
				case VAR:
					{
					alt64=2;
					}
					break;
				}
				switch (alt64) {
				case 1 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:346:4: CONJOU par2= paramMot
					{
					match(input,CONJOU,FOLLOW_CONJOU_in_paramsMot1219); 
					pushFollow(FOLLOW_paramMot_in_paramsMot1225);
					par2=paramMot();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "OR"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;
				case 2 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:352:5: ( CONJET )? par2= paramMot
					{
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:352:5: ( CONJET )?
					int alt63=2;
					int LA63_0 = input.LA(1);
					if ( (LA63_0==CONJET) ) {
						alt63=1;
					}
					switch (alt63) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:352:5: CONJET
							{
							match(input,CONJET,FOLLOW_CONJET_in_paramsMot1236); 
							}
							break;

					}

					pushFollow(FOLLOW_paramMot_in_paramsMot1243);
					par2=paramMot();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "AND"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;

				default :
					break loop64;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return les_pars_arbre;
	}
	// $ANTLR end "paramsMot"



	// $ANTLR start "paramMot"
	// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:361:1: paramMot returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
	public final Arbre paramMot() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:361:54: (a= VAR )
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:362:2: a= VAR
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_paramMot1271); 
			 lepar_arbre.ajouteFils(new Arbre("mot =", "'"+a.getText()+"'"));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "paramMot"



	// $ANTLR start "paramsRubrique"
	// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:366:1: paramsRubrique returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= paramRubrique ( CONJOU par2= paramRubrique | ( CONJET )? par2= paramRubrique )* ;
	public final Arbre paramsRubrique() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:367:40: (par1= paramRubrique ( CONJOU par2= paramRubrique | ( CONJET )? par2= paramRubrique )* )
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:368:3: par1= paramRubrique ( CONJOU par2= paramRubrique | ( CONJET )? par2= paramRubrique )*
			{
			pushFollow(FOLLOW_paramRubrique_in_paramsRubrique1301);
			par1=paramRubrique();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:373:3: ( CONJOU par2= paramRubrique | ( CONJET )? par2= paramRubrique )*
			loop66:
			while (true) {
				int alt66=3;
				int LA66_0 = input.LA(1);
				if ( (LA66_0==CONJOU) ) {
					alt66=1;
				}
				else if ( (LA66_0==CONJET||LA66_0==VAR) ) {
					alt66=2;
				}

				switch (alt66) {
				case 1 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:373:4: CONJOU par2= paramRubrique
					{
					match(input,CONJOU,FOLLOW_CONJOU_in_paramsRubrique1312); 
					pushFollow(FOLLOW_paramRubrique_in_paramsRubrique1318);
					par2=paramRubrique();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "OR"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;
				case 2 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:379:5: ( CONJET )? par2= paramRubrique
					{
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:379:5: ( CONJET )?
					int alt65=2;
					int LA65_0 = input.LA(1);
					if ( (LA65_0==CONJET) ) {
						alt65=1;
					}
					switch (alt65) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:379:5: CONJET
							{
							match(input,CONJET,FOLLOW_CONJET_in_paramsRubrique1329); 
							}
							break;

					}

					pushFollow(FOLLOW_paramRubrique_in_paramsRubrique1336);
					par2=paramRubrique();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "AND"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;

				default :
					break loop66;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return les_pars_arbre;
	}
	// $ANTLR end "paramsRubrique"



	// $ANTLR start "paramRubrique"
	// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:388:1: paramRubrique returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
	public final Arbre paramRubrique() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:388:59: (a= VAR )
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:389:2: a= VAR
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_paramRubrique1364); 
			 lepar_arbre.ajouteFils(new Arbre("LOWER(rubrique) LIKE", "'%"+a.getText()+"%'"));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "paramRubrique"



	// $ANTLR start "paramsAnnee"
	// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:394:1: paramsAnnee returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= paramAnnee ( CONJOU par2= paramAnnee | CONJET par2= paramAnnee )* ;
	public final Arbre paramsAnnee() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:395:40: (par1= paramAnnee ( CONJOU par2= paramAnnee | CONJET par2= paramAnnee )* )
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:396:3: par1= paramAnnee ( CONJOU par2= paramAnnee | CONJET par2= paramAnnee )*
			{
			pushFollow(FOLLOW_paramAnnee_in_paramsAnnee1395);
			par1=paramAnnee();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:401:3: ( CONJOU par2= paramAnnee | CONJET par2= paramAnnee )*
			loop67:
			while (true) {
				int alt67=3;
				int LA67_0 = input.LA(1);
				if ( (LA67_0==CONJET) ) {
					int LA67_2 = input.LA(2);
					if ( (LA67_2==ANNEE) ) {
						alt67=2;
					}

				}
				else if ( (LA67_0==CONJOU) ) {
					alt67=1;
				}

				switch (alt67) {
				case 1 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:401:4: CONJOU par2= paramAnnee
					{
					match(input,CONJOU,FOLLOW_CONJOU_in_paramsAnnee1406); 
					pushFollow(FOLLOW_paramAnnee_in_paramsAnnee1412);
					par2=paramAnnee();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "OR"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;
				case 2 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:407:5: CONJET par2= paramAnnee
					{
					match(input,CONJET,FOLLOW_CONJET_in_paramsAnnee1423); 
					pushFollow(FOLLOW_paramAnnee_in_paramsAnnee1429);
					par2=paramAnnee();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "AND"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;

				default :
					break loop67;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return les_pars_arbre;
	}
	// $ANTLR end "paramsAnnee"



	// $ANTLR start "paramAnnee"
	// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:416:1: paramAnnee returns [Arbre lepar_arbre = new Arbre(\"\")] : a= ANNEE ;
	public final Arbre paramAnnee() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:416:56: (a= ANNEE )
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:417:2: a= ANNEE
			{
			a=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_paramAnnee1457); 
			 lepar_arbre.ajouteFils(new Arbre("annee =", "'"+a.getText()+"'"));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "paramAnnee"



	// $ANTLR start "paramsAnneeJointure"
	// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:421:1: paramsAnneeJointure returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= paramAnneeJointure ( CONJOU par2= paramAnneeJointure | CONJET par2= paramAnneeJointure )* ;
	public final Arbre paramsAnneeJointure() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:422:40: (par1= paramAnneeJointure ( CONJOU par2= paramAnneeJointure | CONJET par2= paramAnneeJointure )* )
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:423:3: par1= paramAnneeJointure ( CONJOU par2= paramAnneeJointure | CONJET par2= paramAnneeJointure )*
			{
			pushFollow(FOLLOW_paramAnneeJointure_in_paramsAnneeJointure1487);
			par1=paramAnneeJointure();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:428:3: ( CONJOU par2= paramAnneeJointure | CONJET par2= paramAnneeJointure )*
			loop68:
			while (true) {
				int alt68=3;
				int LA68_0 = input.LA(1);
				if ( (LA68_0==CONJOU) ) {
					alt68=1;
				}
				else if ( (LA68_0==CONJET) ) {
					alt68=2;
				}

				switch (alt68) {
				case 1 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:428:4: CONJOU par2= paramAnneeJointure
					{
					match(input,CONJOU,FOLLOW_CONJOU_in_paramsAnneeJointure1498); 
					pushFollow(FOLLOW_paramAnneeJointure_in_paramsAnneeJointure1504);
					par2=paramAnneeJointure();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "OR"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;
				case 2 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:434:5: CONJET par2= paramAnneeJointure
					{
					match(input,CONJET,FOLLOW_CONJET_in_paramsAnneeJointure1515); 
					pushFollow(FOLLOW_paramAnneeJointure_in_paramsAnneeJointure1521);
					par2=paramAnneeJointure();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "AND"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;

				default :
					break loop68;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return les_pars_arbre;
	}
	// $ANTLR end "paramsAnneeJointure"



	// $ANTLR start "paramAnneeJointure"
	// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:443:1: paramAnneeJointure returns [Arbre lepar_arbre = new Arbre(\"\")] : a= ANNEE ;
	public final Arbre paramAnneeJointure() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:443:64: (a= ANNEE )
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:444:2: a= ANNEE
			{
			a=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_paramAnneeJointure1549); 
			 lepar_arbre.ajouteFils(new Arbre("date.annee =", "'"+a.getText()+"'"));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "paramAnneeJointure"



	// $ANTLR start "paramAnneeBetween"
	// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:448:1: paramAnneeBetween returns [Arbre lepar_arbre = new Arbre(\"\")] : a= ANNEE ;
	public final Arbre paramAnneeBetween() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:448:63: (a= ANNEE )
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:449:2: a= ANNEE
			{
			a=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_paramAnneeBetween1571); 
			 lepar_arbre.ajouteFils(new Arbre("'"+a.getText()+"'"));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "paramAnneeBetween"

	// Delegated rules


	protected DFA62 dfa62 = new DFA62(this);
	static final String DFA62_eotS =
		"\126\uffff";
	static final String DFA62_eofS =
		"\1\uffff\1\13\1\uffff\1\21\20\uffff\1\41\1\uffff\1\50\1\56\2\uffff\1\72"+
		"\1\100\2\uffff\1\41\14\uffff\1\56\21\uffff\1\100\3\uffff\1\41\2\uffff"+
		"\2\50\1\56\4\uffff\2\72\1\100\1\uffff\1\122\1\125\5\uffff";
	static final String DFA62_minS =
		"\1\5\1\6\1\uffff\1\6\2\5\1\6\1\24\1\4\1\24\2\uffff\1\6\1\24\1\4\1\24\4"+
		"\uffff\1\6\1\4\1\7\2\6\1\4\1\7\1\6\1\24\3\6\1\4\1\uffff\1\11\2\4\1\17"+
		"\3\uffff\1\24\3\6\1\4\1\uffff\1\24\3\6\1\4\1\11\2\4\1\17\3\uffff\1\24"+
		"\3\6\1\4\1\uffff\1\6\1\uffff\1\4\2\7\1\6\1\uffff\1\6\1\uffff\1\4\2\7\1"+
		"\6\1\uffff\2\7\1\17\1\uffff\1\7\1\17\1\uffff";
	static final String DFA62_maxS =
		"\1\20\1\23\1\uffff\1\23\2\10\1\23\1\24\1\15\1\24\2\uffff\1\23\1\24\1\15"+
		"\1\24\4\uffff\1\24\1\4\1\23\2\24\1\4\1\23\4\24\1\6\1\15\1\uffff\1\11\1"+
		"\4\2\23\3\uffff\3\24\1\6\1\15\1\uffff\3\24\1\6\1\15\1\11\1\4\2\23\3\uffff"+
		"\3\24\1\6\1\15\1\uffff\1\24\1\uffff\1\4\2\23\1\24\1\uffff\1\24\1\uffff"+
		"\1\4\2\23\1\24\1\uffff\3\23\1\uffff\2\23\1\uffff";
	static final String DFA62_acceptS =
		"\2\uffff\1\2\7\uffff\1\13\1\21\4\uffff\1\14\1\22\1\16\1\17\15\uffff\1"+
		"\20\4\uffff\1\1\1\6\1\23\5\uffff\1\12\11\uffff\1\3\1\7\1\24\5\uffff\1"+
		"\15\1\uffff\1\4\4\uffff\1\10\1\uffff\1\5\4\uffff\1\11\3\uffff\1\25\2\uffff"+
		"\1\26";
	static final String DFA62_specialS =
		"\126\uffff}>";
	static final String[] DFA62_transitionS = {
			"\1\1\2\uffff\1\3\2\uffff\1\4\2\uffff\1\5\1\uffff\1\2",
			"\1\10\1\6\7\uffff\1\11\1\12\2\uffff\1\7",
			"",
			"\1\16\1\14\7\uffff\1\17\1\20\2\uffff\1\15",
			"\1\22\2\uffff\1\23",
			"\1\13\2\uffff\1\21",
			"\1\10\10\uffff\1\11\1\12\2\uffff\1\7",
			"\1\24",
			"\1\26\10\uffff\1\25",
			"\1\27",
			"",
			"",
			"\1\16\10\uffff\1\17\1\20\2\uffff\1\15",
			"\1\30",
			"\1\32\10\uffff\1\31",
			"\1\33",
			"",
			"",
			"",
			"",
			"\1\40\1\37\1\uffff\1\35\1\34\11\uffff\1\36",
			"\1\42",
			"\1\45\1\uffff\1\44\1\43\4\uffff\1\47\3\uffff\1\46",
			"\1\55\1\54\1\uffff\1\52\1\51\11\uffff\1\53",
			"\1\63\1\62\1\uffff\1\60\1\57\11\uffff\1\61",
			"\1\64",
			"\1\67\1\uffff\1\66\1\65\4\uffff\1\71\3\uffff\1\70",
			"\1\77\1\76\1\uffff\1\74\1\73\11\uffff\1\75",
			"\1\101",
			"\2\46\14\uffff\1\36",
			"\1\40\1\37\1\uffff\1\35\1\34\11\uffff\1\36",
			"\1\40",
			"\1\46\10\uffff\1\102",
			"",
			"\1\103",
			"\1\104",
			"\1\105\2\uffff\1\45\7\uffff\1\47\3\uffff\1\46",
			"\1\47\3\uffff\1\46",
			"",
			"",
			"",
			"\1\106",
			"\1\55\1\54\14\uffff\1\53",
			"\1\55\1\54\1\uffff\1\52\1\51\11\uffff\1\53",
			"\1\55",
			"\1\47\10\uffff\1\107",
			"",
			"\1\110",
			"\1\63\1\62\14\uffff\1\61",
			"\1\63\1\62\1\uffff\1\60\1\57\11\uffff\1\61",
			"\1\63",
			"\1\70\10\uffff\1\111",
			"\1\112",
			"\1\113",
			"\1\114\2\uffff\1\67\7\uffff\1\71\3\uffff\1\70",
			"\1\71\3\uffff\1\70",
			"",
			"",
			"",
			"\1\115",
			"\1\77\1\76\14\uffff\1\75",
			"\1\77\1\76\1\uffff\1\74\1\73\11\uffff\1\75",
			"\1\77",
			"\1\71\10\uffff\1\116",
			"",
			"\1\40\1\37\1\uffff\1\35\1\34\11\uffff\1\36",
			"",
			"\1\117",
			"\1\45\1\uffff\1\44\1\43\4\uffff\1\47\3\uffff\1\46",
			"\1\45\1\uffff\1\44\1\43\4\uffff\1\47\3\uffff\1\46",
			"\1\55\1\54\1\uffff\1\52\1\51\11\uffff\1\53",
			"",
			"\1\63\1\62\1\uffff\1\60\1\57\11\uffff\1\61",
			"",
			"\1\120",
			"\1\67\1\uffff\1\66\1\65\4\uffff\1\71\3\uffff\1\70",
			"\1\67\1\uffff\1\66\1\65\4\uffff\1\71\3\uffff\1\70",
			"\1\77\1\76\1\uffff\1\74\1\73\11\uffff\1\75",
			"",
			"\1\121\1\uffff\1\107\5\uffff\1\107\3\uffff\1\102",
			"\1\124\1\uffff\1\123\5\uffff\1\116\3\uffff\1\111",
			"\1\107\3\uffff\1\102",
			"",
			"\1\124\7\uffff\1\116\3\uffff\1\111",
			"\1\116\3\uffff\1\111",
			""
	};

	static final short[] DFA62_eot = DFA.unpackEncodedString(DFA62_eotS);
	static final short[] DFA62_eof = DFA.unpackEncodedString(DFA62_eofS);
	static final char[] DFA62_min = DFA.unpackEncodedStringToUnsignedChars(DFA62_minS);
	static final char[] DFA62_max = DFA.unpackEncodedStringToUnsignedChars(DFA62_maxS);
	static final short[] DFA62_accept = DFA.unpackEncodedString(DFA62_acceptS);
	static final short[] DFA62_special = DFA.unpackEncodedString(DFA62_specialS);
	static final short[][] DFA62_transition;

	static {
		int numStates = DFA62_transitionS.length;
		DFA62_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA62_transition[i] = DFA.unpackEncodedString(DFA62_transitionS[i]);
		}
	}

	protected class DFA62 extends DFA {

		public DFA62(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 62;
			this.eot = DFA62_eot;
			this.eof = DFA62_eof;
			this.min = DFA62_min;
			this.max = DFA62_max;
			this.accept = DFA62_accept;
			this.special = DFA62_special;
			this.transition = DFA62_transition;
		}
		@Override
		public String getDescription() {
			return "79:10: ( ARTICLE ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | RUBRIQUE ARTICLE ( AVOIR )? MOT ps= paramsMot | BULLETIN ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ARTICLE ( AVOIR )? ( TITRE ps= paramsMot ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( AVOIR )? TITRE ps= paramsMot ) | BULLETIN ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ARTICLE ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | BULLETIN ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ARTICLE ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | BULLETIN ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ARTICLE ( AVOIR )? MOT ps= paramsMot | ARTICLE ( AVOIR )? RUBRIQUE MOT ps= paramsRubrique | BULLETIN ( AVOIR )? RUBRIQUE MOT ps= paramsRubrique | BULLETIN ( AVOIR )? MOT ps= paramsMot | COUNT ARTICLE ( AVOIR )? MOT ps= paramsMot | COUNT BULLETIN ( AVOIR )? MOT ps= paramsMot | ARTICLE ( AVOIR )? TITRE ps= paramsMot | ( EVERY )? ARTICLE | ( EVERY )? BULLETIN | ARTICLE ( AVOIR )? AUTEUR ps= paramsAnnee | BULLETIN ( AVOIR )? AUTEUR ps= paramsAnnee | ARTICLE ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | BULLETIN ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween )";
		}
	}

	public static final BitSet FOLLOW_requete_in_listerequetes357 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete404 = new BitSet(new long[]{0x0000000000034920L});
	public static final BitSet FOLLOW_ARTICLE_in_requete408 = new BitSet(new long[]{0x00000000000800C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete410 = new BitSet(new long[]{0x0000000000080040L});
	public static final BitSet FOLLOW_TITRE_in_requete414 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete418 = new BitSet(new long[]{0x00000000000002C0L});
	public static final BitSet FOLLOW_CONJET_in_requete420 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete423 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete426 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramsAnnee_in_requete430 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTEUR_in_requete434 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramsAnnee_in_requete438 = new BitSet(new long[]{0x0000000000080280L});
	public static final BitSet FOLLOW_CONJET_in_requete440 = new BitSet(new long[]{0x0000000000080080L});
	public static final BitSet FOLLOW_AVOIR_in_requete443 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_TITRE_in_requete446 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete450 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete458 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ARTICLE_in_requete460 = new BitSet(new long[]{0x0000000000008080L});
	public static final BitSet FOLLOW_AVOIR_in_requete462 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOT_in_requete465 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete469 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BULLETIN_in_requete482 = new BitSet(new long[]{0x00000000000800C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete484 = new BitSet(new long[]{0x0000000000080040L});
	public static final BitSet FOLLOW_TITRE_in_requete488 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete492 = new BitSet(new long[]{0x00000000000002C0L});
	public static final BitSet FOLLOW_CONJET_in_requete494 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete497 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete500 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramsAnnee_in_requete504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTEUR_in_requete508 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramsAnnee_in_requete512 = new BitSet(new long[]{0x0000000000080280L});
	public static final BitSet FOLLOW_CONJET_in_requete514 = new BitSet(new long[]{0x0000000000080080L});
	public static final BitSet FOLLOW_AVOIR_in_requete517 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_TITRE_in_requete520 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete524 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARTICLE_in_requete538 = new BitSet(new long[]{0x00000000000800C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete540 = new BitSet(new long[]{0x0000000000080040L});
	public static final BitSet FOLLOW_TITRE_in_requete544 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete548 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete550 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete553 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ENTRE_in_requete555 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete559 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CONJET_in_requete561 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete565 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTEUR_in_requete569 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ENTRE_in_requete571 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete575 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CONJET_in_requete577 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete581 = new BitSet(new long[]{0x0000000000080080L});
	public static final BitSet FOLLOW_AVOIR_in_requete583 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_TITRE_in_requete586 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete590 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BULLETIN_in_requete604 = new BitSet(new long[]{0x00000000000800C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete606 = new BitSet(new long[]{0x0000000000080040L});
	public static final BitSet FOLLOW_TITRE_in_requete610 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete614 = new BitSet(new long[]{0x00000000000002C0L});
	public static final BitSet FOLLOW_CONJET_in_requete616 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete619 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete622 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ENTRE_in_requete624 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete628 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CONJET_in_requete630 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete634 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTEUR_in_requete638 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ENTRE_in_requete640 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete644 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CONJET_in_requete646 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete650 = new BitSet(new long[]{0x0000000000080280L});
	public static final BitSet FOLLOW_CONJET_in_requete652 = new BitSet(new long[]{0x0000000000080080L});
	public static final BitSet FOLLOW_AVOIR_in_requete655 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_TITRE_in_requete658 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARTICLE_in_requete684 = new BitSet(new long[]{0x00000000000080C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete686 = new BitSet(new long[]{0x0000000000008040L});
	public static final BitSet FOLLOW_MOT_in_requete690 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete694 = new BitSet(new long[]{0x00000000000002C0L});
	public static final BitSet FOLLOW_CONJET_in_requete696 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete699 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete702 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramsAnnee_in_requete706 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTEUR_in_requete710 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramsAnnee_in_requete714 = new BitSet(new long[]{0x0000000000008280L});
	public static final BitSet FOLLOW_CONJET_in_requete716 = new BitSet(new long[]{0x0000000000008080L});
	public static final BitSet FOLLOW_AVOIR_in_requete719 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOT_in_requete722 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete726 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BULLETIN_in_requete740 = new BitSet(new long[]{0x00000000000080C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete742 = new BitSet(new long[]{0x0000000000008040L});
	public static final BitSet FOLLOW_MOT_in_requete746 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete750 = new BitSet(new long[]{0x00000000000002C0L});
	public static final BitSet FOLLOW_CONJET_in_requete752 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete755 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete758 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramsAnnee_in_requete762 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTEUR_in_requete766 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramsAnnee_in_requete770 = new BitSet(new long[]{0x0000000000008280L});
	public static final BitSet FOLLOW_CONJET_in_requete772 = new BitSet(new long[]{0x0000000000008080L});
	public static final BitSet FOLLOW_AVOIR_in_requete775 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOT_in_requete778 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARTICLE_in_requete796 = new BitSet(new long[]{0x00000000000080C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete798 = new BitSet(new long[]{0x0000000000008040L});
	public static final BitSet FOLLOW_MOT_in_requete802 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete806 = new BitSet(new long[]{0x00000000000002C0L});
	public static final BitSet FOLLOW_CONJET_in_requete808 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete811 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete814 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ENTRE_in_requete816 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete820 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CONJET_in_requete822 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete826 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTEUR_in_requete830 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ENTRE_in_requete832 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete836 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CONJET_in_requete838 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete842 = new BitSet(new long[]{0x0000000000008280L});
	public static final BitSet FOLLOW_CONJET_in_requete844 = new BitSet(new long[]{0x0000000000008080L});
	public static final BitSet FOLLOW_AVOIR_in_requete847 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOT_in_requete850 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete854 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BULLETIN_in_requete868 = new BitSet(new long[]{0x00000000000080C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete870 = new BitSet(new long[]{0x0000000000008040L});
	public static final BitSet FOLLOW_MOT_in_requete874 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete878 = new BitSet(new long[]{0x00000000000002C0L});
	public static final BitSet FOLLOW_CONJET_in_requete880 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete883 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete886 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ENTRE_in_requete888 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete892 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CONJET_in_requete894 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete898 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTEUR_in_requete902 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ENTRE_in_requete904 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete908 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CONJET_in_requete910 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete914 = new BitSet(new long[]{0x0000000000008280L});
	public static final BitSet FOLLOW_CONJET_in_requete916 = new BitSet(new long[]{0x0000000000008080L});
	public static final BitSet FOLLOW_AVOIR_in_requete919 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOT_in_requete922 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete926 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARTICLE_in_requete944 = new BitSet(new long[]{0x0000000000008080L});
	public static final BitSet FOLLOW_AVOIR_in_requete946 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOT_in_requete949 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete953 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARTICLE_in_requete960 = new BitSet(new long[]{0x0000000000010080L});
	public static final BitSet FOLLOW_AVOIR_in_requete962 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete965 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOT_in_requete967 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsRubrique_in_requete971 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BULLETIN_in_requete978 = new BitSet(new long[]{0x0000000000010080L});
	public static final BitSet FOLLOW_AVOIR_in_requete980 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete983 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOT_in_requete985 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsRubrique_in_requete989 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BULLETIN_in_requete998 = new BitSet(new long[]{0x0000000000008080L});
	public static final BitSet FOLLOW_AVOIR_in_requete1000 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOT_in_requete1003 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete1007 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COUNT_in_requete1016 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1018 = new BitSet(new long[]{0x0000000000008080L});
	public static final BitSet FOLLOW_AVOIR_in_requete1020 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOT_in_requete1023 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete1027 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COUNT_in_requete1038 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_BULLETIN_in_requete1040 = new BitSet(new long[]{0x0000000000008080L});
	public static final BitSet FOLLOW_AVOIR_in_requete1042 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOT_in_requete1045 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete1049 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1058 = new BitSet(new long[]{0x0000000000080080L});
	public static final BitSet FOLLOW_AVOIR_in_requete1060 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_TITRE_in_requete1063 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete1067 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EVERY_in_requete1076 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1079 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EVERY_in_requete1088 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_BULLETIN_in_requete1091 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1100 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete1102 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1105 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramsAnnee_in_requete1109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BULLETIN_in_requete1118 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete1120 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1123 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramsAnnee_in_requete1127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1136 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete1138 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1141 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ENTRE_in_requete1143 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete1147 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CONJET_in_requete1149 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete1153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BULLETIN_in_requete1161 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete1163 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1166 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ENTRE_in_requete1168 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete1172 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CONJET_in_requete1174 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete1178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramMot_in_paramsMot1208 = new BitSet(new long[]{0x0000000000100602L});
	public static final BitSet FOLLOW_CONJOU_in_paramsMot1219 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramMot_in_paramsMot1225 = new BitSet(new long[]{0x0000000000100602L});
	public static final BitSet FOLLOW_CONJET_in_paramsMot1236 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramMot_in_paramsMot1243 = new BitSet(new long[]{0x0000000000100602L});
	public static final BitSet FOLLOW_VAR_in_paramMot1271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramRubrique_in_paramsRubrique1301 = new BitSet(new long[]{0x0000000000100602L});
	public static final BitSet FOLLOW_CONJOU_in_paramsRubrique1312 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramRubrique_in_paramsRubrique1318 = new BitSet(new long[]{0x0000000000100602L});
	public static final BitSet FOLLOW_CONJET_in_paramsRubrique1329 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramRubrique_in_paramsRubrique1336 = new BitSet(new long[]{0x0000000000100602L});
	public static final BitSet FOLLOW_VAR_in_paramRubrique1364 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramAnnee_in_paramsAnnee1395 = new BitSet(new long[]{0x0000000000000602L});
	public static final BitSet FOLLOW_CONJOU_in_paramsAnnee1406 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnnee_in_paramsAnnee1412 = new BitSet(new long[]{0x0000000000000602L});
	public static final BitSet FOLLOW_CONJET_in_paramsAnnee1423 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnnee_in_paramsAnnee1429 = new BitSet(new long[]{0x0000000000000602L});
	public static final BitSet FOLLOW_ANNEE_in_paramAnnee1457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramAnneeJointure_in_paramsAnneeJointure1487 = new BitSet(new long[]{0x0000000000000602L});
	public static final BitSet FOLLOW_CONJOU_in_paramsAnneeJointure1498 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeJointure_in_paramsAnneeJointure1504 = new BitSet(new long[]{0x0000000000000602L});
	public static final BitSet FOLLOW_CONJET_in_paramsAnneeJointure1515 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeJointure_in_paramsAnneeJointure1521 = new BitSet(new long[]{0x0000000000000602L});
	public static final BitSet FOLLOW_ANNEE_in_paramAnneeJointure1549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANNEE_in_paramAnneeBetween1571 = new BitSet(new long[]{0x0000000000000002L});
}
