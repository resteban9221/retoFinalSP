package com.retoFinalSP.tasks.Flujo3Tasks;

import com.retoFinalSP.userInterfacesTargets.Flujo1TargetsUI.WebtablesDemoqa;
import com.retoFinalSP.userInterfacesTargets.Flujo3TargetsUI.Alerts;
import com.retoFinalSP.userInterfacesTargets.Flujo3TargetsUI.AlertsFrameWindowsDemoqa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.Wait;

import java.sql.Time;
import java.time.Duration;

public class OpenAndCloseAlertButton implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Alerts.BTNALERT));
    }

    public static OpenAndCloseAlertButton openAndCloseAlertButton(){
        return Tasks.instrumented(OpenAndCloseAlertButton.class);
    }
}
