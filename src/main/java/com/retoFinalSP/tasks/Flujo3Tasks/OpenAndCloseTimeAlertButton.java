package com.retoFinalSP.tasks.Flujo3Tasks;

import com.retoFinalSP.userInterfacesTargets.Flujo3TargetsUI.Alerts;
import com.retoFinalSP.userInterfacesTargets.Flujo3TargetsUI.AlertsFrameWindowsDemoqa;
import net.bytebuddy.asm.Advice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.questions.page.AlertTextQuestion;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.remote.server.handler.AcceptAlert;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class OpenAndCloseTimeAlertButton implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Alerts.BTNTIMEALERT));
    }

    public static OpenAndCloseTimeAlertButton openAndCloseTimeAlertButton(){
        return Tasks.instrumented(OpenAndCloseTimeAlertButton.class);
    }
}
//actor.attemptsTo(WaitUntil.the(TEXTO_SALUDO_USUARIO, isPresent()).forNoMoreThan(15).seconds());