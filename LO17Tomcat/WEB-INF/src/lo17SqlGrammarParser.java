// $ANTLR 3.5.1 C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g 2016-06-17 11:31:05

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
	// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:66:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( SELECT )? ( ARTICLE ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | BULLETIN ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ARTICLE ( AVOIR )? ( TITRE ps= paramsMot ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( AVOIR )? TITRE ps= paramsMot ) | BULLETIN ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ARTICLE ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | BULLETIN ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ARTICLE ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | BULLETIN ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ARTICLE ( AVOIR )? MOT ps= paramsMot | BULLETIN ( AVOIR )? MOT ps= paramsMot | COUNT ARTICLE ( AVOIR )? MOT ps= paramsMot | COUNT BULLETIN ( AVOIR )? MOT ps= paramsMot | ARTICLE ( AVOIR )? TITRE ps= paramsMot | ( EVERY )? ARTICLE | ( EVERY )? BULLETIN | ARTICLE ( AVOIR )? AUTEUR ps= paramsAnnee | BULLETIN ( AVOIR )? AUTEUR ps= paramsAnnee | ARTICLE ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | BULLETIN ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ) ;
	public final Arbre requete() throws RecognitionException {
		Arbre req_arbre =  new Arbre("");


		Arbre ps =null;
		Arbre psAnnee =null;
		Arbre annee1 =null;
		Arbre annee2 =null;

		Arbre ps_arbre;
		try {
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:67:26: ( ( SELECT )? ( ARTICLE ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | BULLETIN ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ARTICLE ( AVOIR )? ( TITRE ps= paramsMot ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( AVOIR )? TITRE ps= paramsMot ) | BULLETIN ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ARTICLE ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | BULLETIN ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ARTICLE ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | BULLETIN ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ARTICLE ( AVOIR )? MOT ps= paramsMot | BULLETIN ( AVOIR )? MOT ps= paramsMot | COUNT ARTICLE ( AVOIR )? MOT ps= paramsMot | COUNT BULLETIN ( AVOIR )? MOT ps= paramsMot | ARTICLE ( AVOIR )? TITRE ps= paramsMot | ( EVERY )? ARTICLE | ( EVERY )? BULLETIN | ARTICLE ( AVOIR )? AUTEUR ps= paramsAnnee | BULLETIN ( AVOIR )? AUTEUR ps= paramsAnnee | ARTICLE ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | BULLETIN ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ) )
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:79:2: ( SELECT )? ( ARTICLE ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | BULLETIN ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ARTICLE ( AVOIR )? ( TITRE ps= paramsMot ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( AVOIR )? TITRE ps= paramsMot ) | BULLETIN ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ARTICLE ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | BULLETIN ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ARTICLE ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | BULLETIN ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ARTICLE ( AVOIR )? MOT ps= paramsMot | BULLETIN ( AVOIR )? MOT ps= paramsMot | COUNT ARTICLE ( AVOIR )? MOT ps= paramsMot | COUNT BULLETIN ( AVOIR )? MOT ps= paramsMot | ARTICLE ( AVOIR )? TITRE ps= paramsMot | ( EVERY )? ARTICLE | ( EVERY )? BULLETIN | ARTICLE ( AVOIR )? AUTEUR ps= paramsAnnee | BULLETIN ( AVOIR )? AUTEUR ps= paramsAnnee | ARTICLE ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | BULLETIN ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween )
			{
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:79:2: ( SELECT )?
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

			}

			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:79:10: ( ARTICLE ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | BULLETIN ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ARTICLE ( AVOIR )? ( TITRE ps= paramsMot ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( AVOIR )? TITRE ps= paramsMot ) | BULLETIN ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ARTICLE ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | BULLETIN ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ARTICLE ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | BULLETIN ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ARTICLE ( AVOIR )? MOT ps= paramsMot | BULLETIN ( AVOIR )? MOT ps= paramsMot | COUNT ARTICLE ( AVOIR )? MOT ps= paramsMot | COUNT BULLETIN ( AVOIR )? MOT ps= paramsMot | ARTICLE ( AVOIR )? TITRE ps= paramsMot | ( EVERY )? ARTICLE | ( EVERY )? BULLETIN | ARTICLE ( AVOIR )? AUTEUR ps= paramsAnnee | BULLETIN ( AVOIR )? AUTEUR ps= paramsAnnee | ARTICLE ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | BULLETIN ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween )
			int alt59=19;
			alt59 = dfa59.predict(input);
			switch (alt59) {
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
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:94:4: BULLETIN ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot )
					{
					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete464); 
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:94:13: ( AVOIR )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==AVOIR) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:94:13: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete466); 
							}
							break;

					}

					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:94:20: ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot )
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==TITRE) ) {
						alt13=1;
					}
					else if ( (LA13_0==AUTEUR) ) {
						alt13=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 13, 0, input);
						throw nvae;
					}

					switch (alt13) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:94:21: TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee
							{
							match(input,TITRE,FOLLOW_TITRE_in_requete470); 
							pushFollow(FOLLOW_paramsMot_in_requete474);
							ps=paramsMot();
							state._fsp--;

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:94:40: ( CONJET )?
							int alt9=2;
							int LA9_0 = input.LA(1);
							if ( (LA9_0==CONJET) ) {
								alt9=1;
							}
							switch (alt9) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:94:40: CONJET
									{
									match(input,CONJET,FOLLOW_CONJET_in_requete476); 
									}
									break;

							}

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:94:48: ( AVOIR )?
							int alt10=2;
							int LA10_0 = input.LA(1);
							if ( (LA10_0==AVOIR) ) {
								alt10=1;
							}
							switch (alt10) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:94:48: AVOIR
									{
									match(input,AVOIR,FOLLOW_AVOIR_in_requete479); 
									}
									break;

							}

							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete482); 
							pushFollow(FOLLOW_paramsAnnee_in_requete486);
							psAnnee=paramsAnnee();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:94:84: AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot
							{
							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete490); 
							pushFollow(FOLLOW_paramsAnnee_in_requete494);
							psAnnee=paramsAnnee();
							state._fsp--;

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:94:111: ( CONJET )?
							int alt11=2;
							int LA11_0 = input.LA(1);
							if ( (LA11_0==CONJET) ) {
								alt11=1;
							}
							switch (alt11) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:94:111: CONJET
									{
									match(input,CONJET,FOLLOW_CONJET_in_requete496); 
									}
									break;

							}

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:94:119: ( AVOIR )?
							int alt12=2;
							int LA12_0 = input.LA(1);
							if ( (LA12_0==AVOIR) ) {
								alt12=1;
							}
							switch (alt12) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:94:119: AVOIR
									{
									match(input,AVOIR,FOLLOW_AVOIR_in_requete499); 
									}
									break;

							}

							match(input,TITRE,FOLLOW_TITRE_in_requete502); 
							pushFollow(FOLLOW_paramsMot_in_requete506);
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
				case 3 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:109:4: ARTICLE ( AVOIR )? ( TITRE ps= paramsMot ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( AVOIR )? TITRE ps= paramsMot )
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete520); 
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:109:12: ( AVOIR )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==AVOIR) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:109:12: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete522); 
							}
							break;

					}

					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:109:19: ( TITRE ps= paramsMot ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( AVOIR )? TITRE ps= paramsMot )
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==TITRE) ) {
						alt17=1;
					}
					else if ( (LA17_0==AUTEUR) ) {
						alt17=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 17, 0, input);
						throw nvae;
					}

					switch (alt17) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:109:20: TITRE ps= paramsMot ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween
							{
							match(input,TITRE,FOLLOW_TITRE_in_requete526); 
							pushFollow(FOLLOW_paramsMot_in_requete530);
							ps=paramsMot();
							state._fsp--;

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:109:39: ( AVOIR )?
							int alt15=2;
							int LA15_0 = input.LA(1);
							if ( (LA15_0==AVOIR) ) {
								alt15=1;
							}
							switch (alt15) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:109:39: AVOIR
									{
									match(input,AVOIR,FOLLOW_AVOIR_in_requete532); 
									}
									break;

							}

							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete535); 
							match(input,ENTRE,FOLLOW_ENTRE_in_requete537); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete541);
							annee1=paramAnneeBetween();
							state._fsp--;

							match(input,CONJET,FOLLOW_CONJET_in_requete543); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete547);
							annee2=paramAnneeBetween();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:109:118: AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( AVOIR )? TITRE ps= paramsMot
							{
							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete551); 
							match(input,ENTRE,FOLLOW_ENTRE_in_requete553); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete557);
							annee1=paramAnneeBetween();
							state._fsp--;

							match(input,CONJET,FOLLOW_CONJET_in_requete559); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete563);
							annee2=paramAnneeBetween();
							state._fsp--;

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:109:188: ( AVOIR )?
							int alt16=2;
							int LA16_0 = input.LA(1);
							if ( (LA16_0==AVOIR) ) {
								alt16=1;
							}
							switch (alt16) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:109:188: AVOIR
									{
									match(input,AVOIR,FOLLOW_AVOIR_in_requete565); 
									}
									break;

							}

							match(input,TITRE,FOLLOW_TITRE_in_requete568); 
							pushFollow(FOLLOW_paramsMot_in_requete572);
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
				case 4 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:127:4: BULLETIN ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? TITRE ps= paramsMot )
					{
					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete586); 
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:127:13: ( AVOIR )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==AVOIR) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:127:13: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete588); 
							}
							break;

					}

					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:127:20: ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? TITRE ps= paramsMot )
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==TITRE) ) {
						alt23=1;
					}
					else if ( (LA23_0==AUTEUR) ) {
						alt23=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 23, 0, input);
						throw nvae;
					}

					switch (alt23) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:127:21: TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween
							{
							match(input,TITRE,FOLLOW_TITRE_in_requete592); 
							pushFollow(FOLLOW_paramsMot_in_requete596);
							ps=paramsMot();
							state._fsp--;

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:127:40: ( CONJET )?
							int alt19=2;
							int LA19_0 = input.LA(1);
							if ( (LA19_0==CONJET) ) {
								alt19=1;
							}
							switch (alt19) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:127:40: CONJET
									{
									match(input,CONJET,FOLLOW_CONJET_in_requete598); 
									}
									break;

							}

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:127:48: ( AVOIR )?
							int alt20=2;
							int LA20_0 = input.LA(1);
							if ( (LA20_0==AVOIR) ) {
								alt20=1;
							}
							switch (alt20) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:127:48: AVOIR
									{
									match(input,AVOIR,FOLLOW_AVOIR_in_requete601); 
									}
									break;

							}

							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete604); 
							match(input,ENTRE,FOLLOW_ENTRE_in_requete606); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete610);
							annee1=paramAnneeBetween();
							state._fsp--;

							match(input,CONJET,FOLLOW_CONJET_in_requete612); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete616);
							annee2=paramAnneeBetween();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:127:127: AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? TITRE ps= paramsMot
							{
							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete620); 
							match(input,ENTRE,FOLLOW_ENTRE_in_requete622); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete626);
							annee1=paramAnneeBetween();
							state._fsp--;

							match(input,CONJET,FOLLOW_CONJET_in_requete628); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete632);
							annee2=paramAnneeBetween();
							state._fsp--;

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:127:197: ( CONJET )?
							int alt21=2;
							int LA21_0 = input.LA(1);
							if ( (LA21_0==CONJET) ) {
								alt21=1;
							}
							switch (alt21) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:127:197: CONJET
									{
									match(input,CONJET,FOLLOW_CONJET_in_requete634); 
									}
									break;

							}

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:127:205: ( AVOIR )?
							int alt22=2;
							int LA22_0 = input.LA(1);
							if ( (LA22_0==AVOIR) ) {
								alt22=1;
							}
							switch (alt22) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:127:205: AVOIR
									{
									match(input,AVOIR,FOLLOW_AVOIR_in_requete637); 
									}
									break;

							}

							match(input,TITRE,FOLLOW_TITRE_in_requete640); 
							pushFollow(FOLLOW_paramsMot_in_requete644);
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
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:149:4: ARTICLE ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot )
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete666); 
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:149:12: ( AVOIR )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==AVOIR) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:149:12: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete668); 
							}
							break;

					}

					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:149:19: ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot )
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==MOT) ) {
						alt29=1;
					}
					else if ( (LA29_0==AUTEUR) ) {
						alt29=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 29, 0, input);
						throw nvae;
					}

					switch (alt29) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:149:20: MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee
							{
							match(input,MOT,FOLLOW_MOT_in_requete672); 
							pushFollow(FOLLOW_paramsMot_in_requete676);
							ps=paramsMot();
							state._fsp--;

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:149:37: ( CONJET )?
							int alt25=2;
							int LA25_0 = input.LA(1);
							if ( (LA25_0==CONJET) ) {
								alt25=1;
							}
							switch (alt25) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:149:37: CONJET
									{
									match(input,CONJET,FOLLOW_CONJET_in_requete678); 
									}
									break;

							}

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:149:45: ( AVOIR )?
							int alt26=2;
							int LA26_0 = input.LA(1);
							if ( (LA26_0==AVOIR) ) {
								alt26=1;
							}
							switch (alt26) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:149:45: AVOIR
									{
									match(input,AVOIR,FOLLOW_AVOIR_in_requete681); 
									}
									break;

							}

							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete684); 
							pushFollow(FOLLOW_paramsAnnee_in_requete688);
							psAnnee=paramsAnnee();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:149:81: AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot
							{
							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete692); 
							pushFollow(FOLLOW_paramsAnnee_in_requete696);
							psAnnee=paramsAnnee();
							state._fsp--;

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:149:108: ( CONJET )?
							int alt27=2;
							int LA27_0 = input.LA(1);
							if ( (LA27_0==CONJET) ) {
								alt27=1;
							}
							switch (alt27) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:149:108: CONJET
									{
									match(input,CONJET,FOLLOW_CONJET_in_requete698); 
									}
									break;

							}

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:149:116: ( AVOIR )?
							int alt28=2;
							int LA28_0 = input.LA(1);
							if ( (LA28_0==AVOIR) ) {
								alt28=1;
							}
							switch (alt28) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:149:116: AVOIR
									{
									match(input,AVOIR,FOLLOW_AVOIR_in_requete701); 
									}
									break;

							}

							match(input,MOT,FOLLOW_MOT_in_requete704); 
							pushFollow(FOLLOW_paramsMot_in_requete708);
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
				case 6 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:164:4: BULLETIN ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot )
					{
					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete722); 
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:164:13: ( AVOIR )?
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==AVOIR) ) {
						alt30=1;
					}
					switch (alt30) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:164:13: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete724); 
							}
							break;

					}

					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:164:20: ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot )
					int alt35=2;
					int LA35_0 = input.LA(1);
					if ( (LA35_0==MOT) ) {
						alt35=1;
					}
					else if ( (LA35_0==AUTEUR) ) {
						alt35=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 35, 0, input);
						throw nvae;
					}

					switch (alt35) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:164:21: MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee
							{
							match(input,MOT,FOLLOW_MOT_in_requete728); 
							pushFollow(FOLLOW_paramsMot_in_requete732);
							ps=paramsMot();
							state._fsp--;

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:164:38: ( CONJET )?
							int alt31=2;
							int LA31_0 = input.LA(1);
							if ( (LA31_0==CONJET) ) {
								alt31=1;
							}
							switch (alt31) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:164:38: CONJET
									{
									match(input,CONJET,FOLLOW_CONJET_in_requete734); 
									}
									break;

							}

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:164:46: ( AVOIR )?
							int alt32=2;
							int LA32_0 = input.LA(1);
							if ( (LA32_0==AVOIR) ) {
								alt32=1;
							}
							switch (alt32) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:164:46: AVOIR
									{
									match(input,AVOIR,FOLLOW_AVOIR_in_requete737); 
									}
									break;

							}

							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete740); 
							pushFollow(FOLLOW_paramsAnnee_in_requete744);
							psAnnee=paramsAnnee();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:164:82: AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot
							{
							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete748); 
							pushFollow(FOLLOW_paramsAnnee_in_requete752);
							psAnnee=paramsAnnee();
							state._fsp--;

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:164:109: ( CONJET )?
							int alt33=2;
							int LA33_0 = input.LA(1);
							if ( (LA33_0==CONJET) ) {
								alt33=1;
							}
							switch (alt33) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:164:109: CONJET
									{
									match(input,CONJET,FOLLOW_CONJET_in_requete754); 
									}
									break;

							}

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:164:117: ( AVOIR )?
							int alt34=2;
							int LA34_0 = input.LA(1);
							if ( (LA34_0==AVOIR) ) {
								alt34=1;
							}
							switch (alt34) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:164:117: AVOIR
									{
									match(input,AVOIR,FOLLOW_AVOIR_in_requete757); 
									}
									break;

							}

							match(input,MOT,FOLLOW_MOT_in_requete760); 
							pushFollow(FOLLOW_paramsMot_in_requete764);
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
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:179:4: ARTICLE ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot )
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete778); 
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:179:12: ( AVOIR )?
					int alt36=2;
					int LA36_0 = input.LA(1);
					if ( (LA36_0==AVOIR) ) {
						alt36=1;
					}
					switch (alt36) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:179:12: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete780); 
							}
							break;

					}

					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:179:19: ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot )
					int alt41=2;
					int LA41_0 = input.LA(1);
					if ( (LA41_0==MOT) ) {
						alt41=1;
					}
					else if ( (LA41_0==AUTEUR) ) {
						alt41=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 41, 0, input);
						throw nvae;
					}

					switch (alt41) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:179:20: MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween
							{
							match(input,MOT,FOLLOW_MOT_in_requete784); 
							pushFollow(FOLLOW_paramsMot_in_requete788);
							ps=paramsMot();
							state._fsp--;

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:179:37: ( CONJET )?
							int alt37=2;
							int LA37_0 = input.LA(1);
							if ( (LA37_0==CONJET) ) {
								alt37=1;
							}
							switch (alt37) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:179:37: CONJET
									{
									match(input,CONJET,FOLLOW_CONJET_in_requete790); 
									}
									break;

							}

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:179:45: ( AVOIR )?
							int alt38=2;
							int LA38_0 = input.LA(1);
							if ( (LA38_0==AVOIR) ) {
								alt38=1;
							}
							switch (alt38) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:179:45: AVOIR
									{
									match(input,AVOIR,FOLLOW_AVOIR_in_requete793); 
									}
									break;

							}

							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete796); 
							match(input,ENTRE,FOLLOW_ENTRE_in_requete798); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete802);
							annee1=paramAnneeBetween();
							state._fsp--;

							match(input,CONJET,FOLLOW_CONJET_in_requete804); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete808);
							annee2=paramAnneeBetween();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:179:124: AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot
							{
							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete812); 
							match(input,ENTRE,FOLLOW_ENTRE_in_requete814); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete818);
							annee1=paramAnneeBetween();
							state._fsp--;

							match(input,CONJET,FOLLOW_CONJET_in_requete820); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete824);
							annee2=paramAnneeBetween();
							state._fsp--;

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:179:194: ( CONJET )?
							int alt39=2;
							int LA39_0 = input.LA(1);
							if ( (LA39_0==CONJET) ) {
								alt39=1;
							}
							switch (alt39) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:179:194: CONJET
									{
									match(input,CONJET,FOLLOW_CONJET_in_requete826); 
									}
									break;

							}

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:179:202: ( AVOIR )?
							int alt40=2;
							int LA40_0 = input.LA(1);
							if ( (LA40_0==AVOIR) ) {
								alt40=1;
							}
							switch (alt40) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:179:202: AVOIR
									{
									match(input,AVOIR,FOLLOW_AVOIR_in_requete829); 
									}
									break;

							}

							match(input,MOT,FOLLOW_MOT_in_requete832); 
							pushFollow(FOLLOW_paramsMot_in_requete836);
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
				case 8 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:197:4: BULLETIN ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot )
					{
					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete850); 
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:197:13: ( AVOIR )?
					int alt42=2;
					int LA42_0 = input.LA(1);
					if ( (LA42_0==AVOIR) ) {
						alt42=1;
					}
					switch (alt42) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:197:13: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete852); 
							}
							break;

					}

					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:197:20: ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot )
					int alt47=2;
					int LA47_0 = input.LA(1);
					if ( (LA47_0==MOT) ) {
						alt47=1;
					}
					else if ( (LA47_0==AUTEUR) ) {
						alt47=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 47, 0, input);
						throw nvae;
					}

					switch (alt47) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:197:21: MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween
							{
							match(input,MOT,FOLLOW_MOT_in_requete856); 
							pushFollow(FOLLOW_paramsMot_in_requete860);
							ps=paramsMot();
							state._fsp--;

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:197:38: ( CONJET )?
							int alt43=2;
							int LA43_0 = input.LA(1);
							if ( (LA43_0==CONJET) ) {
								alt43=1;
							}
							switch (alt43) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:197:38: CONJET
									{
									match(input,CONJET,FOLLOW_CONJET_in_requete862); 
									}
									break;

							}

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:197:46: ( AVOIR )?
							int alt44=2;
							int LA44_0 = input.LA(1);
							if ( (LA44_0==AVOIR) ) {
								alt44=1;
							}
							switch (alt44) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:197:46: AVOIR
									{
									match(input,AVOIR,FOLLOW_AVOIR_in_requete865); 
									}
									break;

							}

							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete868); 
							match(input,ENTRE,FOLLOW_ENTRE_in_requete870); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete874);
							annee1=paramAnneeBetween();
							state._fsp--;

							match(input,CONJET,FOLLOW_CONJET_in_requete876); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete880);
							annee2=paramAnneeBetween();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:197:125: AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot
							{
							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete884); 
							match(input,ENTRE,FOLLOW_ENTRE_in_requete886); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete890);
							annee1=paramAnneeBetween();
							state._fsp--;

							match(input,CONJET,FOLLOW_CONJET_in_requete892); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete896);
							annee2=paramAnneeBetween();
							state._fsp--;

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:197:195: ( CONJET )?
							int alt45=2;
							int LA45_0 = input.LA(1);
							if ( (LA45_0==CONJET) ) {
								alt45=1;
							}
							switch (alt45) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:197:195: CONJET
									{
									match(input,CONJET,FOLLOW_CONJET_in_requete898); 
									}
									break;

							}

							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:197:203: ( AVOIR )?
							int alt46=2;
							int LA46_0 = input.LA(1);
							if ( (LA46_0==AVOIR) ) {
								alt46=1;
							}
							switch (alt46) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:197:203: AVOIR
									{
									match(input,AVOIR,FOLLOW_AVOIR_in_requete901); 
									}
									break;

							}

							match(input,MOT,FOLLOW_MOT_in_requete904); 
							pushFollow(FOLLOW_paramsMot_in_requete908);
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
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:217:4: ARTICLE ( AVOIR )? MOT ps= paramsMot
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete926); 
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:217:12: ( AVOIR )?
					int alt48=2;
					int LA48_0 = input.LA(1);
					if ( (LA48_0==AVOIR) ) {
						alt48=1;
					}
					switch (alt48) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:217:12: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete928); 
							}
							break;

					}

					match(input,MOT,FOLLOW_MOT_in_requete931); 
					pushFollow(FOLLOW_paramsMot_in_requete935);
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
				case 10 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:226:4: BULLETIN ( AVOIR )? MOT ps= paramsMot
					{
					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete944); 
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:226:13: ( AVOIR )?
					int alt49=2;
					int LA49_0 = input.LA(1);
					if ( (LA49_0==AVOIR) ) {
						alt49=1;
					}
					switch (alt49) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:226:13: AVOIR
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
							req_arbre.ajouteFils(new Arbre("","numero"));
							req_arbre.ajouteFils(new Arbre("","FROM titretext"));
							req_arbre.ajouteFils(new Arbre("","WHERE"));
							ps_arbre = ps;
							req_arbre.ajouteFils(ps_arbre);
						
					}
					break;
				case 11 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:235:4: COUNT ARTICLE ( AVOIR )? MOT ps= paramsMot
					{
					match(input,COUNT,FOLLOW_COUNT_in_requete962); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete964); 
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:235:18: ( AVOIR )?
					int alt50=2;
					int LA50_0 = input.LA(1);
					if ( (LA50_0==AVOIR) ) {
						alt50=1;
					}
					switch (alt50) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:235:18: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete966); 
							}
							break;

					}

					match(input,MOT,FOLLOW_MOT_in_requete969); 
					pushFollow(FOLLOW_paramsMot_in_requete973);
					ps=paramsMot();
					state._fsp--;


							req_arbre.ajouteFils(new Arbre("","SELECT COUNT(DISTINCT fichier)"));
							req_arbre.ajouteFils(new Arbre("","FROM titretext"));
							req_arbre.ajouteFils(new Arbre("","WHERE"));
							ps_arbre = ps;
							req_arbre.ajouteFils(ps_arbre);
						
					}
					break;
				case 12 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:243:4: COUNT BULLETIN ( AVOIR )? MOT ps= paramsMot
					{
					match(input,COUNT,FOLLOW_COUNT_in_requete984); 
					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete986); 
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:243:19: ( AVOIR )?
					int alt51=2;
					int LA51_0 = input.LA(1);
					if ( (LA51_0==AVOIR) ) {
						alt51=1;
					}
					switch (alt51) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:243:19: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete988); 
							}
							break;

					}

					match(input,MOT,FOLLOW_MOT_in_requete991); 
					pushFollow(FOLLOW_paramsMot_in_requete995);
					ps=paramsMot();
					state._fsp--;


							req_arbre.ajouteFils(new Arbre("","SELECT COUNT(DISTINCT numero)"));
							req_arbre.ajouteFils(new Arbre("","FROM titretext"));
							req_arbre.ajouteFils(new Arbre("","WHERE"));
							ps_arbre = ps;
							req_arbre.ajouteFils(ps_arbre);
						
					}
					break;
				case 13 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:251:4: ARTICLE ( AVOIR )? TITRE ps= paramsMot
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1004); 
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:251:12: ( AVOIR )?
					int alt52=2;
					int LA52_0 = input.LA(1);
					if ( (LA52_0==AVOIR) ) {
						alt52=1;
					}
					switch (alt52) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:251:12: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete1006); 
							}
							break;

					}

					match(input,TITRE,FOLLOW_TITRE_in_requete1009); 
					pushFollow(FOLLOW_paramsMot_in_requete1013);
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
				case 14 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:260:4: ( EVERY )? ARTICLE
					{
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:260:4: ( EVERY )?
					int alt53=2;
					int LA53_0 = input.LA(1);
					if ( (LA53_0==EVERY) ) {
						alt53=1;
					}
					switch (alt53) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:260:4: EVERY
							{
							match(input,EVERY,FOLLOW_EVERY_in_requete1022); 
							}
							break;

					}

					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1025); 

							req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
							req_arbre.ajouteFils(new Arbre("","fichier"));
							req_arbre.ajouteFils(new Arbre("","FROM numero"));
						
					}
					break;
				case 15 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:266:4: ( EVERY )? BULLETIN
					{
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:266:4: ( EVERY )?
					int alt54=2;
					int LA54_0 = input.LA(1);
					if ( (LA54_0==EVERY) ) {
						alt54=1;
					}
					switch (alt54) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:266:4: EVERY
							{
							match(input,EVERY,FOLLOW_EVERY_in_requete1034); 
							}
							break;

					}

					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete1037); 

							req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
							req_arbre.ajouteFils(new Arbre("","numero"));
							req_arbre.ajouteFils(new Arbre("","FROM numero"));
						
					}
					break;
				case 16 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:272:4: ARTICLE ( AVOIR )? AUTEUR ps= paramsAnnee
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1046); 
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:272:12: ( AVOIR )?
					int alt55=2;
					int LA55_0 = input.LA(1);
					if ( (LA55_0==AVOIR) ) {
						alt55=1;
					}
					switch (alt55) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:272:12: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete1048); 
							}
							break;

					}

					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1051); 
					pushFollow(FOLLOW_paramsAnnee_in_requete1055);
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
				case 17 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:281:4: BULLETIN ( AVOIR )? AUTEUR ps= paramsAnnee
					{
					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete1064); 
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:281:13: ( AVOIR )?
					int alt56=2;
					int LA56_0 = input.LA(1);
					if ( (LA56_0==AVOIR) ) {
						alt56=1;
					}
					switch (alt56) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:281:13: AVOIR
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
							req_arbre.ajouteFils(new Arbre("","numero"));
							req_arbre.ajouteFils(new Arbre("","FROM date"));
							req_arbre.ajouteFils(new Arbre("","WHERE"));
							ps_arbre = ps;
							req_arbre.ajouteFils(ps_arbre);
						
					}
					break;
				case 18 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:290:4: ARTICLE ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1082); 
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:290:12: ( AVOIR )?
					int alt57=2;
					int LA57_0 = input.LA(1);
					if ( (LA57_0==AVOIR) ) {
						alt57=1;
					}
					switch (alt57) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:290:12: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete1084); 
							}
							break;

					}

					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1087); 
					match(input,ENTRE,FOLLOW_ENTRE_in_requete1089); 
					pushFollow(FOLLOW_paramAnneeBetween_in_requete1093);
					annee1=paramAnneeBetween();
					state._fsp--;

					match(input,CONJET,FOLLOW_CONJET_in_requete1095); 
					pushFollow(FOLLOW_paramAnneeBetween_in_requete1099);
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
				case 19 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:302:4: BULLETIN ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween
					{
					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete1107); 
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:302:13: ( AVOIR )?
					int alt58=2;
					int LA58_0 = input.LA(1);
					if ( (LA58_0==AVOIR) ) {
						alt58=1;
					}
					switch (alt58) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:302:13: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete1109); 
							}
							break;

					}

					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1112); 
					match(input,ENTRE,FOLLOW_ENTRE_in_requete1114); 
					pushFollow(FOLLOW_paramAnneeBetween_in_requete1118);
					annee1=paramAnneeBetween();
					state._fsp--;

					match(input,CONJET,FOLLOW_CONJET_in_requete1120); 
					pushFollow(FOLLOW_paramAnneeBetween_in_requete1124);
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
	// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:316:1: paramsMot returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= paramMot ( CONJOU par2= paramMot | ( CONJET )? par2= paramMot )* ;
	public final Arbre paramsMot() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:317:40: (par1= paramMot ( CONJOU par2= paramMot | ( CONJET )? par2= paramMot )* )
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:318:3: par1= paramMot ( CONJOU par2= paramMot | ( CONJET )? par2= paramMot )*
			{
			pushFollow(FOLLOW_paramMot_in_paramsMot1154);
			par1=paramMot();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:323:3: ( CONJOU par2= paramMot | ( CONJET )? par2= paramMot )*
			loop61:
			while (true) {
				int alt61=3;
				switch ( input.LA(1) ) {
				case CONJET:
					{
					int LA61_1 = input.LA(2);
					if ( (LA61_1==VAR) ) {
						alt61=2;
					}

					}
					break;
				case CONJOU:
					{
					alt61=1;
					}
					break;
				case VAR:
					{
					alt61=2;
					}
					break;
				}
				switch (alt61) {
				case 1 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:323:4: CONJOU par2= paramMot
					{
					match(input,CONJOU,FOLLOW_CONJOU_in_paramsMot1165); 
					pushFollow(FOLLOW_paramMot_in_paramsMot1171);
					par2=paramMot();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "OR"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;
				case 2 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:329:5: ( CONJET )? par2= paramMot
					{
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:329:5: ( CONJET )?
					int alt60=2;
					int LA60_0 = input.LA(1);
					if ( (LA60_0==CONJET) ) {
						alt60=1;
					}
					switch (alt60) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:329:5: CONJET
							{
							match(input,CONJET,FOLLOW_CONJET_in_paramsMot1182); 
							}
							break;

					}

					pushFollow(FOLLOW_paramMot_in_paramsMot1189);
					par2=paramMot();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "AND"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;

				default :
					break loop61;
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
	// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:338:1: paramMot returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
	public final Arbre paramMot() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:338:54: (a= VAR )
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:339:2: a= VAR
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_paramMot1217); 
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
	// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:344:1: paramsAnnee returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= paramAnnee ( CONJOU par2= paramAnnee | CONJET par2= paramAnnee )* ;
	public final Arbre paramsAnnee() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:345:40: (par1= paramAnnee ( CONJOU par2= paramAnnee | CONJET par2= paramAnnee )* )
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:346:3: par1= paramAnnee ( CONJOU par2= paramAnnee | CONJET par2= paramAnnee )*
			{
			pushFollow(FOLLOW_paramAnnee_in_paramsAnnee1248);
			par1=paramAnnee();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:351:3: ( CONJOU par2= paramAnnee | CONJET par2= paramAnnee )*
			loop62:
			while (true) {
				int alt62=3;
				int LA62_0 = input.LA(1);
				if ( (LA62_0==CONJET) ) {
					int LA62_2 = input.LA(2);
					if ( (LA62_2==ANNEE) ) {
						alt62=2;
					}

				}
				else if ( (LA62_0==CONJOU) ) {
					alt62=1;
				}

				switch (alt62) {
				case 1 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:351:4: CONJOU par2= paramAnnee
					{
					match(input,CONJOU,FOLLOW_CONJOU_in_paramsAnnee1259); 
					pushFollow(FOLLOW_paramAnnee_in_paramsAnnee1265);
					par2=paramAnnee();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "OR"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;
				case 2 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:357:5: CONJET par2= paramAnnee
					{
					match(input,CONJET,FOLLOW_CONJET_in_paramsAnnee1276); 
					pushFollow(FOLLOW_paramAnnee_in_paramsAnnee1282);
					par2=paramAnnee();
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
	// $ANTLR end "paramsAnnee"



	// $ANTLR start "paramAnnee"
	// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:366:1: paramAnnee returns [Arbre lepar_arbre = new Arbre(\"\")] : a= ANNEE ;
	public final Arbre paramAnnee() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:366:56: (a= ANNEE )
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:367:2: a= ANNEE
			{
			a=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_paramAnnee1310); 
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
	// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:371:1: paramsAnneeJointure returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= paramAnneeJointure ( CONJOU par2= paramAnneeJointure | CONJET par2= paramAnneeJointure )* ;
	public final Arbre paramsAnneeJointure() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:372:40: (par1= paramAnneeJointure ( CONJOU par2= paramAnneeJointure | CONJET par2= paramAnneeJointure )* )
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:373:3: par1= paramAnneeJointure ( CONJOU par2= paramAnneeJointure | CONJET par2= paramAnneeJointure )*
			{
			pushFollow(FOLLOW_paramAnneeJointure_in_paramsAnneeJointure1340);
			par1=paramAnneeJointure();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:378:3: ( CONJOU par2= paramAnneeJointure | CONJET par2= paramAnneeJointure )*
			loop63:
			while (true) {
				int alt63=3;
				int LA63_0 = input.LA(1);
				if ( (LA63_0==CONJOU) ) {
					alt63=1;
				}
				else if ( (LA63_0==CONJET) ) {
					alt63=2;
				}

				switch (alt63) {
				case 1 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:378:4: CONJOU par2= paramAnneeJointure
					{
					match(input,CONJOU,FOLLOW_CONJOU_in_paramsAnneeJointure1351); 
					pushFollow(FOLLOW_paramAnneeJointure_in_paramsAnneeJointure1357);
					par2=paramAnneeJointure();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "OR"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;
				case 2 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:384:5: CONJET par2= paramAnneeJointure
					{
					match(input,CONJET,FOLLOW_CONJET_in_paramsAnneeJointure1368); 
					pushFollow(FOLLOW_paramAnneeJointure_in_paramsAnneeJointure1374);
					par2=paramAnneeJointure();
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
	// $ANTLR end "paramsAnneeJointure"



	// $ANTLR start "paramAnneeJointure"
	// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:393:1: paramAnneeJointure returns [Arbre lepar_arbre = new Arbre(\"\")] : a= ANNEE ;
	public final Arbre paramAnneeJointure() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:393:64: (a= ANNEE )
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:394:2: a= ANNEE
			{
			a=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_paramAnneeJointure1402); 
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
	// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:398:1: paramAnneeBetween returns [Arbre lepar_arbre = new Arbre(\"\")] : a= ANNEE ;
	public final Arbre paramAnneeBetween() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:398:63: (a= ANNEE )
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:399:2: a= ANNEE
			{
			a=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_paramAnneeBetween1424); 
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


	protected DFA59 dfa59 = new DFA59(this);
	static final String DFA59_eotS =
		"\123\uffff";
	static final String DFA59_eofS =
		"\1\uffff\1\11\1\16\16\uffff\1\36\1\uffff\1\45\1\53\2\uffff\1\67\1\75\2"+
		"\uffff\1\36\14\uffff\1\53\21\uffff\1\75\3\uffff\1\36\2\uffff\2\45\1\53"+
		"\4\uffff\2\67\1\75\1\uffff\1\117\1\122\5\uffff";
	static final String DFA59_minS =
		"\1\5\2\6\2\5\1\6\1\24\1\4\1\24\1\uffff\1\6\1\24\1\4\1\24\3\uffff\1\6\1"+
		"\4\1\7\2\6\1\4\1\7\1\6\1\24\3\6\1\4\1\uffff\1\11\2\4\1\17\3\uffff\1\24"+
		"\3\6\1\4\1\uffff\1\24\3\6\1\4\1\11\2\4\1\17\3\uffff\1\24\3\6\1\4\1\uffff"+
		"\1\6\1\uffff\1\4\2\7\1\6\1\uffff\1\6\1\uffff\1\4\2\7\1\6\1\uffff\2\7\1"+
		"\17\1\uffff\1\7\1\17\1\uffff";
	static final String DFA59_maxS =
		"\1\16\2\23\2\10\1\23\1\24\1\15\1\24\1\uffff\1\23\1\24\1\15\1\24\3\uffff"+
		"\1\24\1\4\1\23\2\24\1\4\1\23\4\24\1\6\1\15\1\uffff\1\11\1\4\2\23\3\uffff"+
		"\3\24\1\6\1\15\1\uffff\3\24\1\6\1\15\1\11\1\4\2\23\3\uffff\3\24\1\6\1"+
		"\15\1\uffff\1\24\1\uffff\1\4\2\23\1\24\1\uffff\1\24\1\uffff\1\4\2\23\1"+
		"\24\1\uffff\3\23\1\uffff\2\23\1\uffff";
	static final String DFA59_acceptS =
		"\11\uffff\1\16\4\uffff\1\17\1\13\1\14\15\uffff\1\15\4\uffff\1\1\1\5\1"+
		"\20\5\uffff\1\11\11\uffff\1\2\1\6\1\21\5\uffff\1\12\1\uffff\1\3\4\uffff"+
		"\1\7\1\uffff\1\4\4\uffff\1\10\3\uffff\1\22\2\uffff\1\23";
	static final String DFA59_specialS =
		"\123\uffff}>";
	static final String[] DFA59_transitionS = {
			"\1\1\2\uffff\1\2\2\uffff\1\3\2\uffff\1\4",
			"\1\7\1\5\7\uffff\1\10\3\uffff\1\6",
			"\1\14\1\12\7\uffff\1\15\3\uffff\1\13",
			"\1\17\2\uffff\1\20",
			"\1\11\2\uffff\1\16",
			"\1\7\10\uffff\1\10\3\uffff\1\6",
			"\1\21",
			"\1\23\10\uffff\1\22",
			"\1\24",
			"",
			"\1\14\10\uffff\1\15\3\uffff\1\13",
			"\1\25",
			"\1\27\10\uffff\1\26",
			"\1\30",
			"",
			"",
			"",
			"\1\35\1\34\1\uffff\1\32\1\31\11\uffff\1\33",
			"\1\37",
			"\1\42\1\uffff\1\41\1\40\4\uffff\1\44\3\uffff\1\43",
			"\1\52\1\51\1\uffff\1\47\1\46\11\uffff\1\50",
			"\1\60\1\57\1\uffff\1\55\1\54\11\uffff\1\56",
			"\1\61",
			"\1\64\1\uffff\1\63\1\62\4\uffff\1\66\3\uffff\1\65",
			"\1\74\1\73\1\uffff\1\71\1\70\11\uffff\1\72",
			"\1\76",
			"\2\43\14\uffff\1\33",
			"\1\35\1\34\1\uffff\1\32\1\31\11\uffff\1\33",
			"\1\35",
			"\1\43\10\uffff\1\77",
			"",
			"\1\100",
			"\1\101",
			"\1\102\2\uffff\1\42\7\uffff\1\44\3\uffff\1\43",
			"\1\44\3\uffff\1\43",
			"",
			"",
			"",
			"\1\103",
			"\1\52\1\51\14\uffff\1\50",
			"\1\52\1\51\1\uffff\1\47\1\46\11\uffff\1\50",
			"\1\52",
			"\1\44\10\uffff\1\104",
			"",
			"\1\105",
			"\1\60\1\57\14\uffff\1\56",
			"\1\60\1\57\1\uffff\1\55\1\54\11\uffff\1\56",
			"\1\60",
			"\1\65\10\uffff\1\106",
			"\1\107",
			"\1\110",
			"\1\111\2\uffff\1\64\7\uffff\1\66\3\uffff\1\65",
			"\1\66\3\uffff\1\65",
			"",
			"",
			"",
			"\1\112",
			"\1\74\1\73\14\uffff\1\72",
			"\1\74\1\73\1\uffff\1\71\1\70\11\uffff\1\72",
			"\1\74",
			"\1\66\10\uffff\1\113",
			"",
			"\1\35\1\34\1\uffff\1\32\1\31\11\uffff\1\33",
			"",
			"\1\114",
			"\1\42\1\uffff\1\41\1\40\4\uffff\1\44\3\uffff\1\43",
			"\1\42\1\uffff\1\41\1\40\4\uffff\1\44\3\uffff\1\43",
			"\1\52\1\51\1\uffff\1\47\1\46\11\uffff\1\50",
			"",
			"\1\60\1\57\1\uffff\1\55\1\54\11\uffff\1\56",
			"",
			"\1\115",
			"\1\64\1\uffff\1\63\1\62\4\uffff\1\66\3\uffff\1\65",
			"\1\64\1\uffff\1\63\1\62\4\uffff\1\66\3\uffff\1\65",
			"\1\74\1\73\1\uffff\1\71\1\70\11\uffff\1\72",
			"",
			"\1\116\1\uffff\1\104\5\uffff\1\104\3\uffff\1\77",
			"\1\121\1\uffff\1\120\5\uffff\1\113\3\uffff\1\106",
			"\1\104\3\uffff\1\77",
			"",
			"\1\121\7\uffff\1\113\3\uffff\1\106",
			"\1\113\3\uffff\1\106",
			""
	};

	static final short[] DFA59_eot = DFA.unpackEncodedString(DFA59_eotS);
	static final short[] DFA59_eof = DFA.unpackEncodedString(DFA59_eofS);
	static final char[] DFA59_min = DFA.unpackEncodedStringToUnsignedChars(DFA59_minS);
	static final char[] DFA59_max = DFA.unpackEncodedStringToUnsignedChars(DFA59_maxS);
	static final short[] DFA59_accept = DFA.unpackEncodedString(DFA59_acceptS);
	static final short[] DFA59_special = DFA.unpackEncodedString(DFA59_specialS);
	static final short[][] DFA59_transition;

	static {
		int numStates = DFA59_transitionS.length;
		DFA59_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA59_transition[i] = DFA.unpackEncodedString(DFA59_transitionS[i]);
		}
	}

	protected class DFA59 extends DFA {

		public DFA59(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 59;
			this.eot = DFA59_eot;
			this.eof = DFA59_eof;
			this.min = DFA59_min;
			this.max = DFA59_max;
			this.accept = DFA59_accept;
			this.special = DFA59_special;
			this.transition = DFA59_transition;
		}
		@Override
		public String getDescription() {
			return "79:10: ( ARTICLE ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | BULLETIN ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ARTICLE ( AVOIR )? ( TITRE ps= paramsMot ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( AVOIR )? TITRE ps= paramsMot ) | BULLETIN ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ARTICLE ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | BULLETIN ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ARTICLE ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | BULLETIN ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ARTICLE ( AVOIR )? MOT ps= paramsMot | BULLETIN ( AVOIR )? MOT ps= paramsMot | COUNT ARTICLE ( AVOIR )? MOT ps= paramsMot | COUNT BULLETIN ( AVOIR )? MOT ps= paramsMot | ARTICLE ( AVOIR )? TITRE ps= paramsMot | ( EVERY )? ARTICLE | ( EVERY )? BULLETIN | ARTICLE ( AVOIR )? AUTEUR ps= paramsAnnee | BULLETIN ( AVOIR )? AUTEUR ps= paramsAnnee | ARTICLE ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | BULLETIN ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween )";
		}
	}

	public static final BitSet FOLLOW_requete_in_listerequetes357 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete404 = new BitSet(new long[]{0x0000000000004920L});
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
	public static final BitSet FOLLOW_BULLETIN_in_requete464 = new BitSet(new long[]{0x00000000000800C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete466 = new BitSet(new long[]{0x0000000000080040L});
	public static final BitSet FOLLOW_TITRE_in_requete470 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete474 = new BitSet(new long[]{0x00000000000002C0L});
	public static final BitSet FOLLOW_CONJET_in_requete476 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete479 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete482 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramsAnnee_in_requete486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTEUR_in_requete490 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramsAnnee_in_requete494 = new BitSet(new long[]{0x0000000000080280L});
	public static final BitSet FOLLOW_CONJET_in_requete496 = new BitSet(new long[]{0x0000000000080080L});
	public static final BitSet FOLLOW_AVOIR_in_requete499 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_TITRE_in_requete502 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARTICLE_in_requete520 = new BitSet(new long[]{0x00000000000800C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete522 = new BitSet(new long[]{0x0000000000080040L});
	public static final BitSet FOLLOW_TITRE_in_requete526 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete530 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete532 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete535 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ENTRE_in_requete537 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete541 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CONJET_in_requete543 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTEUR_in_requete551 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ENTRE_in_requete553 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete557 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CONJET_in_requete559 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete563 = new BitSet(new long[]{0x0000000000080080L});
	public static final BitSet FOLLOW_AVOIR_in_requete565 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_TITRE_in_requete568 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BULLETIN_in_requete586 = new BitSet(new long[]{0x00000000000800C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete588 = new BitSet(new long[]{0x0000000000080040L});
	public static final BitSet FOLLOW_TITRE_in_requete592 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete596 = new BitSet(new long[]{0x00000000000002C0L});
	public static final BitSet FOLLOW_CONJET_in_requete598 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete601 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete604 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ENTRE_in_requete606 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete610 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CONJET_in_requete612 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTEUR_in_requete620 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ENTRE_in_requete622 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete626 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CONJET_in_requete628 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete632 = new BitSet(new long[]{0x0000000000080280L});
	public static final BitSet FOLLOW_CONJET_in_requete634 = new BitSet(new long[]{0x0000000000080080L});
	public static final BitSet FOLLOW_AVOIR_in_requete637 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_TITRE_in_requete640 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete644 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARTICLE_in_requete666 = new BitSet(new long[]{0x00000000000080C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete668 = new BitSet(new long[]{0x0000000000008040L});
	public static final BitSet FOLLOW_MOT_in_requete672 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete676 = new BitSet(new long[]{0x00000000000002C0L});
	public static final BitSet FOLLOW_CONJET_in_requete678 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete681 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete684 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramsAnnee_in_requete688 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTEUR_in_requete692 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramsAnnee_in_requete696 = new BitSet(new long[]{0x0000000000008280L});
	public static final BitSet FOLLOW_CONJET_in_requete698 = new BitSet(new long[]{0x0000000000008080L});
	public static final BitSet FOLLOW_AVOIR_in_requete701 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOT_in_requete704 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete708 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BULLETIN_in_requete722 = new BitSet(new long[]{0x00000000000080C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete724 = new BitSet(new long[]{0x0000000000008040L});
	public static final BitSet FOLLOW_MOT_in_requete728 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete732 = new BitSet(new long[]{0x00000000000002C0L});
	public static final BitSet FOLLOW_CONJET_in_requete734 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete737 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete740 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramsAnnee_in_requete744 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTEUR_in_requete748 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramsAnnee_in_requete752 = new BitSet(new long[]{0x0000000000008280L});
	public static final BitSet FOLLOW_CONJET_in_requete754 = new BitSet(new long[]{0x0000000000008080L});
	public static final BitSet FOLLOW_AVOIR_in_requete757 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOT_in_requete760 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARTICLE_in_requete778 = new BitSet(new long[]{0x00000000000080C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete780 = new BitSet(new long[]{0x0000000000008040L});
	public static final BitSet FOLLOW_MOT_in_requete784 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete788 = new BitSet(new long[]{0x00000000000002C0L});
	public static final BitSet FOLLOW_CONJET_in_requete790 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete793 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete796 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ENTRE_in_requete798 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete802 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CONJET_in_requete804 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete808 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTEUR_in_requete812 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ENTRE_in_requete814 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete818 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CONJET_in_requete820 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete824 = new BitSet(new long[]{0x0000000000008280L});
	public static final BitSet FOLLOW_CONJET_in_requete826 = new BitSet(new long[]{0x0000000000008080L});
	public static final BitSet FOLLOW_AVOIR_in_requete829 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOT_in_requete832 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete836 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BULLETIN_in_requete850 = new BitSet(new long[]{0x00000000000080C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete852 = new BitSet(new long[]{0x0000000000008040L});
	public static final BitSet FOLLOW_MOT_in_requete856 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete860 = new BitSet(new long[]{0x00000000000002C0L});
	public static final BitSet FOLLOW_CONJET_in_requete862 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete865 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete868 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ENTRE_in_requete870 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete874 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CONJET_in_requete876 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete880 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTEUR_in_requete884 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ENTRE_in_requete886 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete890 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CONJET_in_requete892 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete896 = new BitSet(new long[]{0x0000000000008280L});
	public static final BitSet FOLLOW_CONJET_in_requete898 = new BitSet(new long[]{0x0000000000008080L});
	public static final BitSet FOLLOW_AVOIR_in_requete901 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOT_in_requete904 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete908 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARTICLE_in_requete926 = new BitSet(new long[]{0x0000000000008080L});
	public static final BitSet FOLLOW_AVOIR_in_requete928 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOT_in_requete931 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete935 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BULLETIN_in_requete944 = new BitSet(new long[]{0x0000000000008080L});
	public static final BitSet FOLLOW_AVOIR_in_requete946 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOT_in_requete949 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete953 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COUNT_in_requete962 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ARTICLE_in_requete964 = new BitSet(new long[]{0x0000000000008080L});
	public static final BitSet FOLLOW_AVOIR_in_requete966 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOT_in_requete969 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete973 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COUNT_in_requete984 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_BULLETIN_in_requete986 = new BitSet(new long[]{0x0000000000008080L});
	public static final BitSet FOLLOW_AVOIR_in_requete988 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOT_in_requete991 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete995 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1004 = new BitSet(new long[]{0x0000000000080080L});
	public static final BitSet FOLLOW_AVOIR_in_requete1006 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_TITRE_in_requete1009 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete1013 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EVERY_in_requete1022 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1025 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EVERY_in_requete1034 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_BULLETIN_in_requete1037 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1046 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete1048 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1051 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramsAnnee_in_requete1055 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BULLETIN_in_requete1064 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete1066 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1069 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramsAnnee_in_requete1073 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1082 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete1084 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1087 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ENTRE_in_requete1089 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete1093 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CONJET_in_requete1095 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete1099 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BULLETIN_in_requete1107 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete1109 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1112 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ENTRE_in_requete1114 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete1118 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CONJET_in_requete1120 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete1124 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramMot_in_paramsMot1154 = new BitSet(new long[]{0x0000000000100602L});
	public static final BitSet FOLLOW_CONJOU_in_paramsMot1165 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramMot_in_paramsMot1171 = new BitSet(new long[]{0x0000000000100602L});
	public static final BitSet FOLLOW_CONJET_in_paramsMot1182 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramMot_in_paramsMot1189 = new BitSet(new long[]{0x0000000000100602L});
	public static final BitSet FOLLOW_VAR_in_paramMot1217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramAnnee_in_paramsAnnee1248 = new BitSet(new long[]{0x0000000000000602L});
	public static final BitSet FOLLOW_CONJOU_in_paramsAnnee1259 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnnee_in_paramsAnnee1265 = new BitSet(new long[]{0x0000000000000602L});
	public static final BitSet FOLLOW_CONJET_in_paramsAnnee1276 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnnee_in_paramsAnnee1282 = new BitSet(new long[]{0x0000000000000602L});
	public static final BitSet FOLLOW_ANNEE_in_paramAnnee1310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramAnneeJointure_in_paramsAnneeJointure1340 = new BitSet(new long[]{0x0000000000000602L});
	public static final BitSet FOLLOW_CONJOU_in_paramsAnneeJointure1351 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeJointure_in_paramsAnneeJointure1357 = new BitSet(new long[]{0x0000000000000602L});
	public static final BitSet FOLLOW_CONJET_in_paramsAnneeJointure1368 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeJointure_in_paramsAnneeJointure1374 = new BitSet(new long[]{0x0000000000000602L});
	public static final BitSet FOLLOW_ANNEE_in_paramAnneeJointure1402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANNEE_in_paramAnneeBetween1424 = new BitSet(new long[]{0x0000000000000002L});
}
