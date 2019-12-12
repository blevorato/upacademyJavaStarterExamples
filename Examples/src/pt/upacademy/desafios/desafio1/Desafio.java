package pt.upacademy.desafios.desafio1;

public class Desafio {
	private int count;
	private int big3;
	private int big5;

	public Desafio(int i) {
		// TODO Auto-generated constructor stub
		this.count = i;

	}

	public void run() {
		int index;
		for (index = 1; index <= count; index++) {
			if (index % 3 == 0) {
				big3++;
			} 
			
			if (index % 5 == 0) {
				big5++;
			}
		}
	}

	public int getBig3Count() {
		return big3;
	}

	public int getBig5Count() {
		return big5;
	}

}
