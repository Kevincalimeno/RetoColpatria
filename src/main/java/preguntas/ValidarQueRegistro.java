package preguntas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import paginas.Elements;

public class ValidarQueRegistro implements Question<Boolean> {

    private Boolean respuesta = false;
    private final int fila;

    public ValidarQueRegistro(int fila) {
        this.fila = fila;
    }


    public static ValidarQueRegistro eliminado(int fila) {
        return new ValidarQueRegistro(fila);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        switch (fila) {
            case 1:
                if (!Elements.GRID_1.resolveFor(actor).isPresent()) {
                    System.out.println("El registro fue ELIMINADO");
                    respuesta = true;
                } else {
                    System.out.println("El registro NO FUE ELIMINADO");
                }
                break;

            case 2:
                if (!Elements.GRID_2.resolveFor(actor).isPresent()) {
                    System.out.println("El registro fue ELIMINADO");
                    respuesta = true;
                } else {
                    System.out.println("El registro NO FUE ELIMINADO");
                }
                break;

            case 3:
                if (!Elements.GRID_3.resolveFor(actor).isPresent()) {
                    System.out.println("El registro fue ELIMINADO");
                    respuesta = true;
                } else {
                    System.out.println("El registro NO FUE ELIMINADO");
                }
                break;

            case 4:
                if (!Elements.GRID_4.resolveFor(actor).isPresent()) {
                    System.out.println("El registro fue ELIMINADO");
                    respuesta = true;
                } else {
                    System.out.println("El registro NO FUE ELIMINADO");
                }
                break;
            default:
                System.out.println("REGISTRO NO DISPONIBLE PARA ELIMINAR");
                break;
        }

        return respuesta;
    }
}
