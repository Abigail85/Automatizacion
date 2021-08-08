package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AutomationPracticeHomeResultadosPage {
    public static final String PRIMER_RESULTADO ="http://automationpractice.com/index.php";
    public static final Target RESULTADOS_BUSQUEDA = Target.the("resultados de busqueda").located(By.xpath("//div[@id='center_column']//img[contains(@title, 'Blouse')]"));
}

