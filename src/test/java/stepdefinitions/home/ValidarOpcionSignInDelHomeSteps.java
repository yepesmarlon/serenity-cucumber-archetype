package stepdefinitions.home;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.core.annotations.events.BeforeScenario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.HomeQuestions;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class ValidarOpcionSignInDelHomeSteps {

    @Given("^(.*) abre la URL de My Shop$")
    public void abrirLaUrlMyShop(String actorName) {
        Actor actor = OnStage.theActorCalled(actorName);
        actor.attemptsTo(
                Open.browserOn().thePageNamed("pages.automationpractice")
        );
    }

    @Then("^valida el texto de Sign in$")
    public void validarElTextoDeSignIn(DataTable dataTable) {
        List<Map<String, String>> accountDataList = dataTable.asMaps();
        for (Map<String, String> accountData : accountDataList) {
            String expectText = accountData.get("Texto de Sign in");
            theActorInTheSpotlight().should(
                    seeThat("el texto de Sing In es:", HomeQuestions.textSignIn(),
                            equalTo(expectText))
            );
        }
    }
}
