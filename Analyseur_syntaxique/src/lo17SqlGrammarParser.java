// $ANTLR 3.5.1 C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g 2016-06-03 15:00:53

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class lo17SqlGrammarParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARTICLE", "AUTEUR", "BULLETIN", 
		"CONJET", "CONJOU", "COUNT", "DATE", "EVERY", "MOT", "RUBRIQUE", "SELECT", 
		"TEXTE", "TITRE", "VAR", "WS"
	};
	public static final int EOF=-1;
	public static final int ARTICLE=4;
	public static final int AUTEUR=5;
	public static final int BULLETIN=6;
	public static final int CONJET=7;
	public static final int CONJOU=8;
	public static final int COUNT=9;
	public static final int DATE=10;
	public static final int EVERY=11;
	public static final int MOT=12;
	public static final int RUBRIQUE=13;
	public static final int SELECT=14;
	public static final int TEXTE=15;
	public static final int TITRE=16;
	public static final int VAR=17;
	public static final int WS=18;

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
	@Override public String getGrammarFileName() { return "C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g"; }



	// $ANTLR start "listerequetes"
	// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:48:1: listerequetes returns [String sql = \"\"] : r= requete ;
	public final String listerequetes() throws RecognitionException {
		String sql =  "";


		Arbre r =null;

		Arbre lr_arbre;
		try {
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:49:25: (r= requete )
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:50:3: r= requete
			{
			pushFollow(FOLLOW_requete_in_listerequetes294);
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
	// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:57:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( ( SELECT )? ARTICLE MOT ps= params | ( SELECT )? BULLETIN MOT ps= params | ( SELECT )? COUNT ARTICLE MOT ps= params | ( SELECT )? COUNT BULLETIN MOT ps= params | ( SELECT )? ARTICLE TITRE ps= params | ( SELECT )? ( EVERY )? ARTICLE | ( SELECT )? ( EVERY )? BULLETIN );
	public final Arbre requete() throws RecognitionException {
		Arbre req_arbre =  new Arbre("");


		Arbre ps =null;

		Arbre ps_arbre;
		try {
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:58:26: ( ( SELECT )? ARTICLE MOT ps= params | ( SELECT )? BULLETIN MOT ps= params | ( SELECT )? COUNT ARTICLE MOT ps= params | ( SELECT )? COUNT BULLETIN MOT ps= params | ( SELECT )? ARTICLE TITRE ps= params | ( SELECT )? ( EVERY )? ARTICLE | ( SELECT )? ( EVERY )? BULLETIN )
			int alt10=7;
			switch ( input.LA(1) ) {
			case SELECT:
				{
				switch ( input.LA(2) ) {
				case ARTICLE:
					{
					switch ( input.LA(3) ) {
					case MOT:
						{
						alt10=1;
						}
						break;
					case TITRE:
						{
						alt10=5;
						}
						break;
					case EOF:
						{
						alt10=6;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 10, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case BULLETIN:
					{
					int LA10_3 = input.LA(3);
					if ( (LA10_3==MOT) ) {
						alt10=2;
					}
					else if ( (LA10_3==EOF) ) {
						alt10=7;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 10, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case COUNT:
					{
					int LA10_4 = input.LA(3);
					if ( (LA10_4==ARTICLE) ) {
						alt10=3;
					}
					else if ( (LA10_4==BULLETIN) ) {
						alt10=4;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 10, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case EVERY:
					{
					int LA10_5 = input.LA(3);
					if ( (LA10_5==ARTICLE) ) {
						alt10=6;
					}
					else if ( (LA10_5==BULLETIN) ) {
						alt10=7;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 10, 5, input);
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
							new NoViableAltException("", 10, 1, input);
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
					alt10=1;
					}
					break;
				case TITRE:
					{
					alt10=5;
					}
					break;
				case EOF:
					{
					alt10=6;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case BULLETIN:
				{
				int LA10_3 = input.LA(2);
				if ( (LA10_3==MOT) ) {
					alt10=2;
				}
				else if ( (LA10_3==EOF) ) {
					alt10=7;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case COUNT:
				{
				int LA10_4 = input.LA(2);
				if ( (LA10_4==ARTICLE) ) {
					alt10=3;
				}
				else if ( (LA10_4==BULLETIN) ) {
					alt10=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case EVERY:
				{
				int LA10_5 = input.LA(2);
				if ( (LA10_5==ARTICLE) ) {
					alt10=6;
				}
				else if ( (LA10_5==BULLETIN) ) {
					alt10=7;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:61:2: ( SELECT )? ARTICLE MOT ps= params
					{
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:61:2: ( SELECT )?
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==SELECT) ) {
						alt1=1;
					}
					switch (alt1) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:61:2: SELECT
							{
							match(input,SELECT,FOLLOW_SELECT_in_requete323); 
							}
							break;

					}

					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete326); 
					match(input,MOT,FOLLOW_MOT_in_requete328); 
					pushFollow(FOLLOW_params_in_requete332);
					ps=params();
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
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:70:4: ( SELECT )? BULLETIN MOT ps= params
					{
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:70:4: ( SELECT )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==SELECT) ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:70:4: SELECT
							{
							match(input,SELECT,FOLLOW_SELECT_in_requete341); 
							}
							break;

					}

					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete344); 
					match(input,MOT,FOLLOW_MOT_in_requete346); 
					pushFollow(FOLLOW_params_in_requete350);
					ps=params();
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
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:79:4: ( SELECT )? COUNT ARTICLE MOT ps= params
					{
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:79:4: ( SELECT )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==SELECT) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:79:4: SELECT
							{
							match(input,SELECT,FOLLOW_SELECT_in_requete359); 
							}
							break;

					}

					match(input,COUNT,FOLLOW_COUNT_in_requete362); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete364); 
					match(input,MOT,FOLLOW_MOT_in_requete366); 
					pushFollow(FOLLOW_params_in_requete370);
					ps=params();
					state._fsp--;


							req_arbre.ajouteFils(new Arbre("","SELECT COUNT(DISTINCT fichier)"));
							req_arbre.ajouteFils(new Arbre("","FROM titretext"));
							req_arbre.ajouteFils(new Arbre("","WHERE"));
							ps_arbre = ps;
							req_arbre.ajouteFils(ps_arbre);
						
					}
					break;
				case 4 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:87:4: ( SELECT )? COUNT BULLETIN MOT ps= params
					{
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:87:4: ( SELECT )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==SELECT) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:87:4: SELECT
							{
							match(input,SELECT,FOLLOW_SELECT_in_requete381); 
							}
							break;

					}

					match(input,COUNT,FOLLOW_COUNT_in_requete384); 
					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete386); 
					match(input,MOT,FOLLOW_MOT_in_requete388); 
					pushFollow(FOLLOW_params_in_requete392);
					ps=params();
					state._fsp--;


							req_arbre.ajouteFils(new Arbre("","SELECT COUNT(DISTINCT numero)"));
							req_arbre.ajouteFils(new Arbre("","FROM titretext"));
							req_arbre.ajouteFils(new Arbre("","WHERE"));
							ps_arbre = ps;
							req_arbre.ajouteFils(ps_arbre);
						
					}
					break;
				case 5 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:95:4: ( SELECT )? ARTICLE TITRE ps= params
					{
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:95:4: ( SELECT )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==SELECT) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:95:4: SELECT
							{
							match(input,SELECT,FOLLOW_SELECT_in_requete401); 
							}
							break;

					}

					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete404); 
					match(input,TITRE,FOLLOW_TITRE_in_requete406); 
					pushFollow(FOLLOW_params_in_requete410);
					ps=params();
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
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:104:4: ( SELECT )? ( EVERY )? ARTICLE
					{
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:104:4: ( SELECT )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==SELECT) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:104:4: SELECT
							{
							match(input,SELECT,FOLLOW_SELECT_in_requete419); 
							}
							break;

					}

					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:104:12: ( EVERY )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==EVERY) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:104:12: EVERY
							{
							match(input,EVERY,FOLLOW_EVERY_in_requete422); 
							}
							break;

					}

					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete425); 

							req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
							req_arbre.ajouteFils(new Arbre("","fichier"));
							req_arbre.ajouteFils(new Arbre("","FROM numero"));
						
					}
					break;
				case 7 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:110:4: ( SELECT )? ( EVERY )? BULLETIN
					{
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:110:4: ( SELECT )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==SELECT) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:110:4: SELECT
							{
							match(input,SELECT,FOLLOW_SELECT_in_requete434); 
							}
							break;

					}

					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:110:12: ( EVERY )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==EVERY) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:110:12: EVERY
							{
							match(input,EVERY,FOLLOW_EVERY_in_requete437); 
							}
							break;

					}

					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete440); 

							req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
							req_arbre.ajouteFils(new Arbre("","numero"));
							req_arbre.ajouteFils(new Arbre("","FROM numero"));
						
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



	// $ANTLR start "params"
	// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:117:1: params returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param ( CONJOU par2= param | CONJET par2= param )* ;
	public final Arbre params() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:118:40: (par1= param ( CONJOU par2= param | CONJET par2= param )* )
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:119:3: par1= param ( CONJOU par2= param | CONJET par2= param )*
			{
			pushFollow(FOLLOW_param_in_params468);
			par1=param();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:124:3: ( CONJOU par2= param | CONJET par2= param )*
			loop11:
			while (true) {
				int alt11=3;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==CONJOU) ) {
					alt11=1;
				}
				else if ( (LA11_0==CONJET) ) {
					alt11=2;
				}

				switch (alt11) {
				case 1 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:124:4: CONJOU par2= param
					{
					match(input,CONJOU,FOLLOW_CONJOU_in_params479); 
					pushFollow(FOLLOW_param_in_params485);
					par2=param();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "OR"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;
				case 2 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:130:5: CONJET par2= param
					{
					match(input,CONJET,FOLLOW_CONJET_in_params496); 
					pushFollow(FOLLOW_param_in_params502);
					par2=param();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "AND"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;

				default :
					break loop11;
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
	// $ANTLR end "params"



	// $ANTLR start "param"
	// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:139:1: param returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
	public final Arbre param() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:139:51: (a= VAR )
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:140:2: a= VAR
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_param530); 
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
	// $ANTLR end "param"

	// Delegated rules



	public static final BitSet FOLLOW_requete_in_listerequetes294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete323 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete326 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_MOT_in_requete328 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_params_in_requete332 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete341 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BULLETIN_in_requete344 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_MOT_in_requete346 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_params_in_requete350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete359 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_COUNT_in_requete362 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete364 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_MOT_in_requete366 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_params_in_requete370 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete381 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_COUNT_in_requete384 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BULLETIN_in_requete386 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_MOT_in_requete388 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_params_in_requete392 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete401 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete404 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_TITRE_in_requete406 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_params_in_requete410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete419 = new BitSet(new long[]{0x0000000000000810L});
	public static final BitSet FOLLOW_EVERY_in_requete422 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete434 = new BitSet(new long[]{0x0000000000000840L});
	public static final BitSet FOLLOW_EVERY_in_requete437 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BULLETIN_in_requete440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_in_params468 = new BitSet(new long[]{0x0000000000000182L});
	public static final BitSet FOLLOW_CONJOU_in_params479 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_param_in_params485 = new BitSet(new long[]{0x0000000000000182L});
	public static final BitSet FOLLOW_CONJET_in_params496 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_param_in_params502 = new BitSet(new long[]{0x0000000000000182L});
	public static final BitSet FOLLOW_VAR_in_param530 = new BitSet(new long[]{0x0000000000000002L});
}
