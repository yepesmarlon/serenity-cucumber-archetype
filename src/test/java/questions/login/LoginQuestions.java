package questions.login;

import net.serenitybdd.screenplay.Question;
import ui.login.LoginUI;

public class LoginQuestions {

    //                        Questions de la funcionalidad de login                        //

    // ********** visual de visual de ingreso exitoso ********** //

    public static Question<String> textSwagLabs() {
        return actor -> LoginUI.TEXT_SWAG_LABS.resolveFor(actor).getText().trim();
    }

    public static Question<String> textProducts() {
        return actor -> LoginUI.TEXT_PRODUCTS.resolveFor(actor).getText().trim();
    }
}
