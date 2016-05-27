// $ANTLR 3.5.1 C:\\Users\\Florian\\Documents\\workspace\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g 2016-05-27 15:48:56

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
	@Override public String getGrammarFileName() { return "C:\\Users\\Florian\\Documents\\workspace\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g"; }



	// $ANTLR start "listerequetes"
	// C:\\Users\\Florian\\Documents\\workspace\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:45:1: listerequetes returns [String sql = \"\"] : r= requete ;
	public final String listerequetes() throws RecognitionException {
		String sql =  "";


		Arbre r =null;

		Arbre lr_arbre;
		try {
			// C:\\Users\\Florian\\Documents\\workspace\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:46:25: (r= requete )
			// C:\\Users\\Florian\\Documents\\workspace\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:47:3: r= requete
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
	// C:\\Users\\Florian\\Documents\\workspace\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:54:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( ( SELECT )? ARTICLE MOT ps= params | ( SELECT )? BULLETIN MOT ps= params | ( SELECT )? COUNT ARTICLE MOT ps= params | ( SELECT )? COUNT BULLETIN MOT ps= params );
	public final Arbre requete() throws RecognitionException {
		Arbre req_arbre =  new Arbre("");


		Arbre ps =null;

		Arbre ps_arbre;
		try {
			// C:\\Users\\Florian\\Documents\\workspace\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:55:26: ( ( SELECT )? ARTICLE MOT ps= params | ( SELECT )? BULLETIN MOT ps= params | ( SELECT )? COUNT ARTICLE MOT ps= params | ( SELECT )? COUNT BULLETIN MOT ps= params )
			int alt5=4;
			switch ( input.LA(1) ) {
			case SELECT:
				{
				switch ( input.LA(2) ) {
				case ARTICLE:
					{
					alt5=1;
					}
					break;
				case BULLETIN:
					{
					alt5=2;
					}
					break;
				case COUNT:
					{
					int LA5_4 = input.LA(3);
					if ( (LA5_4==ARTICLE) ) {
						alt5=3;
					}
					else if ( (LA5_4==BULLETIN) ) {
						alt5=4;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 5, 4, input);
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
							new NoViableAltException("", 5, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case ARTICLE:
				{
				alt5=1;
				}
				break;
			case BULLETIN:
				{
				alt5=2;
				}
				break;
			case COUNT:
				{
				int LA5_4 = input.LA(2);
				if ( (LA5_4==ARTICLE) ) {
					alt5=3;
				}
				else if ( (LA5_4==BULLETIN) ) {
					alt5=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:57:2: ( SELECT )? ARTICLE MOT ps= params
					{
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:57:2: ( SELECT )?
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==SELECT) ) {
						alt1=1;
					}
					switch (alt1) {
						case 1 :
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:57:2: SELECT
							{
							match(input,SELECT,FOLLOW_SELECT_in_requete313); 
							}
							break;

					}

					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete316); 
					match(input,MOT,FOLLOW_MOT_in_requete318); 
					pushFollow(FOLLOW_params_in_requete322);
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
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:65:4: ( SELECT )? BULLETIN MOT ps= params
					{
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:65:4: ( SELECT )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==SELECT) ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:65:4: SELECT
							{
							match(input,SELECT,FOLLOW_SELECT_in_requete329); 
							}
							break;

					}

					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete332); 
					match(input,MOT,FOLLOW_MOT_in_requete334); 
					pushFollow(FOLLOW_params_in_requete338);
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
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:73:4: ( SELECT )? COUNT ARTICLE MOT ps= params
					{
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:73:4: ( SELECT )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==SELECT) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:73:4: SELECT
							{
							match(input,SELECT,FOLLOW_SELECT_in_requete345); 
							}
							break;

					}

					match(input,COUNT,FOLLOW_COUNT_in_requete348); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete350); 
					match(input,MOT,FOLLOW_MOT_in_requete352); 
					pushFollow(FOLLOW_params_in_requete356);
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
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:80:4: ( SELECT )? COUNT BULLETIN MOT ps= params
					{
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:80:4: ( SELECT )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==SELECT) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// C:\\Users\\Florian\\Documents\\workspace\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:80:4: SELECT
							{
							match(input,SELECT,FOLLOW_SELECT_in_requete365); 
							}
							break;

					}

					match(input,COUNT,FOLLOW_COUNT_in_requete368); 
					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete370); 
					match(input,MOT,FOLLOW_MOT_in_requete372); 
					pushFollow(FOLLOW_params_in_requete376);
					ps=params();
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
	// C:\\Users\\Florian\\Documents\\workspace\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:89:1: params returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param ( CONJOU par2= param | CONJET par2= param )* ;
	public final Arbre params() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// C:\\Users\\Florian\\Documents\\workspace\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:90:40: (par1= param ( CONJOU par2= param | CONJET par2= param )* )
			// C:\\Users\\Florian\\Documents\\workspace\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:91:3: par1= param ( CONJOU par2= param | CONJET par2= param )*
			{
			pushFollow(FOLLOW_param_in_params406);
			par1=param();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// C:\\Users\\Florian\\Documents\\workspace\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:96:3: ( CONJOU par2= param | CONJET par2= param )*
			loop6:
			while (true) {
				int alt6=3;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==CONJOU) ) {
					alt6=1;
				}
				else if ( (LA6_0==CONJET) ) {
					alt6=2;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:96:4: CONJOU par2= param
					{
					match(input,CONJOU,FOLLOW_CONJOU_in_params417); 
					pushFollow(FOLLOW_param_in_params423);
					par2=param();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "OR"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;
				case 2 :
					// C:\\Users\\Florian\\Documents\\workspace\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:102:5: CONJET par2= param
					{
					match(input,CONJET,FOLLOW_CONJET_in_params434); 
					pushFollow(FOLLOW_param_in_params440);
					par2=param();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "AND"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;

				default :
					break loop6;
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
	// C:\\Users\\Florian\\Documents\\workspace\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:111:1: param returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
	public final Arbre param() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\Florian\\Documents\\workspace\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:111:51: (a= VAR )
			// C:\\Users\\Florian\\Documents\\workspace\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:112:2: a= VAR
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_param468); 
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
	public static final BitSet FOLLOW_SELECT_in_requete313 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete316 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_MOT_in_requete318 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_params_in_requete322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete329 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BULLETIN_in_requete332 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_MOT_in_requete334 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_params_in_requete338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete345 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_COUNT_in_requete348 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete350 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_MOT_in_requete352 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_params_in_requete356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete365 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_COUNT_in_requete368 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BULLETIN_in_requete370 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_MOT_in_requete372 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_params_in_requete376 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_in_params406 = new BitSet(new long[]{0x0000000000000182L});
	public static final BitSet FOLLOW_CONJOU_in_params417 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_param_in_params423 = new BitSet(new long[]{0x0000000000000182L});
	public static final BitSet FOLLOW_CONJET_in_params434 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_param_in_params440 = new BitSet(new long[]{0x0000000000000182L});
	public static final BitSet FOLLOW_VAR_in_param468 = new BitSet(new long[]{0x0000000000000002L});
}
