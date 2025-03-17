package utils.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class MaximizeWindowUtils implements Task {

    // metodo estatico para usar sin necesida de intanciar
    public static MaximizeWindowUtils now() {
        return instrumented(MaximizeWindowUtils.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        driver.manage().window().maximize();
    }
}
