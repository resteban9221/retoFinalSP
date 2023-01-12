package com.retoFinalSP.tasks.Flujo1Tasks;

import com.retoFinalSP.userInterfacesTargets.Flujo1TargetsUI.ElementsDemoqa;
import com.retoFinalSP.userInterfacesTargets.HomePageDemoqa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class LoggElements_Webtables implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(HomePageDemoqa.BTNELEMENTS), Click.on(HomePageDemoqa.BTNELEMENTS)
        ,Scroll.to(ElementsDemoqa.BTNWEBTABLES), Click.on(ElementsDemoqa.BTNWEBTABLES));
    }


    public static LoggElements_Webtables logElementsWebtables(){
        return Tasks.instrumented(LoggElements_Webtables.class);
    }
}