package tareas;

import interacciones.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.Switch;
import org.openqa.selenium.remote.server.handler.SwitchToFrame;
import paginas.PaginaPrincipal.*;

import static paginas.Alerts.*;
import static paginas.PaginaPrincipal.BTN_ALERTS;
import static paginas.PaginaPrincipal.BTN_BOOK;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class Interactuar implements Task {

    private final String nombre;

    public Interactuar(String nombre) {
        this.nombre = nombre;
    }

    public static Interactuar alertas(String nombre) {
        return Tasks.instrumented(Interactuar.class, nombre);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(BTN_BOOK),
                JavaScriptClick.on(BTN_ALERTS),
                JavaScriptClick.on(BTN_ALERTS2),
                Wait.por(2000),
                Click.on(BTN_ALERT1)
        );
       // getDriver().switchTo().alert().accept();
        actor.attemptsTo( Wait.por(2000),
                Click.on(BTN_ALERT2),
                Wait.por(6000)
                );
      // getDriver().switchTo().alert().accept();
        actor.attemptsTo( Wait.por(2000),
                Click.on(BTN_ALERT3));
      // getDriver().switchTo().alert().accept();
        actor.attemptsTo( Wait.por(2000),
                Click.on(BTN_ALERT4));
       // getDriver().switchTo().alert().sendKeys(nombre);
        System.out.println("Fin");
    }
}
