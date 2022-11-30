package co.com.bancolombia.certification.atm.conac.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Login {

    public static final Target EMAIL_FIELD = Target.the("email field login")
            .located(By.id("i0116"));
    public static final Target PASSWORD_FIELD = Target.the("password field login")
            .located(By.id("i0118"));
    public static final Target NEXT_FIELD = Target.the("button next field")
            .located(By.id("idSIButton9"));
    public static final String ATM_HOME_PAGE = "https://canales-tradicionales-int-qa.apps.ambientesbc.com/cab-conac/#/cab-conac";


}
