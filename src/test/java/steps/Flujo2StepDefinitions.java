package steps;

import com.retoFinalSP.tasks.Flujo2Tasks.LoggWidgets_DatePicker;
import com.retoFinalSP.tasks.Flujo2Tasks.SelectDate;
import com.retoFinalSP.tasks.Flujo2Tasks.SelectDateAndTime;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class Flujo2StepDefinitions {

    @Before
    public void setup(){
        setTheStage(new OnlineCast());
    }


    @When("^Ingresar a la opcion Widgets->Date Picker$")
    public void ingresarALaOpcionWidgetsDatePicker() {
        theActorInTheSpotlight().attemptsTo((LoggWidgets_DatePicker.loggWidgetsDatePicker()));
    }

    @When("^seleccionar fecha en las opciones \\(Select Date y Date And Time\\)$")
    public void seleccionarFechaEnLasOpcionesSelectDateYDateAndTime() {
        theActorInTheSpotlight().attemptsTo(SelectDate.selectDate());
        theActorInTheSpotlight().attemptsTo(SelectDateAndTime.selectDate());

    }

    @Then("^Verificar que quede fecha seleccionada$")
    public void verificarQueQuedeFechaSeleccionada() {
    }
}
