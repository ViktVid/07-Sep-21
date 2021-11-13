package pack07_09;

public class Stampanje {
	public static void main (String [] args) {
		
	

/* Sve platne kartice na sebi imaju mesec, godinu, broj kartice i sumu. Visa kartica ima jos i ime i prezime.
Napraviti metodu koja moze da dodaje sredstva i da vrsi transakcije. Podaci ne mogu da se podese, mogu samo da se citaju.
Visa kartica ima proviziju od 1.8% transakcije, a minimalna provizija je 4$.
Master kartica ima proviziju od 1.5% transakcije i mesecno odrzavanje kosta 2$.
Kartica treba da prikazuje podatke u formatu:
 Tip kartice: broj racuna, mesec/godina, stanje racuna, ime i prezime vlasnika kartice */
	
	PlatnaKartica pk = new PlatnaKartica ("7105-1579-5191-6184", 11, 2024, 212);
	pk.stampanje();
	VisaCard vc = new VisaCard ("7105-1579-5191-6184", 11, 2024, 212, "Viktoria", "Videnovic");
vc.stampanje();
vc.izvrsiTransakciju(20);
vc.dodavanjeSredstava(24);
vc.izvrsiTransakciju(500);
vc.stampanje();

/*MasterCard mc = new MasterCard("1518-1567-1268-1268", 03, 2024, 500);
mc.stampanje();
mc.odrzavanjeRacuna();
mc.stampanje();
mc.izvrsiTransakciju(100);
mc.stampanje();
mc.dodavanjeSredstava(20);
mc.stampanje();*/

	
	
	}
}