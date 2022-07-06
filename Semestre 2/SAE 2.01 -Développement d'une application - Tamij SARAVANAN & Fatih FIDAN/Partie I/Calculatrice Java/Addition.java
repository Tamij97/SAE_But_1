public class Addition extends Operation{

	public Addition(Nombre nbr_1, Nombre nbr_2) {
		super(nbr_1, nbr_2);
	}
	
	public int valeur() {
		return this.getOPerande1().valeur() + this.getOPerande2().valeur();
	}
	
	public String toString() {
		return "(" + this.getOPerande1().valeur() + " + " + this.getOPerande2().valeur() + ")" ;
	}
	
}
