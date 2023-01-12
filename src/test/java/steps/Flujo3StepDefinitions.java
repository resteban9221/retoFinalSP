package steps;

import com.retoFinalSP.tasks.Flujo1Tasks.AggNewRegist;
import com.retoFinalSP.tasks.Flujo1Tasks.DeleteRegistr;
import com.retoFinalSP.tasks.Flujo1Tasks.LoggElements_Webtables;
import com.retoFinalSP.tasks.Flujo2Tasks.LoggWidgets_DatePicker;
import com.retoFinalSP.tasks.Flujo3Tasks.*;
import com.retoFinalSP.userInterfacesTargets.HomePageDemoqa;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;


public class Flujo3StepDefinitions {

    @Before
    public void setup(){
        setTheStage(new OnlineCast());
    }

    @When("^Ingresar a la opcion Alerts,Frame & Windows->Alerts$")

    public void ingresarALaOpcionAlertsFrameWindowsAlerts() {
        theActorInTheSpotlight().attemptsTo((LoggAlerts_Frame_Windows.loggAlerts_frame_windows()));
    }

    @When("^Activar y cerrar (\\d+) tipos de ventanas emergentes$")
    public void activarYCerrarTiposDeVentanasEmergentes(int arg1) {
    }

    @When("^Activar y cerrar alertButton$")
    public void activarYCerrarAlertButton() {
        theActorInTheSpotlight().attemptsTo((OpenAndCloseAlertButton.openAndCloseAlertButton()));
    }

    @When("^Activar y cerrar timerAlertButton$")
    public void activarYCerrarTimerAlertButton() {
        theActorInTheSpotlight().attemptsTo((OpenAndCloseTimeAlertButton.openAndCloseTimeAlertButton()));
    }

    @When("^Activar y cerrar confirmButton$")
    public void activarYCerrarConfirmButton() {
        theActorInTheSpotlight().attemptsTo((OpenAndCloseConfirmButton.openAndCloseConfirmButton()));
    }

    @When("^Activar y cerrar promtButtonInputName$")
    public void activarYCerrarPromtButtonInputName() {
        theActorInTheSpotlight().attemptsTo((OpenAndCloseInputNameButton.openAndCloseInputNameButton()));
    }

    @When("^Verificar que en la ultima opcion aparezca el nombre$")
    public void verificarQueEnLaUltimaOpcionAparezcaElNombre() {
    }

    @Then("^Ventanas emergentes todas cerradas$")
    public void ventanasEmergentesTodasCerradas() {
    }
}
