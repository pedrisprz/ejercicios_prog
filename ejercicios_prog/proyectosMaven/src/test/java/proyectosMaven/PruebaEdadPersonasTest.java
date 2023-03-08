package proyectosMaven;

import org.junit.jupiter.api.Test;
import java.util.Random;

public class PruebaEdadPersonasTest {
	
    @Test
    public void testCapturaExcepcionesEspecificas() throws Exception {
        PruebaEdadPersonas test = new PruebaEdadPersonas();
        Random r = new Random();
	        for (int i = 0; i < 100; i++) {
		            int edad = r.nextInt(100) + 1;
		            try {
		                test.generaExcepcionEdad(edad);
			            } catch (InfantilException e) {
			                System.out.println("InfantilException capturada: " + e.getMessage());
			            } catch (AdultoException e) {
			                System.out.println("AdultoException capturada: " + e.getMessage());
			            } catch (MayorException e) {
			                System.out.println("MayorException capturada: " + e.getMessage());
			            }
	        		}
    			}
    @Test
    public void testGeneraExcepcionEdad_GenericException() {
        PruebaEdadPersonas test = new PruebaEdadPersonas();
        Random random = new Random();
	        for (int i = 0; i < 100; i++) {
	            int edad = random.nextInt(100) + 1;
	            try {
	                test.generaExcepcionEdad(edad);
	            } catch (Exception e) {
	                System.out.println("Excepcion capturada: " + e.getMessage());
	            }
	        }
	    }
}