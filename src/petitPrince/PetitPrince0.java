package petitPrince;

import asteroide.Sujet;
import asteroide.console.ConsoleJavaBoy;

public class PetitPrince0 implements Sujet{
	
	private String nom;
	private int argent;
	private ConsoleJavaBoy console;
	
	private static int compteur = 0;
	 
	
	public PetitPrince0() {
		this.nom = nom;
		this.argent = argent;
		this.console = new ConsoleJavaBoy(this);
	}
	
	public String getNom() {
		return this.nom;
	}
    
	public int getArgent() {
		return this.argent;
	}
    
	public void run() {
		this.console.parler("JE PARLE");
		this.console.seDirigerVers(0);
		
		this.compteur+=1;
		
		
	}

}
