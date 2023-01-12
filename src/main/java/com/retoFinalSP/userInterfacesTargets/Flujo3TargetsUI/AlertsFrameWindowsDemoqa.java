package com.retoFinalSP.userInterfacesTargets.Flujo3TargetsUI;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demoqa.com/")
public class AlertsFrameWindowsDemoqa extends PageObject {
    //vista de https://demoqa.com/alertsWindows Target BTNALERTS para ingresar a https://demoqa.com/alerts
    public static final Target BTNALERTS=Target.the("btn ingresar a Alerts").located(By.xpath("(//li[@id='item-1'])[2]"));

}

