package ds2021_2022;
import java.util.Scanner;

public class Film {
	protected String titre;
	protected String réalisateur ;
	protected String pays;
	protected int durée;
	protected int nb_places;
	protected int getNbPlaces() {
		return nb_places;
	}
	public void setNbPlaces(int nb) {
		this.nb_places=nb;
	}
	@Override
	public String toString() {
		return ("Insurrection de "+réalisateur+"("+pays+")"+" - "+durée +" min.");
		
	}
	public Film(String titre, String r, String pays, int d) {
		this.titre=titre;
		this.réalisateur=r;
		this.pays=pays;
		this.durée=d;
	}
	public float totalVenteBillets() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nombre de places pour étudiants : ");
        int nbEtu = scanner.nextInt();
		if(nbEtu<=nb_places) {
			System.out.println(nbEtu*2+(nb_places-nbEtu)*3);
			return(nbEtu*2+(nb_places-nbEtu)*3);}
		else
			System.out.println( "les places d'etudiants doivent etre inferieur ou egales au nombres de places disponibles ");
		return 0;	
		
	}
	
}
