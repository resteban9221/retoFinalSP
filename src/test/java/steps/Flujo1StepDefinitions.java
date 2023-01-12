package steps;

import com.retoFinalSP.tasks.Flujo1Tasks.AggNewRegist;
import com.retoFinalSP.tasks.Flujo1Tasks.DeleteRegistr;
import com.retoFinalSP.tasks.Flujo1Tasks.LoggElements_Webtables;
import com.retoFinalSP.userInterfacesTargets.HomePageDemoqa;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.actors.OnStage.*;


public class Flujo1StepDefinitions {

    @Before
    public void setup(){
        setTheStage(new OnlineCast());
    }


    @Given("^Ir a la pagina https://demoqa\\.com/$")
    public void irALaPaginaHttpsDemoqaCom() {
        theActorCalled("EstebanAutomatizador").wasAbleTo(Open.browserOn(new HomePageDemoqa()));
    }

    @When("^Ingresar a la opcion elements->web tables$")
    public void ingresarALaOpcionElementsWebTables() {
        theActorInTheSpotlight().attemptsTo((LoggElements_Webtables.logElementsWebtables()));
    }

    @When("^Agregar un nuevo registro$")
    public void agregarUnNuevoRegistro() {
        theActorInTheSpotlight().attemptsTo((AggNewRegist.aggNewRegist()));
    }

    @When("^Eliminar cualquier registro que este en la tabla,$")
    public void eliminarCualquierRegistroQueEsteEnLaTabla() {
        theActorInTheSpotlight().attemptsTo((DeleteRegistr.deleteRegistr()));
    }

    @Then("^Verificar que quede ingresado el registro$")
    public void verificarQueQuedeIngresadoElRegistro() {
    }
}
