package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OriflameHomePage {
	public static final String ORIFLAME_HOME_PAGE = "https://co.oriflame.com/";
	public static final Target MENU_PRINCIPAL = Target.the("abre la opcion CATÁLOGO & PRODUCTOS").located(By.xpath("//div[@id='menu-main']//a[contains(@class, 'n-mainmenu-link n-mainmenu-shop-link has-submenu')]"));
	public static final Target SUB_MENU_A= Target.the("abre el submenu perfumes").located(By.xpath("//div[@id='menu-main']//li[contains(@class, 'n-submenu-item category-color-fragrance')]"));//div[@id='menu-main']/nav/ul/li[1]/div/div/ul[1]/li[5]/a
	public static final String DIGITAR_USUARI= "Admin@lineadevida.com" ;
	public static final Target SUB_MENU_B= Target.the("le da click a la opcion Mujer").located(By.xpath("//div[@id='menu-main']//a[text()='Mujer']"));
	public static final String DIGITAR_PASSWORD = "123456";
	public static final Target PRIMER_ELEMENTO = Target.the("le da click al primer elemento").located(By.xpath("//div[@id='main']//img[contains(@class, 'image lazyloaded')]"));
	public static final Target COMPRA_PRODUCTO = Target.the("le da click al primer elemento").located(By.xpath("//div[@id='quick-buy-window']//input[contains(@class, 'k-button add-to-basket es-co')]"));//div[contains(@class, 'n-header-item n-header-basket js-basket')]//span
	public static final Target VACIAR_CARRO = Target.the("le da click al primer elemento").located(By.xpath("//*[@id='shopping-bag-page']/div[2]/div[3]/ul/li/button"));//a[contains(@class, 'n-header-item-link js-basket-link')]
	public static final Target VER_CARRO_COMPRAS = Target.the("le da click al primer elemento").located(By.xpath("//span[text()='Carro de Compras']/.."));//a[text()='Ver el Carro de Compras']"
	public static final Target CONFIRMAR = Target.the("le da click al primer elemento").located(By.xpath("//button[@id='control-f780c81c-fdae-43c5-a3f6-94c7b87abf06']"));
}
