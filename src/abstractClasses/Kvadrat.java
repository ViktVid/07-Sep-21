package abstractClasses;

public class Kvadrat extends Figura {

	/*Kreirati klasu Kvadrat koja nasledjuje klasu Figura. Ima stranicu a, getere, setere, konstruktore.
Implementira metodu povrsine po formuli a * a
Implementira metodu obima 4 * a  */
	
	private double a;

	public Kvadrat(double a) {
		
		this.a = a;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double povrsina() {
		return (a * a);

	}

	public double obim() {

		return 4 * a;
	}
	

	
}
