package petitPrince;

import asteroide.Sujet;
import asteroide.console.ConsoleJavaBoy;

public class PetitPrince0 implements Sujet{
	
	private String nom;
	private int argent;
	
	public PetitPrince0(String nom, int argent) {
		this.nom = nom;
		this.argent = argent;
	}
	
	public String getNom() {
		return this.nom;
	}
    
	public int getArgent() {
		return this.argent;
	}
    
	public void run() {
		
	}

}
