// $ANTLR 3.5.1 C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g 2016-06-03 15:00:53

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
	public static final int EVERY=11;
	public static final int MOT=12;
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
	@Override public String getGrammarFileName() { return "C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g"; }

	// $ANTLR start "SELECT"
	public final void mSELECT() throws RecognitionException {
		try {
			int _type = SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:3:8: ( 'vouloir' | 'afficher' | 'trouve' | 'recuperer' | 'donner' | 'quel' )
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
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:3:10: 'vouloir'
					{
					match("vouloir"); 

					}
					break;
				case 2 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:3:22: 'afficher'
					{
					match("afficher"); 

					}
					break;
				case 3 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:3:35: 'trouve'
					{
					match("trouve"); 

					}
					break;
				case 4 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:3:46: 'recuperer'
					{
					match("recuperer"); 

					}
					break;
				case 5 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:3:60: 'donner'
					{
					match("donner"); 

					}
					break;
				case 6 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:3:71: 'quel'
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

	// $ANTLR start "EVERY"
	public final void mEVERY() throws RecognitionException {
		try {
			int _type = EVERY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:6:7: ( 'tous' )
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:6:9: 'tous'
			{
			match("tous"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EVERY"

	// $ANTLR start "COUNT"
	public final void mCOUNT() throws RecognitionException {
		try {
			int _type = COUNT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:9:7: ( 'combien' | 'nombre' )
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
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:9:9: 'combien'
					{
					match("combien"); 

					}
					break;
				case 2 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:9:21: 'nombre'
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
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:12:9: ( 'article' )
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:12:11: 'article'
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
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:15:10: ( 'bulletin' )
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:15:12: 'bulletin'
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
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:18:7: ( 'titre' | 'sujet' )
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
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:18:9: 'titre'
					{
					match("titre"); 

					}
					break;
				case 2 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:18:19: 'sujet'
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
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:21:6: ( 'texte' )
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:21:8: 'texte'
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
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:24:9: ( 'catégorie' | 'rubrique' | 'thème' )
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
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:24:11: 'catégorie'
					{
					match("catégorie"); 

					}
					break;
				case 2 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:24:26: 'rubrique'
					{
					match("rubrique"); 

					}
					break;
				case 3 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:24:39: 'thème'
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
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:27:7: ( 'auteur' | 'écrire' | 'auteur avoir écrire' )
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
			else if ( (LA5_0=='\u00C3') ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:27:9: 'auteur'
					{
					match("auteur"); 

					}
					break;
				case 2 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:27:20: 'écrire'
					{
					match("écrire"); 

					}
					break;
				case 3 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:27:32: 'auteur avoir écrire'
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
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:30:5: ( 'quand' | 'quel date' | 'publier' | 'paraître' | 'paru' )
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
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:30:7: 'quand'
					{
					match("quand"); 

					}
					break;
				case 2 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:30:17: 'quel date'
					{
					match("quel date"); 

					}
					break;
				case 3 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:30:31: 'publier'
					{
					match("publier"); 

					}
					break;
				case 4 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:30:43: 'paraître'
					{
					match("paraître"); 

					}
					break;
				case 5 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:30:57: 'paru'
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
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:33:8: ( 'et' )
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:33:10: 'et'
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
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:36:8: ( 'ou' )
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:36:10: 'ou'
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

	// $ANTLR start "MOT"
	public final void mMOT() throws RecognitionException {
		try {
			int _type = MOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:39:5: ( 'mot' | 'contenir' | 'parler' | 'trait' )
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
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:39:7: 'mot'
					{
					match("mot"); 

					}
					break;
				case 2 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:39:15: 'contenir'
					{
					match("contenir"); 

					}
					break;
				case 3 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:39:28: 'parler'
					{
					match("parler"); 

					}
					break;
				case 4 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:39:39: 'trait'
					{
					match("trait"); 

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
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:42:5: ( ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' ) | '\\n' )
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
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:42:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' )
					{
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:42:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' )
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
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:42:8: ' '
							{
							match(' '); 
							}
							break;
						case 2 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:42:13: '\\t'
							{
							match('\t'); 
							}
							break;
						case 3 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:42:20: '\\r'
							{
							match('\r'); 
							}
							break;
						case 4 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:42:27: 'je'
							{
							match("je"); 

							}
							break;
						case 5 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:42:34: 'qui'
							{
							match("qui"); 

							}
							break;
						case 6 :
							// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:42:42: 'dont'
							{
							match("dont"); 

							}
							break;

					}

					skip();
					}
					break;
				case 2 :
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:42:62: '\\n'
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
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:45:5: ( ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00a0' .. '\\u00ff' ) ( ( 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | ( '\\u00a0' .. '\\u00ff' ) )+ )
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:45:7: ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00a0' .. '\\u00ff' ) ( ( 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | ( '\\u00a0' .. '\\u00ff' ) )+
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u00A0' && input.LA(1) <= '\u00FF') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:45:47: ( ( 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | ( '\\u00a0' .. '\\u00ff' ) )+
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
					// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:
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
		// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:1:8: ( SELECT | EVERY | COUNT | ARTICLE | BULLETIN | TITRE | TEXTE | RUBRIQUE | AUTEUR | DATE | CONJET | CONJOU | MOT | WS | VAR )
		int alt11=15;
		alt11 = dfa11.predict(input);
		switch (alt11) {
			case 1 :
				// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:1:10: SELECT
				{
				mSELECT(); 

				}
				break;
			case 2 :
				// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:1:17: EVERY
				{
				mEVERY(); 

				}
				break;
			case 3 :
				// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:1:23: COUNT
				{
				mCOUNT(); 

				}
				break;
			case 4 :
				// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:1:29: ARTICLE
				{
				mARTICLE(); 

				}
				break;
			case 5 :
				// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:1:37: BULLETIN
				{
				mBULLETIN(); 

				}
				break;
			case 6 :
				// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:1:46: TITRE
				{
				mTITRE(); 

				}
				break;
			case 7 :
				// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:1:52: TEXTE
				{
				mTEXTE(); 

				}
				break;
			case 8 :
				// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:1:58: RUBRIQUE
				{
				mRUBRIQUE(); 

				}
				break;
			case 9 :
				// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:1:67: AUTEUR
				{
				mAUTEUR(); 

				}
				break;
			case 10 :
				// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:1:74: DATE
				{
				mDATE(); 

				}
				break;
			case 11 :
				// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:1:79: CONJET
				{
				mCONJET(); 

				}
				break;
			case 12 :
				// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:1:86: CONJOU
				{
				mCONJOU(); 

				}
				break;
			case 13 :
				// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:1:93: MOT
				{
				mMOT(); 

				}
				break;
			case 14 :
				// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:1:97: WS
				{
				mWS(); 

				}
				break;
			case 15 :
				// C:\\Users\\JeanV\\Documents\\ETUDES\\GI05\\LO17\\projet\\LO17\\Analyseur_syntaxique\\src\\lo17SqlGrammar.g:1:100: VAR
				{
				mVAR(); 

				}
				break;

		}
	}


	protected DFA11 dfa11 = new DFA11(this);
	static final String DFA11_eotS =
		"\23\uffff\25\22\1\105\1\106\1\22\1\20\17\22\1\20\11\22\2\uffff\1\143\6"+
		"\22\1\152\6\22\1\20\1\162\12\22\1\161\1\22\1\uffff\5\22\1\143\1\uffff"+
		"\1\u0083\1\u0084\4\22\2\uffff\1\161\5\22\1\u0083\7\22\1\u0095\1\162\2"+
		"\uffff\1\u0096\2\22\1\162\3\22\1\u009c\4\22\1\143\1\162\1\22\1\u00a2\2"+
		"\uffff\2\22\1\u009c\2\22\1\uffff\1\22\1\u0095\1\161\1\22\1\162\1\uffff"+
		"\1\22\1\u0096\1\143\1\22\1\u00ab\1\22\1\162\1\22\1\uffff\1\161\1\u0096";
	static final String DFA11_eofS =
		"\u00ae\uffff";
	static final String DFA11_minS =
		"\1\11\17\55\1\uffff\1\55\1\uffff\1\165\1\146\2\164\1\141\1\165\1\164\1"+
		"\170\1\u00c3\1\143\1\142\1\156\1\141\1\155\1\164\1\155\1\154\1\152\1\143"+
		"\1\142\1\162\2\55\1\164\1\55\1\154\2\151\1\145\1\165\1\151\1\163\1\162"+
		"\1\164\1\u00a8\1\165\1\162\1\156\1\154\1\156\1\55\1\142\1\164\1\u00c3"+
		"\1\142\1\154\1\145\1\162\1\154\1\141\2\uffff\1\55\1\157\2\143\1\165\1"+
		"\166\1\164\1\55\2\145\1\155\1\160\1\151\1\145\1\55\1\40\1\144\1\151\1"+
		"\145\1\u00a9\1\162\1\145\1\164\2\151\1\u00c3\1\55\1\145\1\uffff\1\151"+
		"\1\150\1\154\1\162\1\145\1\55\1\uffff\2\55\2\145\1\161\1\162\2\uffff\1"+
		"\55\1\145\1\156\1\147\1\145\1\164\1\55\1\162\1\145\1\u00ae\2\162\2\145"+
		"\2\55\2\uffff\1\55\1\162\1\165\1\55\1\156\1\151\1\157\1\55\1\151\1\145"+
		"\1\162\1\164\2\55\1\162\1\55\2\uffff\2\145\1\55\2\162\1\uffff\1\156\2"+
		"\55\1\162\1\55\1\uffff\1\162\2\55\1\151\1\55\1\145\1\55\1\145\1\uffff"+
		"\2\55";
	static final String DFA11_maxS =
		"\20\u00ff\1\uffff\1\u00ff\1\uffff\1\165\1\146\2\164\1\157\1\165\1\164"+
		"\1\170\1\u00c3\1\143\1\142\1\156\1\151\1\156\1\164\1\155\1\154\1\152\1"+
		"\143\1\142\1\162\2\u00ff\1\164\1\u00ff\1\154\2\151\1\145\1\165\1\151\1"+
		"\163\1\162\1\164\1\u00a8\1\165\1\162\1\164\1\154\1\156\1\u00ff\1\142\1"+
		"\164\1\u00c3\1\142\1\154\1\145\1\162\1\154\1\165\2\uffff\1\u00ff\1\157"+
		"\2\143\1\165\1\166\1\164\1\u00ff\2\145\1\155\1\160\1\151\1\145\2\u00ff"+
		"\1\144\1\151\1\145\1\u00a9\1\162\1\145\1\164\2\151\1\u00c3\1\u00ff\1\145"+
		"\1\uffff\1\151\1\150\1\154\1\162\1\145\1\u00ff\1\uffff\2\u00ff\2\145\1"+
		"\161\1\162\2\uffff\1\u00ff\1\145\1\156\1\147\1\145\1\164\1\u00ff\1\162"+
		"\1\145\1\u00ae\2\162\2\145\2\u00ff\2\uffff\1\u00ff\1\162\1\165\1\u00ff"+
		"\1\156\1\151\1\157\1\u00ff\1\151\1\145\1\162\1\164\2\u00ff\1\162\1\u00ff"+
		"\2\uffff\2\145\1\u00ff\2\162\1\uffff\1\156\2\u00ff\1\162\1\u00ff\1\uffff"+
		"\1\162\2\u00ff\1\151\1\u00ff\1\145\1\u00ff\1\145\1\uffff\2\u00ff";
	static final String DFA11_acceptS =
		"\20\uffff\1\16\1\uffff\1\17\62\uffff\1\13\1\14\34\uffff\1\15\6\uffff\1"+
		"\2\6\uffff\1\12\1\1\20\uffff\1\6\1\7\20\uffff\1\11\1\10\5\uffff\1\3\5"+
		"\uffff\1\4\10\uffff\1\5\2\uffff";
	static final String DFA11_specialS =
		"\u00ae\uffff}>";
	static final String[] DFA11_transitionS = {
			"\2\20\2\uffff\1\20\22\uffff\1\20\40\uffff\32\22\6\uffff\1\2\1\11\1\7"+
			"\1\5\1\15\4\22\1\21\2\22\1\17\1\10\1\16\1\14\1\6\1\4\1\12\1\3\1\22\1"+
			"\1\4\22\45\uffff\43\22\1\13\74\22",
			"\1\22\2\uffff\12\22\47\uffff\16\22\1\23\13\22\45\uffff\140\22",
			"\1\22\2\uffff\12\22\47\uffff\5\22\1\24\13\22\1\25\2\22\1\26\5\22\45"+
			"\uffff\140\22",
			"\1\22\2\uffff\12\22\47\uffff\4\22\1\32\2\22\1\33\1\31\5\22\1\30\2\22"+
			"\1\27\10\22\45\uffff\140\22",
			"\1\22\2\uffff\12\22\47\uffff\4\22\1\34\17\22\1\35\5\22\45\uffff\140"+
			"\22",
			"\1\22\2\uffff\12\22\47\uffff\16\22\1\36\13\22\45\uffff\140\22",
			"\1\22\2\uffff\12\22\47\uffff\24\22\1\37\5\22\45\uffff\140\22",
			"\1\22\2\uffff\12\22\47\uffff\1\41\15\22\1\40\13\22\45\uffff\140\22",
			"\1\22\2\uffff\12\22\47\uffff\16\22\1\42\13\22\45\uffff\140\22",
			"\1\22\2\uffff\12\22\47\uffff\24\22\1\43\5\22\45\uffff\140\22",
			"\1\22\2\uffff\12\22\47\uffff\24\22\1\44\5\22\45\uffff\140\22",
			"\1\22\2\uffff\12\22\47\uffff\32\22\45\uffff\11\22\1\45\126\22",
			"\1\22\2\uffff\12\22\47\uffff\1\47\23\22\1\46\5\22\45\uffff\140\22",
			"\1\22\2\uffff\12\22\47\uffff\23\22\1\50\6\22\45\uffff\140\22",
			"\1\22\2\uffff\12\22\47\uffff\24\22\1\51\5\22\45\uffff\140\22",
			"\1\22\2\uffff\12\22\47\uffff\16\22\1\52\13\22\45\uffff\140\22",
			"",
			"\1\22\2\uffff\12\22\47\uffff\4\22\1\53\25\22\45\uffff\140\22",
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
			"\1\70",
			"\1\72\3\uffff\1\71\3\uffff\1\73",
			"\1\74\1\75",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\22\2\uffff\12\22\47\uffff\32\22\45\uffff\140\22",
			"\1\22\2\uffff\12\22\47\uffff\32\22\45\uffff\140\22",
			"\1\107",
			"\1\22\2\uffff\12\22\47\uffff\32\22\45\uffff\140\22",
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
			"\1\122",
			"\1\123",
			"\1\124\5\uffff\1\125",
			"\1\126",
			"\1\127",
			"\1\22\2\uffff\12\22\47\uffff\32\22\45\uffff\140\22",
			"\1\130",
			"\1\131",
			"\1\132",
			"\1\133",
			"\1\134",
			"\1\135",
			"\1\136",
			"\1\137",
			"\1\140\12\uffff\1\142\10\uffff\1\141",
			"",
			"",
			"\1\22\2\uffff\12\22\47\uffff\32\22\45\uffff\140\22",
			"\1\144",
			"\1\145",
			"\1\146",
			"\1\147",
			"\1\150",
			"\1\151",
			"\1\22\2\uffff\12\22\47\uffff\32\22\45\uffff\140\22",
			"\1\153",
			"\1\154",
			"\1\155",
			"\1\156",
			"\1\157",
			"\1\160",
			"\1\22\2\uffff\12\22\47\uffff\32\22\45\uffff\140\22",
			"\1\161\14\uffff\1\22\2\uffff\12\22\47\uffff\32\22\45\uffff\140\22",
			"\1\163",
			"\1\164",
			"\1\165",
			"\1\166",
			"\1\167",
			"\1\170",
			"\1\171",
			"\1\172",
			"\1\173",
			"\1\174",
			"\1\22\2\uffff\12\22\47\uffff\32\22\45\uffff\140\22",
			"\1\175",
			"",
			"\1\176",
			"\1\177",
			"\1\u0080",
			"\1\u0081",
			"\1\u0082",
			"\1\22\2\uffff\12\22\47\uffff\32\22\45\uffff\140\22",
			"",
			"\1\22\2\uffff\12\22\47\uffff\32\22\45\uffff\140\22",
			"\1\22\2\uffff\12\22\47\uffff\32\22\45\uffff\140\22",
			"\1\u0085",
			"\1\u0086",
			"\1\u0087",
			"\1\u0088",
			"",
			"",
			"\1\22\2\uffff\12\22\47\uffff\32\22\45\uffff\140\22",
			"\1\u0089",
			"\1\u008a",
			"\1\u008b",
			"\1\u008c",
			"\1\u008d",
			"\1\22\2\uffff\12\22\47\uffff\32\22\45\uffff\140\22",
			"\1\u008e",
			"\1\u008f",
			"\1\u0090",
			"\1\u0091",
			"\1\u0092",
			"\1\u0093",
			"\1\u0094",
			"\1\22\2\uffff\12\22\47\uffff\32\22\45\uffff\140\22",
			"\1\22\2\uffff\12\22\47\uffff\32\22\45\uffff\140\22",
			"",
			"",
			"\1\22\2\uffff\12\22\47\uffff\32\22\45\uffff\140\22",
			"\1\u0097",
			"\1\u0098",
			"\1\22\2\uffff\12\22\47\uffff\32\22\45\uffff\140\22",
			"\1\u0099",
			"\1\u009a",
			"\1\u009b",
			"\1\22\2\uffff\12\22\47\uffff\32\22\45\uffff\140\22",
			"\1\u009d",
			"\1\u009e",
			"\1\u009f",
			"\1\u00a0",
			"\1\22\2\uffff\12\22\47\uffff\32\22\45\uffff\140\22",
			"\1\22\2\uffff\12\22\47\uffff\32\22\45\uffff\140\22",
			"\1\u00a1",
			"\1\22\2\uffff\12\22\47\uffff\32\22\45\uffff\140\22",
			"",
			"",
			"\1\u00a3",
			"\1\u00a4",
			"\1\22\2\uffff\12\22\47\uffff\32\22\45\uffff\140\22",
			"\1\u00a5",
			"\1\u00a6",
			"",
			"\1\u00a7",
			"\1\22\2\uffff\12\22\47\uffff\32\22\45\uffff\140\22",
			"\1\22\2\uffff\12\22\47\uffff\32\22\45\uffff\140\22",
			"\1\u00a8",
			"\1\22\2\uffff\12\22\47\uffff\32\22\45\uffff\140\22",
			"",
			"\1\u00a9",
			"\1\22\2\uffff\12\22\47\uffff\32\22\45\uffff\140\22",
			"\1\22\2\uffff\12\22\47\uffff\32\22\45\uffff\140\22",
			"\1\u00aa",
			"\1\22\2\uffff\12\22\47\uffff\32\22\45\uffff\140\22",
			"\1\u00ac",
			"\1\22\2\uffff\12\22\47\uffff\32\22\45\uffff\140\22",
			"\1\u00ad",
			"",
			"\1\22\2\uffff\12\22\47\uffff\32\22\45\uffff\140\22",
			"\1\22\2\uffff\12\22\47\uffff\32\22\45\uffff\140\22"
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
			return "1:1: Tokens : ( SELECT | EVERY | COUNT | ARTICLE | BULLETIN | TITRE | TEXTE | RUBRIQUE | AUTEUR | DATE | CONJET | CONJOU | MOT | WS | VAR );";
		}
	}

}
