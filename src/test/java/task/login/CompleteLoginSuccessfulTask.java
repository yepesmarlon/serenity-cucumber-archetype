package task.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import ui.login.LoginUI;


import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CompleteLoginSuccessfulTask implements Task {

    // atributos de inastancia inmutables
    private final String name;
    private final String password;

    // constructor
    public CompleteLoginSuccessfulTask(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of(name).into(LoginUI.FIELD_USER_NAME),
                SendKeys.of(password).into(LoginUI.FIELD_PASSWORD),
                Click.on(LoginUI.BUTTON_CONTINUE),
                WaitUntil.the(LoginUI.TEXT_PRODUCTS, isVisible()).forNoMoreThan(5).seconds()
        );
    }
}
