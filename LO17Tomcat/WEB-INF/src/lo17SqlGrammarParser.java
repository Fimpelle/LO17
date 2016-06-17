// $ANTLR 3.5.1 C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g 2016-06-17 14:18:31

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class lo17SqlGrammarParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ANNEE", "ARTICLE", "AUTEUR", 
		"AVOIR", "BULLETIN", "CONJET", "CONJOU", "COUNT", "DATE", "ENTRE", "EVERY", 
		"MOT", "RUBRIQUE", "SELECT", "TITRE", "VAR", "WS"
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
	public static final int TITRE=18;
	public static final int VAR=19;
	public static final int WS=20;

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
	// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:54:1: listerequetes returns [String sql = \"\"] : r= requete ;
	public final String listerequetes() throws RecognitionException {
		String sql =  "";


		Arbre r =null;

		Arbre lr_arbre;
		try {
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:55:25: (r= requete )
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:56:3: r= requete
			{
			pushFollow(FOLLOW_requete_in_listerequetes348);
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
	// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:63:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( SELECT )* ( ARTICLE ( AVOIR )? ( ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ( TITRE ps= paramsMot ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( AVOIR )? TITRE ps= paramsMot ) | RUBRIQUE MOT ps= paramsRubrique | ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | MOT ps= paramsMot | TITRE ps= paramsMot | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ps= paramsAnnee ) | BULLETIN ( AVOIR )? ( ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | RUBRIQUE MOT ps= paramsRubrique | ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | MOT ps= paramsMot | AUTEUR ps= paramsAnnee | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ) | RUBRIQUE ARTICLE ( AVOIR )? MOT ps= paramsMot | COUNT ( ARTICLE ( AVOIR )? MOT ps= paramsMot | BULLETIN ( AVOIR )? MOT ps= paramsMot ) | ( EVERY )? ( ARTICLE | BULLETIN ) ) ;
	public final Arbre requete() throws RecognitionException {
		Arbre req_arbre =  new Arbre("");


		Arbre ps =null;
		Arbre psAnnee =null;
		Arbre annee1 =null;
		Arbre annee2 =null;

		Arbre ps_arbre;
		try {
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:64:26: ( ( SELECT )* ( ARTICLE ( AVOIR )? ( ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ( TITRE ps= paramsMot ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( AVOIR )? TITRE ps= paramsMot ) | RUBRIQUE MOT ps= paramsRubrique | ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | MOT ps= paramsMot | TITRE ps= paramsMot | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ps= paramsAnnee ) | BULLETIN ( AVOIR )? ( ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | RUBRIQUE MOT ps= paramsRubrique | ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | MOT ps= paramsMot | AUTEUR ps= paramsAnnee | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ) | RUBRIQUE ARTICLE ( AVOIR )? MOT ps= paramsMot | COUNT ( ARTICLE ( AVOIR )? MOT ps= paramsMot | BULLETIN ( AVOIR )? MOT ps= paramsMot ) | ( EVERY )? ( ARTICLE | BULLETIN ) ) )
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:73:2: ( SELECT )* ( ARTICLE ( AVOIR )? ( ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ( TITRE ps= paramsMot ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( AVOIR )? TITRE ps= paramsMot ) | RUBRIQUE MOT ps= paramsRubrique | ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | MOT ps= paramsMot | TITRE ps= paramsMot | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ps= paramsAnnee ) | BULLETIN ( AVOIR )? ( ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | RUBRIQUE MOT ps= paramsRubrique | ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | MOT ps= paramsMot | AUTEUR ps= paramsAnnee | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ) | RUBRIQUE ARTICLE ( AVOIR )? MOT ps= paramsMot | COUNT ( ARTICLE ( AVOIR )? MOT ps= paramsMot | BULLETIN ( AVOIR )? MOT ps= paramsMot ) | ( EVERY )? ( ARTICLE | BULLETIN ) )
			{
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:73:2: ( SELECT )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==SELECT) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:73:2: SELECT
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete389); 
					}
					break;

				default :
					break loop1;
				}
			}

			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:73:10: ( ARTICLE ( AVOIR )? ( ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ( TITRE ps= paramsMot ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( AVOIR )? TITRE ps= paramsMot ) | RUBRIQUE MOT ps= paramsRubrique | ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | MOT ps= paramsMot | TITRE ps= paramsMot | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ps= paramsAnnee ) | BULLETIN ( AVOIR )? ( ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | RUBRIQUE MOT ps= paramsRubrique | ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | MOT ps= paramsMot | AUTEUR ps= paramsAnnee | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ) | RUBRIQUE ARTICLE ( AVOIR )? MOT ps= paramsMot | COUNT ( ARTICLE ( AVOIR )? MOT ps= paramsMot | BULLETIN ( AVOIR )? MOT ps= paramsMot ) | ( EVERY )? ( ARTICLE | BULLETIN ) )
			int alt50=5;
			switch ( input.LA(1) ) {
			case ARTICLE:
				{
				int LA50_1 = input.LA(2);
				if ( ((LA50_1 >= AUTEUR && LA50_1 <= AVOIR)||(LA50_1 >= MOT && LA50_1 <= RUBRIQUE)||LA50_1==TITRE) ) {
					alt50=1;
				}
				else if ( (LA50_1==EOF) ) {
					alt50=5;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 50, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case BULLETIN:
				{
				int LA50_2 = input.LA(2);
				if ( ((LA50_2 >= AUTEUR && LA50_2 <= AVOIR)||(LA50_2 >= MOT && LA50_2 <= RUBRIQUE)||LA50_2==TITRE) ) {
					alt50=2;
				}
				else if ( (LA50_2==EOF) ) {
					alt50=5;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 50, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case RUBRIQUE:
				{
				alt50=3;
				}
				break;
			case COUNT:
				{
				alt50=4;
				}
				break;
			case EVERY:
				{
				alt50=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 50, 0, input);
				throw nvae;
			}
			switch (alt50) {
				case 1 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:77:3: ARTICLE ( AVOIR )? ( ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ( TITRE ps= paramsMot ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( AVOIR )? TITRE ps= paramsMot ) | RUBRIQUE MOT ps= paramsRubrique | ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | MOT ps= paramsMot | TITRE ps= paramsMot | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ps= paramsAnnee )
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete405); 
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:77:11: ( AVOIR )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==AVOIR) ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:77:11: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete407); 
							}
							break;

					}

					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:77:18: ( ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ( TITRE ps= paramsMot ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( AVOIR )? TITRE ps= paramsMot ) | RUBRIQUE MOT ps= paramsRubrique | ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | MOT ps= paramsMot | TITRE ps= paramsMot | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ps= paramsAnnee )
					int alt21=9;
					alt21 = dfa21.predict(input);
					switch (alt21) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:78:3: ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot )
							{
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:78:3: ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot )
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
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:78:4: TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee
									{
									match(input,TITRE,FOLLOW_TITRE_in_requete415); 
									pushFollow(FOLLOW_paramsMot_in_requete419);
									ps=paramsMot();
									state._fsp--;

									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:78:23: ( CONJET )?
									int alt3=2;
									int LA3_0 = input.LA(1);
									if ( (LA3_0==CONJET) ) {
										alt3=1;
									}
									switch (alt3) {
										case 1 :
											// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:78:23: CONJET
											{
											match(input,CONJET,FOLLOW_CONJET_in_requete421); 
											}
											break;

									}

									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:78:31: ( AVOIR )?
									int alt4=2;
									int LA4_0 = input.LA(1);
									if ( (LA4_0==AVOIR) ) {
										alt4=1;
									}
									switch (alt4) {
										case 1 :
											// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:78:31: AVOIR
											{
											match(input,AVOIR,FOLLOW_AVOIR_in_requete424); 
											}
											break;

									}

									match(input,AUTEUR,FOLLOW_AUTEUR_in_requete427); 
									pushFollow(FOLLOW_paramsAnnee_in_requete431);
									psAnnee=paramsAnnee();
									state._fsp--;

									}
									break;
								case 2 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:78:67: AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot
									{
									match(input,AUTEUR,FOLLOW_AUTEUR_in_requete435); 
									pushFollow(FOLLOW_paramsAnnee_in_requete439);
									psAnnee=paramsAnnee();
									state._fsp--;

									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:78:94: ( CONJET )?
									int alt5=2;
									int LA5_0 = input.LA(1);
									if ( (LA5_0==CONJET) ) {
										alt5=1;
									}
									switch (alt5) {
										case 1 :
											// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:78:94: CONJET
											{
											match(input,CONJET,FOLLOW_CONJET_in_requete441); 
											}
											break;

									}

									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:78:102: ( AVOIR )?
									int alt6=2;
									int LA6_0 = input.LA(1);
									if ( (LA6_0==AVOIR) ) {
										alt6=1;
									}
									switch (alt6) {
										case 1 :
											// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:78:102: AVOIR
											{
											match(input,AVOIR,FOLLOW_AVOIR_in_requete444); 
											}
											break;

									}

									match(input,TITRE,FOLLOW_TITRE_in_requete447); 
									pushFollow(FOLLOW_paramsMot_in_requete451);
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
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:93:5: ( TITRE ps= paramsMot ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( AVOIR )? TITRE ps= paramsMot )
							{
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:93:5: ( TITRE ps= paramsMot ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( AVOIR )? TITRE ps= paramsMot )
							int alt10=2;
							int LA10_0 = input.LA(1);
							if ( (LA10_0==TITRE) ) {
								alt10=1;
							}
							else if ( (LA10_0==AUTEUR) ) {
								alt10=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 10, 0, input);
								throw nvae;
							}

							switch (alt10) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:93:6: TITRE ps= paramsMot ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween
									{
									match(input,TITRE,FOLLOW_TITRE_in_requete470); 
									pushFollow(FOLLOW_paramsMot_in_requete474);
									ps=paramsMot();
									state._fsp--;

									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:93:25: ( AVOIR )?
									int alt8=2;
									int LA8_0 = input.LA(1);
									if ( (LA8_0==AVOIR) ) {
										alt8=1;
									}
									switch (alt8) {
										case 1 :
											// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:93:25: AVOIR
											{
											match(input,AVOIR,FOLLOW_AVOIR_in_requete476); 
											}
											break;

									}

									match(input,AUTEUR,FOLLOW_AUTEUR_in_requete479); 
									match(input,ENTRE,FOLLOW_ENTRE_in_requete481); 
									pushFollow(FOLLOW_paramAnneeBetween_in_requete485);
									annee1=paramAnneeBetween();
									state._fsp--;

									match(input,CONJET,FOLLOW_CONJET_in_requete487); 
									pushFollow(FOLLOW_paramAnneeBetween_in_requete491);
									annee2=paramAnneeBetween();
									state._fsp--;

									}
									break;
								case 2 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:93:104: AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( AVOIR )? TITRE ps= paramsMot
									{
									match(input,AUTEUR,FOLLOW_AUTEUR_in_requete495); 
									match(input,ENTRE,FOLLOW_ENTRE_in_requete497); 
									pushFollow(FOLLOW_paramAnneeBetween_in_requete501);
									annee1=paramAnneeBetween();
									state._fsp--;

									match(input,CONJET,FOLLOW_CONJET_in_requete503); 
									pushFollow(FOLLOW_paramAnneeBetween_in_requete507);
									annee2=paramAnneeBetween();
									state._fsp--;

									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:93:174: ( AVOIR )?
									int alt9=2;
									int LA9_0 = input.LA(1);
									if ( (LA9_0==AVOIR) ) {
										alt9=1;
									}
									switch (alt9) {
										case 1 :
											// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:93:174: AVOIR
											{
											match(input,AVOIR,FOLLOW_AVOIR_in_requete509); 
											}
											break;

									}

									match(input,TITRE,FOLLOW_TITRE_in_requete512); 
									pushFollow(FOLLOW_paramsMot_in_requete516);
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
						case 3 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:108:5: RUBRIQUE MOT ps= paramsRubrique
							{
							match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete525); 
							match(input,MOT,FOLLOW_MOT_in_requete527); 
							pushFollow(FOLLOW_paramsRubrique_in_requete531);
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
						case 4 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:119:5: ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot )
							{
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:119:5: ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot )
							int alt15=2;
							int LA15_0 = input.LA(1);
							if ( (LA15_0==MOT) ) {
								alt15=1;
							}
							else if ( (LA15_0==AUTEUR) ) {
								alt15=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 15, 0, input);
								throw nvae;
							}

							switch (alt15) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:119:6: MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee
									{
									match(input,MOT,FOLLOW_MOT_in_requete549); 
									pushFollow(FOLLOW_paramsMot_in_requete553);
									ps=paramsMot();
									state._fsp--;

									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:119:23: ( CONJET )?
									int alt11=2;
									int LA11_0 = input.LA(1);
									if ( (LA11_0==CONJET) ) {
										alt11=1;
									}
									switch (alt11) {
										case 1 :
											// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:119:23: CONJET
											{
											match(input,CONJET,FOLLOW_CONJET_in_requete555); 
											}
											break;

									}

									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:119:31: ( AVOIR )?
									int alt12=2;
									int LA12_0 = input.LA(1);
									if ( (LA12_0==AVOIR) ) {
										alt12=1;
									}
									switch (alt12) {
										case 1 :
											// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:119:31: AVOIR
											{
											match(input,AVOIR,FOLLOW_AVOIR_in_requete558); 
											}
											break;

									}

									match(input,AUTEUR,FOLLOW_AUTEUR_in_requete561); 
									pushFollow(FOLLOW_paramsAnnee_in_requete565);
									psAnnee=paramsAnnee();
									state._fsp--;

									}
									break;
								case 2 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:119:67: AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot
									{
									match(input,AUTEUR,FOLLOW_AUTEUR_in_requete569); 
									pushFollow(FOLLOW_paramsAnnee_in_requete573);
									psAnnee=paramsAnnee();
									state._fsp--;

									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:119:94: ( CONJET )?
									int alt13=2;
									int LA13_0 = input.LA(1);
									if ( (LA13_0==CONJET) ) {
										alt13=1;
									}
									switch (alt13) {
										case 1 :
											// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:119:94: CONJET
											{
											match(input,CONJET,FOLLOW_CONJET_in_requete575); 
											}
											break;

									}

									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:119:102: ( AVOIR )?
									int alt14=2;
									int LA14_0 = input.LA(1);
									if ( (LA14_0==AVOIR) ) {
										alt14=1;
									}
									switch (alt14) {
										case 1 :
											// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:119:102: AVOIR
											{
											match(input,AVOIR,FOLLOW_AVOIR_in_requete578); 
											}
											break;

									}

									match(input,MOT,FOLLOW_MOT_in_requete581); 
									pushFollow(FOLLOW_paramsMot_in_requete585);
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
						case 5 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:134:5: ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot )
							{
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:134:5: ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot )
							int alt20=2;
							int LA20_0 = input.LA(1);
							if ( (LA20_0==MOT) ) {
								alt20=1;
							}
							else if ( (LA20_0==AUTEUR) ) {
								alt20=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 20, 0, input);
								throw nvae;
							}

							switch (alt20) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:134:6: MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween
									{
									match(input,MOT,FOLLOW_MOT_in_requete604); 
									pushFollow(FOLLOW_paramsMot_in_requete608);
									ps=paramsMot();
									state._fsp--;

									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:134:23: ( CONJET )?
									int alt16=2;
									int LA16_0 = input.LA(1);
									if ( (LA16_0==CONJET) ) {
										alt16=1;
									}
									switch (alt16) {
										case 1 :
											// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:134:23: CONJET
											{
											match(input,CONJET,FOLLOW_CONJET_in_requete610); 
											}
											break;

									}

									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:134:31: ( AVOIR )?
									int alt17=2;
									int LA17_0 = input.LA(1);
									if ( (LA17_0==AVOIR) ) {
										alt17=1;
									}
									switch (alt17) {
										case 1 :
											// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:134:31: AVOIR
											{
											match(input,AVOIR,FOLLOW_AVOIR_in_requete613); 
											}
											break;

									}

									match(input,AUTEUR,FOLLOW_AUTEUR_in_requete616); 
									match(input,ENTRE,FOLLOW_ENTRE_in_requete618); 
									pushFollow(FOLLOW_paramAnneeBetween_in_requete622);
									annee1=paramAnneeBetween();
									state._fsp--;

									match(input,CONJET,FOLLOW_CONJET_in_requete624); 
									pushFollow(FOLLOW_paramAnneeBetween_in_requete628);
									annee2=paramAnneeBetween();
									state._fsp--;

									}
									break;
								case 2 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:134:110: AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot
									{
									match(input,AUTEUR,FOLLOW_AUTEUR_in_requete632); 
									match(input,ENTRE,FOLLOW_ENTRE_in_requete634); 
									pushFollow(FOLLOW_paramAnneeBetween_in_requete638);
									annee1=paramAnneeBetween();
									state._fsp--;

									match(input,CONJET,FOLLOW_CONJET_in_requete640); 
									pushFollow(FOLLOW_paramAnneeBetween_in_requete644);
									annee2=paramAnneeBetween();
									state._fsp--;

									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:134:180: ( CONJET )?
									int alt18=2;
									int LA18_0 = input.LA(1);
									if ( (LA18_0==CONJET) ) {
										alt18=1;
									}
									switch (alt18) {
										case 1 :
											// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:134:180: CONJET
											{
											match(input,CONJET,FOLLOW_CONJET_in_requete646); 
											}
											break;

									}

									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:134:188: ( AVOIR )?
									int alt19=2;
									int LA19_0 = input.LA(1);
									if ( (LA19_0==AVOIR) ) {
										alt19=1;
									}
									switch (alt19) {
										case 1 :
											// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:134:188: AVOIR
											{
											match(input,AVOIR,FOLLOW_AVOIR_in_requete649); 
											}
											break;

									}

									match(input,MOT,FOLLOW_MOT_in_requete652); 
									pushFollow(FOLLOW_paramsMot_in_requete656);
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
						case 6 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:150:5: MOT ps= paramsMot
							{
							match(input,MOT,FOLLOW_MOT_in_requete668); 
							pushFollow(FOLLOW_paramsMot_in_requete672);
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
						case 7 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:159:5: TITRE ps= paramsMot
							{
							match(input,TITRE,FOLLOW_TITRE_in_requete683); 
							pushFollow(FOLLOW_paramsMot_in_requete687);
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
						case 8 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:168:5: AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween
							{
							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete698); 
							match(input,ENTRE,FOLLOW_ENTRE_in_requete700); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete704);
							annee1=paramAnneeBetween();
							state._fsp--;

							match(input,CONJET,FOLLOW_CONJET_in_requete706); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete710);
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
						case 9 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:180:5: AUTEUR ps= paramsAnnee
							{
							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete720); 
							pushFollow(FOLLOW_paramsAnnee_in_requete724);
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

					}

					}
					break;
				case 2 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:189:4: BULLETIN ( AVOIR )? ( ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | RUBRIQUE MOT ps= paramsRubrique | ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | MOT ps= paramsMot | AUTEUR ps= paramsAnnee | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween )
					{
					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete734); 
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:189:13: ( AVOIR )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==AVOIR) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:189:13: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete736); 
							}
							break;

					}

					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:189:20: ( ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | RUBRIQUE MOT ps= paramsRubrique | ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | MOT ps= paramsMot | AUTEUR ps= paramsAnnee | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween )
					int alt43=8;
					alt43 = dfa43.predict(input);
					switch (alt43) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:193:3: ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot )
							{
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:193:3: ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot )
							int alt27=2;
							int LA27_0 = input.LA(1);
							if ( (LA27_0==TITRE) ) {
								alt27=1;
							}
							else if ( (LA27_0==AUTEUR) ) {
								alt27=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 27, 0, input);
								throw nvae;
							}

							switch (alt27) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:193:4: TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee
									{
									match(input,TITRE,FOLLOW_TITRE_in_requete753); 
									pushFollow(FOLLOW_paramsMot_in_requete757);
									ps=paramsMot();
									state._fsp--;

									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:193:23: ( CONJET )?
									int alt23=2;
									int LA23_0 = input.LA(1);
									if ( (LA23_0==CONJET) ) {
										alt23=1;
									}
									switch (alt23) {
										case 1 :
											// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:193:23: CONJET
											{
											match(input,CONJET,FOLLOW_CONJET_in_requete759); 
											}
											break;

									}

									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:193:31: ( AVOIR )?
									int alt24=2;
									int LA24_0 = input.LA(1);
									if ( (LA24_0==AVOIR) ) {
										alt24=1;
									}
									switch (alt24) {
										case 1 :
											// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:193:31: AVOIR
											{
											match(input,AVOIR,FOLLOW_AVOIR_in_requete762); 
											}
											break;

									}

									match(input,AUTEUR,FOLLOW_AUTEUR_in_requete765); 
									pushFollow(FOLLOW_paramsAnnee_in_requete769);
									psAnnee=paramsAnnee();
									state._fsp--;

									}
									break;
								case 2 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:193:67: AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot
									{
									match(input,AUTEUR,FOLLOW_AUTEUR_in_requete773); 
									pushFollow(FOLLOW_paramsAnnee_in_requete777);
									psAnnee=paramsAnnee();
									state._fsp--;

									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:193:94: ( CONJET )?
									int alt25=2;
									int LA25_0 = input.LA(1);
									if ( (LA25_0==CONJET) ) {
										alt25=1;
									}
									switch (alt25) {
										case 1 :
											// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:193:94: CONJET
											{
											match(input,CONJET,FOLLOW_CONJET_in_requete779); 
											}
											break;

									}

									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:193:102: ( AVOIR )?
									int alt26=2;
									int LA26_0 = input.LA(1);
									if ( (LA26_0==AVOIR) ) {
										alt26=1;
									}
									switch (alt26) {
										case 1 :
											// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:193:102: AVOIR
											{
											match(input,AVOIR,FOLLOW_AVOIR_in_requete782); 
											}
											break;

									}

									match(input,TITRE,FOLLOW_TITRE_in_requete785); 
									pushFollow(FOLLOW_paramsMot_in_requete789);
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
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:208:5: ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? TITRE ps= paramsMot )
							{
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:208:5: ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? TITRE ps= paramsMot )
							int alt32=2;
							int LA32_0 = input.LA(1);
							if ( (LA32_0==TITRE) ) {
								alt32=1;
							}
							else if ( (LA32_0==AUTEUR) ) {
								alt32=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 32, 0, input);
								throw nvae;
							}

							switch (alt32) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:208:6: TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween
									{
									match(input,TITRE,FOLLOW_TITRE_in_requete808); 
									pushFollow(FOLLOW_paramsMot_in_requete812);
									ps=paramsMot();
									state._fsp--;

									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:208:25: ( CONJET )?
									int alt28=2;
									int LA28_0 = input.LA(1);
									if ( (LA28_0==CONJET) ) {
										alt28=1;
									}
									switch (alt28) {
										case 1 :
											// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:208:25: CONJET
											{
											match(input,CONJET,FOLLOW_CONJET_in_requete814); 
											}
											break;

									}

									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:208:33: ( AVOIR )?
									int alt29=2;
									int LA29_0 = input.LA(1);
									if ( (LA29_0==AVOIR) ) {
										alt29=1;
									}
									switch (alt29) {
										case 1 :
											// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:208:33: AVOIR
											{
											match(input,AVOIR,FOLLOW_AVOIR_in_requete817); 
											}
											break;

									}

									match(input,AUTEUR,FOLLOW_AUTEUR_in_requete820); 
									match(input,ENTRE,FOLLOW_ENTRE_in_requete822); 
									pushFollow(FOLLOW_paramAnneeBetween_in_requete826);
									annee1=paramAnneeBetween();
									state._fsp--;

									match(input,CONJET,FOLLOW_CONJET_in_requete828); 
									pushFollow(FOLLOW_paramAnneeBetween_in_requete832);
									annee2=paramAnneeBetween();
									state._fsp--;

									}
									break;
								case 2 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:208:112: AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? TITRE ps= paramsMot
									{
									match(input,AUTEUR,FOLLOW_AUTEUR_in_requete836); 
									match(input,ENTRE,FOLLOW_ENTRE_in_requete838); 
									pushFollow(FOLLOW_paramAnneeBetween_in_requete842);
									annee1=paramAnneeBetween();
									state._fsp--;

									match(input,CONJET,FOLLOW_CONJET_in_requete844); 
									pushFollow(FOLLOW_paramAnneeBetween_in_requete848);
									annee2=paramAnneeBetween();
									state._fsp--;

									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:208:182: ( CONJET )?
									int alt30=2;
									int LA30_0 = input.LA(1);
									if ( (LA30_0==CONJET) ) {
										alt30=1;
									}
									switch (alt30) {
										case 1 :
											// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:208:182: CONJET
											{
											match(input,CONJET,FOLLOW_CONJET_in_requete850); 
											}
											break;

									}

									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:208:190: ( AVOIR )?
									int alt31=2;
									int LA31_0 = input.LA(1);
									if ( (LA31_0==AVOIR) ) {
										alt31=1;
									}
									switch (alt31) {
										case 1 :
											// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:208:190: AVOIR
											{
											match(input,AVOIR,FOLLOW_AVOIR_in_requete853); 
											}
											break;

									}

									match(input,TITRE,FOLLOW_TITRE_in_requete856); 
									pushFollow(FOLLOW_paramsMot_in_requete860);
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
						case 3 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:223:6: RUBRIQUE MOT ps= paramsRubrique
							{
							match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete870); 
							match(input,MOT,FOLLOW_MOT_in_requete872); 
							pushFollow(FOLLOW_paramsRubrique_in_requete876);
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
						case 4 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:234:5: ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot )
							{
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:234:5: ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot )
							int alt37=2;
							int LA37_0 = input.LA(1);
							if ( (LA37_0==MOT) ) {
								alt37=1;
							}
							else if ( (LA37_0==AUTEUR) ) {
								alt37=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 37, 0, input);
								throw nvae;
							}

							switch (alt37) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:234:6: MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee
									{
									match(input,MOT,FOLLOW_MOT_in_requete894); 
									pushFollow(FOLLOW_paramsMot_in_requete898);
									ps=paramsMot();
									state._fsp--;

									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:234:23: ( CONJET )?
									int alt33=2;
									int LA33_0 = input.LA(1);
									if ( (LA33_0==CONJET) ) {
										alt33=1;
									}
									switch (alt33) {
										case 1 :
											// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:234:23: CONJET
											{
											match(input,CONJET,FOLLOW_CONJET_in_requete900); 
											}
											break;

									}

									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:234:31: ( AVOIR )?
									int alt34=2;
									int LA34_0 = input.LA(1);
									if ( (LA34_0==AVOIR) ) {
										alt34=1;
									}
									switch (alt34) {
										case 1 :
											// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:234:31: AVOIR
											{
											match(input,AVOIR,FOLLOW_AVOIR_in_requete903); 
											}
											break;

									}

									match(input,AUTEUR,FOLLOW_AUTEUR_in_requete906); 
									pushFollow(FOLLOW_paramsAnnee_in_requete910);
									psAnnee=paramsAnnee();
									state._fsp--;

									}
									break;
								case 2 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:234:67: AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot
									{
									match(input,AUTEUR,FOLLOW_AUTEUR_in_requete914); 
									pushFollow(FOLLOW_paramsAnnee_in_requete918);
									psAnnee=paramsAnnee();
									state._fsp--;

									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:234:94: ( CONJET )?
									int alt35=2;
									int LA35_0 = input.LA(1);
									if ( (LA35_0==CONJET) ) {
										alt35=1;
									}
									switch (alt35) {
										case 1 :
											// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:234:94: CONJET
											{
											match(input,CONJET,FOLLOW_CONJET_in_requete920); 
											}
											break;

									}

									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:234:102: ( AVOIR )?
									int alt36=2;
									int LA36_0 = input.LA(1);
									if ( (LA36_0==AVOIR) ) {
										alt36=1;
									}
									switch (alt36) {
										case 1 :
											// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:234:102: AVOIR
											{
											match(input,AVOIR,FOLLOW_AVOIR_in_requete923); 
											}
											break;

									}

									match(input,MOT,FOLLOW_MOT_in_requete926); 
									pushFollow(FOLLOW_paramsMot_in_requete930);
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
						case 5 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:250:5: ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot )
							{
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:250:5: ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot )
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
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:250:6: MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween
									{
									match(input,MOT,FOLLOW_MOT_in_requete952); 
									pushFollow(FOLLOW_paramsMot_in_requete956);
									ps=paramsMot();
									state._fsp--;

									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:250:23: ( CONJET )?
									int alt38=2;
									int LA38_0 = input.LA(1);
									if ( (LA38_0==CONJET) ) {
										alt38=1;
									}
									switch (alt38) {
										case 1 :
											// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:250:23: CONJET
											{
											match(input,CONJET,FOLLOW_CONJET_in_requete958); 
											}
											break;

									}

									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:250:31: ( AVOIR )?
									int alt39=2;
									int LA39_0 = input.LA(1);
									if ( (LA39_0==AVOIR) ) {
										alt39=1;
									}
									switch (alt39) {
										case 1 :
											// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:250:31: AVOIR
											{
											match(input,AVOIR,FOLLOW_AVOIR_in_requete961); 
											}
											break;

									}

									match(input,AUTEUR,FOLLOW_AUTEUR_in_requete964); 
									match(input,ENTRE,FOLLOW_ENTRE_in_requete966); 
									pushFollow(FOLLOW_paramAnneeBetween_in_requete970);
									annee1=paramAnneeBetween();
									state._fsp--;

									match(input,CONJET,FOLLOW_CONJET_in_requete972); 
									pushFollow(FOLLOW_paramAnneeBetween_in_requete976);
									annee2=paramAnneeBetween();
									state._fsp--;

									}
									break;
								case 2 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:250:110: AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot
									{
									match(input,AUTEUR,FOLLOW_AUTEUR_in_requete980); 
									match(input,ENTRE,FOLLOW_ENTRE_in_requete982); 
									pushFollow(FOLLOW_paramAnneeBetween_in_requete986);
									annee1=paramAnneeBetween();
									state._fsp--;

									match(input,CONJET,FOLLOW_CONJET_in_requete988); 
									pushFollow(FOLLOW_paramAnneeBetween_in_requete992);
									annee2=paramAnneeBetween();
									state._fsp--;

									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:250:180: ( CONJET )?
									int alt40=2;
									int LA40_0 = input.LA(1);
									if ( (LA40_0==CONJET) ) {
										alt40=1;
									}
									switch (alt40) {
										case 1 :
											// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:250:180: CONJET
											{
											match(input,CONJET,FOLLOW_CONJET_in_requete994); 
											}
											break;

									}

									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:250:188: ( AVOIR )?
									int alt41=2;
									int LA41_0 = input.LA(1);
									if ( (LA41_0==AVOIR) ) {
										alt41=1;
									}
									switch (alt41) {
										case 1 :
											// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:250:188: AVOIR
											{
											match(input,AVOIR,FOLLOW_AVOIR_in_requete997); 
											}
											break;

									}

									match(input,MOT,FOLLOW_MOT_in_requete1000); 
									pushFollow(FOLLOW_paramsMot_in_requete1004);
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
						case 6 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:266:5: MOT ps= paramsMot
							{
							match(input,MOT,FOLLOW_MOT_in_requete1016); 
							pushFollow(FOLLOW_paramsMot_in_requete1020);
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
						case 7 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:276:5: AUTEUR ps= paramsAnnee
							{
							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1034); 
							pushFollow(FOLLOW_paramsAnnee_in_requete1038);
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
						case 8 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:286:5: AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween
							{
							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1052); 
							match(input,ENTRE,FOLLOW_ENTRE_in_requete1054); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete1058);
							annee1=paramAnneeBetween();
							state._fsp--;

							match(input,CONJET,FOLLOW_CONJET_in_requete1060); 
							pushFollow(FOLLOW_paramAnneeBetween_in_requete1064);
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
					break;
				case 3 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:298:4: RUBRIQUE ARTICLE ( AVOIR )? MOT ps= paramsMot
					{
					match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete1073); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1075); 
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:298:21: ( AVOIR )?
					int alt44=2;
					int LA44_0 = input.LA(1);
					if ( (LA44_0==AVOIR) ) {
						alt44=1;
					}
					switch (alt44) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:298:21: AVOIR
							{
							match(input,AVOIR,FOLLOW_AVOIR_in_requete1077); 
							}
							break;

					}

					match(input,MOT,FOLLOW_MOT_in_requete1080); 
					pushFollow(FOLLOW_paramsMot_in_requete1084);
					ps=paramsMot();
					state._fsp--;


							req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT rubrique"));
							req_arbre.ajouteFils(new Arbre("","FROM titretext"));
							req_arbre.ajouteFils(new Arbre("","WHERE"));
							ps_arbre = ps;
							req_arbre.ajouteFils(ps_arbre);
						
					}
					break;
				case 4 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:305:4: COUNT ( ARTICLE ( AVOIR )? MOT ps= paramsMot | BULLETIN ( AVOIR )? MOT ps= paramsMot )
					{
					match(input,COUNT,FOLLOW_COUNT_in_requete1091); 
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:305:9: ( ARTICLE ( AVOIR )? MOT ps= paramsMot | BULLETIN ( AVOIR )? MOT ps= paramsMot )
					int alt47=2;
					int LA47_0 = input.LA(1);
					if ( (LA47_0==ARTICLE) ) {
						alt47=1;
					}
					else if ( (LA47_0==BULLETIN) ) {
						alt47=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 47, 0, input);
						throw nvae;
					}

					switch (alt47) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:307:3: ARTICLE ( AVOIR )? MOT ps= paramsMot
							{
							match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1099); 
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:307:11: ( AVOIR )?
							int alt45=2;
							int LA45_0 = input.LA(1);
							if ( (LA45_0==AVOIR) ) {
								alt45=1;
							}
							switch (alt45) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:307:11: AVOIR
									{
									match(input,AVOIR,FOLLOW_AVOIR_in_requete1101); 
									}
									break;

							}

							match(input,MOT,FOLLOW_MOT_in_requete1104); 
							pushFollow(FOLLOW_paramsMot_in_requete1108);
							ps=paramsMot();
							state._fsp--;


										req_arbre.ajouteFils(new Arbre("","SELECT COUNT(DISTINCT fichier)"));
										req_arbre.ajouteFils(new Arbre("","FROM titretext"));
										req_arbre.ajouteFils(new Arbre("","WHERE"));
										ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
									
							}
							break;
						case 2 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:315:5: BULLETIN ( AVOIR )? MOT ps= paramsMot
							{
							match(input,BULLETIN,FOLLOW_BULLETIN_in_requete1121); 
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:315:14: ( AVOIR )?
							int alt46=2;
							int LA46_0 = input.LA(1);
							if ( (LA46_0==AVOIR) ) {
								alt46=1;
							}
							switch (alt46) {
								case 1 :
									// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:315:14: AVOIR
									{
									match(input,AVOIR,FOLLOW_AVOIR_in_requete1123); 
									}
									break;

							}

							match(input,MOT,FOLLOW_MOT_in_requete1126); 
							pushFollow(FOLLOW_paramsMot_in_requete1130);
							ps=paramsMot();
							state._fsp--;


										req_arbre.ajouteFils(new Arbre("","SELECT COUNT(DISTINCT numero)"));
										req_arbre.ajouteFils(new Arbre("","FROM titretext"));
										req_arbre.ajouteFils(new Arbre("","WHERE"));
										ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
									
							}
							break;

					}

					}
					break;
				case 5 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:324:4: ( EVERY )? ( ARTICLE | BULLETIN )
					{
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:324:4: ( EVERY )?
					int alt48=2;
					int LA48_0 = input.LA(1);
					if ( (LA48_0==EVERY) ) {
						alt48=1;
					}
					switch (alt48) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:324:4: EVERY
							{
							match(input,EVERY,FOLLOW_EVERY_in_requete1142); 
							}
							break;

					}

					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:324:10: ( ARTICLE | BULLETIN )
					int alt49=2;
					int LA49_0 = input.LA(1);
					if ( (LA49_0==ARTICLE) ) {
						alt49=1;
					}
					else if ( (LA49_0==BULLETIN) ) {
						alt49=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 49, 0, input);
						throw nvae;
					}

					switch (alt49) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:326:3: ARTICLE
							{
							match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1151); 

										req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
										req_arbre.ajouteFils(new Arbre("","fichier"));
										req_arbre.ajouteFils(new Arbre("","FROM numero"));
									
							}
							break;
						case 2 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:332:5: BULLETIN
							{
							match(input,BULLETIN,FOLLOW_BULLETIN_in_requete1162); 

										req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
										req_arbre.ajouteFils(new Arbre("","numero"));
										req_arbre.ajouteFils(new Arbre("","FROM numero"));
									
							}
							break;

					}

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
	// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:341:1: paramsMot returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= paramMot ( CONJOU par2= paramMot | CONJET par2= paramMot )* ;
	public final Arbre paramsMot() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:342:40: (par1= paramMot ( CONJOU par2= paramMot | CONJET par2= paramMot )* )
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:343:3: par1= paramMot ( CONJOU par2= paramMot | CONJET par2= paramMot )*
			{
			pushFollow(FOLLOW_paramMot_in_paramsMot1196);
			par1=paramMot();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:348:3: ( CONJOU par2= paramMot | CONJET par2= paramMot )*
			loop51:
			while (true) {
				int alt51=3;
				int LA51_0 = input.LA(1);
				if ( (LA51_0==CONJET) ) {
					int LA51_1 = input.LA(2);
					if ( (LA51_1==VAR) ) {
						alt51=2;
					}

				}
				else if ( (LA51_0==CONJOU) ) {
					alt51=1;
				}

				switch (alt51) {
				case 1 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:348:4: CONJOU par2= paramMot
					{
					match(input,CONJOU,FOLLOW_CONJOU_in_paramsMot1207); 
					pushFollow(FOLLOW_paramMot_in_paramsMot1213);
					par2=paramMot();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "OR"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;
				case 2 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:354:5: CONJET par2= paramMot
					{
					match(input,CONJET,FOLLOW_CONJET_in_paramsMot1224); 
					pushFollow(FOLLOW_paramMot_in_paramsMot1230);
					par2=paramMot();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "AND"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;

				default :
					break loop51;
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
	// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:363:1: paramMot returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
	public final Arbre paramMot() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:363:54: (a= VAR )
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:364:2: a= VAR
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_paramMot1258); 
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
	// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:368:1: paramsRubrique returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= paramRubrique ( CONJOU par2= paramRubrique | ( CONJET )? par2= paramRubrique )* ;
	public final Arbre paramsRubrique() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:369:40: (par1= paramRubrique ( CONJOU par2= paramRubrique | ( CONJET )? par2= paramRubrique )* )
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:370:3: par1= paramRubrique ( CONJOU par2= paramRubrique | ( CONJET )? par2= paramRubrique )*
			{
			pushFollow(FOLLOW_paramRubrique_in_paramsRubrique1288);
			par1=paramRubrique();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:375:3: ( CONJOU par2= paramRubrique | ( CONJET )? par2= paramRubrique )*
			loop53:
			while (true) {
				int alt53=3;
				int LA53_0 = input.LA(1);
				if ( (LA53_0==CONJOU) ) {
					alt53=1;
				}
				else if ( (LA53_0==CONJET||LA53_0==VAR) ) {
					alt53=2;
				}

				switch (alt53) {
				case 1 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:375:4: CONJOU par2= paramRubrique
					{
					match(input,CONJOU,FOLLOW_CONJOU_in_paramsRubrique1299); 
					pushFollow(FOLLOW_paramRubrique_in_paramsRubrique1305);
					par2=paramRubrique();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "OR"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;
				case 2 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:381:5: ( CONJET )? par2= paramRubrique
					{
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:381:5: ( CONJET )?
					int alt52=2;
					int LA52_0 = input.LA(1);
					if ( (LA52_0==CONJET) ) {
						alt52=1;
					}
					switch (alt52) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:381:5: CONJET
							{
							match(input,CONJET,FOLLOW_CONJET_in_paramsRubrique1316); 
							}
							break;

					}

					pushFollow(FOLLOW_paramRubrique_in_paramsRubrique1323);
					par2=paramRubrique();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "AND"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;

				default :
					break loop53;
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
	// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:390:1: paramRubrique returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
	public final Arbre paramRubrique() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:390:59: (a= VAR )
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:391:2: a= VAR
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_paramRubrique1351); 
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
	// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:396:1: paramsAnnee returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= paramAnnee ( CONJOU par2= paramAnnee | CONJET par2= paramAnnee )* ;
	public final Arbre paramsAnnee() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:397:40: (par1= paramAnnee ( CONJOU par2= paramAnnee | CONJET par2= paramAnnee )* )
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:398:3: par1= paramAnnee ( CONJOU par2= paramAnnee | CONJET par2= paramAnnee )*
			{
			pushFollow(FOLLOW_paramAnnee_in_paramsAnnee1382);
			par1=paramAnnee();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:403:3: ( CONJOU par2= paramAnnee | CONJET par2= paramAnnee )*
			loop54:
			while (true) {
				int alt54=3;
				int LA54_0 = input.LA(1);
				if ( (LA54_0==CONJET) ) {
					int LA54_2 = input.LA(2);
					if ( (LA54_2==ANNEE) ) {
						alt54=2;
					}

				}
				else if ( (LA54_0==CONJOU) ) {
					alt54=1;
				}

				switch (alt54) {
				case 1 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:403:4: CONJOU par2= paramAnnee
					{
					match(input,CONJOU,FOLLOW_CONJOU_in_paramsAnnee1393); 
					pushFollow(FOLLOW_paramAnnee_in_paramsAnnee1399);
					par2=paramAnnee();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "OR"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;
				case 2 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:409:5: CONJET par2= paramAnnee
					{
					match(input,CONJET,FOLLOW_CONJET_in_paramsAnnee1410); 
					pushFollow(FOLLOW_paramAnnee_in_paramsAnnee1416);
					par2=paramAnnee();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "AND"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;

				default :
					break loop54;
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
	// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:418:1: paramAnnee returns [Arbre lepar_arbre = new Arbre(\"\")] : a= ANNEE ;
	public final Arbre paramAnnee() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:418:56: (a= ANNEE )
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:419:2: a= ANNEE
			{
			a=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_paramAnnee1444); 
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
	// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:423:1: paramsAnneeJointure returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= paramAnneeJointure ( CONJOU par2= paramAnneeJointure | CONJET par2= paramAnneeJointure )* ;
	public final Arbre paramsAnneeJointure() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:424:40: (par1= paramAnneeJointure ( CONJOU par2= paramAnneeJointure | CONJET par2= paramAnneeJointure )* )
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:425:3: par1= paramAnneeJointure ( CONJOU par2= paramAnneeJointure | CONJET par2= paramAnneeJointure )*
			{
			pushFollow(FOLLOW_paramAnneeJointure_in_paramsAnneeJointure1474);
			par1=paramAnneeJointure();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:430:3: ( CONJOU par2= paramAnneeJointure | CONJET par2= paramAnneeJointure )*
			loop55:
			while (true) {
				int alt55=3;
				int LA55_0 = input.LA(1);
				if ( (LA55_0==CONJOU) ) {
					alt55=1;
				}
				else if ( (LA55_0==CONJET) ) {
					alt55=2;
				}

				switch (alt55) {
				case 1 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:430:4: CONJOU par2= paramAnneeJointure
					{
					match(input,CONJOU,FOLLOW_CONJOU_in_paramsAnneeJointure1485); 
					pushFollow(FOLLOW_paramAnneeJointure_in_paramsAnneeJointure1491);
					par2=paramAnneeJointure();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "OR"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;
				case 2 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:436:5: CONJET par2= paramAnneeJointure
					{
					match(input,CONJET,FOLLOW_CONJET_in_paramsAnneeJointure1502); 
					pushFollow(FOLLOW_paramAnneeJointure_in_paramsAnneeJointure1508);
					par2=paramAnneeJointure();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "AND"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;

				default :
					break loop55;
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
	// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:445:1: paramAnneeJointure returns [Arbre lepar_arbre = new Arbre(\"\")] : a= ANNEE ;
	public final Arbre paramAnneeJointure() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:445:64: (a= ANNEE )
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:446:2: a= ANNEE
			{
			a=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_paramAnneeJointure1536); 
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
	// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:450:1: paramAnneeBetween returns [Arbre lepar_arbre = new Arbre(\"\")] : a= ANNEE ;
	public final Arbre paramAnneeBetween() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:450:63: (a= ANNEE )
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:451:2: a= ANNEE
			{
			a=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_paramAnneeBetween1558); 
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


	protected DFA21 dfa21 = new DFA21(this);
	protected DFA43 dfa43 = new DFA43(this);
	static final String DFA21_eotS =
		"\46\uffff";
	static final String DFA21_eofS =
		"\5\uffff\1\15\1\uffff\1\24\1\31\21\uffff\2\15\2\uffff\2\24\2\31\1\uffff"+
		"\1\45\2\uffff";
	static final String DFA21_minS =
		"\1\6\1\23\1\4\1\uffff\1\23\1\6\1\4\1\7\1\6\1\23\2\6\1\4\1\uffff\1\11\2"+
		"\4\1\17\3\uffff\1\23\2\6\1\4\1\uffff\2\6\1\uffff\1\4\2\7\2\6\1\uffff\1"+
		"\7\1\17\1\uffff";
	static final String DFA21_maxS =
		"\1\22\1\23\1\15\1\uffff\1\23\1\12\1\4\1\22\1\12\2\23\1\6\1\15\1\uffff"+
		"\1\11\1\4\2\22\3\uffff\2\23\1\6\1\15\1\uffff\2\12\1\uffff\1\4\2\22\2\12"+
		"\1\uffff\2\22\1\uffff";
	static final String DFA21_acceptS =
		"\3\uffff\1\3\11\uffff\1\7\4\uffff\1\1\1\4\1\11\4\uffff\1\6\2\uffff\1\2"+
		"\5\uffff\1\5\2\uffff\1\10";
	static final String DFA21_specialS =
		"\46\uffff}>";
	static final String[] DFA21_transitionS = {
			"\1\2\10\uffff\1\4\1\3\1\uffff\1\1",
			"\1\5",
			"\1\7\10\uffff\1\6",
			"",
			"\1\10",
			"\1\14\1\13\1\uffff\1\12\1\11",
			"\1\16",
			"\1\21\1\uffff\1\20\1\17\4\uffff\1\23\2\uffff\1\22",
			"\1\30\1\27\1\uffff\1\26\1\25",
			"\1\32",
			"\2\22\13\uffff\1\33",
			"\1\14",
			"\1\22\10\uffff\1\34",
			"",
			"\1\35",
			"\1\36",
			"\1\37\2\uffff\1\21\7\uffff\1\23\2\uffff\1\22",
			"\1\23\2\uffff\1\22",
			"",
			"",
			"",
			"\1\40",
			"\1\30\1\27\13\uffff\1\41",
			"\1\30",
			"\1\23\10\uffff\1\42",
			"",
			"\1\14\1\13\1\uffff\1\12\1\11",
			"\1\14\1\13\1\uffff\1\12\1\11",
			"",
			"\1\43",
			"\1\21\1\uffff\1\20\1\17\4\uffff\1\23\2\uffff\1\22",
			"\1\21\1\uffff\1\20\1\17\4\uffff\1\23\2\uffff\1\22",
			"\1\30\1\27\1\uffff\1\26\1\25",
			"\1\30\1\27\1\uffff\1\26\1\25",
			"",
			"\1\44\1\uffff\1\42\5\uffff\1\42\2\uffff\1\34",
			"\1\42\2\uffff\1\34",
			""
	};

	static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
	static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
	static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
	static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
	static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
	static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
	static final short[][] DFA21_transition;

	static {
		int numStates = DFA21_transitionS.length;
		DFA21_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
		}
	}

	protected class DFA21 extends DFA {

		public DFA21(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 21;
			this.eot = DFA21_eot;
			this.eof = DFA21_eof;
			this.min = DFA21_min;
			this.max = DFA21_max;
			this.accept = DFA21_accept;
			this.special = DFA21_special;
			this.transition = DFA21_transition;
		}
		@Override
		public String getDescription() {
			return "77:18: ( ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ( TITRE ps= paramsMot ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( AVOIR )? TITRE ps= paramsMot ) | RUBRIQUE MOT ps= paramsRubrique | ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | MOT ps= paramsMot | TITRE ps= paramsMot | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ps= paramsAnnee )";
		}
	}

	static final String DFA43_eotS =
		"\46\uffff";
	static final String DFA43_eofS =
		"\7\uffff\1\23\1\30\24\uffff\2\23\2\30\1\uffff\1\45\3\uffff";
	static final String DFA43_minS =
		"\1\6\1\23\1\4\1\uffff\1\23\1\6\1\4\1\7\1\6\1\23\2\6\1\4\1\11\2\4\1\17"+
		"\3\uffff\1\23\2\6\1\4\1\uffff\2\6\1\uffff\1\4\2\7\2\6\1\uffff\2\7\1\17"+
		"\1\uffff";
	static final String DFA43_maxS =
		"\1\22\1\23\1\15\1\uffff\1\23\1\12\1\4\1\22\1\12\2\23\1\6\1\15\1\11\1\4"+
		"\2\22\3\uffff\2\23\1\6\1\15\1\uffff\2\12\1\uffff\1\4\2\22\2\12\1\uffff"+
		"\3\22\1\uffff";
	static final String DFA43_acceptS =
		"\3\uffff\1\3\15\uffff\1\1\1\4\1\7\4\uffff\1\6\2\uffff\1\2\5\uffff\1\5"+
		"\3\uffff\1\10";
	static final String DFA43_specialS =
		"\46\uffff}>";
	static final String[] DFA43_transitionS = {
			"\1\2\10\uffff\1\4\1\3\1\uffff\1\1",
			"\1\5",
			"\1\7\10\uffff\1\6",
			"",
			"\1\10",
			"\1\14\1\13\1\uffff\1\12\1\11",
			"\1\15",
			"\1\20\1\uffff\1\17\1\16\4\uffff\1\22\2\uffff\1\21",
			"\1\27\1\26\1\uffff\1\25\1\24",
			"\1\31",
			"\1\14\1\13\13\uffff\1\32",
			"\1\14",
			"\1\21\10\uffff\1\33",
			"\1\34",
			"\1\35",
			"\1\36\2\uffff\1\20\7\uffff\1\22\2\uffff\1\21",
			"\1\22\2\uffff\1\21",
			"",
			"",
			"",
			"\1\37",
			"\1\27\1\26\13\uffff\1\40",
			"\1\27",
			"\1\22\10\uffff\1\41",
			"",
			"\1\14\1\13\1\uffff\1\12\1\11",
			"\1\14\1\13\1\uffff\1\12\1\11",
			"",
			"\1\42",
			"\1\20\1\uffff\1\17\1\16\4\uffff\1\22\2\uffff\1\21",
			"\1\20\1\uffff\1\17\1\16\4\uffff\1\22\2\uffff\1\21",
			"\1\27\1\26\1\uffff\1\25\1\24",
			"\1\27\1\26\1\uffff\1\25\1\24",
			"",
			"\1\44\1\uffff\1\43\5\uffff\1\41\2\uffff\1\33",
			"\1\44\7\uffff\1\41\2\uffff\1\33",
			"\1\41\2\uffff\1\33",
			""
	};

	static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
	static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
	static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
	static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
	static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
	static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
	static final short[][] DFA43_transition;

	static {
		int numStates = DFA43_transitionS.length;
		DFA43_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
		}
	}

	protected class DFA43 extends DFA {

		public DFA43(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 43;
			this.eot = DFA43_eot;
			this.eof = DFA43_eof;
			this.min = DFA43_min;
			this.max = DFA43_max;
			this.accept = DFA43_accept;
			this.special = DFA43_special;
			this.transition = DFA43_transition;
		}
		@Override
		public String getDescription() {
			return "189:20: ( ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | ( TITRE ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? TITRE ps= paramsMot ) | RUBRIQUE MOT ps= paramsRubrique | ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR psAnnee= paramsAnnee | AUTEUR psAnnee= paramsAnnee ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | ( MOT ps= paramsMot ( CONJET )? ( AVOIR )? AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween ( CONJET )? ( AVOIR )? MOT ps= paramsMot ) | MOT ps= paramsMot | AUTEUR ps= paramsAnnee | AUTEUR ENTRE annee1= paramAnneeBetween CONJET annee2= paramAnneeBetween )";
		}
	}

	public static final BitSet FOLLOW_requete_in_listerequetes348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete389 = new BitSet(new long[]{0x0000000000034920L});
	public static final BitSet FOLLOW_ARTICLE_in_requete405 = new BitSet(new long[]{0x00000000000580C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete407 = new BitSet(new long[]{0x0000000000058040L});
	public static final BitSet FOLLOW_TITRE_in_requete415 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_paramsMot_in_requete419 = new BitSet(new long[]{0x00000000000002C0L});
	public static final BitSet FOLLOW_CONJET_in_requete421 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete424 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete427 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramsAnnee_in_requete431 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTEUR_in_requete435 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramsAnnee_in_requete439 = new BitSet(new long[]{0x0000000000040280L});
	public static final BitSet FOLLOW_CONJET_in_requete441 = new BitSet(new long[]{0x0000000000040080L});
	public static final BitSet FOLLOW_AVOIR_in_requete444 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_TITRE_in_requete447 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_paramsMot_in_requete451 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TITRE_in_requete470 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_paramsMot_in_requete474 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete476 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete479 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ENTRE_in_requete481 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete485 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CONJET_in_requete487 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTEUR_in_requete495 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ENTRE_in_requete497 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete501 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CONJET_in_requete503 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete507 = new BitSet(new long[]{0x0000000000040080L});
	public static final BitSet FOLLOW_AVOIR_in_requete509 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_TITRE_in_requete512 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_paramsMot_in_requete516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete525 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOT_in_requete527 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_paramsRubrique_in_requete531 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOT_in_requete549 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_paramsMot_in_requete553 = new BitSet(new long[]{0x00000000000002C0L});
	public static final BitSet FOLLOW_CONJET_in_requete555 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete558 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete561 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramsAnnee_in_requete565 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTEUR_in_requete569 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramsAnnee_in_requete573 = new BitSet(new long[]{0x0000000000008280L});
	public static final BitSet FOLLOW_CONJET_in_requete575 = new BitSet(new long[]{0x0000000000008080L});
	public static final BitSet FOLLOW_AVOIR_in_requete578 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOT_in_requete581 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_paramsMot_in_requete585 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOT_in_requete604 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_paramsMot_in_requete608 = new BitSet(new long[]{0x00000000000002C0L});
	public static final BitSet FOLLOW_CONJET_in_requete610 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete613 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete616 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ENTRE_in_requete618 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete622 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CONJET_in_requete624 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete628 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTEUR_in_requete632 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ENTRE_in_requete634 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete638 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CONJET_in_requete640 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete644 = new BitSet(new long[]{0x0000000000008280L});
	public static final BitSet FOLLOW_CONJET_in_requete646 = new BitSet(new long[]{0x0000000000008080L});
	public static final BitSet FOLLOW_AVOIR_in_requete649 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOT_in_requete652 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_paramsMot_in_requete656 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOT_in_requete668 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_paramsMot_in_requete672 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TITRE_in_requete683 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_paramsMot_in_requete687 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTEUR_in_requete698 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ENTRE_in_requete700 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete704 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CONJET_in_requete706 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete710 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTEUR_in_requete720 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramsAnnee_in_requete724 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BULLETIN_in_requete734 = new BitSet(new long[]{0x00000000000580C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete736 = new BitSet(new long[]{0x0000000000058040L});
	public static final BitSet FOLLOW_TITRE_in_requete753 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_paramsMot_in_requete757 = new BitSet(new long[]{0x00000000000002C0L});
	public static final BitSet FOLLOW_CONJET_in_requete759 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete762 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete765 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramsAnnee_in_requete769 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTEUR_in_requete773 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramsAnnee_in_requete777 = new BitSet(new long[]{0x0000000000040280L});
	public static final BitSet FOLLOW_CONJET_in_requete779 = new BitSet(new long[]{0x0000000000040080L});
	public static final BitSet FOLLOW_AVOIR_in_requete782 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_TITRE_in_requete785 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_paramsMot_in_requete789 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TITRE_in_requete808 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_paramsMot_in_requete812 = new BitSet(new long[]{0x00000000000002C0L});
	public static final BitSet FOLLOW_CONJET_in_requete814 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete817 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete820 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ENTRE_in_requete822 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete826 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CONJET_in_requete828 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete832 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTEUR_in_requete836 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ENTRE_in_requete838 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete842 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CONJET_in_requete844 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete848 = new BitSet(new long[]{0x0000000000040280L});
	public static final BitSet FOLLOW_CONJET_in_requete850 = new BitSet(new long[]{0x0000000000040080L});
	public static final BitSet FOLLOW_AVOIR_in_requete853 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_TITRE_in_requete856 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_paramsMot_in_requete860 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete870 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOT_in_requete872 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_paramsRubrique_in_requete876 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOT_in_requete894 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_paramsMot_in_requete898 = new BitSet(new long[]{0x00000000000002C0L});
	public static final BitSet FOLLOW_CONJET_in_requete900 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete903 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete906 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramsAnnee_in_requete910 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTEUR_in_requete914 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramsAnnee_in_requete918 = new BitSet(new long[]{0x0000000000008280L});
	public static final BitSet FOLLOW_CONJET_in_requete920 = new BitSet(new long[]{0x0000000000008080L});
	public static final BitSet FOLLOW_AVOIR_in_requete923 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOT_in_requete926 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_paramsMot_in_requete930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOT_in_requete952 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_paramsMot_in_requete956 = new BitSet(new long[]{0x00000000000002C0L});
	public static final BitSet FOLLOW_CONJET_in_requete958 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_AVOIR_in_requete961 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete964 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ENTRE_in_requete966 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete970 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CONJET_in_requete972 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete976 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTEUR_in_requete980 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ENTRE_in_requete982 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete986 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CONJET_in_requete988 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete992 = new BitSet(new long[]{0x0000000000008280L});
	public static final BitSet FOLLOW_CONJET_in_requete994 = new BitSet(new long[]{0x0000000000008080L});
	public static final BitSet FOLLOW_AVOIR_in_requete997 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOT_in_requete1000 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_paramsMot_in_requete1004 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOT_in_requete1016 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_paramsMot_in_requete1020 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1034 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramsAnnee_in_requete1038 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1052 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ENTRE_in_requete1054 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete1058 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CONJET_in_requete1060 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete1064 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete1073 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1075 = new BitSet(new long[]{0x0000000000008080L});
	public static final BitSet FOLLOW_AVOIR_in_requete1077 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOT_in_requete1080 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_paramsMot_in_requete1084 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COUNT_in_requete1091 = new BitSet(new long[]{0x0000000000000120L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1099 = new BitSet(new long[]{0x0000000000008080L});
	public static final BitSet FOLLOW_AVOIR_in_requete1101 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOT_in_requete1104 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_paramsMot_in_requete1108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BULLETIN_in_requete1121 = new BitSet(new long[]{0x0000000000008080L});
	public static final BitSet FOLLOW_AVOIR_in_requete1123 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOT_in_requete1126 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_paramsMot_in_requete1130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EVERY_in_requete1142 = new BitSet(new long[]{0x0000000000000120L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1151 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BULLETIN_in_requete1162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramMot_in_paramsMot1196 = new BitSet(new long[]{0x0000000000000602L});
	public static final BitSet FOLLOW_CONJOU_in_paramsMot1207 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_paramMot_in_paramsMot1213 = new BitSet(new long[]{0x0000000000000602L});
	public static final BitSet FOLLOW_CONJET_in_paramsMot1224 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_paramMot_in_paramsMot1230 = new BitSet(new long[]{0x0000000000000602L});
	public static final BitSet FOLLOW_VAR_in_paramMot1258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramRubrique_in_paramsRubrique1288 = new BitSet(new long[]{0x0000000000080602L});
	public static final BitSet FOLLOW_CONJOU_in_paramsRubrique1299 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_paramRubrique_in_paramsRubrique1305 = new BitSet(new long[]{0x0000000000080602L});
	public static final BitSet FOLLOW_CONJET_in_paramsRubrique1316 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_paramRubrique_in_paramsRubrique1323 = new BitSet(new long[]{0x0000000000080602L});
	public static final BitSet FOLLOW_VAR_in_paramRubrique1351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramAnnee_in_paramsAnnee1382 = new BitSet(new long[]{0x0000000000000602L});
	public static final BitSet FOLLOW_CONJOU_in_paramsAnnee1393 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnnee_in_paramsAnnee1399 = new BitSet(new long[]{0x0000000000000602L});
	public static final BitSet FOLLOW_CONJET_in_paramsAnnee1410 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnnee_in_paramsAnnee1416 = new BitSet(new long[]{0x0000000000000602L});
	public static final BitSet FOLLOW_ANNEE_in_paramAnnee1444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramAnneeJointure_in_paramsAnneeJointure1474 = new BitSet(new long[]{0x0000000000000602L});
	public static final BitSet FOLLOW_CONJOU_in_paramsAnneeJointure1485 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeJointure_in_paramsAnneeJointure1491 = new BitSet(new long[]{0x0000000000000602L});
	public static final BitSet FOLLOW_CONJET_in_paramsAnneeJointure1502 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeJointure_in_paramsAnneeJointure1508 = new BitSet(new long[]{0x0000000000000602L});
	public static final BitSet FOLLOW_ANNEE_in_paramAnneeJointure1536 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANNEE_in_paramAnneeBetween1558 = new BitSet(new long[]{0x0000000000000002L});
}
