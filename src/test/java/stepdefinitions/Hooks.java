package stepdefinitions;

import actors.CustomOnlineCast;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;

public class Hooks {
    @Before
    public void setTheStage() {
        // Inicializa el escenario
        OnStage.setTheStage(new CustomOnlineCast());
    }
}
