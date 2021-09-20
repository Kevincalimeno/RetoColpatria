package tareas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import paginas.PaginaBase;


/**
 * Clase para abrir el navegador
 */
public class AbrirLa implements Task {

    private PaginaBase paginaBase;

    public static AbrirLa pagina() {
        return Tasks.instrumented(AbrirLa.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        /**La variable privada PaginaBase es una Userinterface que
         * dirige a la constante URL*/
        actor.attemptsTo(Open.browserOn(paginaBase));
    }
}
