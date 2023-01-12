package com.retoFinalSP.tasks.Flujo1Tasks;

import com.retoFinalSP.userInterfacesTargets.Flujo1TargetsUI.WebtablesDemoqa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class DeleteRegistr implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(WebtablesDemoqa.BTNDELETE),
                Scroll.to(WebtablesDemoqa.SCROLL));
        //Target SCROLL para visualizar que quedó un nuevo registro (publicidad no deja ver bien)
    }

    public static DeleteRegistr deleteRegistr(){
        return Tasks.instrumented(DeleteRegistr.class);
    }
}
