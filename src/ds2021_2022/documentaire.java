package ds2021_2022;

public class documentaire extends Film{
	private String sujet;
	private static float tarif=2.0f;
	
public documentaire(String titre, String r, String pays, int d,String sujet) {
	super(titre,r,pays, d);
	this.sujet=sujet;
	
}
	@Override
    public String toString() {
        return super.toString() + " Sujet: " + sujet ;
    }
	public float totalVenteBillets() {
		System.out.println("le total de vente de billets est :"+getNbPlaces()*tarif);
		
		return getNbPlaces()*tarif;
	}
	
	

	
}
