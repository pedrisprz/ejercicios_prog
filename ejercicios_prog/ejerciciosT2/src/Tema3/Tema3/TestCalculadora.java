package Tema3;

public class TestCalculadora {
	
	static void pruebaUnitariaSuma() {
		Calculadora myCalculadora = new Calculadora();		
		
		int sumando1=1;
		int sumando2=2;
		int primeraSuma = myCalculadora.suma(1,1);
		
		if(primeraSuma!=2) {
		System.out.println("La prueba unitaria está mal");
		}

	}
	public static void main(String[]args) {
		pruebaUnitariaSuma();
		}
	}

