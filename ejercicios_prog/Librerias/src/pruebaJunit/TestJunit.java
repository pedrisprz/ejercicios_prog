package pruebaJunit;

import org.junit.Test;
¡
import libreria.Calculadora;

public class TestJunit {
	
		
	@Test
	public void prueba1() {
		System.out.println("test");
		Calculadora c1 = new Calculadora();
		assterEquals(2,c1.suma(1, 1));
	}
}
