package proyectosMaven;

public class ExcepcionDeBlanco extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExcepcionDeBlanco() {
        super("Se ha ingresado un espacio en blanco");
    }
}
