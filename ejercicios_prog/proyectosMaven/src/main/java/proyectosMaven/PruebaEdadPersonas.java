package proyectosMaven;

public class PruebaEdadPersonas {
    public void generaExcepcionEdad(int edad) throws Exception {
        if (edad < 18) {
            throw new InfantilException("Es menor de edad.");
        } else if (edad >= 18 && edad < 65) {
            throw new AdultoException("Mayor de edad pero no es un adulto mayor.");
        } else if (edad >= 65) {
            throw new MayorException("Es un adulto mayor.");
        }
    }
}

