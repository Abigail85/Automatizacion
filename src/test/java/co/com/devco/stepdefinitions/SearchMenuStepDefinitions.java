package co.com.devco.stepdefinitions;

import co.com.devco.tasks.SearchHome;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.devco.userinterfaces.AutomationPracticeHomeResultadosPage.PRIMER_RESULTADO;
import static co.com.devco.userinterfaces.AutomationPracticeHomeResultadosPage.RESULTADOS_BUSQUEDA;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SearchMenuStepDefinitions {

    @Cuando("un usuario {string} busca {string} en automationpractice")
    public void unUsuarioBuscaEnAutomationpractice(String nombreActor, String palabra) {
        theActorCalled(nombreActor).attemptsTo(
                SearchHome.laPalabra(palabra)
        );
    }

    @Entonces("debe ver {int} resultado")
    public void debeverResultado(Integer cantidadResultadosEsperados) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.thatTheSetOf(RESULTADOS_BUSQUEDA).hasSize(cantidadResultadosEsperados)
        );
    }
}
