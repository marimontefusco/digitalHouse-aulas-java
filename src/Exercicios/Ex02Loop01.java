package Exercicios;

public class Ex02Loop01 {

	public static void main(String[] args) {
		
		/* EX 01 LOOP FOR
		 * Informar todos os números de 1000 a 1999 que quando 
		 * divididos por 11 obtemos resto = 5. 
		 * */
		
		//Processamentos e saída dos dados 
		
		for(int number = 1000; number < 2000; number++ ) {
			
			if (number % 11 == 5) {
				System.out.println(number);
			}
			
		}
		
	}

}
