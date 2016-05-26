import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;



public class Lexique {
	private final HashMap<String, String> dictionnaire;
	
	// Lettres à proximité de chacune des lettres sur un clavier Azerty
	private HashMap<Character, ArrayList<Character>> proximiteMots;
	
	public HashMap<String, String> getDictionnaire() {
		return dictionnaire;
	}

	public Lexique(String file){
		dictionnaire = new HashMap<String, String>();
		//initProximiteMot();
		load(file);
	}

	public void load(String file){
		BufferedReader br=null;
	     String chaine;
	     String mot;
	     String lemme;
	     try {
	          try {
	              br = new BufferedReader(new FileReader(file));
	               while ((chaine=br.readLine())!=null){
	            	    String[] split = chaine.split("\\t");
	            	   
						mot = split[0].trim();
						if (split.length == 1)
							lemme = " ";
						else
							lemme = chaine.split("\t")[1].trim();
						
						dictionnaire.put(mot, lemme);
	               }
	          }
	          catch(EOFException e) {
	               br.close();
	               }
	          } 
	     catch(FileNotFoundException e) {
	          System.out.println("fichier inconnu : " + file);
	          } 
	     catch(IOException e) {
	          System.out.println("IO Exception");
	          }
	}
	
	public String search(String s) {
		return dictionnaire.get(s);
	}
	
	public void print() {
		for (String ks : this.dictionnaire.keySet()) {
			System.out.println(ks);
		}
	}

	public ArrayList<String> proximitePrefixe(String mot) {
		ArrayList<String> candidats = new ArrayList<String>();
		int longMot = mot.length();
		int bestProx = 0;
		for(String key : dictionnaire.keySet()){
			int longKey = key.length();
			// Si mot ou clé trop court, on passe à la pochaine clé
			if(longMot<3 || longKey<3){
				continue;
			}
			// Si trop d'écart de longueur entre mot et clé, on passe à la pochaine clé
			if(Math.abs(longMot-longKey)>7){ // Math.max(longMot-5, longKey-5)
				continue;
			}
			int i = 0;
			int prox = 0;
			while(i<Math.min(longMot, longKey) && mot.charAt(i)==key.charAt(i)){
				i++;
				prox = i*100/Math.max(longMot, longKey);
			}
			// On ne garde que les clés qui ont une proximité de 60% avec le mot
			if(prox >= 60 && i>=4){
				if(prox>bestProx){
					bestProx = prox;
					candidats.clear();
					candidats.add(dictionnaire.get(key));
				}
				else if(prox == bestProx){
					candidats.add(dictionnaire.get(key));
				}
			}
		}
		return candidats;
	}

	public ArrayList<String> proximiteLevenshtein(String mot) {
		ArrayList<String> candidats = new ArrayList<String>();
		int longMot = mot.length();
		int bestDist = 10;
		int currDist;
		
		for (String cle : dictionnaire.keySet()) {
			int longCle = cle.length();
			ArrayList<ArrayList<Integer>> dist = new ArrayList<ArrayList<Integer>>(longMot);
			for(Integer i=0;i<=longMot;i++){
				dist.add(i, new ArrayList<Integer>(longCle));
				dist.get(i).add(0, i);
			}
			for(Integer i=0;i<=longCle;i++){
				dist.get(0).add(i, i);
			}
			int dRempl,dSuppr,dInser;
			for(int i=1;i<=longMot;i++){
				for(int j=1;j<=longCle;j++){
					dRempl = dist.get(i-1).get(j-1) + (mot.charAt(i-1)==cle.charAt(j-1) ? 0 : 1);
					dSuppr = dist.get(i-1).get(j) + 1;
					dInser = dist.get(i).get(j-1) + 1;
					dist.get(i).add(j,Math.min(dRempl, Math.min(dSuppr, dInser)));
				}
			}
			currDist = dist.get(longMot).get(longCle);
			if(currDist<= 3){
				if(currDist<bestDist){
					bestDist = currDist;
					candidats.clear();
					candidats.add(dictionnaire.get(cle));
				}
				else if(currDist == bestDist){
					candidats.add(dictionnaire.get(cle));
				}
			}
		}
		// Si un candidat est un anagramme du mot, on ne garde que lui
		// Pour qu'un anagramme ait le seuil nécessaire pour être candidat, il ne doit avoir qu'une ou deux paires de lettres permutées
		if(candidats.size()>1){
			for (String candidat : candidats) {
				if(anagramme(candidat, mot)){
					candidats.clear();
					candidats.add(candidat);
					break;
				}
			}
		}
		return candidats;
	}
	
