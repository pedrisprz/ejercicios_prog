package proyectosMaven;

public class ExcepcionDeSalida extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExcepcionDeSalida() {
        super("Se ha ingresado el carácter 'x' para salir");
    }
}
