// $ANTLR 3.5.1 C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g 2016-06-03 13:49:16

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class lo17SqlGrammarParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARTICLE", "AUTEUR", "BULLETIN", 
		"CONJET", "CONJOU", "COUNT", "DATE", "MOT", "RUBRIQUE", "SELECT", "TEXTE", 
		"TITRE", "VAR", "WS"
	};
	public static final int EOF=-1;
	public static final int ARTICLE=4;
	public static final int AUTEUR=5;
	public static final int BULLETIN=6;
	public static final int CONJET=7;
	public static final int CONJOU=8;
	public static final int COUNT=9;
	public static final int DATE=10;
	public static final int MOT=11;
	public static final int RUBRIQUE=12;
	public static final int SELECT=13;
	public static final int TEXTE=14;
	public static final int TITRE=15;
	public static final int VAR=16;
	public static final int WS=17;

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
	// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:45:1: listerequetes returns [String sql = \"\"] : r= requete ;
	public final String listerequetes() throws RecognitionException {
		String sql =  "";


		Arbre r =null;

		Arbre lr_arbre;
		try {
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:46:25: (r= requete )
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:47:3: r= requete
			{
			pushFollow(FOLLOW_requete_in_listerequetes286);
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
	// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:54:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( ( SELECT )? ARTICLE MOT ps= params | ( SELECT )? BULLETIN MOT ps= params | ( SELECT )? COUNT ARTICLE MOT ps= params | ( SELECT )? COUNT BULLETIN MOT ps= params | ( SELECT )? ARTICLE TITRE ps= params );
	public final Arbre requete() throws RecognitionException {
		Arbre req_arbre =  new Arbre("");


		Arbre ps =null;

		Arbre ps_arbre;
		try {
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:55:26: ( ( SELECT )? ARTICLE MOT ps= params | ( SELECT )? BULLETIN MOT ps= params | ( SELECT )? COUNT ARTICLE MOT ps= params | ( SELECT )? COUNT BULLETIN MOT ps= params | ( SELECT )? ARTICLE TITRE ps= params )
			int alt6=5;
			switch ( input.LA(1) ) {
			case SELECT:
				{
				switch ( input.LA(2) ) {
				case ARTICLE:
					{
					int LA6_2 = input.LA(3);
					if ( (LA6_2==MOT) ) {
						alt6=1;
					}
					else if ( (LA6_2==TITRE) ) {
						alt6=5;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 6, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case BULLETIN:
					{
					alt6=2;
					}
					break;
				case COUNT:
					{
					int LA6_4 = input.LA(3);
					if ( (LA6_4==ARTICLE) ) {
						alt6=3;
					}
					else if ( (LA6_4==BULLETIN) ) {
						alt6=4;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 6, 4, input);
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
							new NoViableAltException("", 6, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case ARTICLE:
				{
				int LA6_2 = input.LA(2);
				if ( (LA6_2==MOT) ) {
					alt6=1;
				}
				else if ( (LA6_2==TITRE) ) {
					alt6=5;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case BULLETIN:
				{
				alt6=2;
				}
				break;
			case COUNT:
				{
				int LA6_4 = input.LA(2);
				if ( (LA6_4==ARTICLE) ) {
					alt6=3;
				}
				else if ( (LA6_4==BULLETIN) ) {
					alt6=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:58:2: ( SELECT )? ARTICLE MOT ps= params
					{
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:58:2: ( SELECT )?
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==SELECT) ) {
						alt1=1;
					}
					switch (alt1) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:58:2: SELECT
							{
							match(input,SELECT,FOLLOW_SELECT_in_requete315); 
							}
							break;

					}

					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete318); 
					match(input,MOT,FOLLOW_MOT_in_requete320); 
					pushFollow(FOLLOW_params_in_requete324);
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
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:67:4: ( SELECT )? BULLETIN MOT ps= params
					{
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:67:4: ( SELECT )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==SELECT) ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:67:4: SELECT
							{
							match(input,SELECT,FOLLOW_SELECT_in_requete333); 
							}
							break;

					}

					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete336); 
					match(input,MOT,FOLLOW_MOT_in_requete338); 
					pushFollow(FOLLOW_params_in_requete342);
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
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:76:4: ( SELECT )? COUNT ARTICLE MOT ps= params
					{
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:76:4: ( SELECT )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==SELECT) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:76:4: SELECT
							{
							match(input,SELECT,FOLLOW_SELECT_in_requete351); 
							}
							break;

					}

					match(input,COUNT,FOLLOW_COUNT_in_requete354); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete356); 
					match(input,MOT,FOLLOW_MOT_in_requete358); 
					pushFollow(FOLLOW_params_in_requete362);
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
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:84:4: ( SELECT )? COUNT BULLETIN MOT ps= params
					{
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:84:4: ( SELECT )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==SELECT) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:84:4: SELECT
							{
							match(input,SELECT,FOLLOW_SELECT_in_requete373); 
							}
							break;

					}

					match(input,COUNT,FOLLOW_COUNT_in_requete376); 
					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete378); 
					match(input,MOT,FOLLOW_MOT_in_requete380); 
					pushFollow(FOLLOW_params_in_requete384);
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
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:92:4: ( SELECT )? ARTICLE TITRE ps= params
					{
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:92:4: ( SELECT )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==SELECT) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:92:4: SELECT
							{
							match(input,SELECT,FOLLOW_SELECT_in_requete393); 
							}
							break;

					}

					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete396); 
					match(input,TITRE,FOLLOW_TITRE_in_requete398); 
					pushFollow(FOLLOW_params_in_requete402);
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
	// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:102:1: params returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param ( CONJOU par2= param | CONJET par2= param )* ;
	public final Arbre params() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:103:40: (par1= param ( CONJOU par2= param | CONJET par2= param )* )
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:104:3: par1= param ( CONJOU par2= param | CONJET par2= param )*
			{
			pushFollow(FOLLOW_param_in_params434);
			par1=param();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:109:3: ( CONJOU par2= param | CONJET par2= param )*
			loop7:
			while (true) {
				int alt7=3;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==CONJOU) ) {
					alt7=1;
				}
				else if ( (LA7_0==CONJET) ) {
					alt7=2;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:109:4: CONJOU par2= param
					{
					match(input,CONJOU,FOLLOW_CONJOU_in_params445); 
					pushFollow(FOLLOW_param_in_params451);
					par2=param();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "OR"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;
				case 2 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:115:5: CONJET par2= param
					{
					match(input,CONJET,FOLLOW_CONJET_in_params462); 
					pushFollow(FOLLOW_param_in_params468);
					par2=param();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "AND"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;

				default :
					break loop7;
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
	// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:124:1: param returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
	public final Arbre param() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:124:51: (a= VAR )
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:125:2: a= VAR
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_param496); 
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



	public static final BitSet FOLLOW_requete_in_listerequetes286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete315 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete318 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_MOT_in_requete320 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_params_in_requete324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete333 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BULLETIN_in_requete336 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_MOT_in_requete338 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_params_in_requete342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete351 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_COUNT_in_requete354 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete356 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_MOT_in_requete358 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_params_in_requete362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete373 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_COUNT_in_requete376 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BULLETIN_in_requete378 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_MOT_in_requete380 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_params_in_requete384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete393 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete396 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_TITRE_in_requete398 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_params_in_requete402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_in_params434 = new BitSet(new long[]{0x0000000000000182L});
	public static final BitSet FOLLOW_CONJOU_in_params445 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_param_in_params451 = new BitSet(new long[]{0x0000000000000182L});
	public static final BitSet FOLLOW_CONJET_in_params462 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_param_in_params468 = new BitSet(new long[]{0x0000000000000182L});
	public static final BitSet FOLLOW_VAR_in_param496 = new BitSet(new long[]{0x0000000000000002L});
}
