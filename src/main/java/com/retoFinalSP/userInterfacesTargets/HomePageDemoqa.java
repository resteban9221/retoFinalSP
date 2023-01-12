package com.retoFinalSP.userInterfacesTargets;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demoqa.com/")
public class HomePageDemoqa extends PageObject {
    //página principal de Demoqa, cada Target es para ingresar a las vistas Elements, Widgets y Alerts,Frame Y Windows, respectivamente.
    public static final Target BTNELEMENTS = Target.the("Opcion Elements").located(By.xpath("//*[h5='Elements']"));
    public static final Target BTNWIDGETS = Target.the("Opcion Widgets").located(By.xpath("//*[h5='Widgets']"));
    public static final Target BTNALERTSFRAMEWINDOWS = Target.the("Opcion Alerts,Frame Y Windows").located(By.xpath("//*[h5='Alerts, Frame & Windows']"));
}