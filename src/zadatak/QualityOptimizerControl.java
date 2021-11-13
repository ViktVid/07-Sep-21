package zadatak;

public class QualityOptimizerControl {
	/*
 Kreirati klasu QualityOptimizerControl koja nasledjuje klasu Control i 
 ima brzinu interneta u megabitima npr 10mb/s 20mb/s... Getere, setere i konstruktore. 
 Implementira metodu izvrsi akciju tako sto postavlja kvalitet videa u zavisnosti od brzine interneta.

 Kvalitet se racuna na osnovu formule: brzina interneta * 10.1 gde se uzima
 prvi veci kvalitet ako je brzina 20 * 10.1 = 204 - postavlja 240;
 ako je brzina 5*10.1 = 50.5 - postavlja 144;
 ako je brzina 20*10.1 = 505 - postavlja 720; */

	private int brzinaInterneta;
	int[] kvalitetVidea = { 144, 240, 720 };

	public QualityOptimizerControl(int brzinaInterneta) {
		super();
		this.brzinaInterneta = brzinaInterneta;
	}

	public int getBrzinaInterneta() {
		return brzinaInterneta;
	}

	public void setBrzinaInterneta(int brzinaInterneta) {
		this.brzinaInterneta = brzinaInterneta;
	}

	public void izvrsiAkciju(VideoPlayer vp) {

		double x = 100000;
		
		for (int i = 0; i < kvalitetVidea.length; i++) {
			double rezultat = (this.brzinaInterneta * 10.1) - this.kvalitetVidea[i];

		}
	}

}
