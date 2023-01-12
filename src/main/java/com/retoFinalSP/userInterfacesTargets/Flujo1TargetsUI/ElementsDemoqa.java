package com.retoFinalSP.userInterfacesTargets.Flujo1TargetsUI;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demoqa.com/")
public class ElementsDemoqa extends PageObject {
    //vista de https://demoqa.com/elements, Target BTNWEBTABLES para ingresar a https://demoqa.com/webtables
    public static final Target BTNWEBTABLES=Target.the("btn webtables").located(By.xpath("(//li[@id='item-3'])[1]"));
}
