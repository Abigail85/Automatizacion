package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.devco.userinterfaces.AutomationPracticeHomePage.AUTOMATION_PRACTICE_HOME_PAGE;
import static co.com.devco.userinterfaces.AutomationPracticeHomePage.MENU_PRINCIPAL;
import static co.com.devco.userinterfaces.AutomationPracticeHomePage.SUB_MENU;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchHome implements Task {
     final  String palabra;

    public SearchHome(String palabra) { this.palabra = palabra; }

    public static Performable laPalabra(String palabra) {
        return instrumented(SearchHome.class, palabra);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(AUTOMATION_PRACTICE_HOME_PAGE),
                MoveMouse.to(MENU_PRINCIPAL),
                Click.on(SUB_MENU)


        );
    }
}
