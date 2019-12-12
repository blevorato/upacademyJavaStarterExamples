package pt.upacademy.desafios.desafio3;

public class Desafio {

	public static int points(String[] strings) {
		int pontos = 0;
		for (int index = 0; index < strings.length; index++) {
			String[] temp = strings[index].split(":");
			int esquerda = Integer.parseInt(temp[0]);
			int direita = Integer.parseInt(temp[1]);

			if (esquerda > direita) {
				pontos += 3;
				;

			} else if (esquerda == direita) {
				pontos++;
			}
		}
		return pontos;
	}

}
