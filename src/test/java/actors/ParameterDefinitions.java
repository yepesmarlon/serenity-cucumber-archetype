package actors;

import io.cucumber.java.ParameterType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;

public class ParameterDefinitions {
    @ParameterType(".*")
    public Actor actor(String name) {
        return OnStage.theActorCalled(name);
    }
}
