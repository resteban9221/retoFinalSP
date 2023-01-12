package com.retoFinalSP.tasks.Flujo2Tasks;

import com.retoFinalSP.userInterfacesTargets.Flujo2TargetsUI.DatePickerDemoqa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class SelectDate implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(DatePickerDemoqa.INPUTSELECTDATE),
                Click.on(DatePickerDemoqa.LISTMONTH), SelectFromOptions.byValue("5").from(DatePickerDemoqa.LISTMONTH),
                Click.on(DatePickerDemoqa.SELECTYEAR), SelectFromOptions.byVisibleText("1992").from(DatePickerDemoqa.SELECTYEAR),
                Click.on(DatePickerDemoqa.SELECTDAY));

    }

    public static SelectDate selectDate(){
        return Tasks.instrumented(SelectDate.class);
    }
}
