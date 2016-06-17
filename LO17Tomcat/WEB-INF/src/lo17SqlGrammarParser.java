// $ANTLR 3.5.1 C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g 2016-06-17 11:56:03

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
	// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:66:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( SELECT )* ( ARTICLE ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | RUBRIQUE ARTICLE ( AVOIR )? MOT ps= paramsMot | BULLETIN ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ARTICLE ( AVOIR )? ( TITRE ps= paramsMot ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( AVOIR )? TITRE ps= paramsMot ) | BULLETIN ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ARTICLE ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | BULLETIN ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ARTICLE ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | BULLETIN ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ARTICLE ( AVOIR )? MOT ps= paramsMot | BULLETIN ( AVOIR )? MOT ps= paramsMot | COUNT ARTICLE ( AVOIR )? MOT ps= paramsMot | COUNT BULLETIN ( AVOIR )? MOT ps= paramsMot | ARTICLE ( AVOIR )? TITRE ps= paramsMot | ( EVERY )? ARTICLE | ( EVERY )? BULLETIN | ARTICLE ( AVOIR )? AUTEUR ps= paramsAnnee | BULLETIN ( AVOIR )? AUTEUR ps= paramsAnnee | ARTICLE ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | BULLETIN ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ) ;
	public final Arbre requete() throws RecognitionException {
		Arbre req_arbre =  new Arbre("");


		Arbre ps =null;
		Arbre psAnnee =null;
		Arbre annee1 =null;
		Arbre annee2 =null;

		Arbre ps_arbre;
		try {
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:67:26: ( ( SELECT )* ( ARTICLE ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | RUBRIQUE ARTICLE ( AVOIR )? MOT ps= paramsMot | BULLETIN ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ARTICLE ( AVOIR )? ( TITRE ps= paramsMot ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( AVOIR )? TITRE ps= paramsMot ) | BULLETIN ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ARTICLE ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | BULLETIN ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ARTICLE ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | BULLETIN ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ARTICLE ( AVOIR )? MOT ps= paramsMot | BULLETIN ( AVOIR )? MOT ps= paramsMot | COUNT ARTICLE ( AVOIR )? MOT ps= paramsMot | COUNT BULLETIN ( AVOIR )? MOT ps= paramsMot | ARTICLE ( AVOIR )? TITRE ps= paramsMot | ( EVERY )? ARTICLE | ( EVERY )? BULLETIN | ARTICLE ( AVOIR )? AUTEUR ps= paramsAnnee | BULLETIN ( AVOIR )? AUTEUR ps= paramsAnnee | ARTICLE ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | BULLETIN ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ) )
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:79:2: ( SELECT )* ( ARTICLE ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | RUBRIQUE ARTICLE ( AVOIR )? MOT ps= paramsMot | BULLETIN ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ARTICLE ( AVOIR )? ( TITRE ps= paramsMot ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( AVOIR )? TITRE ps= paramsMot ) | BULLETIN ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ARTICLE ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | BULLETIN ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ARTICLE ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | BULLETIN ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ARTICLE ( AVOIR )? MOT ps= paramsMot | BULLETIN ( AVOIR )? MOT ps= paramsMot | COUNT ARTICLE ( AVOIR )? MOT ps= paramsMot | COUNT BULLETIN ( AVOIR )? MOT ps= paramsMot | ARTICLE ( AVOIR )? TITRE ps= paramsMot | ( EVERY )? ARTICLE | ( EVERY )? BULLETIN | ARTICLE ( AVOIR )? AUTEUR ps= paramsAnnee | BULLETIN ( AVOIR )? AUTEUR ps= paramsAnnee | ARTICLE ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | BULLETIN ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween )
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

			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:79:10: ( ARTICLE ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | RUBRIQUE ARTICLE ( AVOIR )? MOT ps= paramsMot | BULLETIN ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ARTICLE ( AVOIR )? ( TITRE ps= paramsMot ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( AVOIR )? TITRE ps= paramsMot ) | BULLETIN ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ARTICLE ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | BULLETIN ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ARTICLE ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | BULLETIN ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ARTICLE ( AVOIR )? MOT ps= paramsMot | BULLETIN ( AVOIR )? MOT ps= paramsMot | COUNT ARTICLE ( AVOIR )? MOT ps= paramsMot | COUNT BULLETIN ( AVOIR )? MOT ps= paramsMot | ARTICLE ( AVOIR )? TITRE ps= paramsMot | ( EVERY )? ARTICLE | ( EVERY )? BULLETIN | ARTICLE ( AVOIR )? AUTEUR ps= paramsAnnee | BULLETIN ( AVOIR )? AUTEUR ps= paramsAnnee | ARTICLE ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | BULLETIN ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween )
			int alt60=20;
			alt60 = dfa60.predict(input);
			switch (alt60) {
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
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:233:4: BULLETIN ( AVOIR )? MOT ps= paramsMot
					{
					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete962); 
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:233:13: ( AVOIR )?
					int alt50=2;
					int LA50_0 = input.LA(1);
					if ( (LA50_0==AVOIR) ) {
						alt50=1;
					}
					switch (alt50) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:233:13: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete964); 
							}
							break;

					}

					match(input,MOT,FOLLOW_MOT_in_requete967); 
					pushFollow(FOLLOW_paramsMot_in_requete971);
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
				case 12 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:242:4: COUNT ARTICLE ( AVOIR )? MOT ps= paramsMot
					{
					match(input,COUNT,FOLLOW_COUNT_in_requete980); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete982); 
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:242:18: ( AVOIR )?
					int alt51=2;
					int LA51_0 = input.LA(1);
					if ( (LA51_0==AVOIR) ) {
						alt51=1;
					}
					switch (alt51) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:242:18: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete984); 
							}
							break;

					}

					match(input,MOT,FOLLOW_MOT_in_requete987); 
					pushFollow(FOLLOW_paramsMot_in_requete991);
					ps=paramsMot();
					state._fsp--;


							req_arbre.ajouteFils(new Arbre("","SELECT COUNT(DISTINCT fichier)"));
							req_arbre.ajouteFils(new Arbre("","FROM titretext"));
							req_arbre.ajouteFils(new Arbre("","WHERE"));
							ps_arbre = ps;
							req_arbre.ajouteFils(ps_arbre);
						
					}
					break;
				case 13 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:250:4: COUNT BULLETIN ( AVOIR )? MOT ps= paramsMot
					{
					match(input,COUNT,FOLLOW_COUNT_in_requete1002); 
					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete1004); 
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:250:19: ( AVOIR )?
					int alt52=2;
					int LA52_0 = input.LA(1);
					if ( (LA52_0==AVOIR) ) {
						alt52=1;
					}
					switch (alt52) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:250:19: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete1006); 
							}
							break;

					}

					match(input,MOT,FOLLOW_MOT_in_requete1009); 
					pushFollow(FOLLOW_paramsMot_in_requete1013);
					ps=paramsMot();
					state._fsp--;


							req_arbre.ajouteFils(new Arbre("","SELECT COUNT(DISTINCT numero)"));
							req_arbre.ajouteFils(new Arbre("","FROM titretext"));
							req_arbre.ajouteFils(new Arbre("","WHERE"));
							ps_arbre = ps;
							req_arbre.ajouteFils(ps_arbre);
						
					}
					break;
				case 14 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:258:4: ARTICLE ( AVOIR )? TITRE ps= paramsMot
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1022); 
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:258:12: ( AVOIR )?
					int alt53=2;
					int LA53_0 = input.LA(1);
					if ( (LA53_0==AVOIR) ) {
						alt53=1;
					}
					switch (alt53) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:258:12: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete1024); 
							}
							break;

					}

					match(input,TITRE,FOLLOW_TITRE_in_requete1027); 
					pushFollow(FOLLOW_paramsMot_in_requete1031);
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
				case 15 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:267:4: ( EVERY )? ARTICLE
					{
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:267:4: ( EVERY )?
					int alt54=2;
					int LA54_0 = input.LA(1);
					if ( (LA54_0==EVERY) ) {
						alt54=1;
					}
					switch (alt54) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:267:4: EVERY
							{
							match(input,EVERY,FOLLOW_EVERY_in_requete1040); 
							}
							break;

					}

					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1043); 

							req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
							req_arbre.ajouteFils(new Arbre("","fichier"));
							req_arbre.ajouteFils(new Arbre("","FROM numero"));
						
					}
					break;
				case 16 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:273:4: ( EVERY )? BULLETIN
					{
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:273:4: ( EVERY )?
					int alt55=2;
					int LA55_0 = input.LA(1);
					if ( (LA55_0==EVERY) ) {
						alt55=1;
					}
					switch (alt55) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:273:4: EVERY
							{
							match(input,EVERY,FOLLOW_EVERY_in_requete1052); 
							}
							break;

					}

					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete1055); 

							req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
							req_arbre.ajouteFils(new Arbre("","numero"));
							req_arbre.ajouteFils(new Arbre("","FROM numero"));
						
					}
					break;
				case 17 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:279:4: ARTICLE ( AVOIR )? AUTEUR ps= paramsAnnee
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1064); 
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:279:12: ( AVOIR )?
					int alt56=2;
					int LA56_0 = input.LA(1);
					if ( (LA56_0==AVOIR) ) {
						alt56=1;
					}
					switch (alt56) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:279:12: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete1066); 
							}
							break;

					}

					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1069); 
					pushFollow(FOLLOW_paramsAnnee_in_requete1073);
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
				case 18 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:288:4: BULLETIN ( AVOIR )? AUTEUR ps= paramsAnnee
					{
					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete1082); 
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:288:13: ( AVOIR )?
					int alt57=2;
					int LA57_0 = input.LA(1);
					if ( (LA57_0==AVOIR) ) {
						alt57=1;
					}
					switch (alt57) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:288:13: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete1084); 
							}
							break;

					}

					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1087); 
					pushFollow(FOLLOW_paramsAnnee_in_requete1091);
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
				case 19 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:297:4: ARTICLE ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1100); 
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:297:12: ( AVOIR )?
					int alt58=2;
					int LA58_0 = input.LA(1);
					if ( (LA58_0==AVOIR) ) {
						alt58=1;
					}
					switch (alt58) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:297:12: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete1102); 
							}
							break;

					}

					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1105); 
					match(input,ENTRE,FOLLOW_ENTRE_in_requete1107); 
					pushFollow(FOLLOW_paramAnneeBetween_in_requete1111);
					annee1=paramAnneeBetween();
					state._fsp--;

					match(input,CONJET,FOLLOW_CONJET_in_requete1113); 
					pushFollow(FOLLOW_paramAnneeBetween_in_requete1117);
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
				case 20 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:309:4: BULLETIN ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween
					{
					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete1125); 
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:309:13: ( AVOIR )?
					int alt59=2;
					int LA59_0 = input.LA(1);
					if ( (LA59_0==AVOIR) ) {
						alt59=1;
					}
					switch (alt59) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:309:13: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete1127); 
							}
							break;

					}

					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1130); 
					match(input,ENTRE,FOLLOW_ENTRE_in_requete1132); 
					pushFollow(FOLLOW_paramAnneeBetween_in_requete1136);
					annee1=paramAnneeBetween();
					state._fsp--;

					match(input,CONJET,FOLLOW_CONJET_in_requete1138); 
					pushFollow(FOLLOW_paramAnneeBetween_in_requete1142);
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
	// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:323:1: paramsMot returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= paramMot ( CONJOU par2= paramMot | ( CONJET )? par2= paramMot )* ;
	public final Arbre paramsMot() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:324:40: (par1= paramMot ( CONJOU par2= paramMot | ( CONJET )? par2= paramMot )* )
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:325:3: par1= paramMot ( CONJOU par2= paramMot | ( CONJET )? par2= paramMot )*
			{
			pushFollow(FOLLOW_paramMot_in_paramsMot1172);
			par1=paramMot();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:330:3: ( CONJOU par2= paramMot | ( CONJET )? par2= paramMot )*
			loop62:
			while (true) {
				int alt62=3;
				switch ( input.LA(1) ) {
				case CONJET:
					{
					int LA62_1 = input.LA(2);
					if ( (LA62_1==VAR) ) {
						alt62=2;
					}

					}
					break;
				case CONJOU:
					{
					alt62=1;
					}
					break;
				case VAR:
					{
					alt62=2;
					}
					break;
				}
				switch (alt62) {
				case 1 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:330:4: CONJOU par2= paramMot
					{
					match(input,CONJOU,FOLLOW_CONJOU_in_paramsMot1183); 
					pushFollow(FOLLOW_paramMot_in_paramsMot1189);
					par2=paramMot();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "OR"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;
				case 2 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:336:5: ( CONJET )? par2= paramMot
					{
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:336:5: ( CONJET )?
					int alt61=2;
					int LA61_0 = input.LA(1);
					if ( (LA61_0==CONJET) ) {
						alt61=1;
					}
					switch (alt61) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:336:5: CONJET
							{
							match(input,CONJET,FOLLOW_CONJET_in_paramsMot1200); 
							}
							break;

					}

					pushFollow(FOLLOW_paramMot_in_paramsMot1207);
					par2=paramMot();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "AND"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;

				default :
					break loop62;
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
	// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:345:1: paramMot returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
	public final Arbre paramMot() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:345:54: (a= VAR )
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:346:2: a= VAR
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_paramMot1235); 
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



	// $ANTLR start "paramsAnnee"
	// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:351:1: paramsAnnee returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= paramAnnee ( CONJOU par2= paramAnnee | CONJET par2= paramAnnee )* ;
	public final Arbre paramsAnnee() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:352:40: (par1= paramAnnee ( CONJOU par2= paramAnnee | CONJET par2= paramAnnee )* )
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:353:3: par1= paramAnnee ( CONJOU par2= paramAnnee | CONJET par2= paramAnnee )*
			{
			pushFollow(FOLLOW_paramAnnee_in_paramsAnnee1266);
			par1=paramAnnee();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:358:3: ( CONJOU par2= paramAnnee | CONJET par2= paramAnnee )*
			loop63:
			while (true) {
				int alt63=3;
				int LA63_0 = input.LA(1);
				if ( (LA63_0==CONJET) ) {
					int LA63_2 = input.LA(2);
					if ( (LA63_2==ANNEE) ) {
						alt63=2;
					}

				}
				else if ( (LA63_0==CONJOU) ) {
					alt63=1;
				}

				switch (alt63) {
				case 1 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:358:4: CONJOU par2= paramAnnee
					{
					match(input,CONJOU,FOLLOW_CONJOU_in_paramsAnnee1277); 
					pushFollow(FOLLOW_paramAnnee_in_paramsAnnee1283);
					par2=paramAnnee();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "OR"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;
				case 2 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:364:5: CONJET par2= paramAnnee
					{
					match(input,CONJET,FOLLOW_CONJET_in_paramsAnnee1294); 
					pushFollow(FOLLOW_paramAnnee_in_paramsAnnee1300);
					par2=paramAnnee();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "AND"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;

				default :
					break loop63;
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
	// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:373:1: paramAnnee returns [Arbre lepar_arbre = new Arbre(\"\")] : a= ANNEE ;
	public final Arbre paramAnnee() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:373:56: (a= ANNEE )
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:374:2: a= ANNEE
			{
			a=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_paramAnnee1328); 
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
	// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:378:1: paramsAnneeJointure returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= paramAnneeJointure ( CONJOU par2= paramAnneeJointure | CONJET par2= paramAnneeJointure )* ;
	public final Arbre paramsAnneeJointure() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:379:40: (par1= paramAnneeJointure ( CONJOU par2= paramAnneeJointure | CONJET par2= paramAnneeJointure )* )
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:380:3: par1= paramAnneeJointure ( CONJOU par2= paramAnneeJointure | CONJET par2= paramAnneeJointure )*
			{
			pushFollow(FOLLOW_paramAnneeJointure_in_paramsAnneeJointure1358);
			par1=paramAnneeJointure();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:385:3: ( CONJOU par2= paramAnneeJointure | CONJET par2= paramAnneeJointure )*
			loop64:
			while (true) {
				int alt64=3;
				int LA64_0 = input.LA(1);
				if ( (LA64_0==CONJOU) ) {
					alt64=1;
				}
				else if ( (LA64_0==CONJET) ) {
					alt64=2;
				}

				switch (alt64) {
				case 1 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:385:4: CONJOU par2= paramAnneeJointure
					{
					match(input,CONJOU,FOLLOW_CONJOU_in_paramsAnneeJointure1369); 
					pushFollow(FOLLOW_paramAnneeJointure_in_paramsAnneeJointure1375);
					par2=paramAnneeJointure();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "OR"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;
				case 2 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:391:5: CONJET par2= paramAnneeJointure
					{
					match(input,CONJET,FOLLOW_CONJET_in_paramsAnneeJointure1386); 
					pushFollow(FOLLOW_paramAnneeJointure_in_paramsAnneeJointure1392);
					par2=paramAnneeJointure();
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
	// $ANTLR end "paramsAnneeJointure"



	// $ANTLR start "paramAnneeJointure"
	// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:400:1: paramAnneeJointure returns [Arbre lepar_arbre = new Arbre(\"\")] : a= ANNEE ;
	public final Arbre paramAnneeJointure() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:400:64: (a= ANNEE )
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:401:2: a= ANNEE
			{
			a=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_paramAnneeJointure1420); 
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
	// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:405:1: paramAnneeBetween returns [Arbre lepar_arbre = new Arbre(\"\")] : a= ANNEE ;
	public final Arbre paramAnneeBetween() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:405:63: (a= ANNEE )
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:406:2: a= ANNEE
			{
			a=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_paramAnneeBetween1442); 
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


	protected DFA60 dfa60 = new DFA60(this);
	static final String DFA60_eotS =
		"\124\uffff";
	static final String DFA60_eofS =
		"\1\uffff\1\12\1\uffff\1\17\16\uffff\1\37\1\uffff\1\46\1\54\2\uffff\1\70"+
		"\1\76\2\uffff\1\37\14\uffff\1\54\21\uffff\1\76\3\uffff\1\37\2\uffff\2"+
		"\46\1\54\4\uffff\2\70\1\76\1\uffff\1\120\1\123\5\uffff";
	static final String DFA60_minS =
		"\1\5\1\6\1\uffff\1\6\2\5\1\6\1\24\1\4\1\24\1\uffff\1\6\1\24\1\4\1\24\3"+
		"\uffff\1\6\1\4\1\7\2\6\1\4\1\7\1\6\1\24\3\6\1\4\1\uffff\1\11\2\4\1\17"+
		"\3\uffff\1\24\3\6\1\4\1\uffff\1\24\3\6\1\4\1\11\2\4\1\17\3\uffff\1\24"+
		"\3\6\1\4\1\uffff\1\6\1\uffff\1\4\2\7\1\6\1\uffff\1\6\1\uffff\1\4\2\7\1"+
		"\6\1\uffff\2\7\1\17\1\uffff\1\7\1\17\1\uffff";
	static final String DFA60_maxS =
		"\1\20\1\23\1\uffff\1\23\2\10\1\23\1\24\1\15\1\24\1\uffff\1\23\1\24\1\15"+
		"\1\24\3\uffff\1\24\1\4\1\23\2\24\1\4\1\23\4\24\1\6\1\15\1\uffff\1\11\1"+
		"\4\2\23\3\uffff\3\24\1\6\1\15\1\uffff\3\24\1\6\1\15\1\11\1\4\2\23\3\uffff"+
		"\3\24\1\6\1\15\1\uffff\1\24\1\uffff\1\4\2\23\1\24\1\uffff\1\24\1\uffff"+
		"\1\4\2\23\1\24\1\uffff\3\23\1\uffff\2\23\1\uffff";
	static final String DFA60_acceptS =
		"\2\uffff\1\2\7\uffff\1\17\4\uffff\1\20\1\14\1\15\15\uffff\1\16\4\uffff"+
		"\1\1\1\6\1\21\5\uffff\1\12\11\uffff\1\3\1\7\1\22\5\uffff\1\13\1\uffff"+
		"\1\4\4\uffff\1\10\1\uffff\1\5\4\uffff\1\11\3\uffff\1\23\2\uffff\1\24";
	static final String DFA60_specialS =
		"\124\uffff}>";
	static final String[] DFA60_transitionS = {
			"\1\1\2\uffff\1\3\2\uffff\1\4\2\uffff\1\5\1\uffff\1\2",
			"\1\10\1\6\7\uffff\1\11\3\uffff\1\7",
			"",
			"\1\15\1\13\7\uffff\1\16\3\uffff\1\14",
			"\1\20\2\uffff\1\21",
			"\1\12\2\uffff\1\17",
			"\1\10\10\uffff\1\11\3\uffff\1\7",
			"\1\22",
			"\1\24\10\uffff\1\23",
			"\1\25",
			"",
			"\1\15\10\uffff\1\16\3\uffff\1\14",
			"\1\26",
			"\1\30\10\uffff\1\27",
			"\1\31",
			"",
			"",
			"",
			"\1\36\1\35\1\uffff\1\33\1\32\11\uffff\1\34",
			"\1\40",
			"\1\43\1\uffff\1\42\1\41\4\uffff\1\45\3\uffff\1\44",
			"\1\53\1\52\1\uffff\1\50\1\47\11\uffff\1\51",
			"\1\61\1\60\1\uffff\1\56\1\55\11\uffff\1\57",
			"\1\62",
			"\1\65\1\uffff\1\64\1\63\4\uffff\1\67\3\uffff\1\66",
			"\1\75\1\74\1\uffff\1\72\1\71\11\uffff\1\73",
			"\1\77",
			"\2\44\14\uffff\1\34",
			"\1\36\1\35\1\uffff\1\33\1\32\11\uffff\1\34",
			"\1\36",
			"\1\44\10\uffff\1\100",
			"",
			"\1\101",
			"\1\102",
			"\1\103\2\uffff\1\43\7\uffff\1\45\3\uffff\1\44",
			"\1\45\3\uffff\1\44",
			"",
			"",
			"",
			"\1\104",
			"\1\53\1\52\14\uffff\1\51",
			"\1\53\1\52\1\uffff\1\50\1\47\11\uffff\1\51",
			"\1\53",
			"\1\45\10\uffff\1\105",
			"",
			"\1\106",
			"\1\61\1\60\14\uffff\1\57",
			"\1\61\1\60\1\uffff\1\56\1\55\11\uffff\1\57",
			"\1\61",
			"\1\66\10\uffff\1\107",
			"\1\110",
			"\1\111",
			"\1\112\2\uffff\1\65\7\uffff\1\67\3\uffff\1\66",
			"\1\67\3\uffff\1\66",
			"",
			"",
			"",
			"\1\113",
			"\1\75\1\74\14\uffff\1\73",
			"\1\75\1\74\1\uffff\1\72\1\71\11\uffff\1\73",
			"\1\75",
			"\1\67\10\uffff\1\114",
			"",
			"\1\36\1\35\1\uffff\1\33\1\32\11\uffff\1\34",
			"",
			"\1\115",
			"\1\43\1\uffff\1\42\1\41\4\uffff\1\45\3\uffff\1\44",
			"\1\43\1\uffff\1\42\1\41\4\uffff\1\45\3\uffff\1\44",
			"\1\53\1\52\1\uffff\1\50\1\47\11\uffff\1\51",
			"",
			"\1\61\1\60\1\uffff\1\56\1\55\11\uffff\1\57",
			"",
			"\1\116",
			"\1\65\1\uffff\1\64\1\63\4\uffff\1\67\3\uffff\1\66",
			"\1\65\1\uffff\1\64\1\63\4\uffff\1\67\3\uffff\1\66",
			"\1\75\1\74\1\uffff\1\72\1\71\11\uffff\1\73",
			"",
			"\1\117\1\uffff\1\105\5\uffff\1\105\3\uffff\1\100",
			"\1\122\1\uffff\1\121\5\uffff\1\114\3\uffff\1\107",
			"\1\105\3\uffff\1\100",
			"",
			"\1\122\7\uffff\1\114\3\uffff\1\107",
			"\1\114\3\uffff\1\107",
			""
	};

	static final short[] DFA60_eot = DFA.unpackEncodedString(DFA60_eotS);
	static final short[] DFA60_eof = DFA.unpackEncodedString(DFA60_eofS);
	static final char[] DFA60_min = DFA.unpackEncodedStringToUnsignedChars(DFA60_minS);
	static final char[] DFA60_max = DFA.unpackEncodedStringToUnsignedChars(DFA60_maxS);
	static final short[] DFA60_accept = DFA.unpackEncodedString(DFA60_acceptS);
	static final short[] DFA60_special = DFA.unpackEncodedString(DFA60_specialS);
	static final short[][] DFA60_transition;

	static {
		int numStates = DFA60_transitionS.length;
		DFA60_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA60_transition[i] = DFA.unpackEncodedString(DFA60_transitionS[i]);
		}
	}

	protected class DFA60 extends DFA {

		public DFA60(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 60;
			this.eot = DFA60_eot;
			this.eof = DFA60_eof;
			this.min = DFA60_min;
			this.max = DFA60_max;
			this.accept = DFA60_accept;
			this.special = DFA60_special;
			this.transition = DFA60_transition;
		}
		@Override
		public String getDescription() {
			return "79:10: ( ARTICLE ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | RUBRIQUE ARTICLE ( AVOIR )? MOT ps= paramsMot | BULLETIN ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ARTICLE ( AVOIR )? ( TITRE ps= paramsMot ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( AVOIR )? TITRE ps= paramsMot ) | BULLETIN ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ARTICLE ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | BULLETIN ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ARTICLE ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | BULLETIN ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ARTICLE ( AVOIR )? MOT ps= paramsMot | BULLETIN ( AVOIR )? MOT ps= paramsMot | COUNT ARTICLE ( AVOIR )? MOT ps= paramsMot | COUNT BULLETIN ( AVOIR )? MOT ps= paramsMot | ARTICLE ( AVOIR )? TITRE ps= paramsMot | ( EVERY )? ARTICLE | ( EVERY )? BULLETIN | ARTICLE ( AVOIR )? AUTEUR ps= paramsAnnee | BULLETIN ( AVOIR )? AUTEUR ps= paramsAnnee | ARTICLE ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | BULLETIN ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween )";
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
	public static final BitSet FOLLOW_BULLETIN_in_requete962 = new BitSet(new long[]{0x0000000000008080L});
	public static final BitSet FOLLOW_AVOIR_in_requete964 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOT_in_requete967 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete971 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COUNT_in_requete980 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ARTICLE_in_requete982 = new BitSet(new long[]{0x0000000000008080L});
	public static final BitSet FOLLOW_AVOIR_in_requete984 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOT_in_requete987 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete991 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COUNT_in_requete1002 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_BULLETIN_in_requete1004 = new BitSet(new long[]{0x0000000000008080L});
	public static final BitSet FOLLOW_AVOIR_in_requete1006 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOT_in_requete1009 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete1013 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1022 = new BitSet(new long[]{0x0000000000080080L});
	public static final BitSet FOLLOW_AVOIR_in_requete1024 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_TITRE_in_requete1027 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete1031 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EVERY_in_requete1040 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1043 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EVERY_in_requete1052 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_BULLETIN_in_requete1055 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1064 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete1066 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1069 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramsAnnee_in_requete1073 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BULLETIN_in_requete1082 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete1084 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1087 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramsAnnee_in_requete1091 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1100 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete1102 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1105 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ENTRE_in_requete1107 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete1111 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CONJET_in_requete1113 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete1117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BULLETIN_in_requete1125 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete1127 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1130 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ENTRE_in_requete1132 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete1136 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CONJET_in_requete1138 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete1142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramMot_in_paramsMot1172 = new BitSet(new long[]{0x0000000000100602L});
	public static final BitSet FOLLOW_CONJOU_in_paramsMot1183 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramMot_in_paramsMot1189 = new BitSet(new long[]{0x0000000000100602L});
	public static final BitSet FOLLOW_CONJET_in_paramsMot1200 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramMot_in_paramsMot1207 = new BitSet(new long[]{0x0000000000100602L});
	public static final BitSet FOLLOW_VAR_in_paramMot1235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramAnnee_in_paramsAnnee1266 = new BitSet(new long[]{0x0000000000000602L});
	public static final BitSet FOLLOW_CONJOU_in_paramsAnnee1277 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnnee_in_paramsAnnee1283 = new BitSet(new long[]{0x0000000000000602L});
	public static final BitSet FOLLOW_CONJET_in_paramsAnnee1294 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnnee_in_paramsAnnee1300 = new BitSet(new long[]{0x0000000000000602L});
	public static final BitSet FOLLOW_ANNEE_in_paramAnnee1328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramAnneeJointure_in_paramsAnneeJointure1358 = new BitSet(new long[]{0x0000000000000602L});
	public static final BitSet FOLLOW_CONJOU_in_paramsAnneeJointure1369 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeJointure_in_paramsAnneeJointure1375 = new BitSet(new long[]{0x0000000000000602L});
	public static final BitSet FOLLOW_CONJET_in_paramsAnneeJointure1386 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeJointure_in_paramsAnneeJointure1392 = new BitSet(new long[]{0x0000000000000602L});
	public static final BitSet FOLLOW_ANNEE_in_paramAnneeJointure1420 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANNEE_in_paramAnneeBetween1442 = new BitSet(new long[]{0x0000000000000002L});
}
