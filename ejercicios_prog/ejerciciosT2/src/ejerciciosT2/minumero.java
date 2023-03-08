package ejerciciosT2;

public class minumero {
	int numero;
	
	minumero(){
	numero = 2;	
	}
	
	minumero(int nuevoNumero){
		numero=nuevoNumero;
	}
	
	double dobleNumero() {
		return numero*2;
	}
	double tripleNumero() {
		return numero*3;
	}
	double cuadrupleNumero() {
		return numero*4;
	}
	public static void main(String []args) {
		minumero n1=new minumero();
		System.out.println(n1.dobleNumero());
		System.out.println(n1.tripleNumero());
		System.out.println(n1.cuadrupleNumero());
	}
}


