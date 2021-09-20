package preguntas;

import interacciones.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import paginas.Elements;

public class ValidarRegistro implements Question<Boolean> {

    private Boolean respuesta = false;


    public static ValidarRegistro creado() {
        return new ValidarRegistro();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(Wait.por(6000));

        if (Elements.GRID_4.resolveFor(actor).isPresent()) {
            System.out.println("El registro fue creado");
            respuesta = true;
        } else {
            System.out.println("El registro no aparece en la tabla");
        }


        return respuesta;
    }
}
