package petitPrince;

import asteroide.Sujet;
import asteroide.console.ConsoleJavaBoy;

public class PetitPrince implements Sujet{
	
	private String nom;
	private int argent;
	private ConsoleJavaBoy console;
	
	private static int compteur = 0;
	 
	
	public PetitPrince(String nom) {
		this.nom = nom;
		this.argent = 0;
		this.console = new ConsoleJavaBoy(this);
	}
	
	public String getNom() {
		return this.nom;
	}
    
	public int getArgent() {
		return this.argent;
	}
    
	public void run() {
		this.console.parler("Je dis quelques chose");
		this.console.seDirigerVers(0);
		
		this.compteur+=1;
		
		
	}

}
