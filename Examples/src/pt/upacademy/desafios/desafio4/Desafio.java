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
=======
	private static Scanner scanner;
>>>>>>> c6d7fd6cbd2a0b9849a40b5706e1d67cd01ab013

	public static int[] ints(String msg) {
		List<Integer> result = new ArrayList<Integer>();
		
		scanner = new Scanner(msg);
		while (scanner.hasNext()) {
			if (scanner.hasNextInt()) {
				result.add(scanner.nextInt());
			} else {
				scanner.next();
			}		
		}
		
//		String[] numbers = msg.split(" ");
//		for (String string : numbers) {
//			try {
//				int num = Integer.parseInt(string);
//				result.add(num);
//			} catch (Exception e) {}
//		}
		
//		if (msg == "") return new int[]{};
//		String[] numbers = msg.split(" ");
//		for (String s : numbers) {
//			boolean isInt = true;
//			for(int i = 0; i < s.length(); i++) {
//		        if(Character.digit(s.charAt(i),10) < 0) {
//		        	isInt = false;
//		        	break;
//		        }
//		    }
//			if (isInt) result.add(Integer.parseInt(s));
//		}

		
		return result.stream().mapToInt(i -> i).toArray();
	}
}