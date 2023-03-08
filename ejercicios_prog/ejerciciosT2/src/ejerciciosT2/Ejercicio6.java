package ejerciciosT2;

public class Ejercicio6 {
	public static double descubrePorcentaje(double precio, double descuento) {
		return(precio-descuento)*100/precio;
	}
	public static void main(String[]args)	{
		System.out.println(descubrePorcentaje(100,80));
		System.out.println(descubrePorcentaje(100,50));
	}
}
