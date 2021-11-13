package zadatak;

public class AudioControl extends Control {

	/*
	 * Kreirati klasu AudioControl koja nasledjuje klasu Control i getere, setere i
	 * konstruktore. Ima atribut koji kaze da li se smanjuje ili pojacava zvuk (tipa
	 * boolean). Implementirati metodu izvrsi akciju tako sto pojaca ili smanjuje
	 * zvuk za 1. U opsegu od 0 do 100.
	 */

	private boolean pojacava;

	public AudioControl(boolean pojacava) {
		super();
		this.pojacava = pojacava;
	}

	public boolean isPojacava() {
		return pojacava;
	}

	public void setUnapred(boolean unapred) {
		this.pojacava = unapred;
	}

	@Override
	public void izvrsiAkciju(VideoPlayer vp) {
		if (pojacava = true) {
		
		}
	}
}
