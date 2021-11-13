package pack07_09;

public class PlatnaKartica {

	/* suma, broj kartice, mesec i godina
Metodu dodajSredstva koja ce dodavati sredstva za unetu vrednost
Metodu izvrsiTransakciju koja skida prosledjenu vrednost sa racuna
Metodu koja stampa podatke o kartici u formatu:
7105-1579-5191-6184, 11/2024, $212
Za klasu Platna kartica napraviti samo getere */
	
	private double suma;
	private String brojKartice;
	private int mesec;
	private int godina;
	
	public PlatnaKartica (String brojKartice, int mesec, int godina, double suma) {
		
		this.suma = suma;
		this.brojKartice = brojKartice;
		this.mesec = mesec;
		this.godina = godina;	
	}

	public double getSuma() {
		return suma;
	}

	public String getBrojKartice() {
		return brojKartice;
	}

	public int getMesec() {
		return mesec;
	}

	public int getGodina() {
		return godina;
	}
	
	public void dodavanjeSredstava(double profit) {
		suma = suma + profit;
	}
	
	public void izvrsiTransakciju(double trosak) {
		suma = suma - trosak;
	}
	
	public void stampanje() {
		System.out.println(
				"Podaci platne kartice: " + "\n" + "Broj kartice: " + this.brojKartice + "\n" + "Datum vazenja kartice: "
						+ this.mesec + "/" + this.godina + "\n" + "Iznos na kartici: $" + this.suma);
	}
}
