package ejerciciosT2;

public class Ejercicio2 {
 
	public static void main(String [] args) {
		Coche coche1 = new Coche();
		coche1.acelera(20);
		coche1.frena(30);
		int velocidad = coche1.getVelocidad();
		System.out.println(velocidad);
	}
	
}
