// $ANTLR 3.5.1 C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g 2016-06-16 19:24:53

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
	@Override public String getGrammarFileName() { return "C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g"; }



	// $ANTLR start "listerequetes"
	// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:57:1: listerequetes returns [String sql = \"\"] : r= requete ;
	public final String listerequetes() throws RecognitionException {
		String sql =  "";


		Arbre r =null;

		Arbre lr_arbre;
		try {
			// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:58:25: (r= requete )
			// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:59:3: r= requete
			{
			pushFollow(FOLLOW_requete_in_listerequetes345);
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
	// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:66:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( SELECT )? ( ARTICLE ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | BULLETIN ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ARTICLE ( AVOIR )? ( TITRE ps= paramsMot ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( AVOIR )? TITRE ps= paramsMot ) | BULLETIN ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ARTICLE ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | BULLETIN ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ARTICLE ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | BULLETIN ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ARTICLE ( AVOIR )? MOT ps= paramsMot | BULLETIN ( AVOIR )? MOT ps= paramsMot | COUNT ARTICLE ( AVOIR )? MOT ps= paramsMot | COUNT BULLETIN ( AVOIR )? MOT ps= paramsMot | ARTICLE ( AVOIR )? TITRE ps= paramsMot | ( EVERY )? ARTICLE | ( EVERY )? BULLETIN | ARTICLE ( AVOIR )? AUTEUR ps= paramsAnnee | BULLETIN ( AVOIR )? AUTEUR ps= paramsAnnee | ARTICLE ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | BULLETIN ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ) ;
	public final Arbre requete() throws RecognitionException {
		Arbre req_arbre =  new Arbre("");


		Arbre ps =null;
		Arbre psAnnee =null;
		Arbre annee1 =null;
		Arbre annee2 =null;

		Arbre ps_arbre;
		try {
			// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:67:26: ( ( SELECT )? ( ARTICLE ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | BULLETIN ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ARTICLE ( AVOIR )? ( TITRE ps= paramsMot ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( AVOIR )? TITRE ps= paramsMot ) | BULLETIN ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ARTICLE ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | BULLETIN ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ARTICLE ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | BULLETIN ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ARTICLE ( AVOIR )? MOT ps= paramsMot | BULLETIN ( AVOIR )? MOT ps= paramsMot | COUNT ARTICLE ( AVOIR )? MOT ps= paramsMot | COUNT BULLETIN ( AVOIR )? MOT ps= paramsMot | ARTICLE ( AVOIR )? TITRE ps= paramsMot | ( EVERY )? ARTICLE | ( EVERY )? BULLETIN | ARTICLE ( AVOIR )? AUTEUR ps= paramsAnnee | BULLETIN ( AVOIR )? AUTEUR ps= paramsAnnee | ARTICLE ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | BULLETIN ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ) )
			// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:79:2: ( SELECT )? ( ARTICLE ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | BULLETIN ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ARTICLE ( AVOIR )? ( TITRE ps= paramsMot ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( AVOIR )? TITRE ps= paramsMot ) | BULLETIN ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ARTICLE ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | BULLETIN ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ARTICLE ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | BULLETIN ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ARTICLE ( AVOIR )? MOT ps= paramsMot | BULLETIN ( AVOIR )? MOT ps= paramsMot | COUNT ARTICLE ( AVOIR )? MOT ps= paramsMot | COUNT BULLETIN ( AVOIR )? MOT ps= paramsMot | ARTICLE ( AVOIR )? TITRE ps= paramsMot | ( EVERY )? ARTICLE | ( EVERY )? BULLETIN | ARTICLE ( AVOIR )? AUTEUR ps= paramsAnnee | BULLETIN ( AVOIR )? AUTEUR ps= paramsAnnee | ARTICLE ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | BULLETIN ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween )
			{
			// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:79:2: ( SELECT )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==SELECT) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:79:2: SELECT
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete392); 
					}
					break;

			}

			// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:79:10: ( ARTICLE ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | BULLETIN ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ARTICLE ( AVOIR )? ( TITRE ps= paramsMot ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( AVOIR )? TITRE ps= paramsMot ) | BULLETIN ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ARTICLE ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | BULLETIN ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ARTICLE ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | BULLETIN ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ARTICLE ( AVOIR )? MOT ps= paramsMot | BULLETIN ( AVOIR )? MOT ps= paramsMot | COUNT ARTICLE ( AVOIR )? MOT ps= paramsMot | COUNT BULLETIN ( AVOIR )? MOT ps= paramsMot | ARTICLE ( AVOIR )? TITRE ps= paramsMot | ( EVERY )? ARTICLE | ( EVERY )? BULLETIN | ARTICLE ( AVOIR )? AUTEUR ps= paramsAnnee | BULLETIN ( AVOIR )? AUTEUR ps= paramsAnnee | ARTICLE ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | BULLETIN ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween )
			int alt59=19;
			alt59 = dfa59.predict(input);
			switch (alt59) {
				case 1 :
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:79:11: ARTICLE ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot )
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete396); 
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:79:19: ( AVOIR )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==AVOIR) ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:79:19: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete398); 
							}
							break;

					}

					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:79:26: ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot )
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
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:79:27: TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee
							{
							match(input,TITRE,FOLLOW_TITRE_in_requete402); 
							pushFollow(FOLLOW_paramsMot_in_requete406);
							ps=paramsMot();
							state._fsp--;

							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:79:46: ( CONJET )?
							int alt3=2;
							int LA3_0 = input.LA(1);
							if ( (LA3_0==CONJET) ) {
								alt3=1;
							}
							switch (alt3) {
								case 1 :
									// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:79:46: CONJET
									{
									match(input,CONJET,FOLLOW_CONJET_in_requete408); 
									}
									break;

							}

							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:79:54: ( AVOIR )?
							int alt4=2;
							int LA4_0 = input.LA(1);
							if ( (LA4_0==AVOIR) ) {
								alt4=1;
							}
							switch (alt4) {
								case 1 :
									// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:79:54: AVOIR
									{
									match(input,AVOIR,FOLLOW_AVOIR_in_requete411); 
									}
									break;

							}

							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete414); 
							pushFollow(FOLLOW_paramsAnnee_in_requete418);
							psAnnee=paramsAnnee();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:79:90: AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot
							{
							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete422); 
							pushFollow(FOLLOW_paramsAnnee_in_requete426);
							psAnnee=paramsAnnee();
							state._fsp--;

							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:79:117: ( CONJET )?
							int alt5=2;
							int LA5_0 = input.LA(1);
							if ( (LA5_0==CONJET) ) {
								alt5=1;
							}
							switch (alt5) {
								case 1 :
									// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:79:117: CONJET
									{
									match(input,CONJET,FOLLOW_CONJET_in_requete428); 
									}
									break;

							}

							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:79:125: ( AVOIR )?
							int alt6=2;
							int LA6_0 = input.LA(1);
							if ( (LA6_0==AVOIR) ) {
								alt6=1;
							}
							switch (alt6) {
								case 1 :
									// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:79:125: AVOIR
									{
									match(input,AVOIR,FOLLOW_AVOIR_in_requete431); 
									}
									break;

							}

							match(input,TITRE,FOLLOW_TITRE_in_requete434); 
							pushFollow(FOLLOW_paramsMot_in_requete438);
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
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:94:4: BULLETIN ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot )
					{
					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete452); 
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:94:13: ( AVOIR )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==AVOIR) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:94:13: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete454); 
							}
							break;

					}

					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:94:20: ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot )
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
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:94:21: TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee
							{
							match(input,TITRE,FOLLOW_TITRE_in_requete458); 
							pushFollow(FOLLOW_paramsMot_in_requete462);
							ps=paramsMot();
							state._fsp--;

							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:94:40: ( CONJET )?
							int alt9=2;
							int LA9_0 = input.LA(1);
							if ( (LA9_0==CONJET) ) {
								alt9=1;
							}
							switch (alt9) {
								case 1 :
									// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:94:40: CONJET
									{
									match(input,CONJET,FOLLOW_CONJET_in_requete464); 
									}
									break;

							}

							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:94:48: ( AVOIR )?
							int alt10=2;
							int LA10_0 = input.LA(1);
							if ( (LA10_0==AVOIR) ) {
								alt10=1;
							}
							switch (alt10) {
								case 1 :
									// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:94:48: AVOIR
									{
									match(input,AVOIR,FOLLOW_AVOIR_in_requete467); 
									}
									break;

							}

							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete470); 
							pushFollow(FOLLOW_paramsAnnee_in_requete474);
							psAnnee=paramsAnnee();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:94:84: AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot
							{
							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete478); 
							pushFollow(FOLLOW_paramsAnnee_in_requete482);
							psAnnee=paramsAnnee();
							state._fsp--;

							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:94:111: ( CONJET )?
							int alt11=2;
							int LA11_0 = input.LA(1);
							if ( (LA11_0==CONJET) ) {
								alt11=1;
							}
							switch (alt11) {
								case 1 :
									// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:94:111: CONJET
									{
									match(input,CONJET,FOLLOW_CONJET_in_requete484); 
									}
									break;

							}

							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:94:119: ( AVOIR )?
							int alt12=2;
							int LA12_0 = input.LA(1);
							if ( (LA12_0==AVOIR) ) {
								alt12=1;
							}
							switch (alt12) {
								case 1 :
									// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:94:119: AVOIR
									{
									match(input,AVOIR,FOLLOW_AVOIR_in_requete487); 
									}
									break;

							}

							match(input,TITRE,FOLLOW_TITRE_in_requete490); 
							pushFollow(FOLLOW_paramsMot_in_requete494);
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
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:109:4: ARTICLE ( AVOIR )? ( TITRE ps= paramsMot ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( AVOIR )? TITRE ps= paramsMot )
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete508); 
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:109:12: ( AVOIR )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==AVOIR) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:109:12: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete510); 
							}
							break;

					}

					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:109:19: ( TITRE ps= paramsMot ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( AVOIR )? TITRE ps= paramsMot )
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
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:109:20: TITRE ps= paramsMot ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween
							{
							match(input,TITRE,FOLLOW_TITRE_in_requete514); 
							pushFollow(FOLLOW_paramsMot_in_requete518);
							ps=paramsMot();
							state._fsp--;

							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:109:39: ( AVOIR )?
							int alt15=2;
							int LA15_0 = input.LA(1);
							if ( (LA15_0==AVOIR) ) {
								alt15=1;
							}
							switch (alt15) {
								case 1 :
									// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:109:39: AVOIR
									{
									match(input,AVOIR,FOLLOW_AVOIR_in_requete520); 
									}
									break;

							}

							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete523); 
							match(input,ENTRE,FOLLOW_ENTRE_in_requete525); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete529);
							annee1=paramAnneeBetween();
							state._fsp--;

							match(input,CONJET,FOLLOW_CONJET_in_requete531); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete535);
							annee2=paramAnneeBetween();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:109:118: AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( AVOIR )? TITRE ps= paramsMot
							{
							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete539); 
							match(input,ENTRE,FOLLOW_ENTRE_in_requete541); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete545);
							annee1=paramAnneeBetween();
							state._fsp--;

							match(input,CONJET,FOLLOW_CONJET_in_requete547); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete551);
							annee2=paramAnneeBetween();
							state._fsp--;

							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:109:188: ( AVOIR )?
							int alt16=2;
							int LA16_0 = input.LA(1);
							if ( (LA16_0==AVOIR) ) {
								alt16=1;
							}
							switch (alt16) {
								case 1 :
									// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:109:188: AVOIR
									{
									match(input,AVOIR,FOLLOW_AVOIR_in_requete553); 
									}
									break;

							}

							match(input,TITRE,FOLLOW_TITRE_in_requete556); 
							pushFollow(FOLLOW_paramsMot_in_requete560);
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
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:127:4: BULLETIN ( AVOIR )? ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? TITRE ps= paramsMot )
					{
					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete574); 
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:127:13: ( AVOIR )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==AVOIR) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:127:13: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete576); 
							}
							break;

					}

					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:127:20: ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? TITRE ps= paramsMot )
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
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:127:21: TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween
							{
							match(input,TITRE,FOLLOW_TITRE_in_requete580); 
							pushFollow(FOLLOW_paramsMot_in_requete584);
							ps=paramsMot();
							state._fsp--;

							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:127:40: ( CONJET )?
							int alt19=2;
							int LA19_0 = input.LA(1);
							if ( (LA19_0==CONJET) ) {
								alt19=1;
							}
							switch (alt19) {
								case 1 :
									// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:127:40: CONJET
									{
									match(input,CONJET,FOLLOW_CONJET_in_requete586); 
									}
									break;

							}

							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:127:48: ( AVOIR )?
							int alt20=2;
							int LA20_0 = input.LA(1);
							if ( (LA20_0==AVOIR) ) {
								alt20=1;
							}
							switch (alt20) {
								case 1 :
									// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:127:48: AVOIR
									{
									match(input,AVOIR,FOLLOW_AVOIR_in_requete589); 
									}
									break;

							}

							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete592); 
							match(input,ENTRE,FOLLOW_ENTRE_in_requete594); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete598);
							annee1=paramAnneeBetween();
							state._fsp--;

							match(input,CONJET,FOLLOW_CONJET_in_requete600); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete604);
							annee2=paramAnneeBetween();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:127:127: AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? TITRE ps= paramsMot
							{
							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete608); 
							match(input,ENTRE,FOLLOW_ENTRE_in_requete610); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete614);
							annee1=paramAnneeBetween();
							state._fsp--;

							match(input,CONJET,FOLLOW_CONJET_in_requete616); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete620);
							annee2=paramAnneeBetween();
							state._fsp--;

							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:127:197: ( CONJET )?
							int alt21=2;
							int LA21_0 = input.LA(1);
							if ( (LA21_0==CONJET) ) {
								alt21=1;
							}
							switch (alt21) {
								case 1 :
									// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:127:197: CONJET
									{
									match(input,CONJET,FOLLOW_CONJET_in_requete622); 
									}
									break;

							}

							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:127:205: ( AVOIR )?
							int alt22=2;
							int LA22_0 = input.LA(1);
							if ( (LA22_0==AVOIR) ) {
								alt22=1;
							}
							switch (alt22) {
								case 1 :
									// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:127:205: AVOIR
									{
									match(input,AVOIR,FOLLOW_AVOIR_in_requete625); 
									}
									break;

							}

							match(input,TITRE,FOLLOW_TITRE_in_requete628); 
							pushFollow(FOLLOW_paramsMot_in_requete632);
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
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:149:4: ARTICLE ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot )
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete654); 
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:149:12: ( AVOIR )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==AVOIR) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:149:12: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete656); 
							}
							break;

					}

					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:149:19: ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot )
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
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:149:20: MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee
							{
							match(input,MOT,FOLLOW_MOT_in_requete660); 
							pushFollow(FOLLOW_paramsMot_in_requete664);
							ps=paramsMot();
							state._fsp--;

							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:149:37: ( CONJET )?
							int alt25=2;
							int LA25_0 = input.LA(1);
							if ( (LA25_0==CONJET) ) {
								alt25=1;
							}
							switch (alt25) {
								case 1 :
									// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:149:37: CONJET
									{
									match(input,CONJET,FOLLOW_CONJET_in_requete666); 
									}
									break;

							}

							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:149:45: ( AVOIR )?
							int alt26=2;
							int LA26_0 = input.LA(1);
							if ( (LA26_0==AVOIR) ) {
								alt26=1;
							}
							switch (alt26) {
								case 1 :
									// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:149:45: AVOIR
									{
									match(input,AVOIR,FOLLOW_AVOIR_in_requete669); 
									}
									break;

							}

							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete672); 
							pushFollow(FOLLOW_paramsAnnee_in_requete676);
							psAnnee=paramsAnnee();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:149:81: AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot
							{
							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete680); 
							pushFollow(FOLLOW_paramsAnnee_in_requete684);
							psAnnee=paramsAnnee();
							state._fsp--;

							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:149:108: ( CONJET )?
							int alt27=2;
							int LA27_0 = input.LA(1);
							if ( (LA27_0==CONJET) ) {
								alt27=1;
							}
							switch (alt27) {
								case 1 :
									// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:149:108: CONJET
									{
									match(input,CONJET,FOLLOW_CONJET_in_requete686); 
									}
									break;

							}

							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:149:116: ( AVOIR )?
							int alt28=2;
							int LA28_0 = input.LA(1);
							if ( (LA28_0==AVOIR) ) {
								alt28=1;
							}
							switch (alt28) {
								case 1 :
									// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:149:116: AVOIR
									{
									match(input,AVOIR,FOLLOW_AVOIR_in_requete689); 
									}
									break;

							}

							match(input,MOT,FOLLOW_MOT_in_requete692); 
							pushFollow(FOLLOW_paramsMot_in_requete696);
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
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:164:4: BULLETIN ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot )
					{
					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete710); 
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:164:13: ( AVOIR )?
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==AVOIR) ) {
						alt30=1;
					}
					switch (alt30) {
						case 1 :
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:164:13: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete712); 
							}
							break;

					}

					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:164:20: ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot )
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
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:164:21: MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee
							{
							match(input,MOT,FOLLOW_MOT_in_requete716); 
							pushFollow(FOLLOW_paramsMot_in_requete720);
							ps=paramsMot();
							state._fsp--;

							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:164:38: ( CONJET )?
							int alt31=2;
							int LA31_0 = input.LA(1);
							if ( (LA31_0==CONJET) ) {
								alt31=1;
							}
							switch (alt31) {
								case 1 :
									// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:164:38: CONJET
									{
									match(input,CONJET,FOLLOW_CONJET_in_requete722); 
									}
									break;

							}

							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:164:46: ( AVOIR )?
							int alt32=2;
							int LA32_0 = input.LA(1);
							if ( (LA32_0==AVOIR) ) {
								alt32=1;
							}
							switch (alt32) {
								case 1 :
									// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:164:46: AVOIR
									{
									match(input,AVOIR,FOLLOW_AVOIR_in_requete725); 
									}
									break;

							}

							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete728); 
							pushFollow(FOLLOW_paramsAnnee_in_requete732);
							psAnnee=paramsAnnee();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:164:82: AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot
							{
							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete736); 
							pushFollow(FOLLOW_paramsAnnee_in_requete740);
							psAnnee=paramsAnnee();
							state._fsp--;

							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:164:109: ( CONJET )?
							int alt33=2;
							int LA33_0 = input.LA(1);
							if ( (LA33_0==CONJET) ) {
								alt33=1;
							}
							switch (alt33) {
								case 1 :
									// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:164:109: CONJET
									{
									match(input,CONJET,FOLLOW_CONJET_in_requete742); 
									}
									break;

							}

							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:164:117: ( AVOIR )?
							int alt34=2;
							int LA34_0 = input.LA(1);
							if ( (LA34_0==AVOIR) ) {
								alt34=1;
							}
							switch (alt34) {
								case 1 :
									// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:164:117: AVOIR
									{
									match(input,AVOIR,FOLLOW_AVOIR_in_requete745); 
									}
									break;

							}

							match(input,MOT,FOLLOW_MOT_in_requete748); 
							pushFollow(FOLLOW_paramsMot_in_requete752);
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
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:179:4: ARTICLE ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot )
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete766); 
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:179:12: ( AVOIR )?
					int alt36=2;
					int LA36_0 = input.LA(1);
					if ( (LA36_0==AVOIR) ) {
						alt36=1;
					}
					switch (alt36) {
						case 1 :
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:179:12: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete768); 
							}
							break;

					}

					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:179:19: ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot )
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
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:179:20: MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween
							{
							match(input,MOT,FOLLOW_MOT_in_requete772); 
							pushFollow(FOLLOW_paramsMot_in_requete776);
							ps=paramsMot();
							state._fsp--;

							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:179:37: ( CONJET )?
							int alt37=2;
							int LA37_0 = input.LA(1);
							if ( (LA37_0==CONJET) ) {
								alt37=1;
							}
							switch (alt37) {
								case 1 :
									// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:179:37: CONJET
									{
									match(input,CONJET,FOLLOW_CONJET_in_requete778); 
									}
									break;

							}

							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:179:45: ( AVOIR )?
							int alt38=2;
							int LA38_0 = input.LA(1);
							if ( (LA38_0==AVOIR) ) {
								alt38=1;
							}
							switch (alt38) {
								case 1 :
									// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:179:45: AVOIR
									{
									match(input,AVOIR,FOLLOW_AVOIR_in_requete781); 
									}
									break;

							}

							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete784); 
							match(input,ENTRE,FOLLOW_ENTRE_in_requete786); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete790);
							annee1=paramAnneeBetween();
							state._fsp--;

							match(input,CONJET,FOLLOW_CONJET_in_requete792); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete796);
							annee2=paramAnneeBetween();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:179:124: AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot
							{
							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete800); 
							match(input,ENTRE,FOLLOW_ENTRE_in_requete802); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete806);
							annee1=paramAnneeBetween();
							state._fsp--;

							match(input,CONJET,FOLLOW_CONJET_in_requete808); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete812);
							annee2=paramAnneeBetween();
							state._fsp--;

							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:179:194: ( CONJET )?
							int alt39=2;
							int LA39_0 = input.LA(1);
							if ( (LA39_0==CONJET) ) {
								alt39=1;
							}
							switch (alt39) {
								case 1 :
									// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:179:194: CONJET
									{
									match(input,CONJET,FOLLOW_CONJET_in_requete814); 
									}
									break;

							}

							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:179:202: ( AVOIR )?
							int alt40=2;
							int LA40_0 = input.LA(1);
							if ( (LA40_0==AVOIR) ) {
								alt40=1;
							}
							switch (alt40) {
								case 1 :
									// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:179:202: AVOIR
									{
									match(input,AVOIR,FOLLOW_AVOIR_in_requete817); 
									}
									break;

							}

							match(input,MOT,FOLLOW_MOT_in_requete820); 
							pushFollow(FOLLOW_paramsMot_in_requete824);
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
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:197:4: BULLETIN ( AVOIR )? ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot )
					{
					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete838); 
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:197:13: ( AVOIR )?
					int alt42=2;
					int LA42_0 = input.LA(1);
					if ( (LA42_0==AVOIR) ) {
						alt42=1;
					}
					switch (alt42) {
						case 1 :
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:197:13: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete840); 
							}
							break;

					}

					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:197:20: ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot )
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
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:197:21: MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween
							{
							match(input,MOT,FOLLOW_MOT_in_requete844); 
							pushFollow(FOLLOW_paramsMot_in_requete848);
							ps=paramsMot();
							state._fsp--;

							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:197:38: ( CONJET )?
							int alt43=2;
							int LA43_0 = input.LA(1);
							if ( (LA43_0==CONJET) ) {
								alt43=1;
							}
							switch (alt43) {
								case 1 :
									// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:197:38: CONJET
									{
									match(input,CONJET,FOLLOW_CONJET_in_requete850); 
									}
									break;

							}

							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:197:46: ( AVOIR )?
							int alt44=2;
							int LA44_0 = input.LA(1);
							if ( (LA44_0==AVOIR) ) {
								alt44=1;
							}
							switch (alt44) {
								case 1 :
									// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:197:46: AVOIR
									{
									match(input,AVOIR,FOLLOW_AVOIR_in_requete853); 
									}
									break;

							}

							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete856); 
							match(input,ENTRE,FOLLOW_ENTRE_in_requete858); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete862);
							annee1=paramAnneeBetween();
							state._fsp--;

							match(input,CONJET,FOLLOW_CONJET_in_requete864); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete868);
							annee2=paramAnneeBetween();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:197:125: AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot
							{
							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete872); 
							match(input,ENTRE,FOLLOW_ENTRE_in_requete874); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete878);
							annee1=paramAnneeBetween();
							state._fsp--;

							match(input,CONJET,FOLLOW_CONJET_in_requete880); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete884);
							annee2=paramAnneeBetween();
							state._fsp--;

							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:197:195: ( CONJET )?
							int alt45=2;
							int LA45_0 = input.LA(1);
							if ( (LA45_0==CONJET) ) {
								alt45=1;
							}
							switch (alt45) {
								case 1 :
									// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:197:195: CONJET
									{
									match(input,CONJET,FOLLOW_CONJET_in_requete886); 
									}
									break;

							}

							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:197:203: ( AVOIR )?
							int alt46=2;
							int LA46_0 = input.LA(1);
							if ( (LA46_0==AVOIR) ) {
								alt46=1;
							}
							switch (alt46) {
								case 1 :
									// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:197:203: AVOIR
									{
									match(input,AVOIR,FOLLOW_AVOIR_in_requete889); 
									}
									break;

							}

							match(input,MOT,FOLLOW_MOT_in_requete892); 
							pushFollow(FOLLOW_paramsMot_in_requete896);
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
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:217:4: ARTICLE ( AVOIR )? MOT ps= paramsMot
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete914); 
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:217:12: ( AVOIR )?
					int alt48=2;
					int LA48_0 = input.LA(1);
					if ( (LA48_0==AVOIR) ) {
						alt48=1;
					}
					switch (alt48) {
						case 1 :
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:217:12: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete916); 
							}
							break;

					}

					match(input,MOT,FOLLOW_MOT_in_requete919); 
					pushFollow(FOLLOW_paramsMot_in_requete923);
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
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:226:4: BULLETIN ( AVOIR )? MOT ps= paramsMot
					{
					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete932); 
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:226:13: ( AVOIR )?
					int alt49=2;
					int LA49_0 = input.LA(1);
					if ( (LA49_0==AVOIR) ) {
						alt49=1;
					}
					switch (alt49) {
						case 1 :
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:226:13: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete934); 
							}
							break;

					}

					match(input,MOT,FOLLOW_MOT_in_requete937); 
					pushFollow(FOLLOW_paramsMot_in_requete941);
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
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:235:4: COUNT ARTICLE ( AVOIR )? MOT ps= paramsMot
					{
					match(input,COUNT,FOLLOW_COUNT_in_requete950); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete952); 
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:235:18: ( AVOIR )?
					int alt50=2;
					int LA50_0 = input.LA(1);
					if ( (LA50_0==AVOIR) ) {
						alt50=1;
					}
					switch (alt50) {
						case 1 :
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:235:18: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete954); 
							}
							break;

					}

					match(input,MOT,FOLLOW_MOT_in_requete957); 
					pushFollow(FOLLOW_paramsMot_in_requete961);
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
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:243:4: COUNT BULLETIN ( AVOIR )? MOT ps= paramsMot
					{
					match(input,COUNT,FOLLOW_COUNT_in_requete972); 
					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete974); 
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:243:19: ( AVOIR )?
					int alt51=2;
					int LA51_0 = input.LA(1);
					if ( (LA51_0==AVOIR) ) {
						alt51=1;
					}
					switch (alt51) {
						case 1 :
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:243:19: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete976); 
							}
							break;

					}

					match(input,MOT,FOLLOW_MOT_in_requete979); 
					pushFollow(FOLLOW_paramsMot_in_requete983);
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
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:251:4: ARTICLE ( AVOIR )? TITRE ps= paramsMot
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete992); 
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:251:12: ( AVOIR )?
					int alt52=2;
					int LA52_0 = input.LA(1);
					if ( (LA52_0==AVOIR) ) {
						alt52=1;
					}
					switch (alt52) {
						case 1 :
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:251:12: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete994); 
							}
							break;

					}

					match(input,TITRE,FOLLOW_TITRE_in_requete997); 
					pushFollow(FOLLOW_paramsMot_in_requete1001);
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
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:260:4: ( EVERY )? ARTICLE
					{
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:260:4: ( EVERY )?
					int alt53=2;
					int LA53_0 = input.LA(1);
					if ( (LA53_0==EVERY) ) {
						alt53=1;
					}
					switch (alt53) {
						case 1 :
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:260:4: EVERY
							{
							match(input,EVERY,FOLLOW_EVERY_in_requete1010); 
							}
							break;

					}

					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1013); 

							req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
							req_arbre.ajouteFils(new Arbre("","fichier"));
							req_arbre.ajouteFils(new Arbre("","FROM numero"));
						
					}
					break;
				case 15 :
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:266:4: ( EVERY )? BULLETIN
					{
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:266:4: ( EVERY )?
					int alt54=2;
					int LA54_0 = input.LA(1);
					if ( (LA54_0==EVERY) ) {
						alt54=1;
					}
					switch (alt54) {
						case 1 :
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:266:4: EVERY
							{
							match(input,EVERY,FOLLOW_EVERY_in_requete1022); 
							}
							break;

					}

					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete1025); 

							req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
							req_arbre.ajouteFils(new Arbre("","numero"));
							req_arbre.ajouteFils(new Arbre("","FROM numero"));
						
					}
					break;
				case 16 :
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:272:4: ARTICLE ( AVOIR )? AUTEUR ps= paramsAnnee
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1034); 
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:272:12: ( AVOIR )?
					int alt55=2;
					int LA55_0 = input.LA(1);
					if ( (LA55_0==AVOIR) ) {
						alt55=1;
					}
					switch (alt55) {
						case 1 :
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:272:12: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete1036); 
							}
							break;

					}

					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1039); 
					pushFollow(FOLLOW_paramsAnnee_in_requete1043);
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
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:281:4: BULLETIN ( AVOIR )? AUTEUR ps= paramsAnnee
					{
					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete1052); 
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:281:13: ( AVOIR )?
					int alt56=2;
					int LA56_0 = input.LA(1);
					if ( (LA56_0==AVOIR) ) {
						alt56=1;
					}
					switch (alt56) {
						case 1 :
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:281:13: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete1054); 
							}
							break;

					}

					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1057); 
					pushFollow(FOLLOW_paramsAnnee_in_requete1061);
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
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:290:4: ARTICLE ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1070); 
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:290:12: ( AVOIR )?
					int alt57=2;
					int LA57_0 = input.LA(1);
					if ( (LA57_0==AVOIR) ) {
						alt57=1;
					}
					switch (alt57) {
						case 1 :
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:290:12: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete1072); 
							}
							break;

					}

					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1075); 
					match(input,ENTRE,FOLLOW_ENTRE_in_requete1077); 
					pushFollow(FOLLOW_paramAnneeBetween_in_requete1081);
					annee1=paramAnneeBetween();
					state._fsp--;

					match(input,CONJET,FOLLOW_CONJET_in_requete1083); 
					pushFollow(FOLLOW_paramAnneeBetween_in_requete1087);
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
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:302:4: BULLETIN ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween
					{
					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete1095); 
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:302:13: ( AVOIR )?
					int alt58=2;
					int LA58_0 = input.LA(1);
					if ( (LA58_0==AVOIR) ) {
						alt58=1;
					}
					switch (alt58) {
						case 1 :
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:302:13: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete1097); 
							}
							break;

					}

					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1100); 
					match(input,ENTRE,FOLLOW_ENTRE_in_requete1102); 
					pushFollow(FOLLOW_paramAnneeBetween_in_requete1106);
					annee1=paramAnneeBetween();
					state._fsp--;

					match(input,CONJET,FOLLOW_CONJET_in_requete1108); 
					pushFollow(FOLLOW_paramAnneeBetween_in_requete1112);
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
	// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:316:1: paramsMot returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= paramMot ( CONJOU par2= paramMot | CONJET par2= paramMot )* ;
	public final Arbre paramsMot() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:317:40: (par1= paramMot ( CONJOU par2= paramMot | CONJET par2= paramMot )* )
			// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:318:3: par1= paramMot ( CONJOU par2= paramMot | CONJET par2= paramMot )*
			{
			pushFollow(FOLLOW_paramMot_in_paramsMot1142);
			par1=paramMot();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:323:3: ( CONJOU par2= paramMot | CONJET par2= paramMot )*
			loop60:
			while (true) {
				int alt60=3;
				int LA60_0 = input.LA(1);
				if ( (LA60_0==CONJET) ) {
					int LA60_1 = input.LA(2);
					if ( (LA60_1==VAR) ) {
						alt60=2;
					}

				}
				else if ( (LA60_0==CONJOU) ) {
					alt60=1;
				}

				switch (alt60) {
				case 1 :
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:323:4: CONJOU par2= paramMot
					{
					match(input,CONJOU,FOLLOW_CONJOU_in_paramsMot1153); 
					pushFollow(FOLLOW_paramMot_in_paramsMot1159);
					par2=paramMot();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "OR"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;
				case 2 :
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:329:5: CONJET par2= paramMot
					{
					match(input,CONJET,FOLLOW_CONJET_in_paramsMot1170); 
					pushFollow(FOLLOW_paramMot_in_paramsMot1176);
					par2=paramMot();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "AND"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;

				default :
					break loop60;
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
	// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:338:1: paramMot returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
	public final Arbre paramMot() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:338:54: (a= VAR )
			// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:339:2: a= VAR
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_paramMot1204); 
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
	// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:344:1: paramsAnnee returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= paramAnnee ( CONJOU par2= paramAnnee | CONJET par2= paramAnnee )* ;
	public final Arbre paramsAnnee() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:345:40: (par1= paramAnnee ( CONJOU par2= paramAnnee | CONJET par2= paramAnnee )* )
			// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:346:3: par1= paramAnnee ( CONJOU par2= paramAnnee | CONJET par2= paramAnnee )*
			{
			pushFollow(FOLLOW_paramAnnee_in_paramsAnnee1235);
			par1=paramAnnee();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:351:3: ( CONJOU par2= paramAnnee | CONJET par2= paramAnnee )*
			loop61:
			while (true) {
				int alt61=3;
				int LA61_0 = input.LA(1);
				if ( (LA61_0==CONJET) ) {
					int LA61_2 = input.LA(2);
					if ( (LA61_2==ANNEE) ) {
						alt61=2;
					}

				}
				else if ( (LA61_0==CONJOU) ) {
					alt61=1;
				}

				switch (alt61) {
				case 1 :
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:351:4: CONJOU par2= paramAnnee
					{
					match(input,CONJOU,FOLLOW_CONJOU_in_paramsAnnee1246); 
					pushFollow(FOLLOW_paramAnnee_in_paramsAnnee1252);
					par2=paramAnnee();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "OR"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;
				case 2 :
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:357:5: CONJET par2= paramAnnee
					{
					match(input,CONJET,FOLLOW_CONJET_in_paramsAnnee1263); 
					pushFollow(FOLLOW_paramAnnee_in_paramsAnnee1269);
					par2=paramAnnee();
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
	// $ANTLR end "paramsAnnee"



	// $ANTLR start "paramAnnee"
	// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:366:1: paramAnnee returns [Arbre lepar_arbre = new Arbre(\"\")] : a= ANNEE ;
	public final Arbre paramAnnee() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:366:56: (a= ANNEE )
			// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:367:2: a= ANNEE
			{
			a=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_paramAnnee1297); 
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
	// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:371:1: paramsAnneeJointure returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= paramAnneeJointure ( CONJOU par2= paramAnneeJointure | CONJET par2= paramAnneeJointure )* ;
	public final Arbre paramsAnneeJointure() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:372:40: (par1= paramAnneeJointure ( CONJOU par2= paramAnneeJointure | CONJET par2= paramAnneeJointure )* )
			// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:373:3: par1= paramAnneeJointure ( CONJOU par2= paramAnneeJointure | CONJET par2= paramAnneeJointure )*
			{
			pushFollow(FOLLOW_paramAnneeJointure_in_paramsAnneeJointure1327);
			par1=paramAnneeJointure();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:378:3: ( CONJOU par2= paramAnneeJointure | CONJET par2= paramAnneeJointure )*
			loop62:
			while (true) {
				int alt62=3;
				int LA62_0 = input.LA(1);
				if ( (LA62_0==CONJOU) ) {
					alt62=1;
				}
				else if ( (LA62_0==CONJET) ) {
					alt62=2;
				}

				switch (alt62) {
				case 1 :
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:378:4: CONJOU par2= paramAnneeJointure
					{
					match(input,CONJOU,FOLLOW_CONJOU_in_paramsAnneeJointure1338); 
					pushFollow(FOLLOW_paramAnneeJointure_in_paramsAnneeJointure1344);
					par2=paramAnneeJointure();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "OR"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;
				case 2 :
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:384:5: CONJET par2= paramAnneeJointure
					{
					match(input,CONJET,FOLLOW_CONJET_in_paramsAnneeJointure1355); 
					pushFollow(FOLLOW_paramAnneeJointure_in_paramsAnneeJointure1361);
					par2=paramAnneeJointure();
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
	// $ANTLR end "paramsAnneeJointure"



	// $ANTLR start "paramAnneeJointure"
	// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:393:1: paramAnneeJointure returns [Arbre lepar_arbre = new Arbre(\"\")] : a= ANNEE ;
	public final Arbre paramAnneeJointure() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:393:64: (a= ANNEE )
			// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:394:2: a= ANNEE
			{
			a=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_paramAnneeJointure1389); 
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
	// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:398:1: paramAnneeBetween returns [Arbre lepar_arbre = new Arbre(\"\")] : a= ANNEE ;
	public final Arbre paramAnneeBetween() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:398:63: (a= ANNEE )
			// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:399:2: a= ANNEE
			{
			a=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_paramAnneeBetween1411); 
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
		"\1\uffff\1\11\1\16\16\uffff\1\35\1\uffff\1\44\1\51\2\uffff\1\64\1\71\41"+
		"\uffff\2\35\2\uffff\2\44\2\51\5\uffff\2\64\2\71\1\uffff\1\117\1\122\5"+
		"\uffff";
	static final String DFA59_minS =
		"\1\5\2\6\2\5\1\6\1\24\1\4\1\24\1\uffff\1\6\1\24\1\4\1\24\3\uffff\1\6\1"+
		"\4\1\7\2\6\1\4\1\7\1\6\1\24\2\6\1\4\1\uffff\1\11\2\4\1\17\3\uffff\1\24"+
		"\2\6\1\4\1\uffff\1\24\2\6\1\4\1\11\2\4\1\17\3\uffff\1\24\2\6\1\4\1\uffff"+
		"\2\6\1\uffff\1\4\2\7\2\6\1\uffff\2\6\1\uffff\1\4\2\7\2\6\1\uffff\2\7\1"+
		"\17\1\uffff\1\7\1\17\1\uffff";
	static final String DFA59_maxS =
		"\1\16\2\23\2\10\1\23\1\24\1\15\1\24\1\uffff\1\23\1\24\1\15\1\24\3\uffff"+
		"\1\12\1\4\1\23\2\12\1\4\1\23\1\12\2\24\1\6\1\15\1\uffff\1\11\1\4\2\23"+
		"\3\uffff\2\24\1\6\1\15\1\uffff\2\24\1\6\1\15\1\11\1\4\2\23\3\uffff\2\24"+
		"\1\6\1\15\1\uffff\2\12\1\uffff\1\4\2\23\2\12\1\uffff\2\12\1\uffff\1\4"+
		"\2\23\2\12\1\uffff\3\23\1\uffff\2\23\1\uffff";
	static final String DFA59_acceptS =
		"\11\uffff\1\16\4\uffff\1\17\1\13\1\14\14\uffff\1\15\4\uffff\1\1\1\5\1"+
		"\20\4\uffff\1\11\10\uffff\1\2\1\6\1\21\4\uffff\1\12\2\uffff\1\3\5\uffff"+
		"\1\7\2\uffff\1\4\5\uffff\1\10\3\uffff\1\22\2\uffff\1\23";
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
			"\1\34\1\33\1\uffff\1\32\1\31",
			"\1\36",
			"\1\41\1\uffff\1\40\1\37\4\uffff\1\43\3\uffff\1\42",
			"\1\50\1\47\1\uffff\1\46\1\45",
			"\1\55\1\54\1\uffff\1\53\1\52",
			"\1\56",
			"\1\61\1\uffff\1\60\1\57\4\uffff\1\63\3\uffff\1\62",
			"\1\70\1\67\1\uffff\1\66\1\65",
			"\1\72",
			"\2\42\14\uffff\1\73",
			"\1\34",
			"\1\42\10\uffff\1\74",
			"",
			"\1\75",
			"\1\76",
			"\1\77\2\uffff\1\41\7\uffff\1\43\3\uffff\1\42",
			"\1\43\3\uffff\1\42",
			"",
			"",
			"",
			"\1\100",
			"\1\50\1\47\14\uffff\1\101",
			"\1\50",
			"\1\43\10\uffff\1\102",
			"",
			"\1\103",
			"\1\55\1\54\14\uffff\1\104",
			"\1\55",
			"\1\62\10\uffff\1\105",
			"\1\106",
			"\1\107",
			"\1\110\2\uffff\1\61\7\uffff\1\63\3\uffff\1\62",
			"\1\63\3\uffff\1\62",
			"",
			"",
			"",
			"\1\111",
			"\1\70\1\67\14\uffff\1\112",
			"\1\70",
			"\1\63\10\uffff\1\113",
			"",
			"\1\34\1\33\1\uffff\1\32\1\31",
			"\1\34\1\33\1\uffff\1\32\1\31",
			"",
			"\1\114",
			"\1\41\1\uffff\1\40\1\37\4\uffff\1\43\3\uffff\1\42",
			"\1\41\1\uffff\1\40\1\37\4\uffff\1\43\3\uffff\1\42",
			"\1\50\1\47\1\uffff\1\46\1\45",
			"\1\50\1\47\1\uffff\1\46\1\45",
			"",
			"\1\55\1\54\1\uffff\1\53\1\52",
			"\1\55\1\54\1\uffff\1\53\1\52",
			"",
			"\1\115",
			"\1\61\1\uffff\1\60\1\57\4\uffff\1\63\3\uffff\1\62",
			"\1\61\1\uffff\1\60\1\57\4\uffff\1\63\3\uffff\1\62",
			"\1\70\1\67\1\uffff\1\66\1\65",
			"\1\70\1\67\1\uffff\1\66\1\65",
			"",
			"\1\116\1\uffff\1\102\5\uffff\1\102\3\uffff\1\74",
			"\1\121\1\uffff\1\120\5\uffff\1\113\3\uffff\1\105",
			"\1\102\3\uffff\1\74",
			"",
			"\1\121\7\uffff\1\113\3\uffff\1\105",
			"\1\113\3\uffff\1\105",
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

	public static final BitSet FOLLOW_requete_in_listerequetes345 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete392 = new BitSet(new long[]{0x0000000000004920L});
	public static final BitSet FOLLOW_ARTICLE_in_requete396 = new BitSet(new long[]{0x00000000000800C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete398 = new BitSet(new long[]{0x0000000000080040L});
	public static final BitSet FOLLOW_TITRE_in_requete402 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete406 = new BitSet(new long[]{0x00000000000002C0L});
	public static final BitSet FOLLOW_CONJET_in_requete408 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete411 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete414 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramsAnnee_in_requete418 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTEUR_in_requete422 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramsAnnee_in_requete426 = new BitSet(new long[]{0x0000000000080280L});
	public static final BitSet FOLLOW_CONJET_in_requete428 = new BitSet(new long[]{0x0000000000080080L});
	public static final BitSet FOLLOW_AVOIR_in_requete431 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_TITRE_in_requete434 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BULLETIN_in_requete452 = new BitSet(new long[]{0x00000000000800C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete454 = new BitSet(new long[]{0x0000000000080040L});
	public static final BitSet FOLLOW_TITRE_in_requete458 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete462 = new BitSet(new long[]{0x00000000000002C0L});
	public static final BitSet FOLLOW_CONJET_in_requete464 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete467 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete470 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramsAnnee_in_requete474 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTEUR_in_requete478 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramsAnnee_in_requete482 = new BitSet(new long[]{0x0000000000080280L});
	public static final BitSet FOLLOW_CONJET_in_requete484 = new BitSet(new long[]{0x0000000000080080L});
	public static final BitSet FOLLOW_AVOIR_in_requete487 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_TITRE_in_requete490 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete494 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARTICLE_in_requete508 = new BitSet(new long[]{0x00000000000800C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete510 = new BitSet(new long[]{0x0000000000080040L});
	public static final BitSet FOLLOW_TITRE_in_requete514 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete518 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete520 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete523 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ENTRE_in_requete525 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete529 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CONJET_in_requete531 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete535 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTEUR_in_requete539 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ENTRE_in_requete541 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete545 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CONJET_in_requete547 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete551 = new BitSet(new long[]{0x0000000000080080L});
	public static final BitSet FOLLOW_AVOIR_in_requete553 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_TITRE_in_requete556 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BULLETIN_in_requete574 = new BitSet(new long[]{0x00000000000800C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete576 = new BitSet(new long[]{0x0000000000080040L});
	public static final BitSet FOLLOW_TITRE_in_requete580 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete584 = new BitSet(new long[]{0x00000000000002C0L});
	public static final BitSet FOLLOW_CONJET_in_requete586 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete589 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete592 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ENTRE_in_requete594 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete598 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CONJET_in_requete600 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTEUR_in_requete608 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ENTRE_in_requete610 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete614 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CONJET_in_requete616 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete620 = new BitSet(new long[]{0x0000000000080280L});
	public static final BitSet FOLLOW_CONJET_in_requete622 = new BitSet(new long[]{0x0000000000080080L});
	public static final BitSet FOLLOW_AVOIR_in_requete625 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_TITRE_in_requete628 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete632 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARTICLE_in_requete654 = new BitSet(new long[]{0x00000000000080C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete656 = new BitSet(new long[]{0x0000000000008040L});
	public static final BitSet FOLLOW_MOT_in_requete660 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete664 = new BitSet(new long[]{0x00000000000002C0L});
	public static final BitSet FOLLOW_CONJET_in_requete666 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete669 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete672 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramsAnnee_in_requete676 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTEUR_in_requete680 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramsAnnee_in_requete684 = new BitSet(new long[]{0x0000000000008280L});
	public static final BitSet FOLLOW_CONJET_in_requete686 = new BitSet(new long[]{0x0000000000008080L});
	public static final BitSet FOLLOW_AVOIR_in_requete689 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOT_in_requete692 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BULLETIN_in_requete710 = new BitSet(new long[]{0x00000000000080C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete712 = new BitSet(new long[]{0x0000000000008040L});
	public static final BitSet FOLLOW_MOT_in_requete716 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete720 = new BitSet(new long[]{0x00000000000002C0L});
	public static final BitSet FOLLOW_CONJET_in_requete722 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete725 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete728 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramsAnnee_in_requete732 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTEUR_in_requete736 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramsAnnee_in_requete740 = new BitSet(new long[]{0x0000000000008280L});
	public static final BitSet FOLLOW_CONJET_in_requete742 = new BitSet(new long[]{0x0000000000008080L});
	public static final BitSet FOLLOW_AVOIR_in_requete745 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOT_in_requete748 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARTICLE_in_requete766 = new BitSet(new long[]{0x00000000000080C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete768 = new BitSet(new long[]{0x0000000000008040L});
	public static final BitSet FOLLOW_MOT_in_requete772 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete776 = new BitSet(new long[]{0x00000000000002C0L});
	public static final BitSet FOLLOW_CONJET_in_requete778 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete781 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete784 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ENTRE_in_requete786 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete790 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CONJET_in_requete792 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTEUR_in_requete800 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ENTRE_in_requete802 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete806 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CONJET_in_requete808 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete812 = new BitSet(new long[]{0x0000000000008280L});
	public static final BitSet FOLLOW_CONJET_in_requete814 = new BitSet(new long[]{0x0000000000008080L});
	public static final BitSet FOLLOW_AVOIR_in_requete817 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOT_in_requete820 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete824 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BULLETIN_in_requete838 = new BitSet(new long[]{0x00000000000080C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete840 = new BitSet(new long[]{0x0000000000008040L});
	public static final BitSet FOLLOW_MOT_in_requete844 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete848 = new BitSet(new long[]{0x00000000000002C0L});
	public static final BitSet FOLLOW_CONJET_in_requete850 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete853 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete856 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ENTRE_in_requete858 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete862 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CONJET_in_requete864 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete868 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTEUR_in_requete872 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ENTRE_in_requete874 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete878 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CONJET_in_requete880 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete884 = new BitSet(new long[]{0x0000000000008280L});
	public static final BitSet FOLLOW_CONJET_in_requete886 = new BitSet(new long[]{0x0000000000008080L});
	public static final BitSet FOLLOW_AVOIR_in_requete889 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOT_in_requete892 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete896 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARTICLE_in_requete914 = new BitSet(new long[]{0x0000000000008080L});
	public static final BitSet FOLLOW_AVOIR_in_requete916 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOT_in_requete919 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete923 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BULLETIN_in_requete932 = new BitSet(new long[]{0x0000000000008080L});
	public static final BitSet FOLLOW_AVOIR_in_requete934 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOT_in_requete937 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete941 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COUNT_in_requete950 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ARTICLE_in_requete952 = new BitSet(new long[]{0x0000000000008080L});
	public static final BitSet FOLLOW_AVOIR_in_requete954 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOT_in_requete957 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete961 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COUNT_in_requete972 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_BULLETIN_in_requete974 = new BitSet(new long[]{0x0000000000008080L});
	public static final BitSet FOLLOW_AVOIR_in_requete976 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOT_in_requete979 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete983 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARTICLE_in_requete992 = new BitSet(new long[]{0x0000000000080080L});
	public static final BitSet FOLLOW_AVOIR_in_requete994 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_TITRE_in_requete997 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramsMot_in_requete1001 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EVERY_in_requete1010 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1013 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EVERY_in_requete1022 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_BULLETIN_in_requete1025 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1034 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete1036 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1039 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramsAnnee_in_requete1043 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BULLETIN_in_requete1052 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete1054 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1057 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramsAnnee_in_requete1061 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1070 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete1072 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1075 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ENTRE_in_requete1077 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete1081 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CONJET_in_requete1083 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete1087 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BULLETIN_in_requete1095 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete1097 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1100 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ENTRE_in_requete1102 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete1106 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CONJET_in_requete1108 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete1112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramMot_in_paramsMot1142 = new BitSet(new long[]{0x0000000000000602L});
	public static final BitSet FOLLOW_CONJOU_in_paramsMot1153 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramMot_in_paramsMot1159 = new BitSet(new long[]{0x0000000000000602L});
	public static final BitSet FOLLOW_CONJET_in_paramsMot1170 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_paramMot_in_paramsMot1176 = new BitSet(new long[]{0x0000000000000602L});
	public static final BitSet FOLLOW_VAR_in_paramMot1204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramAnnee_in_paramsAnnee1235 = new BitSet(new long[]{0x0000000000000602L});
	public static final BitSet FOLLOW_CONJOU_in_paramsAnnee1246 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnnee_in_paramsAnnee1252 = new BitSet(new long[]{0x0000000000000602L});
	public static final BitSet FOLLOW_CONJET_in_paramsAnnee1263 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnnee_in_paramsAnnee1269 = new BitSet(new long[]{0x0000000000000602L});
	public static final BitSet FOLLOW_ANNEE_in_paramAnnee1297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramAnneeJointure_in_paramsAnneeJointure1327 = new BitSet(new long[]{0x0000000000000602L});
	public static final BitSet FOLLOW_CONJOU_in_paramsAnneeJointure1338 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeJointure_in_paramsAnneeJointure1344 = new BitSet(new long[]{0x0000000000000602L});
	public static final BitSet FOLLOW_CONJET_in_paramsAnneeJointure1355 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeJointure_in_paramsAnneeJointure1361 = new BitSet(new long[]{0x0000000000000602L});
	public static final BitSet FOLLOW_ANNEE_in_paramAnneeJointure1389 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANNEE_in_paramAnneeBetween1411 = new BitSet(new long[]{0x0000000000000002L});
}
