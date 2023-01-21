package myPackage;

public class DossierBancaire {
	
	  
	  private Compte_courant cc;
	  private Compte_epargne ce;

	//Constructeur
    public DossierBancaire()
    {
    	cc = new Compte_courant(0);
    	ce = new Compte_epargne(0);
    }

    public void deposer(double value) 
    {
    	cc.Addsolde(0.4*value);
    	ce.Addsolde(0.6*value);
    	
    }
    public double Consulter() {
    	return cc.getsolde()+ce.getsolde();
    	}
    
    public void remunerer() {
    	ce.Remunérer();
    }
	
}
