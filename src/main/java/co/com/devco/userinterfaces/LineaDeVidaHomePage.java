package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LineaDeVidaHomePage {
	public static final String LINEA_VIDA_HOME_PAGE = "http://localhost:8888/proyecto-linea-de-vida/proyecto-linea-de-vida/public/";
	public static final Target INGRESAR_LOGIN = Target.the("abre la opcion Ingresar").located(By.xpath("//div[@id='content']//a[text()='Ingresar']"));
	public static final Target INGRESAR_CORREO= Target.the("abre la opcion de ingresar el correo").located(By.xpath("//input[@id='email']"));
	public static final String DIGITAR_USUARIO= "Admin@lineadevida.com" ;
	public static final Target INGRESAR_PASSWORD= Target.the("Mueve el mouse a la opcion de ingresar la contraseña").located(By.xpath("//input[@id='password']"));
	public static final String DIGITAR_PASSWORD = "123456";
	public static final Target OPCION_INGRESAR = Target.the("le da click a la opcion Ingresar").located(By.xpath("//button[contains(@class, 'btn btn-primary btn-user btn-block')]"));
}
