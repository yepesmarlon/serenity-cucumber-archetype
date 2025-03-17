package ui.form;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeUI {

    //                        Localizadores de la funcionalidad de formulario                        //

    // ********** Visual de home ********** //

    public static final Target TEXT_OPTION_FORMS = Target.the("Texto de la opción formularios")
            .located(By.xpath("//p[contains(text(),'Forms')]"));

    public static final Target BUTTON_FORM = Target.the("Botón de All in One")
            .located(By.linkText("All in One"));

    // ********** Funcionalidad de formulario ********** //

    public static final Target TEXT_FIRST_NAME = Target.the("Texto de First Name")
            .located(By.xpath("//label[contains(text(),'First Name')]"));

    public static final Target TEXT_LAST_NAME = Target.the("Texto de Last Name")
            .located(By.xpath("//label[contains(text(),'Last Name')]"));

    public static final Target TEXT_EMAIL = Target.the("Texto de Email")
            .located(By.xpath("//label[contains(text(),'Email')]"));

    public static final Target TEXT_COUNTRY_CODE = Target.the("Texto de Country Code")
            .located(By.xpath("//label[contains(text(),'Country code')]"));
}
