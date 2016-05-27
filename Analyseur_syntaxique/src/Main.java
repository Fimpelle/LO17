import java.io.*;
import java.util.Scanner;
//import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

public class Main {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		PgsqlInterrogator.init();
		PgsqlInterrogator.open();

		System.out.print("Input : ");
		// input natural language request
		String s = scanner.nextLine();
		// get normalized request
		s = Normalisator.normalize(s);
		// print normalized request
		System.out.println("Normalized : " + s);

		// main loop
		while (!s.equals("*")) {
			try {
				lo17SqlGrammarLexer lexer = new lo17SqlGrammarLexer(new ANTLRReaderStream(new StringReader(s)));
				CommonTokenStream tokens = new CommonTokenStream(lexer);
				lo17SqlGrammarParser parser = new lo17SqlGrammarParser(tokens);

				// construct query
				String query = parser.listerequetes();

				System.out.println("Query : " + query);
				System.out.println("Query execution :");
				PgsqlInterrogator.execQuery(query);
			}
			catch (Exception e) {

			}

			System.out.print("\t\t####################\nInput : ");
			// input natural language request
			s = scanner.nextLine();
			// get normalized request
			s = Normalisator.normalize(s);
			// print normalized request
			System.out.println("Normalized : " + s);
		}


		PgsqlInterrogator.close();
		scanner.close();
	}
}
