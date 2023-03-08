package ejerciciosT2;

public class Temperatura {

	public static void main(String[] args) {
		int contador=0;
		Temperatura myTemp=new Temperatura();
	}
	
	double celsiusToFarenheit(double temp) {
		return 1.8*temp+32;
	}
	double farenheitToCelsius(double temp) {
		return (temp-32)/1.8;
	}
}
