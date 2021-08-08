package co.com.devco.stepdefinitions;

import co.com.devco.tasks.BuscaMenuPrincipal;
import co.com.devco.tasks.BuscarEnGoogle;
import co.com.devco.userinterfaces.LineaVidaResultadosPage;
import co.com.devco.userinterfaces.OriflameHomeResultadosPage;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.devco.userinterfaces.GoogleResultadosPage.PRIMER_RESULTADO;
import static co.com.devco.userinterfaces.OriflameHomeResultadosPage.RESULTADOS_BUSQUEDA;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SearchWitchFilterStepDefinitions {

    @Cuando("un usuario {string} busca {string} en oriflame")
    public void unUsuarioBuscaEnOriflame(String nombreActor, String palabra) {
        theActorCalled(nombreActor).attemptsTo(
                BuscaMenuPrincipal.laPalabra(palabra)

        );
    }

        @Entonces("debe ver como resultado {string}")
        public void debeVerComoResultado(String resultado) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(RESULTADOS_BUSQUEDA).hasSize(1)
        );
    }
}
