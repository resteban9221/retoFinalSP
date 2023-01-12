package com.retoFinalSP.tasks.Flujo2Tasks;

import com.retoFinalSP.userInterfacesTargets.HomePageDemoqa;
import com.retoFinalSP.userInterfacesTargets.Flujo2TargetsUI.WidgetsDemoqa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class LoggWidgets_DatePicker implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(HomePageDemoqa.BTNWIDGETS), Click.on(HomePageDemoqa.BTNWIDGETS)
        ,Scroll.to(WidgetsDemoqa.BTNDATEPICKER), Click.on(WidgetsDemoqa.BTNDATEPICKER));
    }


    public static LoggWidgets_DatePicker loggWidgetsDatePicker(){
        return Tasks.instrumented(LoggWidgets_DatePicker.class);
    }
}