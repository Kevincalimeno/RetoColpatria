package tareas;

import interacciones.Wait;
import modelos.DataReto2;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;
import paginas.PaginaPrincipal;
import paginas.Widgets;

import static paginas.PaginaPrincipal.*;
import static paginas.Widgets.*;

public class Seleccionar implements Task {

    private final DataReto2 dataReto2;

    public Seleccionar(DataReto2 dataReto2) {
        this.dataReto2 = dataReto2;
    }

    public static Seleccionar fecha(DataReto2 dataReto2) {
        return Tasks.instrumented(Seleccionar.class, dataReto2);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(BTN_BOOK),
                Wait.por(2000),
                JavaScriptClick.on(BTN_WIDGETS),
                Wait.por(2000),
                JavaScriptClick.on(DATEPICKER),
                Wait.por(2000),
                Enter.theValue(dataReto2.getFecha1()).into(SELECTDATE),
                Wait.por(3000),
            JavaScriptClick.on(SELECTDATE)
                );
        SELECTDATE.resolveFor(actor).click();

        actor.attemptsTo(Enter.theValue(dataReto2.getFecha2()).into(SELECTDATETIME),
                Wait.por(3000)
        );

    }
}
