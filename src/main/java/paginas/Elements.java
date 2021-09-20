package paginas;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Elements {
    public static final Target BTN_WEBTABLES = Target.the("Boton webtables").located(By.xpath("//span[contains(text(),'Web Tables')]"));
    public static final Target TXT_FIRSTNAME = Target.the("Caja de texto primer nombre").located(By.id("firstName"));
    public static final Target TXT_LASTNAME = Target.the("Caja de texto segundo nombre").located(By.id("lastName"));
    public static final Target TXT_EMAIL = Target.the("Caja de texto email").located(By.id("userEmail"));
    public static final Target TXT_AGE = Target.the("Caja de texto edad").located(By.id("age"));
    public static final Target TXT_SALARY = Target.the("Caja de texto salario").located(By.id("salary"));
    public static final Target TXT_DEPARTMENT = Target.the("Caja de texto departamento").located(By.id("department"));
    public static final Target BTN_SUBMIT = Target.the("Boton submit").located(By.id("submit"));
    public static final Target BTN_ADD = Target.the("Boton añadir registro").located(By.id("addNewRecordButton"));
    public static final Target GRID_1 = Target.the("Nombre en el grid").located(By.id("delete-record-1"));
    public static final Target GRID_2 = Target.the("Nombre en el grid").located(By.id("delete-record-2"));
    public static final Target GRID_3 = Target.the("Nombre en el grid").located(By.id("delete-record-3"));
    public static final Target GRID_4 = Target.the("Nombre en el grid").located(By.id("delete-record-4"));




}


