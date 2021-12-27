package resenjeDrugogPrakticnogTesta;

public class MojePojacalo extends Pojacalo {

	@Override
	public void ukljuci() throws Exception {
		if(this.getJacinaZvuka() == 50) {
			throw new Exception("Pojacalo je ukljuceno");
		}
		else {
			this.setJacinaZvuka(50);
		}

	}
	
	@Override
	public void iskljuci() throws Exception {
		if(this.getJacinaZvuka() == 0) {
			throw new Exception("Pojacalo je iskljuceno");
		}
		else {
			this.setJacinaZvuka(0);
		}

	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MojePojacalo) {
			MojePojacalo temp = (MojePojacalo)obj;
			if(this.getJacinaZvuka() == temp.getJacinaZvuka()) {
				return true;
			}
		}
		return false;
	}

}
