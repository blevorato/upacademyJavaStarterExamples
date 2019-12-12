package pt.upacademy.desafios.desafio4;

public class Desafio {

	public static int[] ints(String string) {
		int count = 0;
		for (int index=0;index< string.length();index++) {
			char c = string.charAt(index);
			if (Character.isDigit(c)) {
				count++;
				
			}
		}
		
		int[]numeros = new int[count];
		
		for (int index2 =0;index2<count;index2++) {
			
		}
		return numeros;
	}

}
