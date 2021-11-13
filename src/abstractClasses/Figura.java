package abstractClasses;

public abstract class Figura {

	public abstract double povrsina();	
	public abstract double obim();
	

	public void stampanje() {
		System.out.println("Povrsina je: " + this.povrsina());
		System.out.println("Obim je: " + this.obim());
	}
}
