package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.devco.userinterfaces.OriflameHomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuscaMenuPrincipal implements Task {


    public BuscaMenuPrincipal( ) {  }

    public static Performable laPalabra() {
        return instrumented(BuscaMenuPrincipal.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(ORIFLAME_HOME_PAGE),
                Click.on(MENU_PRINCIPAL),
                MoveMouse.to(SUB_MENU_A),
                Click.on(SUB_MENU_B),
                Click.on(PRIMER_ELEMENTO),
                Click.on(COMPRA_PRODUCTO),
                Click.on(VER_CARRO_COMPRAS),
                Click.on(VACIAR_CARRO),
                Click.on(CONFIRMAR)



        );
    }
}
