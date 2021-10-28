package introduction;

public class Variables {
	public static void main (String [] args) {
		int prviBroj = 24;
		int drugiBroj = 12;
		char operation = 'a';
		int rezultat = 0;
		
		if(operation == '+') {
			rezultat = prviBroj + drugiBroj;
			System.out.println(rezultat);
		}
		else if (operation == '-') {
			rezultat = prviBroj - drugiBroj;
			System.out.println(rezultat);
		}
		else if (operation == '*') {
			rezultat = prviBroj * drugiBroj;
			System.out.println(rezultat);
		}
		else if (operation == '/') {
			rezultat = prviBroj/drugiBroj;
			System.out.println(rezultat);
		}
		else {
			System.out.println("Nije unet odgovarajuci simbol racunskih operacija");
		}
		
		String primer = "Broj je: " + prviBroj;
		System.out.println(primer);
	}
}
