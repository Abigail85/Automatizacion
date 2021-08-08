package co.com.devco.stepdefinitions;

import co.com.devco.tasks.BuscaIngresarLogin;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.devco.userinterfaces.LineaVidaResultadosPage.RESULTADOS_BUSQUEDA;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BuscarIngresarStepDefinitions {

    @Cuando("un usuario {string} busca {string} en linea-de-vida")
    public void unUsuarioBuscaEnLineaDeVida(String Actor, String palabra) {
        theActorCalled(Actor).attemptsTo(
                BuscaIngresarLogin.laPalabra(palabra)
        );
    }

    @Entonces("debe ver como resultado un menu")
    public void debeVerComoResultadoUnMenu() {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(RESULTADOS_BUSQUEDA).hasSize(1)
        );
    }
}
