// Generated from grammar/PoleLang.g4 by ANTLR 4.7

package grammar;
import java.util.HashMap;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PoleLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, Print=3, To=4, If=5, For=6, ForIndex=7, Add=8, Copy=9, 
		Split=10, Line=11, Head=12, Info=13, Exists=14, With=15, MaxColumn=16, 
		MinColumn=17, SumColumn=18, FormatSize=19, MegaBytes=20, Bytes=21, KiloBytes=22, 
		GigaBytes=23, End=24, Number=25, FileNameText=26, ID=27, StringInput=28, 
		Ws=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "Print", "To", "If", "For", "ForIndex", "Add", "Copy", 
		"Split", "Line", "Head", "Info", "Exists", "With", "MaxColumn", "MinColumn", 
		"SumColumn", "FormatSize", "MegaBytes", "Bytes", "KiloBytes", "GigaBytes", 
		"End", "Number", "FileNameText", "ID", "StringInputText", "StringInput", 
		"Ws"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'print'", "'to'", "'if'", "'for'", "'='", "'add'", 
		"'copy'", "'split'", "'line'", "'head'", "'info'", "'exists'", "'with'", 
		"'max-column'", "'min-column'", "'sum-column'", "'format-size'", "'mb'", 
		"'b'", "'kb'", "'gb'", "'end'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "Print", "To", "If", "For", "ForIndex", "Add", "Copy", 
		"Split", "Line", "Head", "Info", "Exists", "With", "MaxColumn", "MinColumn", 
		"SumColumn", "FormatSize", "MegaBytes", "Bytes", "KiloBytes", "GigaBytes", 
		"End", "Number", "FileNameText", "ID", "StringInput", "Ws"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public PoleLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PoleLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u00df\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\32\6\32\u00bd\n\32\r\32\16\32\u00be\3\33\6\33\u00c2"+
		"\n\33\r\33\16\33\u00c3\3\33\3\33\3\33\3\33\3\33\3\34\6\34\u00cc\n\34\r"+
		"\34\16\34\u00cd\3\35\6\35\u00d1\n\35\r\35\16\35\u00d2\3\36\3\36\3\36\3"+
		"\36\3\37\6\37\u00da\n\37\r\37\16\37\u00db\3\37\3\37\2\2 \3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\2;\36=\37\3\2\7\3\2"+
		"\62;\7\2//\62;C\\aac|\3\2c|\4\2\f\f\17\17\4\2\13\f\"\"\2\u00e2\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3"+
		"?\3\2\2\2\5A\3\2\2\2\7C\3\2\2\2\tI\3\2\2\2\13L\3\2\2\2\rO\3\2\2\2\17S"+
		"\3\2\2\2\21U\3\2\2\2\23Y\3\2\2\2\25^\3\2\2\2\27d\3\2\2\2\31i\3\2\2\2\33"+
		"n\3\2\2\2\35s\3\2\2\2\37z\3\2\2\2!\177\3\2\2\2#\u008a\3\2\2\2%\u0095\3"+
		"\2\2\2\'\u00a0\3\2\2\2)\u00ac\3\2\2\2+\u00af\3\2\2\2-\u00b1\3\2\2\2/\u00b4"+
		"\3\2\2\2\61\u00b7\3\2\2\2\63\u00bc\3\2\2\2\65\u00c1\3\2\2\2\67\u00cb\3"+
		"\2\2\29\u00d0\3\2\2\2;\u00d4\3\2\2\2=\u00d9\3\2\2\2?@\7*\2\2@\4\3\2\2"+
		"\2AB\7+\2\2B\6\3\2\2\2CD\7r\2\2DE\7t\2\2EF\7k\2\2FG\7p\2\2GH\7v\2\2H\b"+
		"\3\2\2\2IJ\7v\2\2JK\7q\2\2K\n\3\2\2\2LM\7k\2\2MN\7h\2\2N\f\3\2\2\2OP\7"+
		"h\2\2PQ\7q\2\2QR\7t\2\2R\16\3\2\2\2ST\7?\2\2T\20\3\2\2\2UV\7c\2\2VW\7"+
		"f\2\2WX\7f\2\2X\22\3\2\2\2YZ\7e\2\2Z[\7q\2\2[\\\7r\2\2\\]\7{\2\2]\24\3"+
		"\2\2\2^_\7u\2\2_`\7r\2\2`a\7n\2\2ab\7k\2\2bc\7v\2\2c\26\3\2\2\2de\7n\2"+
		"\2ef\7k\2\2fg\7p\2\2gh\7g\2\2h\30\3\2\2\2ij\7j\2\2jk\7g\2\2kl\7c\2\2l"+
		"m\7f\2\2m\32\3\2\2\2no\7k\2\2op\7p\2\2pq\7h\2\2qr\7q\2\2r\34\3\2\2\2s"+
		"t\7g\2\2tu\7z\2\2uv\7k\2\2vw\7u\2\2wx\7v\2\2xy\7u\2\2y\36\3\2\2\2z{\7"+
		"y\2\2{|\7k\2\2|}\7v\2\2}~\7j\2\2~ \3\2\2\2\177\u0080\7o\2\2\u0080\u0081"+
		"\7c\2\2\u0081\u0082\7z\2\2\u0082\u0083\7/\2\2\u0083\u0084\7e\2\2\u0084"+
		"\u0085\7q\2\2\u0085\u0086\7n\2\2\u0086\u0087\7w\2\2\u0087\u0088\7o\2\2"+
		"\u0088\u0089\7p\2\2\u0089\"\3\2\2\2\u008a\u008b\7o\2\2\u008b\u008c\7k"+
		"\2\2\u008c\u008d\7p\2\2\u008d\u008e\7/\2\2\u008e\u008f\7e\2\2\u008f\u0090"+
		"\7q\2\2\u0090\u0091\7n\2\2\u0091\u0092\7w\2\2\u0092\u0093\7o\2\2\u0093"+
		"\u0094\7p\2\2\u0094$\3\2\2\2\u0095\u0096\7u\2\2\u0096\u0097\7w\2\2\u0097"+
		"\u0098\7o\2\2\u0098\u0099\7/\2\2\u0099\u009a\7e\2\2\u009a\u009b\7q\2\2"+
		"\u009b\u009c\7n\2\2\u009c\u009d\7w\2\2\u009d\u009e\7o\2\2\u009e\u009f"+
		"\7p\2\2\u009f&\3\2\2\2\u00a0\u00a1\7h\2\2\u00a1\u00a2\7q\2\2\u00a2\u00a3"+
		"\7t\2\2\u00a3\u00a4\7o\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7v\2\2\u00a6"+
		"\u00a7\7/\2\2\u00a7\u00a8\7u\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7|\2\2"+
		"\u00aa\u00ab\7g\2\2\u00ab(\3\2\2\2\u00ac\u00ad\7o\2\2\u00ad\u00ae\7d\2"+
		"\2\u00ae*\3\2\2\2\u00af\u00b0\7d\2\2\u00b0,\3\2\2\2\u00b1\u00b2\7m\2\2"+
		"\u00b2\u00b3\7d\2\2\u00b3.\3\2\2\2\u00b4\u00b5\7i\2\2\u00b5\u00b6\7d\2"+
		"\2\u00b6\60\3\2\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7p\2\2\u00b9\u00ba"+
		"\7f\2\2\u00ba\62\3\2\2\2\u00bb\u00bd\t\2\2\2\u00bc\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\64\3\2\2"+
		"\2\u00c0\u00c2\t\3\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c1"+
		"\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\7\60\2\2"+
		"\u00c6\u00c7\7v\2\2\u00c7\u00c8\7z\2\2\u00c8\u00c9\7v\2\2\u00c9\66\3\2"+
		"\2\2\u00ca\u00cc\t\4\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce8\3\2\2\2\u00cf\u00d1\n\5\2\2"+
		"\u00d0\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3"+
		"\3\2\2\2\u00d3:\3\2\2\2\u00d4\u00d5\7$\2\2\u00d5\u00d6\59\35\2\u00d6\u00d7"+
		"\7$\2\2\u00d7<\3\2\2\2\u00d8\u00da\t\6\2\2\u00d9\u00d8\3\2\2\2\u00da\u00db"+
		"\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00de\b\37\2\2\u00de>\3\2\2\2\b\2\u00be\u00c3\u00cd\u00d2\u00db\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}