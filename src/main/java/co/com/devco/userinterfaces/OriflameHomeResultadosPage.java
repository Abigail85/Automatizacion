package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OriflameHomeResultadosPage {
    public static final String RESULTADOS_BUSQUEDA = "https://co.oriflame.com/shopping/basket";
    public static final Target PRIMER_RESULTADO = Target.the("Primer resultado de busqueda").located(By.xpath("//div[@id='search']//div[@class='g' and position()=1]//link"));
}
