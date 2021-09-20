package tareas;

import interacciones.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import paginas.Elements;

public class EliminarCualquier implements Task {

    private final int fila;

    public EliminarCualquier(int fila) {
        this.fila = fila;
    }

    public static EliminarCualquier registro(int fila) {
        return Tasks.instrumented(EliminarCualquier.class, fila);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Wait.por(4000));

        switch (fila) {
            case 1:
                actor.attemptsTo(Click.on(Elements.GRID_1));
                break;

            case 2:
                actor.attemptsTo(Click.on(Elements.GRID_2));
                break;

            case 3:
                actor.attemptsTo(Click.on(Elements.GRID_3));
                break;

            case 4:
                actor.attemptsTo(Click.on(Elements.GRID_4));
                break;
            default:
                System.out.println("REGISTRO NO DISPONIBLE PARA ELIMINAR");
                break;
        }

    }
}
