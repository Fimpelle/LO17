import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Application {

	public static void main(String[] args) {
		Lexique lexique = new Lexique("res/lemmes");
		
		// saisie requête
		String requete = readInput();
		
		// extraction des mots de la requête
		StringTokenizer st = new StringTokenizer(requete);
		ArrayList<String> motsRequete = new ArrayList<String>();
		while (st.hasMoreTokens()) {
	         motsRequete.add(st.nextToken().toLowerCase());
	    }
		
		for (String string : motsRequete) {
			ArrayList<String> lemmesCandidats;
			System.out.print(string +" : ");
			// 2)b
			if(lexique.getDictionnaire().containsKey(string)){
				System.out.print("(dictionnaire) \t");
				System.out.println(lexique.getDictionnaire().get(string));
			}
			// 2)c
			else if((lemmesCandidats = lexique.proximitePrefixe(string)).size()>0){
				System.out.print("(prefixe) \t");
				for(String lc : lemmesCandidats){
					System.out.print(lc + " ");
				}
				System.out.println();
			}
			// 2)c
			else if((lemmesCandidats = lexique.proximiteLevenshtein(string)).size()>0){
				System.out.print("(levenshtein) \t");
				for(String lc : lemmesCandidats){
					System.out.print(lc + " ");
				}
				System.out.println();
			}
			// 2)d
			else{
				System.out.println("le mot " + string + " n'a pas de lemme " );
			}
		}
	}

    public static String readInput() {
	    BufferedReader br=null;
	    String chaine = "";
	    try {
	         try {
	             br = new BufferedReader(new InputStreamReader(System.in));
	             System.out.print("saisie : ");
	             chaine=br.readLine();
	              }
	         catch(EOFException e) {
	              br.close();
	              }
	         } 
	    catch(IOException e) {
	         System.out.println("IO Exception");
	         }
	    
	    return chaine;
    }
}