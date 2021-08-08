package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AutomationPracticeHomePage {
	public static final String AUTOMATION_PRACTICE_HOME_PAGE = "http://automationpractice.com/index.php";
	public static final Target MENU_PRINCIPAL = Target.the("abre el menu Mujeres").located(By.xpath("//div[@id='block_top_menu']//a[contains(@title, 'Women')]"));
	public static final Target SUB_MENU= Target.the(" ingresa al submenu Blusas").located(By.xpath("//div[@id='block_top_menu']//a[text()='Blouses']"));

}
