package com.retoFinalSP.userInterfacesTargets.Flujo1TargetsUI;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://demoqa.com/")
public class WebtablesDemoqa extends PageObject {
    //vista de https://demoqa.com/webtables, al hacer click en en el Target BTNADD se empieza a llenar el formulario
    public static final Target BTNADD= Target.the("btn Agregar registro").located(By.id("addNewRecordButton"));
    public static final Target INPUTFIRSTNAME= Target.the("input ingresar nombre").located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("input ingresar apellido").located(By.id("lastName"));
    public static final Target INPUTEMAIL= Target.the("input ingresar correo").located(By.id("userEmail"));
    public static final Target INPUTAGE= Target.the("input ingresar edad").located(By.id("age"));
    public static final Target INPUTSALARY= Target.the("input ingresar salario").located(By.id("salary"));
    public static final Target INPUTDEPARTMENT= Target.the("input ingresar oficina").located(By.id("department"));
    public static final Target BTNSUBMIT= Target.the("btn enviar").located(By.id("submit"));
    public static final Target BTNDELETE= Target.the("btn eliminar un resgistro").located(By.id("delete-record-1"));
    public static final Target SCROLL= Target.the("bajar").located(By.xpath("(//li[@id='item-0'])[1]"));

}
