package resenjaPrvogPrakticnogTesta;

public class Zadatak2 {

	public static void main(String[] args) {
		// Putem for petlje izračunati faktorijel broja 6 i ispisati ga na konzoli.
		
				/* 
					Realizacija:
					
					//Promenljivu faktorijel inicijalizujemo na 1 zato sto mora da se mnozi sa brojacem petlje - jedinica ne utice na vrednost proizvoda mnozenja
					int faktorijel = 1;
					for(int i = 6; int >=1; i--){
						faktorijel = faktorijel * 1;
						}
					System.out.println("Faktorijel broja 6 je: " + faktorijel);
					
				 */
				
				
				/*Izračunati i ispisati na konzolu kvadrate parnih brojeva u intervalu od 1 do 101 
				 (uključujući i te vrednosti) pomoću for petlje.
				Ispis na konzoli treba da bude formatiran na sledeći način:
				 
				Kvadrat broja 2 je 4
				Kvadrat broja 4 je 16
				Kvadrat broja 6 je 36 …
				
				Realizacija:
				
				for(int i = 1; i<=101; i++){
					if(i%2 == 0){
						System.out.println("Kvadrat broja " + i + " je: " + i*i);
						}
					}
				*/
				
				/*Koristeći while petlju izračunati faktorijel broja 6.

				Realizacija: 
				
				int faktorijel = 1;
				int brojac = 6;
				while(brojac>=1) {
					faktorijel = faktorijel * brojac;
					brojac--;
				}
				System.out.println(faktorijel);
				*/
				
				/*
				 	Izračunati i ispisati na konzolu kvadrate neparnih brojeva u intervalu od 101 do 1 
				 	(uključujući i te vrednosti) pomoću while petlje.
					Ispis na konzoli treba da bude formatiran na sledeći način:
					
					Kvadrat broja 101 je 10201
					Kvadrat broja 99 je 9801
					Kvadrat broja 97 je 9409  …
					
					Realizacija:
					
					int i = 101;
					while(i>=1){
						if(i%2 == 1){
							System.out.println("Kvadrat broja " + i +" je: " i*i);
							}
						i--;
						}
				 */

	}

}
