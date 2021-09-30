package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AutomationPracticeHomePage {
	public static final String AUTOMATION_PRACTICE_HOME_PAGE = "http://automationpractice.com/index.php";
	public static final Target A_MENU_PRINCIPAL = Target.the("menu {0}").locatedBy("//a[text()='{0}']");
	public static final Target A_SUB_MENU = Target.the("submenu {0}").locatedBy("//a[text()='{0}']");

}
