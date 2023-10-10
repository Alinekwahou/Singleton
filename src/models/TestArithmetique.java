package models;

public class TestArithmetique {

	public static void main(String[] args) {
	
		int produit = Arithmetique.getInstance(6,3).produit(6,3);
		 System.out.printf("le produit est %d ",produit);
		 Arithmetique a1 = Arithmetique.getInstance(8, 3);
	     a1.affiche();

	    int soustraction = Arithmetique.getInstance(6,3).soustraction(6,3);
			 System.out.printf("la soustraction est %d ",soustraction);
			 Arithmetique a2 = Arithmetique.getInstance(8, 3);
		     a2.affiche();
	     float division=Arithmetique.getInstance(6,3).division(6,2);
	    		
	    System.out.printf("la division est %f", division);
	    		
		Arithmetique a3 = Arithmetique.getInstance(5, 9);
		 a3.affiche();
	}

}
