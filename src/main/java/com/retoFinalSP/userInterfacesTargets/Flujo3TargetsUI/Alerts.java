package com.retoFinalSP.userInterfacesTargets.Flujo3TargetsUI;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demoqa.com/")
public class Alerts extends PageObject {
    // vista de https://demoqa.com/alerts, Targets para interactuar con las alertas
    public static final Target BTNALERT= Target.the("btn alertButton").located(By.id("alertButton"));
    public static final Target BTNTIMEALERT= Target.the("btn timerAlertButton").located(By.id("timerAlertButton"));
    public static final Target BTNCONFIRM= Target.the("btn confirmButton").located(By.id("confirmButton"));
    public static final Target BTNPROMTINPUTNAME= Target.the("btn promtButton Input name").located(By.id("promtButton"));
}

