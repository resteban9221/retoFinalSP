package com.retoFinalSP.tasks.Flujo2Tasks;

import com.retoFinalSP.userInterfacesTargets.Flujo2TargetsUI.DatePickerDemoqa;
import com.retoFinalSP.userInterfacesTargets.Flujo2TargetsUI.DateTimePickerDemoqa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class SelectDateAndTime implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(DateTimePickerDemoqa.INPUTSELECTDATETIME),
                Click.on(DateTimePickerDemoqa.LISTMONTH), Click.on(DateTimePickerDemoqa.SELECTMONTH),
                Click.on(DateTimePickerDemoqa.LISTYEAR), Click.on(DateTimePickerDemoqa.SELECTYEAR),
                Click.on(DateTimePickerDemoqa.SELECTDAY), Click.on(DateTimePickerDemoqa.SELECTTIME));

    }

    public static SelectDateAndTime selectDate(){
        return Tasks.instrumented(SelectDateAndTime.class);
    }
}
