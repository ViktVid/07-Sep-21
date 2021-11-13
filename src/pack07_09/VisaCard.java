package pack07_09;

public class VisaCard extends PlatnaKartica {

/*	Napraviti klasu Visa kartica koja nasledjuje klasu Platna kartica
Napraviti atribut ime i prezime za klasu
Geter i seter za atribut
Implementirati metodu tako da na prosledjenu transakciju dodeljuje se provizija od 1.8%
Najmanja provizija je 4$
Implementirati metodu koja stampa karticu u formatu:
Visa card: 7105-1579-5191-6184, 11/2024, $212 */
	
	private String ime;
	private String prezime;

	public VisaCard(String brojKartice, int mesec, int godina, double suma, String ime, String prezime) {
		super(brojKartice, mesec, godina, suma);
		this.ime = ime;
		this.prezime = prezime;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	public void izvrsiTransakciju (double transakcija) {
		double provizija = transakcija * 0.018; // 0,018 jer je to 1.8 -> Ne buni se!
		if (provizija < 4) {
			super.izvrsiTransakciju(transakcija + 4);
			
		} else {
			super.izvrsiTransakciju(transakcija + provizija);
		}
	}
	
	   public void stampanje() {
	        System.out.print("Visa kartica: ");
	        super.stampanje();
	        System.out.println(" " + this.ime + this.prezime);
	    }
	
}
