package comparaisons;

import datastructures.DataStructure;

public class Mesures {

	/**
	 * Permet de renvoyer la mesure de la complexité pour l'exécution de
	 * la fonction alea sur une structure de donnée.
	 * @param aMesurer Structure de données sur laquelle on exécute alea
	 * @return Valeur de la mesure
	 */
	public static long mesureAlea (DataStructure aMesurer) {
		// TODO : Compléter la fonction afin de pouvoir renvoyer une valeur.
		
		long before = System.nanoTime();
		long after;
		aMesurer.alea();
		after = System.nanoTime();
		
		return after - before;
	}
	
	public static long mesureMinimumSimple (DataStructure aMesurer) {
		
		long before = System.nanoTime();
		long after;
		aMesurer.minimumSimple();
		after = System.nanoTime();
		
		return after - before;
	}
	
	public static long mesureMinimumTri (DataStructure aMesurer) {
		
		long before = System.nanoTime();
		long after;
		aMesurer.minimumTri();
		after = System.nanoTime();
		
		return after - before;
	}
	
	public static long mesureMystere (DataStructure aMesurer) {
	
		long before = System.nanoTime();
		long after;
		aMesurer.mystere();
		after = System.nanoTime();
		
		return after - before;
	}
	
	public static long mesureRecherche (DataStructure aMesurer) {
		
		long before = System.nanoTime();
		long after;
		aMesurer.recherche(5);
		after = System.nanoTime();
		
		return after - before;
	}
}
