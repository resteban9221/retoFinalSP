package com.retoFinalSP.userInterfacesTargets.Flujo2TargetsUI;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://demoqa.com/")
public class DatePickerDemoqa extends PageObject {
    //vista de https://demoqa.com/date-picker, Targets para seleccionar solo fecha (Select Date input)
    public static final Target INPUTSELECTDATE= Target.the("input fecha").located(By.id("datePickerMonthYearInput"));
    public static final Target LISTMONTH= Target.the("lista de meses").located(By.xpath("//select[@class='react-datepicker__month-select']"));
    public static final Target SELECTYEAR= Target.the("Seleccionar año").located(By.xpath("//select[@class='react-datepicker__year-select']"));
    public static final Target SELECTDAY= Target.the("Seleccionar día").located(By.xpath("(//div[@class='react-datepicker__week']//descendant::*[1])[4]"));
}
