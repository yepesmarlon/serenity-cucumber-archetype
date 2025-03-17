package task.form;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import ui.form.HomeUI;

public class FormFunctionalityTask {

    // tarea performable
    public static Performable selectOptionForm() {
        return Task.where(
                "{0} selcciona la opción de formulario",
                Scroll.to(HomeUI.TEXT_OPTION_FORMS),
                Click.on(HomeUI.BUTTON_FORM)
        );
    }
}
