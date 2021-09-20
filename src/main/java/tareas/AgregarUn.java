package tareas;

import modelos.DataReto1;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;


import static paginas.Elements.*;
import static paginas.PaginaPrincipal.BTN_ELEMENTS;


public class AgregarUn implements Task {

    private final DataReto1 dataReto1;

    public AgregarUn(DataReto1 dataReto1) {
        this.dataReto1 = dataReto1;
    }

    public static AgregarUn registro(DataReto1 dataReto1) {
        return Tasks.instrumented(AgregarUn.class, dataReto1);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(JavaScriptClick.on(BTN_ELEMENTS),
                JavaScriptClick.on(BTN_WEBTABLES),
                Click.on(BTN_ADD),
                Enter.theValue(dataReto1.getNombre()).into(TXT_FIRSTNAME),
                Enter.theValue(dataReto1.getApellido()).into(TXT_LASTNAME),
                Enter.theValue(dataReto1.getCorreo()).into(TXT_EMAIL),
                Enter.theValue(dataReto1.getEdad()).into(TXT_AGE),
                Enter.theValue(dataReto1.getSalario()).into(TXT_SALARY),
                Enter.theValue(dataReto1.getSalario()).into(TXT_DEPARTMENT),
                Click.on(BTN_SUBMIT)
        );
    }
}
