package resenjaPrvogPrakticnogTesta;

public class Televizor {
	private boolean power;
	private int brojKanala;
	private int jacinaTona;
	
	//Konstruktori
	public Televizor(boolean power) {
		this.power = power;
	}
	
	public Televizor(boolean power, int brojKanala) {
		this(power);
		this.brojKanala = brojKanala;
	}
	
	@Override
	public String toString() {
		if(this.power) {
			return "Televizor je ukljucen na kanal " + this.brojKanala + " i njegova jacina zvuka je: "
					+ this.jacinaTona;
		}
		else {
			return "Televizor je iskljucen!";
		}
	}
	
	public boolean isPower() {
		return power;
	}
	
	public void pojacaj() {
		if(jacinaTona<50) {
			jacinaTona++;
		}
		else {
			System.out.println("Maksimalna jacina zvuka je 50!");
		}
	}
	
	public int getJacinaTona() {
		return jacinaTona;
	}
}
