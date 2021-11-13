package pack07_09;

public class MasterCard extends PlatnaKartica {
	
/*  Napraviti klasu Master kartica koja nasledjuje klasu Platna kartica
	Implementirati metodu tako da na prosledjenu transakciju dodeljuje se provizija od 1.5%
	Napraviti metodu odrzavanja racuna koja je 2$
	Implementirati metodu koja stampa karticu u formatu:
	Master card: 7105-1579-5191-6184, 11/2024, $212  */
	
	
	private double provizija;
	private double odrzavanjeRacuna;

	public MasterCard(String brojKartice, int mesec, int godina, double suma, double provizija,
			double odrzavanjeRacuna) {
		super(brojKartice, mesec, godina, suma);
		this.provizija = provizija;
		this.odrzavanjeRacuna = odrzavanjeRacuna;
		
	}

	public double getProvizija() {
		return provizija;
	}

	public void setProvizija(double provizija) {
		this.provizija = provizija;
	}

	public double getOdrzavanjeRacuna() {
		return odrzavanjeRacuna;
	}

	public void setOdrzavanjeRacuna(double odrzavanjeRacuna) {
		this.odrzavanjeRacuna = odrzavanjeRacuna;
	}
	
	public void stampanje () {
		System.out.println("");
	}
	
}
