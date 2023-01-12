package com.retoFinalSP.tasks.Flujo1Tasks;

import com.retoFinalSP.userInterfacesTargets.Flujo1TargetsUI.WebtablesDemoqa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class AggNewRegist implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(WebtablesDemoqa.BTNADD),
                Enter.theValue("Esteban").into(WebtablesDemoqa.INPUTFIRSTNAME),
                Enter.theValue("Castaneda").into(WebtablesDemoqa.INPUT_LASTNAME),
                Enter.theValue("esteban@sophos.com").into(WebtablesDemoqa.INPUTEMAIL),
                Enter.theValue("30").into(WebtablesDemoqa.INPUTAGE),
                Enter.theValue("2500000").into(WebtablesDemoqa.INPUTSALARY),
                Enter.theValue("Medellin").into(WebtablesDemoqa.INPUTDEPARTMENT),
                Click.on(WebtablesDemoqa.BTNSUBMIT));
        //ejemplo git
    }

    public static AggNewRegist aggNewRegist(){
        return Tasks.instrumented(AggNewRegist.class);
    }
}
