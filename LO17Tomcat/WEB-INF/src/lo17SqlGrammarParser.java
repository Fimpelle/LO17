// $ANTLR 3.5.1 C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g 2016-06-16 16:10:07

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class lo17SqlGrammarParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ANNEE", "ARTICLE", "AUTEUR", 
		"BULLETIN", "CONJET", "CONJOU", "COUNT", "DATE", "EVERY", "MOT", "RUBRIQUE", 
		"SELECT", "TEXTE", "TITRE", "VAR", "WS", "'entre'"
	};
	public static final int EOF=-1;
	public static final int T__20=20;
	public static final int ANNEE=4;
	public static final int ARTICLE=5;
	public static final int AUTEUR=6;
	public static final int BULLETIN=7;
	public static final int CONJET=8;
	public static final int CONJOU=9;
	public static final int COUNT=10;
	public static final int DATE=11;
	public static final int EVERY=12;
	public static final int MOT=13;
	public static final int RUBRIQUE=14;
	public static final int SELECT=15;
	public static final int TEXTE=16;
	public static final int TITRE=17;
	public static final int VAR=18;
	public static final int WS=19;

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
	// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:51:1: listerequetes returns [String sql = \"\"] : r= requete ;
	public final String listerequetes() throws RecognitionException {
		String sql =  "";


		Arbre r =null;

		Arbre lr_arbre;
		try {
			// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:52:25: (r= requete )
			// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:53:3: r= requete
			{
			pushFollow(FOLLOW_requete_in_listerequetes325);
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
	// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:60:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( ( SELECT )? ARTICLE MOT ps= paramsMot | ( SELECT )? BULLETIN MOT ps= paramsMot | ( SELECT )? COUNT ARTICLE MOT ps= paramsMot | ( SELECT )? COUNT BULLETIN MOT ps= paramsMot | ( SELECT )? ARTICLE TITRE ps= paramsMot | ( SELECT )? ( EVERY )? ARTICLE | ( SELECT )? ( EVERY )? BULLETIN | ( SELECT )? ARTICLE AUTEUR ps= paramsAnnee | ( SELECT )? BULLETIN AUTEUR ps= paramsAnnee | ( SELECT )? ARTICLE AUTEUR 'entre' annee1= paramAnneeBetween annee2= paramAnneeBetween | ( SELECT )? BULLETIN AUTEUR 'entre' annee1= paramAnneeBetween annee2= paramAnneeBetween );
	public final Arbre requete() throws RecognitionException {
		Arbre req_arbre =  new Arbre("");


		Arbre ps =null;
		Arbre annee1 =null;
		Arbre annee2 =null;

		Arbre ps_arbre;
		try {
			// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:61:26: ( ( SELECT )? ARTICLE MOT ps= paramsMot | ( SELECT )? BULLETIN MOT ps= paramsMot | ( SELECT )? COUNT ARTICLE MOT ps= paramsMot | ( SELECT )? COUNT BULLETIN MOT ps= paramsMot | ( SELECT )? ARTICLE TITRE ps= paramsMot | ( SELECT )? ( EVERY )? ARTICLE | ( SELECT )? ( EVERY )? BULLETIN | ( SELECT )? ARTICLE AUTEUR ps= paramsAnnee | ( SELECT )? BULLETIN AUTEUR ps= paramsAnnee | ( SELECT )? ARTICLE AUTEUR 'entre' annee1= paramAnneeBetween annee2= paramAnneeBetween | ( SELECT )? BULLETIN AUTEUR 'entre' annee1= paramAnneeBetween annee2= paramAnneeBetween )
			int alt14=11;
			switch ( input.LA(1) ) {
			case SELECT:
				{
				switch ( input.LA(2) ) {
				case ARTICLE:
					{
					switch ( input.LA(3) ) {
					case MOT:
						{
						alt14=1;
						}
						break;
					case TITRE:
						{
						alt14=5;
						}
						break;
					case AUTEUR:
						{
						int LA14_8 = input.LA(4);
						if ( (LA14_8==20) ) {
							alt14=10;
						}
						else if ( (LA14_8==ANNEE) ) {
							alt14=8;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 14, 8, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case EOF:
						{
						alt14=6;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 14, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case BULLETIN:
					{
					switch ( input.LA(3) ) {
					case MOT:
						{
						alt14=2;
						}
						break;
					case AUTEUR:
						{
						int LA14_11 = input.LA(4);
						if ( (LA14_11==20) ) {
							alt14=11;
						}
						else if ( (LA14_11==ANNEE) ) {
							alt14=9;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 14, 11, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case EOF:
						{
						alt14=7;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 14, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case COUNT:
					{
					int LA14_4 = input.LA(3);
					if ( (LA14_4==ARTICLE) ) {
						alt14=3;
					}
					else if ( (LA14_4==BULLETIN) ) {
						alt14=4;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 14, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case EVERY:
					{
					int LA14_5 = input.LA(3);
					if ( (LA14_5==ARTICLE) ) {
						alt14=6;
					}
					else if ( (LA14_5==BULLETIN) ) {
						alt14=7;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 14, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 14, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case ARTICLE:
				{
				switch ( input.LA(2) ) {
				case MOT:
					{
					alt14=1;
					}
					break;
				case TITRE:
					{
					alt14=5;
					}
					break;
				case AUTEUR:
					{
					int LA14_8 = input.LA(3);
					if ( (LA14_8==20) ) {
						alt14=10;
					}
					else if ( (LA14_8==ANNEE) ) {
						alt14=8;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 14, 8, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case EOF:
					{
					alt14=6;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 14, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case BULLETIN:
				{
				switch ( input.LA(2) ) {
				case MOT:
					{
					alt14=2;
					}
					break;
				case AUTEUR:
					{
					int LA14_11 = input.LA(3);
					if ( (LA14_11==20) ) {
						alt14=11;
					}
					else if ( (LA14_11==ANNEE) ) {
						alt14=9;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 14, 11, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case EOF:
					{
					alt14=7;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 14, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case COUNT:
				{
				int LA14_4 = input.LA(2);
				if ( (LA14_4==ARTICLE) ) {
					alt14=3;
				}
				else if ( (LA14_4==BULLETIN) ) {
					alt14=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 14, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case EVERY:
				{
				int LA14_5 = input.LA(2);
				if ( (LA14_5==ARTICLE) ) {
					alt14=6;
				}
				else if ( (LA14_5==BULLETIN) ) {
					alt14=7;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 14, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:64:2: ( SELECT )? ARTICLE MOT ps= paramsMot
					{
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:64:2: ( SELECT )?
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==SELECT) ) {
						alt1=1;
					}
					switch (alt1) {
						case 1 :
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:64:2: SELECT
							{
							match(input,SELECT,FOLLOW_SELECT_in_requete354); 
							}
							break;

					}

					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete357); 
					match(input,MOT,FOLLOW_MOT_in_requete359); 
					pushFollow(FOLLOW_paramsMot_in_requete363);
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
				case 2 :
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:73:4: ( SELECT )? BULLETIN MOT ps= paramsMot
					{
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:73:4: ( SELECT )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==SELECT) ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:73:4: SELECT
							{
							match(input,SELECT,FOLLOW_SELECT_in_requete372); 
							}
							break;

					}

					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete375); 
					match(input,MOT,FOLLOW_MOT_in_requete377); 
					pushFollow(FOLLOW_paramsMot_in_requete381);
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
				case 3 :
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:82:4: ( SELECT )? COUNT ARTICLE MOT ps= paramsMot
					{
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:82:4: ( SELECT )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==SELECT) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:82:4: SELECT
							{
							match(input,SELECT,FOLLOW_SELECT_in_requete390); 
							}
							break;

					}

					match(input,COUNT,FOLLOW_COUNT_in_requete393); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete395); 
					match(input,MOT,FOLLOW_MOT_in_requete397); 
					pushFollow(FOLLOW_paramsMot_in_requete401);
					ps=paramsMot();
					state._fsp--;


							req_arbre.ajouteFils(new Arbre("","SELECT COUNT(DISTINCT fichier)"));
							req_arbre.ajouteFils(new Arbre("","FROM titretext"));
							req_arbre.ajouteFils(new Arbre("","WHERE"));
							ps_arbre = ps;
							req_arbre.ajouteFils(ps_arbre);
						
					}
					break;
				case 4 :
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:90:4: ( SELECT )? COUNT BULLETIN MOT ps= paramsMot
					{
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:90:4: ( SELECT )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==SELECT) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:90:4: SELECT
							{
							match(input,SELECT,FOLLOW_SELECT_in_requete412); 
							}
							break;

					}

					match(input,COUNT,FOLLOW_COUNT_in_requete415); 
					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete417); 
					match(input,MOT,FOLLOW_MOT_in_requete419); 
					pushFollow(FOLLOW_paramsMot_in_requete423);
					ps=paramsMot();
					state._fsp--;


							req_arbre.ajouteFils(new Arbre("","SELECT COUNT(DISTINCT numero)"));
							req_arbre.ajouteFils(new Arbre("","FROM titretext"));
							req_arbre.ajouteFils(new Arbre("","WHERE"));
							ps_arbre = ps;
							req_arbre.ajouteFils(ps_arbre);
						
					}
					break;
				case 5 :
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:98:4: ( SELECT )? ARTICLE TITRE ps= paramsMot
					{
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:98:4: ( SELECT )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==SELECT) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:98:4: SELECT
							{
							match(input,SELECT,FOLLOW_SELECT_in_requete432); 
							}
							break;

					}

					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete435); 
					match(input,TITRE,FOLLOW_TITRE_in_requete437); 
					pushFollow(FOLLOW_paramsMot_in_requete441);
					ps=paramsMot();
					state._fsp--;


							req_arbre.ajouteFils(new Arbre("","SELECT"));
							req_arbre.ajouteFils(new Arbre("","fichier"));
							req_arbre.ajouteFils(new Arbre("","FROM titre"));
							req_arbre.ajouteFils(new Arbre("","WHERE"));
							ps_arbre = ps;
							req_arbre.ajouteFils(ps_arbre);
						
					}
					break;
				case 6 :
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:107:4: ( SELECT )? ( EVERY )? ARTICLE
					{
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:107:4: ( SELECT )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==SELECT) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:107:4: SELECT
							{
							match(input,SELECT,FOLLOW_SELECT_in_requete450); 
							}
							break;

					}

					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:107:12: ( EVERY )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==EVERY) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:107:12: EVERY
							{
							match(input,EVERY,FOLLOW_EVERY_in_requete453); 
							}
							break;

					}

					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete456); 

							req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
							req_arbre.ajouteFils(new Arbre("","fichier"));
							req_arbre.ajouteFils(new Arbre("","FROM numero"));
						
					}
					break;
				case 7 :
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:113:4: ( SELECT )? ( EVERY )? BULLETIN
					{
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:113:4: ( SELECT )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==SELECT) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:113:4: SELECT
							{
							match(input,SELECT,FOLLOW_SELECT_in_requete465); 
							}
							break;

					}

					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:113:12: ( EVERY )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==EVERY) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:113:12: EVERY
							{
							match(input,EVERY,FOLLOW_EVERY_in_requete468); 
							}
							break;

					}

					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete471); 

							req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
							req_arbre.ajouteFils(new Arbre("","numero"));
							req_arbre.ajouteFils(new Arbre("","FROM numero"));
						
					}
					break;
				case 8 :
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:119:4: ( SELECT )? ARTICLE AUTEUR ps= paramsAnnee
					{
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:119:4: ( SELECT )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==SELECT) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:119:4: SELECT
							{
							match(input,SELECT,FOLLOW_SELECT_in_requete480); 
							}
							break;

					}

					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete483); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete485); 
					pushFollow(FOLLOW_paramsAnnee_in_requete489);
					ps=paramsAnnee();
					state._fsp--;


							req_arbre.ajouteFils(new Arbre("","SELECT"));
							req_arbre.ajouteFils(new Arbre("","fichier"));
							req_arbre.ajouteFils(new Arbre("","FROM date"));
							req_arbre.ajouteFils(new Arbre("","WHERE"));
							ps_arbre = ps;
							req_arbre.ajouteFils(ps_arbre);
						
					}
					break;
				case 9 :
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:128:4: ( SELECT )? BULLETIN AUTEUR ps= paramsAnnee
					{
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:128:4: ( SELECT )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==SELECT) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:128:4: SELECT
							{
							match(input,SELECT,FOLLOW_SELECT_in_requete498); 
							}
							break;

					}

					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete501); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete503); 
					pushFollow(FOLLOW_paramsAnnee_in_requete507);
					ps=paramsAnnee();
					state._fsp--;


							req_arbre.ajouteFils(new Arbre("","SELECT"));
							req_arbre.ajouteFils(new Arbre("","numero"));
							req_arbre.ajouteFils(new Arbre("","FROM date"));
							req_arbre.ajouteFils(new Arbre("","WHERE"));
							ps_arbre = ps;
							req_arbre.ajouteFils(ps_arbre);
						
					}
					break;
				case 10 :
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:137:4: ( SELECT )? ARTICLE AUTEUR 'entre' annee1= paramAnneeBetween annee2= paramAnneeBetween
					{
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:137:4: ( SELECT )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==SELECT) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:137:4: SELECT
							{
							match(input,SELECT,FOLLOW_SELECT_in_requete516); 
							}
							break;

					}

					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete519); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete521); 
					match(input,20,FOLLOW_20_in_requete523); 
					pushFollow(FOLLOW_paramAnneeBetween_in_requete527);
					annee1=paramAnneeBetween();
					state._fsp--;

					pushFollow(FOLLOW_paramAnneeBetween_in_requete531);
					annee2=paramAnneeBetween();
					state._fsp--;


							req_arbre.ajouteFils(new Arbre("","SELECT"));
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
				case 11 :
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:149:4: ( SELECT )? BULLETIN AUTEUR 'entre' annee1= paramAnneeBetween annee2= paramAnneeBetween
					{
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:149:4: ( SELECT )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==SELECT) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:149:4: SELECT
							{
							match(input,SELECT,FOLLOW_SELECT_in_requete539); 
							}
							break;

					}

					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete542); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete544); 
					match(input,20,FOLLOW_20_in_requete546); 
					pushFollow(FOLLOW_paramAnneeBetween_in_requete550);
					annee1=paramAnneeBetween();
					state._fsp--;

					pushFollow(FOLLOW_paramAnneeBetween_in_requete554);
					annee2=paramAnneeBetween();
					state._fsp--;


							req_arbre.ajouteFils(new Arbre("","SELECT"));
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
	// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:162:1: paramsMot returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= paramMot ( CONJOU par2= paramMot | CONJET par2= paramMot )* ;
	public final Arbre paramsMot() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:163:40: (par1= paramMot ( CONJOU par2= paramMot | CONJET par2= paramMot )* )
			// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:164:3: par1= paramMot ( CONJOU par2= paramMot | CONJET par2= paramMot )*
			{
			pushFollow(FOLLOW_paramMot_in_paramsMot581);
			par1=paramMot();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:169:3: ( CONJOU par2= paramMot | CONJET par2= paramMot )*
			loop15:
			while (true) {
				int alt15=3;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==CONJOU) ) {
					alt15=1;
				}
				else if ( (LA15_0==CONJET) ) {
					alt15=2;
				}

				switch (alt15) {
				case 1 :
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:169:4: CONJOU par2= paramMot
					{
					match(input,CONJOU,FOLLOW_CONJOU_in_paramsMot592); 
					pushFollow(FOLLOW_paramMot_in_paramsMot598);
					par2=paramMot();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "OR"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;
				case 2 :
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:175:5: CONJET par2= paramMot
					{
					match(input,CONJET,FOLLOW_CONJET_in_paramsMot609); 
					pushFollow(FOLLOW_paramMot_in_paramsMot615);
					par2=paramMot();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "AND"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;

				default :
					break loop15;
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
	// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:184:1: paramMot returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
	public final Arbre paramMot() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:184:54: (a= VAR )
			// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:185:2: a= VAR
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_paramMot643); 
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
	// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:190:1: paramsAnnee returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= paramAnnee ( CONJOU par2= paramAnnee | CONJET par2= paramAnnee )* ;
	public final Arbre paramsAnnee() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:191:40: (par1= paramAnnee ( CONJOU par2= paramAnnee | CONJET par2= paramAnnee )* )
			// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:192:3: par1= paramAnnee ( CONJOU par2= paramAnnee | CONJET par2= paramAnnee )*
			{
			pushFollow(FOLLOW_paramAnnee_in_paramsAnnee674);
			par1=paramAnnee();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:197:3: ( CONJOU par2= paramAnnee | CONJET par2= paramAnnee )*
			loop16:
			while (true) {
				int alt16=3;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==CONJOU) ) {
					alt16=1;
				}
				else if ( (LA16_0==CONJET) ) {
					alt16=2;
				}

				switch (alt16) {
				case 1 :
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:197:4: CONJOU par2= paramAnnee
					{
					match(input,CONJOU,FOLLOW_CONJOU_in_paramsAnnee685); 
					pushFollow(FOLLOW_paramAnnee_in_paramsAnnee691);
					par2=paramAnnee();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "OR"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;
				case 2 :
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:203:5: CONJET par2= paramAnnee
					{
					match(input,CONJET,FOLLOW_CONJET_in_paramsAnnee702); 
					pushFollow(FOLLOW_paramAnnee_in_paramsAnnee708);
					par2=paramAnnee();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "AND"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;

				default :
					break loop16;
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
	// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:212:1: paramAnnee returns [Arbre lepar_arbre = new Arbre(\"\")] : a= ANNEE ;
	public final Arbre paramAnnee() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:212:56: (a= ANNEE )
			// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:213:2: a= ANNEE
			{
			a=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_paramAnnee736); 
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



	// $ANTLR start "paramAnneeBetween"
	// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:217:1: paramAnneeBetween returns [Arbre lepar_arbre = new Arbre(\"\")] : a= ANNEE ;
	public final Arbre paramAnneeBetween() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:217:63: (a= ANNEE )
			// C:\\Users\\Florian\\Documents\\workspace\\LO17\\LO17Tomcat\\WEB-INF\\src\\lo17SqlGrammar.g:218:2: a= ANNEE
			{
			a=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_paramAnneeBetween758); 
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



	public static final BitSet FOLLOW_requete_in_listerequetes325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete354 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ARTICLE_in_requete357 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_MOT_in_requete359 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_paramsMot_in_requete363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete372 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BULLETIN_in_requete375 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_MOT_in_requete377 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_paramsMot_in_requete381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete390 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COUNT_in_requete393 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ARTICLE_in_requete395 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_MOT_in_requete397 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_paramsMot_in_requete401 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete412 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COUNT_in_requete415 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BULLETIN_in_requete417 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_MOT_in_requete419 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_paramsMot_in_requete423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete432 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ARTICLE_in_requete435 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_TITRE_in_requete437 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_paramsMot_in_requete441 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete450 = new BitSet(new long[]{0x0000000000001020L});
	public static final BitSet FOLLOW_EVERY_in_requete453 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ARTICLE_in_requete456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete465 = new BitSet(new long[]{0x0000000000001080L});
	public static final BitSet FOLLOW_EVERY_in_requete468 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BULLETIN_in_requete471 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete480 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ARTICLE_in_requete483 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete485 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramsAnnee_in_requete489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete498 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BULLETIN_in_requete501 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete503 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramsAnnee_in_requete507 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete516 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ARTICLE_in_requete519 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete521 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_requete523 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete527 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete531 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete539 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BULLETIN_in_requete542 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete544 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_requete546 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete550 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnneeBetween_in_requete554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramMot_in_paramsMot581 = new BitSet(new long[]{0x0000000000000302L});
	public static final BitSet FOLLOW_CONJOU_in_paramsMot592 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_paramMot_in_paramsMot598 = new BitSet(new long[]{0x0000000000000302L});
	public static final BitSet FOLLOW_CONJET_in_paramsMot609 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_paramMot_in_paramsMot615 = new BitSet(new long[]{0x0000000000000302L});
	public static final BitSet FOLLOW_VAR_in_paramMot643 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramAnnee_in_paramsAnnee674 = new BitSet(new long[]{0x0000000000000302L});
	public static final BitSet FOLLOW_CONJOU_in_paramsAnnee685 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnnee_in_paramsAnnee691 = new BitSet(new long[]{0x0000000000000302L});
	public static final BitSet FOLLOW_CONJET_in_paramsAnnee702 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_paramAnnee_in_paramsAnnee708 = new BitSet(new long[]{0x0000000000000302L});
	public static final BitSet FOLLOW_ANNEE_in_paramAnnee736 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANNEE_in_paramAnneeBetween758 = new BitSet(new long[]{0x0000000000000002L});
}
