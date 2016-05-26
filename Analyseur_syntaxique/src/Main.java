import java.io.*;
import java.util.Scanner;
//import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

public class Main {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Texte : ");
		
		
		String s = scanner.nextLine();
		
		System.out.println(s);
		while (!s.equals("*")) {
			try {
				lo17SqlGrammarLexer lexer = new lo17SqlGrammarLexer(new ANTLRReaderStream(
						new StringReader(s)));
				CommonTokenStream tokens = new CommonTokenStream(lexer);
				lo17SqlGrammarParser parser = new lo17SqlGrammarParser(tokens);
				String arbre = parser.listerequetes();
				System.out.println(arbre);
			} catch (Exception e) {
			}
			System.out.print("Texte : ");
			s = scanner.nextLine();
		}
		
		scanner.close();
	}
}
