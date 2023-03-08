package proyectosMaven;
/**import java.util.Scanner;

public class LeerPorTeclado {
	public static void getChar() throws ExcepcionDeVocal, ExcepcionDeNumero, ExcepcionDeBlanco, ExcepcionDeSalida {
		System.out.println("Un carácter: ");
		System.out.println("(Solo va a leer el primer carácter introducido)");
		Scanner scan = new Scanner(System.in);
		char caracter = scan.nextLine().charAt(0);
		scan.close();
		
        if (Character.isWhitespace(caracter)) {
            throw new ExcepcionDeBlanco();
        } else if (Character.isDigit(caracter)) {
            throw new ExcepcionDeNumero();
        } else if (Character.toLowerCase(caracter) == 'a' || Character.toLowerCase(caracter) == 'e' ||
                Character.toLowerCase(caracter) == 'i' || Character.toLowerCase(caracter) == 'o' ||
                Character.toLowerCase(caracter) == 'u') {
            throw new ExcepcionDeVocal();
        } else if (caracter == 'x') {
            throw new ExcepcionDeSalida();
        } else {
        	System.out.println("El carácter" + " '"+caracter +"' " +"no lanza excepciones");
        }
    }

public static void main(String[]args) throws ExcepcionDeVocal, ExcepcionDeNumero, ExcepcionDeBlanco, ExcepcionDeSalida {
	getChar();
	}
}*/

/**import java.util.Random;

class SuperiorException extends Exception {
    public SuperiorException() {
        super("El número es mayor que 80");
    }
}

class InferiorException extends Exception {
    public InferiorException() {
        super("El número es menor que 20");
    }
}

class ProcesadorNumeros {
    private int[] numeros;

    public ProcesadorNumeros() {
        numeros = new int[100];
        Random random = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(101); // Genera números aleatorios entre 0 y 100, ambos incluidos
        }
    }

    public void procesaNumero(int numero) throws SuperiorException, InferiorException {
        if (numero == 0 || numero == 100 || numero == 50) {
            System.out.println("Programa terminado");
            System.exit(0);
        }
        if (numero > 80) {
            throw new SuperiorException();
        } else if (numero < 20) {
            throw new InferiorException();
        }
        // Si el número está entre 20 y 80, no se lanza ninguna excepción
        System.out.println("El número " + numero + " se procesó correctamente");
    }
}

public class Main {
    public static void main(String[] args) {
        ProcesadorNumeros procesador = new ProcesadorNumeros();
        for (int numero : procesador.numeros) {
            try {
                procesador.procesaNumero(numero);
            } catch (SuperiorException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (InferiorException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
 */
public class LeerPorTeclado {
    private char caracter;

    public char getChar() {
        return caracter;
    }

    public void setChar(char caracter) {
        this.caracter = caracter;
    }

    public void procesarCaracter() throws ExcepcionDeVocal, ExcepcionDeNumero, ExcepcionDeBlanco, ExcepcionDeSalida {
        if (Character.isWhitespace(caracter)) {
            throw new ExcepcionDeBlanco();
        } else if (Character.isDigit(caracter)) {
            throw new ExcepcionDeNumero();
        } else if (Character.toLowerCase(caracter) == 'a' || Character.toLowerCase(caracter) == 'e' ||
                Character.toLowerCase(caracter) == 'i' || Character.toLowerCase(caracter) == 'o' ||
                Character.toLowerCase(caracter) == 'u') {
            throw new ExcepcionDeVocal();
        } else if (caracter == 'x') {
            throw new ExcepcionDeSalida();
        }
    }
}
