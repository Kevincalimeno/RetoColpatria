package paginas;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Alerts {
    public static final Target BTN_ALERTS2 = Target.the("Boton alerts").located(By.xpath("//span[contains(text(),'Alerts')]"));
    public static final Target BTN_ALERT1 = Target.the("Boton alerts").located(By.id("alertButton"));
    public static final Target BTN_ALERT2 = Target.the("Boton alerts").located(By.id("timerAlertButton"));
    public static final Target BTN_ALERT3 = Target.the("Boton alerts").located(By.id("confirmButton"));
    public static final Target BTN_ALERT4 = Target.the("Boton alerts").located(By.id("promtButton"));
    public static final Target BTN_ACEPTAR = Target.the("Boton aceptar").located(By.xpath(" //button[contains(text(),' Aceptar ')]"));


}
