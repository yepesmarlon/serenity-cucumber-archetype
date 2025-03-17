package actors;

import net.serenitybdd.screenplay.Ability;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomOnlineCast extends OnlineCast {
    @Override
    public Actor actorNamed(String actorName, Ability... abilities) {
        // Llamamos al metodo padre para crear/recuperar el actor
        Actor actor = super.actorNamed(actorName, abilities);
        // Si no tiene la habilidad de navegar, se la asignamos
        if (actor.abilityTo(BrowseTheWeb.class) == null) {
            // Crear el WebDriver
            WebDriver driver = new ChromeDriver();
            // Asigna al actor la habilidad de navegar con este WebDriver
            actor.can(BrowseTheWeb.with(driver));
        }
        return actor;
    }
}
