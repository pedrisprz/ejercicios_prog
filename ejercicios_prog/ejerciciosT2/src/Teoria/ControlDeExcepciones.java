package Teoria;

public class ControlDeExcepciones {

		public static void main(String []args) {
			try {
				int a = 4 / 5;
			} catch(ArithmeticException e) {
				System.out.println("Se ha producido una excepción aritmética");
			}
		}
}
