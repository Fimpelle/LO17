// $ANTLR 3.5.1 /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g 2016-05-20 16:05:23

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class lo17SqlGrammarParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARTICLE", "AUTEUR", "BULLETIN", 
		"CONJET", "CONJOU", "COUNT", "DATE", "MOT", "POINT", "RUBRIQUE", "SELECT", 
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
	public static final int MOT=11;
	public static final int POINT=12;
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
	@Override public String getGrammarFileName() { return "/volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g"; }



	// $ANTLR start "listerequetes"
	// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:48:1: listerequetes returns [String sql = \"\"] : r= requete POINT ;
	public final String listerequetes() throws RecognitionException {
		String sql =  "";


		Arbre r =null;

		Arbre lr_arbre;
		try {
			// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:49:25: (r= requete POINT )
			// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:50:3: r= requete POINT
			{
			pushFollow(FOLLOW_requete_in_listerequetes295);
			r=requete();
			state._fsp--;

			match(input,POINT,FOLLOW_POINT_in_listerequetes297); 

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
	// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:57:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : SELECT ARTICLE MOT ps= params ;
	public final Arbre requete() throws RecognitionException {
		Arbre req_arbre =  new Arbre("");


		Arbre ps =null;

		Arbre ps_arbre;
		try {
			// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:58:26: ( SELECT ARTICLE MOT ps= params )
			// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:59:2: SELECT ARTICLE MOT ps= params
			{
			match(input,SELECT,FOLLOW_SELECT_in_requete322); 
			match(input,ARTICLE,FOLLOW_ARTICLE_in_requete324); 
			match(input,MOT,FOLLOW_MOT_in_requete326); 
			pushFollow(FOLLOW_params_in_requete330);
			ps=params();
			state._fsp--;


					req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
					req_arbre.ajouteFils(new Arbre("","article"));
					req_arbre.ajouteFils(new Arbre("","FROM titreresume"));
					req_arbre.ajouteFils(new Arbre("","WHERE"));
					ps_arbre = ps;
					req_arbre.ajouteFils(ps_arbre);
				
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
	// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:69:1: params returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param ( CONJOU par2= param | CONJET par2= param )* ;
	public final Arbre params() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:70:40: (par1= param ( CONJOU par2= param | CONJET par2= param )* )
			// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:71:3: par1= param ( CONJOU par2= param | CONJET par2= param )*
			{
			pushFollow(FOLLOW_param_in_params358);
			par1=param();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:76:3: ( CONJOU par2= param | CONJET par2= param )*
			loop1:
			while (true) {
				int alt1=3;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==CONJOU) ) {
					alt1=1;
				}
				else if ( (LA1_0==CONJET) ) {
					alt1=2;
				}

				switch (alt1) {
				case 1 :
					// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:76:4: CONJOU par2= param
					{
					match(input,CONJOU,FOLLOW_CONJOU_in_params369); 
					pushFollow(FOLLOW_param_in_params375);
					par2=param();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "OR"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;
				case 2 :
					// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:82:5: CONJET par2= param
					{
					match(input,CONJET,FOLLOW_CONJET_in_params386); 
					pushFollow(FOLLOW_param_in_params392);
					par2=param();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "AND"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;

				default :
					break loop1;
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
	// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:91:1: param returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
	public final Arbre param() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:91:51: (a= VAR )
			// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:92:2: a= VAR
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_param420); 
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



	public static final BitSet FOLLOW_requete_in_listerequetes295 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_POINT_in_listerequetes297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete322 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete324 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_MOT_in_requete326 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_params_in_requete330 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_in_params358 = new BitSet(new long[]{0x0000000000000182L});
	public static final BitSet FOLLOW_CONJOU_in_params369 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_param_in_params375 = new BitSet(new long[]{0x0000000000000182L});
	public static final BitSet FOLLOW_CONJET_in_params386 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_param_in_params392 = new BitSet(new long[]{0x0000000000000182L});
	public static final BitSet FOLLOW_VAR_in_param420 = new BitSet(new long[]{0x0000000000000002L});
}
