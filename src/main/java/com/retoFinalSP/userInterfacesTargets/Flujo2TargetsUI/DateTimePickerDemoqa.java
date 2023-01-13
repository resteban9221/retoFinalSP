package com.retoFinalSP.userInterfacesTargets.Flujo2TargetsUI;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://demoqa.com/")
public class DateTimePickerDemoqa extends PageObject {
    //vista de https://demoqa.com/date-picker, Targets para seleccionar  fecha y hora (Date And Time input)
    public static final Target INPUTSELECTDATETIME= Target.the("input fecha y hora").located(By.id("dateAndTimePickerInput"));
    public static final Target LISTMONTH= Target.the("lista de meses").located(By.xpath("//span[@class='react-datepicker__month-read-view--down-arrow']"));
    public static final Target SELECTMONTH= Target.the("Seleccionar mes").located(By.xpath("(//div[@class='react-datepicker__month-option'])[5]"));
    public static final Target LISTYEAR= Target.the("lista de años").located(By.xpath("//span[@class='react-datepicker__year-read-view--down-arrow']"));
    public static final Target SELECTYEAR= Target.the("Seleccionar año").located(By.xpath("(//div[@class='react-datepicker__year-option'])[6]"));
    public static final Target SELECTDAY= Target.the("Seleccionar día").located(By.xpath("//div[@aria-label='Choose Saturday, June 1st, 2024']"));
    public static final Target SELECTTIME= Target.the("Seleccionar hora").located(By.xpath("(//li[@class='react-datepicker__time-list-item '])[58]"));

}
