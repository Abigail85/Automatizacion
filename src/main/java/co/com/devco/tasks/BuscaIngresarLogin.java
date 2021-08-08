package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Open;
import static co.com.devco.userinterfaces.LineaDeVidaHomePage.LINEA_VIDA_HOME_PAGE;
import static co.com.devco.userinterfaces.LineaDeVidaHomePage.INGRESAR_LOGIN;
import static co.com.devco.userinterfaces.LineaDeVidaHomePage.INGRESAR_CORREO;
import static co.com.devco.userinterfaces.LineaDeVidaHomePage.DIGITAR_USUARIO;
import static co.com.devco.userinterfaces.LineaDeVidaHomePage.INGRESAR_PASSWORD;
import static co.com.devco.userinterfaces.LineaDeVidaHomePage.DIGITAR_PASSWORD;
import static co.com.devco.userinterfaces.LineaDeVidaHomePage.OPCION_INGRESAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuscaIngresarLogin implements Task {
     final  String palabra;

    public BuscaIngresarLogin(String palabra) { this.palabra = palabra; }

    public static Performable laPalabra(String palabra) {
        return instrumented(BuscaIngresarLogin.class, palabra);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(LINEA_VIDA_HOME_PAGE),
                Click.on(INGRESAR_LOGIN),
                MoveMouse.to(INGRESAR_CORREO),
                Enter.theValue(DIGITAR_USUARIO).into(INGRESAR_CORREO),
                MoveMouse.to(INGRESAR_PASSWORD),
                Enter.theValue(DIGITAR_PASSWORD).into(INGRESAR_PASSWORD),
                Click.on(OPCION_INGRESAR)


        );
    }
}
