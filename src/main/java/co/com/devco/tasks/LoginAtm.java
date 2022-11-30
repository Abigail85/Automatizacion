package co.com.bancolombia.certification.atm.conac.tasks;

import co.com.bancolombia.certification.atm.conac.utils.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.logging.Logger;

import static co.com.bancolombia.certification.atm.conac.userinterfaces.Login.ATM_HOME_PAGE;
import static co.com.bancolombia.certification.atm.conac.userinterfaces.Login.EMAIL_FIELD;
import static java.util.logging.Level.SEVERE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginAtm implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.url("https://canales-tradicionales-int-qa.apps.ambientesbc.com/cab-conac/#/cab-conac"),
                Hit.the(Keys.ENTER).into(ATM_HOME_PAGE),
                WaitUntil.the(EMAIL_FIELD, isVisible()));
        //Esperar.enSegundos(120);

    }


    public static LoginAtm atmLogs(){
        return Tasks.instrumented(LoginAtm.class);
    }
}
