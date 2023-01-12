package com.retoFinalSP.userInterfacesTargets.Flujo2TargetsUI;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demoqa.com/")
public class WidgetsDemoqa extends PageObject {
    //vista de https://demoqa.com/widgets, Target BTNDATEPICKER para ingresar a https://demoqa.com/date-picker
    public static final Target BTNDATEPICKER=Target.the("btn Date Picker ").located(By.xpath("(//li[@id='item-2'])[3]"));
}