	/**
	 * Un mot est un anagramme d'un autre mot si les deux ont la même longueur
	 * et si chaque lettre de l'un apparait autant de fois dans l'autre	
	 * @param mot
	 * @param ref
	 * @return true si c'est un anagramme
	 */
	private boolean anagramme(String mot, String ref){
		if(mot.length()!=ref.length()){
			return false;
		}
		for(int i=0; i<mot.length();i++){
			if(ref.contains(""+mot.charAt(i))){
				ref.replaceFirst(""+mot.charAt(i), "");
			}
			else
				return false;
		}
		return true;
	}
	
	// return le nombre de lettres égales ou à proximité du mot ref
	private int proxFauteSaisie(String mot, String ref){
		int score = 0;
		for(int i=0; i<mot.length();i++){
			
		}
		return score;
	}
	
	private void initProximiteMot() {
		proximiteMots = new HashMap<Character, ArrayList<Character>>();
		//a
		proximiteMots.put('a', new ArrayList<Character>());
		proximiteMots.get('a').add('a');
		proximiteMots.get('a').add('z');
		proximiteMots.get('a').add('q');
		proximiteMots.get('a').add('s');
		proximiteMots.get('a').add('&');
		proximiteMots.get('a').add('é');
		//z
		proximiteMots.put('z', new ArrayList<Character>());
		proximiteMots.get('z').add('a');
		proximiteMots.get('z').add('z');
		proximiteMots.get('z').add('e');
		proximiteMots.get('z').add('q');
		proximiteMots.get('z').add('s');
		proximiteMots.get('z').add('d');
		proximiteMots.get('z').add('é');
		proximiteMots.get('z').add('\"');
		//e
		proximiteMots.put('e', new ArrayList<Character>());
		proximiteMots.get('e').add('z');
		proximiteMots.get('e').add('e');
		proximiteMots.get('e').add('r');
		proximiteMots.get('e').add('s');
		proximiteMots.get('e').add('d');
		proximiteMots.get('e').add('f');
		proximiteMots.get('e').add('\"');
		proximiteMots.get('e').add('\'');
		//r
		proximiteMots.put('r', new ArrayList<Character>());
		proximiteMots.get('r').add('e');
		proximiteMots.get('r').add('r');
		proximiteMots.get('r').add('t');
		proximiteMots.get('r').add('d');
		proximiteMots.get('r').add('f');
		proximiteMots.get('r').add('g');
		proximiteMots.get('r').add('\'');
		proximiteMots.get('r').add('(');
		//t
		proximiteMots.put('t', new ArrayList<Character>());
		proximiteMots.get('t').add('r');
		proximiteMots.get('t').add('t');
		proximiteMots.get('t').add('y');
		proximiteMots.get('t').add('f');
		proximiteMots.get('t').add('g');
		proximiteMots.get('t').add('h');
		proximiteMots.get('t').add('(');
		proximiteMots.get('t').add('-');
		//y
		proximiteMots.put('y', new ArrayList<Character>());
		proximiteMots.get('y').add('t');
		proximiteMots.get('y').add('y');
		proximiteMots.get('y').add('u');
		proximiteMots.get('y').add('g');
		proximiteMots.get('y').add('h');
		proximiteMots.get('y').add('j');
		proximiteMots.get('y').add('-');
		proximiteMots.get('y').add('è');
		//u
		proximiteMots.put('u', new ArrayList<Character>());
		proximiteMots.get('u').add('y');
		proximiteMots.get('u').add('u');
		proximiteMots.get('u').add('i');
		proximiteMots.get('u').add('h');
		proximiteMots.get('u').add('j');
		proximiteMots.get('u').add('k');
		proximiteMots.get('u').add('è');
		proximiteMots.get('u').add('_');
		//i
		proximiteMots.put('i', new ArrayList<Character>());
		proximiteMots.get('i').add('u');
		proximiteMots.get('i').add('i');
		proximiteMots.get('i').add('o');
		proximiteMots.get('i').add('j');
		proximiteMots.get('i').add('k');
		proximiteMots.get('i').add('l');
		proximiteMots.get('i').add('_');
		proximiteMots.get('i').add('ç');
		//o
		proximiteMots.put('o', new ArrayList<Character>());
		proximiteMots.get('o').add('i');
		proximiteMots.get('o').add('o');
		proximiteMots.get('o').add('p');
		proximiteMots.get('o').add('k');
		proximiteMots.get('o').add('l');
		proximiteMots.get('o').add('m');
		proximiteMots.get('o').add('ç');
		proximiteMots.get('o').add('à');
		//p
		proximiteMots.get('p').add('o');
		proximiteMots.get('p').add('p');
		proximiteMots.get('p').add('l');
		proximiteMots.get('p').add('m');
		proximiteMots.get('p').add('^');
		proximiteMots.get('p').add(')');
		proximiteMots.get('p').add('à');
	}
}
