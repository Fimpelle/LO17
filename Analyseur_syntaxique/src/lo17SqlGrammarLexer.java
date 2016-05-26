// $ANTLR 3.5.1 /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g 2016-05-20 16:05:23

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class lo17SqlGrammarLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public lo17SqlGrammarLexer() {} 
	public lo17SqlGrammarLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public lo17SqlGrammarLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g"; }

	// $ANTLR start "SELECT"
	public final void mSELECT() throws RecognitionException {
		try {
			int _type = SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:3:8: ( 'vouloir' | 'afficher' | 'trouver' | 'recuperer' | 'donner' | 'quel' )
			int alt1=6;
			switch ( input.LA(1) ) {
			case 'v':
				{
				alt1=1;
				}
				break;
			case 'a':
				{
				alt1=2;
				}
				break;
			case 't':
				{
				alt1=3;
				}
				break;
			case 'r':
				{
				alt1=4;
				}
				break;
			case 'd':
				{
				alt1=5;
				}
				break;
			case 'q':
				{
				alt1=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:3:10: 'vouloir'
					{
					match("vouloir"); 

					}
					break;
				case 2 :
					// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:3:22: 'afficher'
					{
					match("afficher"); 

					}
					break;
				case 3 :
					// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:3:35: 'trouver'
					{
					match("trouver"); 

					}
					break;
				case 4 :
					// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:3:47: 'recuperer'
					{
					match("recuperer"); 

					}
					break;
				case 5 :
					// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:3:61: 'donner'
					{
					match("donner"); 

					}
					break;
				case 6 :
					// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:3:72: 'quel'
					{
					match("quel"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SELECT"

	// $ANTLR start "COUNT"
	public final void mCOUNT() throws RecognitionException {
		try {
			int _type = COUNT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:6:7: ( 'combien' | 'nombre' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='c') ) {
				alt2=1;
			}
			else if ( (LA2_0=='n') ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:6:9: 'combien'
					{
					match("combien"); 

					}
					break;
				case 2 :
					// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:6:21: 'nombre'
					{
					match("nombre"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COUNT"

	// $ANTLR start "ARTICLE"
	public final void mARTICLE() throws RecognitionException {
		try {
			int _type = ARTICLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:9:9: ( 'article' )
			// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:9:11: 'article'
			{
			match("article"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ARTICLE"

	// $ANTLR start "BULLETIN"
	public final void mBULLETIN() throws RecognitionException {
		try {
			int _type = BULLETIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:12:10: ( 'bulletin' )
			// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:12:12: 'bulletin'
			{
			match("bulletin"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BULLETIN"

	// $ANTLR start "TITRE"
	public final void mTITRE() throws RecognitionException {
		try {
			int _type = TITRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:15:7: ( 'titre' | 'sujet' )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='t') ) {
				alt3=1;
			}
			else if ( (LA3_0=='s') ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:15:9: 'titre'
					{
					match("titre"); 

					}
					break;
				case 2 :
					// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:15:19: 'sujet'
					{
					match("sujet"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TITRE"

	// $ANTLR start "TEXTE"
	public final void mTEXTE() throws RecognitionException {
		try {
			int _type = TEXTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:18:6: ( 'texte' )
			// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:18:8: 'texte'
			{
			match("texte"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TEXTE"

	// $ANTLR start "RUBRIQUE"
	public final void mRUBRIQUE() throws RecognitionException {
		try {
			int _type = RUBRIQUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:21:9: ( 'catégorie' | 'rubrique' | 'thème' )
			int alt4=3;
			switch ( input.LA(1) ) {
			case 'c':
				{
				alt4=1;
				}
				break;
			case 'r':
				{
				alt4=2;
				}
				break;
			case 't':
				{
				alt4=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:21:11: 'catégorie'
					{
					match("catégorie"); 

					}
					break;
				case 2 :
					// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:21:25: 'rubrique'
					{
					match("rubrique"); 

					}
					break;
				case 3 :
					// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:21:38: 'thème'
					{
					match("thème"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RUBRIQUE"

	// $ANTLR start "AUTEUR"
	public final void mAUTEUR() throws RecognitionException {
		try {
			int _type = AUTEUR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:24:7: ( 'auteur' | 'écrire' | 'auteur avoir écrire' )
			int alt5=3;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='a') ) {
				int LA5_1 = input.LA(2);
				if ( (LA5_1=='u') ) {
					int LA5_3 = input.LA(3);
					if ( (LA5_3=='t') ) {
						int LA5_4 = input.LA(4);
						if ( (LA5_4=='e') ) {
							int LA5_5 = input.LA(5);
							if ( (LA5_5=='u') ) {
								int LA5_6 = input.LA(6);
								if ( (LA5_6=='r') ) {
									int LA5_7 = input.LA(7);
									if ( (LA5_7==' ') ) {
										alt5=3;
									}

									else {
										alt5=1;
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 5, 6, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 5, 5, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
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

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 5, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
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
			else if ( (LA5_0=='\u00E9') ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:24:9: 'auteur'
					{
					match("auteur"); 

					}
					break;
				case 2 :
					// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:24:20: 'écrire'
					{
					match("écrire"); 

					}
					break;
				case 3 :
					// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:24:31: 'auteur avoir écrire'
					{
					match("auteur avoir écrire"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AUTEUR"

	// $ANTLR start "DATE"
	public final void mDATE() throws RecognitionException {
		try {
			int _type = DATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:27:5: ( 'quand' | 'quel date' | 'publier' | 'paraître' | 'paru' )
			int alt6=5;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='q') ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1=='u') ) {
					int LA6_3 = input.LA(3);
					if ( (LA6_3=='a') ) {
						alt6=1;
					}
					else if ( (LA6_3=='e') ) {
						alt6=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 6, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
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
			else if ( (LA6_0=='p') ) {
				int LA6_2 = input.LA(2);
				if ( (LA6_2=='u') ) {
					alt6=3;
				}
				else if ( (LA6_2=='a') ) {
					int LA6_5 = input.LA(3);
					if ( (LA6_5=='r') ) {
						int LA6_8 = input.LA(4);
						if ( (LA6_8=='a') ) {
							alt6=4;
						}
						else if ( (LA6_8=='u') ) {
							alt6=5;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 6, 8, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 6, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

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

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:27:7: 'quand'
					{
					match("quand"); 

					}
					break;
				case 2 :
					// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:27:17: 'quel date'
					{
					match("quel date"); 

					}
					break;
				case 3 :
					// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:27:31: 'publier'
					{
					match("publier"); 

					}
					break;
				case 4 :
					// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:27:43: 'paraître'
					{
					match("paraître"); 

					}
					break;
				case 5 :
					// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:27:56: 'paru'
					{
					match("paru"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATE"

	// $ANTLR start "CONJET"
	public final void mCONJET() throws RecognitionException {
		try {
			int _type = CONJET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:30:8: ( 'et' )
			// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:30:10: 'et'
			{
			match("et"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONJET"

	// $ANTLR start "CONJOU"
	public final void mCONJOU() throws RecognitionException {
		try {
			int _type = CONJOU;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:33:8: ( 'ou' )
			// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:33:10: 'ou'
			{
			match("ou"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONJOU"

	// $ANTLR start "POINT"
	public final void mPOINT() throws RecognitionException {
		try {
			int _type = POINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:36:7: ( '.' )
			// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:36:9: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POINT"

	// $ANTLR start "MOT"
	public final void mMOT() throws RecognitionException {
		try {
			int _type = MOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:39:5: ( 'mot' | 'contenir' | 'parler' | 'traiter' )
			int alt7=4;
			switch ( input.LA(1) ) {
			case 'm':
				{
				alt7=1;
				}
				break;
			case 'c':
				{
				alt7=2;
				}
				break;
			case 'p':
				{
				alt7=3;
				}
				break;
			case 't':
				{
				alt7=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:39:7: 'mot'
					{
					match("mot"); 

					}
					break;
				case 2 :
					// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:39:15: 'contenir'
					{
					match("contenir"); 

					}
					break;
				case 3 :
					// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:39:28: 'parler'
					{
					match("parler"); 

					}
					break;
				case 4 :
					// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:39:39: 'traiter'
					{
					match("traiter"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:42:5: ( ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' ) | '\\n' )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='\t'||LA9_0=='\r'||LA9_0==' '||LA9_0=='d'||LA9_0=='j'||LA9_0=='q') ) {
				alt9=1;
			}
			else if ( (LA9_0=='\n') ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:42:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' )
					{
					// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:42:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' )
					int alt8=6;
					switch ( input.LA(1) ) {
					case ' ':
						{
						alt8=1;
						}
						break;
					case '\t':
						{
						alt8=2;
						}
						break;
					case '\r':
						{
						alt8=3;
						}
						break;
					case 'j':
						{
						alt8=4;
						}
						break;
					case 'q':
						{
						alt8=5;
						}
						break;
					case 'd':
						{
						alt8=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 8, 0, input);
						throw nvae;
					}
					switch (alt8) {
						case 1 :
							// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:42:8: ' '
							{
							match(' '); 
							}
							break;
						case 2 :
							// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:42:13: '\\t'
							{
							match('\t'); 
							}
							break;
						case 3 :
							// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:42:20: '\\r'
							{
							match('\r'); 
							}
							break;
						case 4 :
							// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:42:27: 'je'
							{
							match("je"); 

							}
							break;
						case 5 :
							// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:42:34: 'qui'
							{
							match("qui"); 

							}
							break;
						case 6 :
							// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:42:42: 'dont'
							{
							match("dont"); 

							}
							break;

					}

					skip();
					}
					break;
				case 2 :
					// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:42:62: '\\n'
					{
					match('\n'); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:45:5: ( ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00a0' .. '\\u00ff' ) ( ( 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | ( '\\u00a0' .. '\\u00ff' ) )+ )
			// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:45:7: ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00a0' .. '\\u00ff' ) ( ( 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | ( '\\u00a0' .. '\\u00ff' ) )+
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u00A0' && input.LA(1) <= '\u00FF') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:45:47: ( ( 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | ( '\\u00a0' .. '\\u00ff' ) )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0=='-'||(LA10_0 >= '0' && LA10_0 <= '9')||(LA10_0 >= 'a' && LA10_0 <= 'z')||(LA10_0 >= '\u00A0' && LA10_0 <= '\u00FF')) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:
					{
					if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u00A0' && input.LA(1) <= '\u00FF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt10 >= 1 ) break loop10;
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR"

	@Override
	public void mTokens() throws RecognitionException {
		// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:1:8: ( SELECT | COUNT | ARTICLE | BULLETIN | TITRE | TEXTE | RUBRIQUE | AUTEUR | DATE | CONJET | CONJOU | POINT | MOT | WS | VAR )
		int alt11=15;
		alt11 = dfa11.predict(input);
		switch (alt11) {
			case 1 :
				// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:1:10: SELECT
				{
				mSELECT(); 

				}
				break;
			case 2 :
				// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:1:17: COUNT
				{
				mCOUNT(); 

				}
				break;
			case 3 :
				// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:1:23: ARTICLE
				{
				mARTICLE(); 

				}
				break;
			case 4 :
				// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:1:31: BULLETIN
				{
				mBULLETIN(); 

				}
				break;
			case 5 :
				// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:1:40: TITRE
				{
				mTITRE(); 

				}
				break;
			case 6 :
				// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:1:46: TEXTE
				{
				mTEXTE(); 

				}
				break;
			case 7 :
				// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:1:52: RUBRIQUE
				{
				mRUBRIQUE(); 

				}
				break;
			case 8 :
				// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:1:61: AUTEUR
				{
				mAUTEUR(); 

				}
				break;
			case 9 :
				// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:1:68: DATE
				{
				mDATE(); 

				}
				break;
			case 10 :
				// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:1:73: CONJET
				{
				mCONJET(); 

				}
				break;
			case 11 :
				// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:1:80: CONJOU
				{
				mCONJOU(); 

				}
				break;
			case 12 :
				// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:1:87: POINT
				{
				mPOINT(); 

				}
				break;
			case 13 :
				// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:1:93: MOT
				{
				mMOT(); 

				}
				break;
			case 14 :
				// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:1:97: WS
				{
				mWS(); 

				}
				break;
			case 15 :
				// /volsme/users/lo17p026/eclipse/Analyseur_syntaxique/src/lo17SqlGrammar.g:1:100: VAR
				{
				mVAR(); 

				}
				break;

		}
	}


	protected DFA11 dfa11 = new DFA11(this);
	static final String DFA11_eotS =
		"\24\uffff\24\23\1\104\1\105\1\23\1\21\16\23\1\21\11\23\2\uffff\1\141\14"+
		"\23\1\21\1\157\12\23\1\156\1\23\1\uffff\6\23\1\u0081\1\u0082\1\u0083\3"+
		"\23\2\uffff\1\156\5\23\1\u0081\7\23\1\u0093\2\23\3\uffff\2\23\1\157\3"+
		"\23\1\u009b\1\23\1\u0093\2\23\1\141\1\157\1\23\1\u00a0\1\uffff\1\157\1"+
		"\141\2\23\1\u009b\2\23\1\uffff\1\23\1\156\1\23\1\157\1\uffff\1\23\1\u0083"+
		"\1\141\1\23\1\u00a9\1\156\1\157\1\u0083\1\uffff";
	static final String DFA11_eofS =
		"\u00aa\uffff";
	static final String DFA11_minS =
		"\1\11\16\55\1\uffff\1\55\1\uffff\1\55\1\uffff\1\165\1\146\2\164\1\141"+
		"\1\164\1\170\1\u00e8\1\143\1\142\1\156\1\141\1\155\1\164\1\155\1\154\1"+
		"\152\1\162\1\142\1\162\2\55\1\164\1\55\1\154\2\151\1\145\1\165\1\151\1"+
		"\162\1\164\1\155\1\165\1\162\1\156\1\154\1\156\1\55\1\142\1\164\1\u00e9"+
		"\1\142\1\154\1\145\1\151\1\154\1\141\2\uffff\1\55\1\157\2\143\1\165\1"+
		"\166\1\164\3\145\1\160\1\151\1\145\1\55\1\40\1\144\1\151\1\145\1\147\1"+
		"\162\1\145\1\164\1\162\1\151\1\u00ee\1\55\1\145\1\uffff\1\151\1\150\1"+
		"\154\1\162\2\145\3\55\1\145\1\161\1\162\2\uffff\1\55\1\145\1\156\1\157"+
		"\1\145\1\164\1\55\2\145\1\164\2\162\2\145\1\55\2\162\3\uffff\1\162\1\165"+
		"\1\55\1\156\1\151\1\162\1\55\1\151\1\55\2\162\2\55\1\162\1\55\1\uffff"+
		"\2\55\2\145\1\55\1\162\1\151\1\uffff\1\156\1\55\1\145\1\55\1\uffff\1\162"+
		"\2\55\1\145\4\55\1\uffff";
	static final String DFA11_maxS =
		"\17\u00ff\1\uffff\1\u00ff\1\uffff\1\u00ff\1\uffff\1\165\1\146\2\164\1"+
		"\157\1\164\1\170\1\u00e8\1\143\1\142\1\156\1\151\1\156\1\164\1\155\1\154"+
		"\1\152\1\162\1\142\1\162\2\u00ff\1\164\1\u00ff\1\154\2\151\1\145\1\165"+
		"\1\151\1\162\1\164\1\155\1\165\1\162\1\164\1\154\1\156\1\u00ff\1\142\1"+
		"\164\1\u00e9\1\142\1\154\1\145\1\151\1\154\1\165\2\uffff\1\u00ff\1\157"+
		"\2\143\1\165\1\166\1\164\3\145\1\160\1\151\1\145\2\u00ff\1\144\1\151\1"+
		"\145\1\147\1\162\1\145\1\164\1\162\1\151\1\u00ee\1\u00ff\1\145\1\uffff"+
		"\1\151\1\150\1\154\1\162\2\145\3\u00ff\1\145\1\161\1\162\2\uffff\1\u00ff"+
		"\1\145\1\156\1\157\1\145\1\164\1\u00ff\2\145\1\164\2\162\2\145\1\u00ff"+
		"\2\162\3\uffff\1\162\1\165\1\u00ff\1\156\1\151\1\162\1\u00ff\1\151\1\u00ff"+
		"\2\162\2\u00ff\1\162\1\u00ff\1\uffff\2\u00ff\2\145\1\u00ff\1\162\1\151"+
		"\1\uffff\1\156\1\u00ff\1\145\1\u00ff\1\uffff\1\162\2\u00ff\1\145\4\u00ff"+
		"\1\uffff";
	static final String DFA11_acceptS =
		"\17\uffff\1\14\1\uffff\1\16\1\uffff\1\17\60\uffff\1\12\1\13\33\uffff\1"+
		"\15\14\uffff\1\11\1\1\21\uffff\1\5\1\6\1\7\17\uffff\1\10\7\uffff\1\2\4"+
		"\uffff\1\3\10\uffff\1\4";
	static final String DFA11_specialS =
		"\u00aa\uffff}>";
	static final String[] DFA11_transitionS = {
			"\2\21\2\uffff\1\21\22\uffff\1\21\15\uffff\1\17\22\uffff\32\23\6\uffff"+
			"\1\2\1\11\1\7\1\5\1\15\4\23\1\22\2\23\1\20\1\10\1\16\1\14\1\6\1\4\1\12"+
			"\1\3\1\23\1\1\4\23\45\uffff\111\23\1\13\26\23",
			"\1\23\2\uffff\12\23\47\uffff\16\23\1\24\13\23\45\uffff\140\23",
			"\1\23\2\uffff\12\23\47\uffff\5\23\1\25\13\23\1\26\2\23\1\27\5\23\45"+
			"\uffff\140\23",
			"\1\23\2\uffff\12\23\47\uffff\4\23\1\32\2\23\1\33\1\31\10\23\1\30\10"+
			"\23\45\uffff\140\23",
			"\1\23\2\uffff\12\23\47\uffff\4\23\1\34\17\23\1\35\5\23\45\uffff\140"+
			"\23",
			"\1\23\2\uffff\12\23\47\uffff\16\23\1\36\13\23\45\uffff\140\23",
			"\1\23\2\uffff\12\23\47\uffff\24\23\1\37\5\23\45\uffff\140\23",
			"\1\23\2\uffff\12\23\47\uffff\1\41\15\23\1\40\13\23\45\uffff\140\23",
			"\1\23\2\uffff\12\23\47\uffff\16\23\1\42\13\23\45\uffff\140\23",
			"\1\23\2\uffff\12\23\47\uffff\24\23\1\43\5\23\45\uffff\140\23",
			"\1\23\2\uffff\12\23\47\uffff\24\23\1\44\5\23\45\uffff\140\23",
			"\1\23\2\uffff\12\23\47\uffff\2\23\1\45\27\23\45\uffff\140\23",
			"\1\23\2\uffff\12\23\47\uffff\1\47\23\23\1\46\5\23\45\uffff\140\23",
			"\1\23\2\uffff\12\23\47\uffff\23\23\1\50\6\23\45\uffff\140\23",
			"\1\23\2\uffff\12\23\47\uffff\24\23\1\51\5\23\45\uffff\140\23",
			"",
			"\1\23\2\uffff\12\23\47\uffff\16\23\1\52\13\23\45\uffff\140\23",
			"",
			"\1\23\2\uffff\12\23\47\uffff\4\23\1\53\25\23\45\uffff\140\23",
			"",
			"\1\54",
			"\1\55",
			"\1\56",
			"\1\57",
			"\1\61\15\uffff\1\60",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\67",
			"\1\71\3\uffff\1\70\3\uffff\1\72",
			"\1\73\1\74",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\102",
			"\1\103",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"\1\106",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\114",
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\120",
			"\1\121",
			"\1\122\5\uffff\1\123",
			"\1\124",
			"\1\125",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"\1\126",
			"\1\127",
			"\1\130",
			"\1\131",
			"\1\132",
			"\1\133",
			"\1\134",
			"\1\135",
			"\1\136\12\uffff\1\140\10\uffff\1\137",
			"",
			"",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"\1\142",
			"\1\143",
			"\1\144",
			"\1\145",
			"\1\146",
			"\1\147",
			"\1\150",
			"\1\151",
			"\1\152",
			"\1\153",
			"\1\154",
			"\1\155",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"\1\156\14\uffff\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"\1\160",
			"\1\161",
			"\1\162",
			"\1\163",
			"\1\164",
			"\1\165",
			"\1\166",
			"\1\167",
			"\1\170",
			"\1\171",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"\1\172",
			"",
			"\1\173",
			"\1\174",
			"\1\175",
			"\1\176",
			"\1\177",
			"\1\u0080",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"\1\u0084",
			"\1\u0085",
			"\1\u0086",
			"",
			"",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"\1\u0087",
			"\1\u0088",
			"\1\u0089",
			"\1\u008a",
			"\1\u008b",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"\1\u008c",
			"\1\u008d",
			"\1\u008e",
			"\1\u008f",
			"\1\u0090",
			"\1\u0091",
			"\1\u0092",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"\1\u0094",
			"\1\u0095",
			"",
			"",
			"",
			"\1\u0096",
			"\1\u0097",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"\1\u0098",
			"\1\u0099",
			"\1\u009a",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"\1\u009c",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"\1\u009d",
			"\1\u009e",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"\1\u009f",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"\1\u00a1",
			"\1\u00a2",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"\1\u00a3",
			"\1\u00a4",
			"",
			"\1\u00a5",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"\1\u00a6",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"",
			"\1\u00a7",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"\1\u00a8",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			""
	};

	static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
	static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
	static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
	static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
	static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
	static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
	static final short[][] DFA11_transition;

	static {
		int numStates = DFA11_transitionS.length;
		DFA11_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
		}
	}

	protected class DFA11 extends DFA {

		public DFA11(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 11;
			this.eot = DFA11_eot;
			this.eof = DFA11_eof;
			this.min = DFA11_min;
			this.max = DFA11_max;
			this.accept = DFA11_accept;
			this.special = DFA11_special;
			this.transition = DFA11_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( SELECT | COUNT | ARTICLE | BULLETIN | TITRE | TEXTE | RUBRIQUE | AUTEUR | DATE | CONJET | CONJOU | POINT | MOT | WS | VAR );";
		}
	}

}
