package geometry;

public class ReferencesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Razlikujemo dva tipa podataka:
		1) Primitivni tipovi (byte, int, float, double, boolean)
		2) Složeni tipovi podataka (klase)
	
		Tipove podataka još delimo na:
		1) Tipovi vrednosti 
		- varijabla ovog tipa podatka drži podatke u okviru memorijskog prostora koji joj je dodeljen prilikom deklarisanja te varijable
		- pristupanjem vrednosti varijable ovog tipa dobijamo vrednost koja je varijabli dodeljena prilikom inicijalizacije
		- svi primitivni tipovi podataka u Java programskom jeziku su tipovi vrednosti (byte, int, float, double, boolean)
		
		2) Referentni tipovi 
		- varijable ovog tipa podatka drže referencu na podatak odreðenog tipa, ne drže same podatke
		- REFERENCA je adresa memorijske lokacije na kojoj se smeštaju podaci koje varijabla referencira
		- referenca omoguæava pristup objektu 
		- pristupanjem vrednosti ove varijable dobijamo vrednost adrese memorijske lokacije na kojoj se smešta objekat koji se kreira prilikom inicijalizacije
		- svi neprimitivni tipovi podataka u Java programskom jeziku su referentni tipovi (klase)
		*/
		
		
		int number = 2; //tip vrednosti
		System.out.println("Vrednost varijable number je: " + number); //ispisuje vrednost varijable
		System.out.println();
		
		//metoda System.out.println vraæa niz znakova u formatu: <nazivPaketa>.<nazivKlase>@<hexAdresa>
		Point point1 = new Point(20, 20, false); //referentni tip, point1 predstavlja referencu na objekat point1
		System.out.println("Vrednost reference point1 je: " + point1); //ispisuje adresu memorijske lokacije na kojoj je smešten objekat point1

		Point point2 = new Point(30, 30, false); //point2 predstavlja referencu na objekat point2
		System.out.println("Vrednost reference point2 je: " + point2); //ispisuje adresu memorijske lokacije na kojoj je smešten objekat point2
		
		System.out.println("Vrednost koordinate x taèke koju referencira point1: " + point1.getX());
		System.out.println("Vrednost koordinate y taèke koju referencira point1: " + point1.getY());
		System.out.println("Vrednost koordinate x taèke koju referencira point2: " + point2.getX());
		System.out.println("Vrednost koordinate y taèke koju referencira point2: " + point2.getY());
		System.out.println();
		
		//vrednost reference point2 se postavlja na vrednost reference point1
		//point2 dobija kao vrednost adresu memorijske lokacije koja odgovara adresi koju kao vrednost ima point1
		//point1 i point2 reference referenciraju isti objekat u memoriji
		point2 = point1;
		System.out.println("point1 i point2 reference referenciraju isti objekat u memoriji");
		System.out.println("Vrednost reference point1 je: " + point1);
		System.out.println("Vrednost reference point2 je: " + point2);
		System.out.println("Vrednost koordinate x taèke koju referencira point1: " + point1.getX());
		System.out.println("Vrednost koordinate y taèke koju referencira point1: " + point1.getY());
		System.out.println("Vrednost koordinate x taèke koju referencira point2: " + point2.getX());
		System.out.println("Vrednost koordinate y taèke koju referencira point2: " + point2.getY());
		System.out.println();

		//pošto point1 i point2 referenciraju isti objekat u memoriji:
		//promenom vrednosti obeležja objekta koji referencira point1 menjaju se vrednosti obeležja objekta koji referencira point2
		point1.setX(100);
		System.out.println("Vrednost reference point1 je: " + point1);
		System.out.println("Vrednost reference point2 je: " + point2);
		System.out.println("Vrednost koordinate x taèke koju referencira point1: " + point1.getX());
		System.out.println("Vrednost koordinate y taèke koju referencira point1: " + point1.getY());
		System.out.println("Vrednost koordinate x taèke koju referencira point2: " + point2.getX());
		System.out.println("Vrednost koordinate y taèke koju referencira point2: " + point2.getY());
		
	}

}
