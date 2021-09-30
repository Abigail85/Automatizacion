package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.devco.userinterfaces.AutomationPracticeHomePage.AUTOMATION_PRACTICE_HOME_PAGE;
import static co.com.devco.userinterfaces.AutomationPracticeHomePage.A_MENU_PRINCIPAL;
import static co.com.devco.userinterfaces.AutomationPracticeHomePage.A_SUB_MENU;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NavegarPorElMenu implements Task {
    String menu;
    String submenu;

    public NavegarPorElMenu(String menu,String submenu) {
        this.menu = menu;
        this.submenu= submenu;
    }

    public static Performable hacia(String menu , String submenu) {
        return instrumented(NavegarPorElMenu.class, menu,submenu);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(AUTOMATION_PRACTICE_HOME_PAGE),
                MoveMouse.to(A_MENU_PRINCIPAL.of(menu)),
                Click.on(A_SUB_MENU.of(submenu))


        );
    }
}
