package com.retoFinalSP.tasks.Flujo3Tasks;

import com.retoFinalSP.userInterfacesTargets.Flujo3TargetsUI.Alerts;
import com.retoFinalSP.userInterfacesTargets.Flujo3TargetsUI.AlertsFrameWindowsDemoqa;
import io.appium.java_client.pagefactory.Widget;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.questions.AcceptsHints;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.AcceptAlert;

import java.awt.*;
import java.awt.event.KeyEvent;

import static net.serenitybdd.screenplay.actions.Switch.toAlert;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class OpenAndCloseConfirmButton implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(Alerts.BTNCONFIRM));
    }

    public static OpenAndCloseConfirmButton openAndCloseConfirmButton(){
        return Tasks.instrumented(OpenAndCloseConfirmButton.class);
    }
}
//se intenta enviar la tecla "ENTER" para aceptar la ventana emergente

//Intento con hit y sendkeys
//Hit.the(Keys.ENTER).into(AlertsFrameWindowsDemoqa.BTNCONFIRM)
//SendKeys(Keys.ENTER)
//AcceptAlert()
//getDriver().switchTo().alert().accept()


//Intento con JAVA.awt robot

    //WebDriver driver = new ChromeDriver();
/*  try{
            Robot robot =new Robot();

            Thread.currentThread().sleep(3000);

            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

        }catch (AWTException | InterruptedException e){
            e.printStackTrace();
        }*/
