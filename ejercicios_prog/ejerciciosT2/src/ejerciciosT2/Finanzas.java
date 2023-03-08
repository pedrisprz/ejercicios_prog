package ejerciciosT2;

public class Finanzas {
	
	double tipoCambio;
	
	Finanzas(){
		tipoCambio=1.36;
	}
	
	Finanzas(double nuevoCambio){
		tipoCambio=nuevoCambio;
	}
	double dolaresToEuros(double dolares) {
		return dolares/tipoCambio;
	}
	double eurosToDolares (double euros) {
		return euros*tipoCambio;
	}
	public static void main(String []args) {
		Finanzas f1=new Finanzas();
		System.out.println(f1.dolaresToEuros(100));
		System.out.println(f1.eurosToDolares(100));
	}
}
