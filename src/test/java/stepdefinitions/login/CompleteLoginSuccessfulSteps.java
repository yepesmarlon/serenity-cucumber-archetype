package stepdefinitions.login;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import models.login.LoginModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.login.LoginQuestions;
import task.login.CompleteLoginSuccessfulTask;
import utils.login.GetDataLoginTableUtils;
import utils.login.MaximizeWindowUtils;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class CompleteLoginSuccessfulSteps {

    @Given("^(.*) abre la página de SauceDemo$")
    //  metodo con diferenciacion de procedimiento
    // modificador de acceso | modificador de retorno | nombre | tipo de argumentos | llaves
    public void openPagesSauceDemo(String nameActor) {
        Actor actor = OnStage.theActorCalled(nameActor);
        actor.attemptsTo(
                Open.browserOn().thePageNamed("pages.saucedemo"),
                MaximizeWindowUtils.now()
        );
    }

    @When("^ingreso las credenciales válidas$")
    // metodo con diferenciacion de procedimientos
    // modificador de accceso | modificador de retorno | nombre | tipo de argumentos | llavews
    public void EnteredValidCredentials(DataTable dataTable) {
        LoginModel loginModel = GetDataLoginTableUtils.getLoginCredentials(dataTable);
        theActorInTheSpotlight().attemptsTo(
                new CompleteLoginSuccessfulTask(loginModel.getName(), loginModel.getPassword())
        );
    }

    @Then("^valido el ingreso exitoso$")
    // metodo con diferenciacion de procedimientos
    // modificador de acceso | modificador de retorno | nombre | tipo de argumentos | llaves
    public void validateSuccessfulIngres() {
        String title = "Swag Labs";
        String products = "Products";
        theActorInTheSpotlight().should(
                seeThat("el título de Swag Labs es:", LoginQuestions.textSwagLabs(), equalTo(title)),
                seeThat("el texto de Products es:", LoginQuestions.textProducts(), equalTo(products))
        );
    }
}
