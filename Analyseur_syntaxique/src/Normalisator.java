import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Normalisator {

	public static String normalize(String request) {
		Lexique lexique = new Lexique("res/lemmes");
		
		// extraction des mots de la requête
		StringTokenizer st = new StringTokenizer(request);
		ArrayList<String> motsRequete = new ArrayList<String>();
		while (st.hasMoreTokens()) {
	         motsRequete.add(st.nextToken().toLowerCase());
	    }

		String result = "";

		for (String string : motsRequete) {
			ArrayList<String> lemmesCandidats;

			// 2)b
			if(lexique.getDictionnaire().containsKey(string)){
				result += lexique.getDictionnaire().get(string) + " ";
			}
			// 2)c
			else if((lemmesCandidats = lexique.proximitePrefixe(string)).size()>0){
				// Choisit un candidat qui est un anagramme ou obtenu avec des fautes de frappe
				if(lemmesCandidats.size()>1){
					lemmesCandidats = lexique.verifFautes(lemmesCandidats, string);
				}
				// take first candidate ?
				result += lemmesCandidats.get(0) + " ";
			}
			// 2)c
			else if((lemmesCandidats = lexique.proximiteLevenshtein(string)).size()>0){
				// Choisit un candidat qui est un anagramme ou obtenu avec des fautes de frappe
				if(lemmesCandidats.size()>1){
					lemmesCandidats = lexique.verifFautes(lemmesCandidats, string);
				}
				// take first candidate ?
				result += lemmesCandidats.get(0) + " ";
			}
		}

		return result.trim();
	}
}