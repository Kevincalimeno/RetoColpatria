package paginas;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Widgets {

    public static final Target DATEPICKER = Target.the("Boton Date picker").located(By.xpath("//span[contains(text(),'Date Picker')]"));
    public static final Target SELECTDATE = Target.the("texto fecha").located(By.id("datePickerMonthYearInput"));
    public static final Target SELECTDATETIME = Target.the("texto fecha").located(By.id("dateAndTimePickerInput"));
    public static final Target ESPACIOBLANCO = Target.the("espacio en blanco").located(By.xpath("//div[contains(text(),'Select Date')]"));
}
