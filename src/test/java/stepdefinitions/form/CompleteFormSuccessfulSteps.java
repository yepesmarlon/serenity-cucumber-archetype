package stepdefinitions.form;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import task.form.FormFunctionalityTask;
import utils.login.MaximizeWindowUtils;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CompleteFormSuccessfulSteps {

    @Given("{actor} abre la página de LetCode")
    // metodo con diferenciacion de procedimientos
    // modificador de acceso|modificador de retorno|nombre|tipo de argumentos|llaves
    public void openPagesFormLetCode(Actor actor) {
        actor.attemptsTo(
                Open.browserOn().thePageNamed("pages.letcode"),
                MaximizeWindowUtils.now()
        );
    }

    @When("^selecciona la opción del formulario$")
    // metodo con diferenciacion de procedimientos
    // modificador de acceso|modificador de retorno|nombre|tipo de argumentos|llaves
    public void selectOptionForm() {
        theActorInTheSpotlight().attemptsTo(
                FormFunctionalityTask.selectOptionForm()
        );
    }

    @And("^ingresa los datos del formulario$")
    // metodo de diferenciacion de procedimientos
    // modificador de acceso|modificador de retorno|nombre|tipo de argumentos|llaves
    public void ingressDataForm(DataTable dataTable) {
        List<Map<String, String>> accountDataList = dataTable.asMaps();
        for (Map<String, String> accountData : accountDataList) {
            String expectField = accountData.get("Campos del formulario");
            String expectValue = accountData.get("Información del formulario");
            
//            if () {
//
//            } else if () {
//
//            } else if () {
//
//            } else if () {
//
//            } else if () {
//
//            } else if () {
//
//            } else if () {
//
//            } else if () {
//
//            } else if () {
//
//            } else if () {
//
//            } else if () {
//
//            } else if () {
//
//            } else if () {
//
//            } else if () {
//
//            }
        }
    }

    @Then("^se visualiza un mensaje de confirmación exitoso$")
    // metodo de diferenciacion de procedimientos
    // modificadfor de acceso|modificador de retorno|nombre|tipo de argumentos|llaves
    public void visualizeMessageConfirmationSuccessful() {

    }
}
