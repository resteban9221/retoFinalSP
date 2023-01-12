package com.retoFinalSP.tasks.Flujo3Tasks;

import com.retoFinalSP.userInterfacesTargets.Flujo3TargetsUI.Alerts;
import com.retoFinalSP.userInterfacesTargets.Flujo3TargetsUI.AlertsFrameWindowsDemoqa;
import com.retoFinalSP.userInterfacesTargets.HomePageDemoqa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class OpenAndCloseInputNameButton implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        //Scroll.to(...)- no interferir con publicidad
        actor.attemptsTo(Scroll.to(Alerts.BTNPROMTINPUTNAME),Click.on(Alerts.BTNPROMTINPUTNAME));
    }

    public static OpenAndCloseInputNameButton openAndCloseInputNameButton(){
        return Tasks.instrumented(OpenAndCloseInputNameButton.class);
    }
}
