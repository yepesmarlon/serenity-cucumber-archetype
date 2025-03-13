package questions;

import net.serenitybdd.screenplay.Question;
import ui.HomeUI;

public class HomeQuestions {

    public static Question<String> textSignIn() {
        return actor -> HomeUI.TEXT_SIGN_IN.resolveFor(actor).getText().trim();
    }
}
