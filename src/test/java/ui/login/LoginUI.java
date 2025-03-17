package ui.login;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUI {

    //                        Localizadores de la funcionalidad de login                        //

    // ********** visual de ingreso de credenciales ********** //

    public static final Target FIELD_USER_NAME = Target.the("Campo de usename")
            .located(By.id("user-name"));

    public static final Target FIELD_PASSWORD = Target.the("Campo de password")
            .located(By.id("password"));

    public static final Target BUTTON_CONTINUE = Target.the("Botón de Login")
            .located(By.id("login-button"));

    // ********** visual de ingreso exitoso ********** //

    public static final Target TEXT_SWAG_LABS = Target.the("Texto de Swag Labs")
            .located(By.xpath("//div[contains(text(),'Swag Labs')]"));

    public static final Target TEXT_PRODUCTS = Target.the("Texto de Products")
            .located(By.xpath("//span[contains(text(),'Products')]"));
}
