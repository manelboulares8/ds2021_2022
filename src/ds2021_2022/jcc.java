package ds2021_2022;

public class jcc {
	public Film [] competition ;
	public int annee;
	public static final int NBFMAX = 30;
    public int nbF;
    
    public jcc(int nbF,int annee) {
    	competition=new Film[nbF];
    	this.annee=annee;
    	
    }
    public void ajoutFilm(Film f) {
    	if(nbF==NBFMAX) {
    		System.out.println("« La compétition est au complet ».");
    		
    	}else {
    		competition[nbF]=f;
    		nbF++;
    	}
    }
public void listeFilmJCC() {
	for(int i=0;i<nbF;i++) {
		System.out.println(competition[i].toString());
	}}
public int totalVenteBilletsJCC () {
	int tot=0;
	for (int i = 0; i < nbF; i++) {
        tot += competition[i].totalVenteBillets();
    }
	return tot;

}
public static void main(String [] args) {
	documentaire d1=new documentaire("le dernier refuge","ousman","Mali",86,"La guerre civile");
	d1.setNbPlaces(30);
	Film f1=new Film("Insurrection","Jilani Saadi","Tunisie",105);
	f1.setNbPlaces(45);
	jcc j=new jcc(2,2021);
	j.ajoutFilm(d1);
	j.ajoutFilm(f1);
	j.competition[1]=f1;
	//System.out.println(j.competition[0].toString());
	//System.out.println(j.competition[1].toString());
	j.listeFilmJCC();
	j.totalVenteBilletsJCC();
	
	
	
	
}


}
