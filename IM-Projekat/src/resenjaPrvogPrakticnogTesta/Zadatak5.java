package resenjaPrvogPrakticnogTesta;


public class Zadatak5 {

	public static void main(String[] args) {
		//Prva verzija zadatka
		Televizor smartTV = new Televizor(true, 12);
		
		while(smartTV.getJacinaTona()<50) {
			smartTV.pojacaj();
		}
		
		System.out.println(smartTV.toString());
		System.out.println(smartTV.getJacinaTona());
		
		/*Druga verzija je u sustini identicna osim sto se u konstruktoru zahteva podesavanje
		 * obelezja power na false
		 */


	}

}
