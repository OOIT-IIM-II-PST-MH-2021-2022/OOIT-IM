package resenjaPrvogPrakticnogTesta;

public class Zadatak1 {

	public static void main(String[] args) {
		/*
		 * Koristeći while petlju ispisati na konzolu parne brojeve u intervalu od 101 do 1 
		 * (uključujući i te vrednosti).
		 * 
	 	Realizacija:
	 	
		int i = 101;
		while(i>=1) {
			if(i%2 == 0) {
				System.out.println(i);
			}
			i--;
		}
		*/
		
		/*Koristeći while petlju ispisati na konzolu parne brojeve u intervalu od 102 do 22 (uključujući i te vrednosti).
		Okrugli brojevi (odnosno 100,90,80,70...) trebaju da imaju dodatak u ispisu na konzoli koji treba da bude u formatu kao što je prikazano na sledećem primeru:
		  92
		  90 - je početak nove desetice. "
		  88
		  86
		  ....
		  
		  Realizacija:
		  
		  int i = 102;
		  while(i>=2){
		  	if(i%2 == 0){
		  		//Proveravamo da li je i okrugli broj tipa 90,80...
		  		if(i%10 == 0) {
		  			System.out.println(i + " - je pocetak nove desetice");
		  		}
		  		//Ukoliko nije, ispisujemo samo paran broj
		  		else {
		  			System.out.println(i);
		  		}
		  }
		  i--;	
	}*/
		
		/*Koristeći for petlju izračunati sumu neparnih brojeva u intervalu od 101 do 1
		 * (uključujući i te vrednosti) i ispisati na konzolu samo konačan rezultat.
		 
		 Realizacija:
		
		//Moramo napraviti promenljivu koja ce da cuva rezultat sabiranja izvan for petlje
		// zato sto u suprotnom svaki put bi se resetovala na 0 da je deklarisana u petlji
		int suma = 0;
		for(int i = 101; i>=1; i--) {
			if(i%2 == 1) {
				suma = suma + i;
			}
		}
		System.out.println("Suma neparnih brojeva od 101 do 1 je: " + suma);
		
		*/
		
		//Sve ostale varijante prvog zadatka se svode na prethodno koriscenu logiku
		

	}

}
