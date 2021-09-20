package paginas;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaPrincipal {

    public static final Target BTN_ELEMENTS = Target.the("Boton principal elements").located(By.xpath("//h5[contains(text(),'Elements')]"));
    public static final Target BTN_ALERTS = Target.the("Boton principal alerts").located(By.xpath("//h5[contains(text(),'Alerts, Frame & Windows')]"));
    public static final Target BTN_WIDGETS = Target.the("Boton principal widgets").located(By.xpath("//h5[contains(text(),'Widgets')]"));

    public static final Target BTN_BOOK = Target.the("Boton principal book").located(By.xpath("  //h5[contains(text(),'Book Store Application')]"));


}
