package models;

public class Arithmetique {
private static Arithmetique instance = null;
	
	private int x;
	private int y;
	
	private Arithmetique (int x, int y)
	{
	this.x=x;
	this.y=y;
	}
	
	public static Arithmetique getInstance(int x, int y)
	{
	if (instance == null)
	{
	instance = new Arithmetique (x, y);
	}
	return instance;
	}		
			
	public int produit(int x, int y){
	return x*y;
	}
	
	public int soustraction(int x, int y){
	return x-y;
	}
	public int division(int x, int y){
		return x/y;
		}
	public void affiche()
	{
	System.out.println("\nJe suis une instance mes valeurs sont: x = " + this.x + " et y = " +
	this.y);
	}

	public Object clone() throws
	CloneNotSupportedException {
	throw new CloneNotSupportedException();	
	}

}


