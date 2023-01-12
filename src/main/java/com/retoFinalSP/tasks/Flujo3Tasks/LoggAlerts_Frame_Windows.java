package com.retoFinalSP.tasks.Flujo3Tasks;

import com.retoFinalSP.userInterfacesTargets.Flujo1TargetsUI.ElementsDemoqa;
import com.retoFinalSP.userInterfacesTargets.Flujo3TargetsUI.AlertsFrameWindowsDemoqa;
import com.retoFinalSP.userInterfacesTargets.HomePageDemoqa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class LoggAlerts_Frame_Windows implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(HomePageDemoqa.BTNALERTSFRAMEWINDOWS), Click.on(HomePageDemoqa.BTNALERTSFRAMEWINDOWS)
        ,Scroll.to(AlertsFrameWindowsDemoqa.BTNALERTS), Click.on(AlertsFrameWindowsDemoqa.BTNALERTS));
    }


    public static LoggAlerts_Frame_Windows loggAlerts_frame_windows(){
        return Tasks.instrumented(LoggAlerts_Frame_Windows.class);
    }
}