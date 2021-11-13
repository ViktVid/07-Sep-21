package abstractClasses;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {

/*		Trougao t1 = new Trougao(3);
		t1.stampanje();

		Kvadrat k1 = new Kvadrat(2);
		k1.stampanje();

		ArrayList<Figura> listaFigura = new ArrayList<Figura>() {
			listaFigura.add(t1);
			
			double sumaPovrsina = 0;
			doublesumaObima = 0;
			
		for (int i= 0; i < listaFigura.size(); i++) {
			sumaPovrsina = sumaPovrsina + listaFigura.get(i).povrsina();
			sumaObima = sumaObima + listaFigura.get(i).obim();
			}
			System.out.PrintLn("Suma povrsina: " + sumaPovrsina);
			System.out.PrintLn("Suma obima: " + sumaObima);
		} 			*/
		
        Trougao t1 = new Trougao(3);
        Trougao t2 = new Trougao(4);
        Trougao t3 = new Trougao(5);

/*      Pravougaonik p1 = new Pravougaonik(3, 5);
        Pravougaonik p2 = new Pravougaonik(1, 8);	 */

        Kvadrat k1 = new Kvadrat(6);
        Kvadrat k2 = new Kvadrat(7);
        Kvadrat k3 = new Kvadrat(1);
        Kvadrat k4 = new Kvadrat(4);

        ArrayList<Figura> listaFigura = new ArrayList<Figura>();
        listaFigura.add(t1);
        listaFigura.add(t2);
        listaFigura.add(t3);
/*      listaFigura.add(p1);
        listaFigura.add(p2);	 */
        listaFigura.add(k1);
        listaFigura.add(k2);
        listaFigura.add(k3);
        listaFigura.add(k4);

        double sumaPovrsina = 0;
        double sumaObima = 0;

        for (int i = 0 ; i < listaFigura.size() ; i++) {
            sumaPovrsina = sumaPovrsina + listaFigura.get(i).povrsina();
            sumaObima = sumaObima + listaFigura.get(i).obim();
        }
        System.out.println("Suma povrsina: " + sumaPovrsina);
        System.out.println("Suma obima: " + sumaObima);

	}

}
