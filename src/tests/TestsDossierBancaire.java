package tests;

import static org.junit.Assert.*;

import myPackage.Compte_courant;
import myPackage.DossierBancaire;

import org.junit.Test;

//The Test annotation indicates that the public void method to which it is attached can be run as a test case.
public class TestsDossierBancaire {

	@Test  
	public void test_constructeur()
	{
		DossierBancaire dossier=new DossierBancaire();
		assertNotNull(dossier);
		
	}

	@Test
	public void test_deposer() 
	{
		DossierBancaire dossier=new DossierBancaire();
		dossier.deposer(100);
		assertEquals(100,dossier.get_solde(),0);

}
	
	@Test
	public void test_getsolde()
	{
		DossierBancaire dossier=new DossierBancaire();
		assertEquals(0,dossier.get_solde(),0);

}
	
	@Test
	public void deposer2()
	{
		
		Compte_courant cc = new Compte_courant(0);
		cc.Addsolde(100);
		assertEquals(100,cc.getsolde(),0);
	}
		
	@Test
	public void constructeur_cc()
	{
			
		Compte_courant cc = new Compte_courant(20);
		assertEquals(20,cc.getsolde(),0);
			
}
	
	
}
