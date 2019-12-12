package pt.upacademy.desafios.desafio2;

public class Desafio {

	public static String order(String semOrder) {
		if (semOrder != "") {
			String[] nova = semOrder.split(" ");
			String[] temp = new String[nova.length];
			for (int index = 1; index < nova.length + 1; index++) {
				for (int index2 = 0; index2 < nova.length; index2++) {
					if (nova[index2].contains(Integer.toString(index))) {
						temp[index - 1] = nova[index2];

					}
				}
			}
			String comOrder = String.join(" ", temp);
			return comOrder;
		}

		return semOrder;
	}

}
