package co.com.devco.stepdefinitions;

import co.com.devco.tasks.NavegarPorElMenu;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.devco.userinterfaces.AutomationPracticeHomeResultadosPage.RESULTADOS_BUSQUEDA;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CompraUsuarioNoLogueadoStepDefinitions {

    @Cuando("un usuario no logueado ingresa a {string}")
    public void unUsuarioNoLogueadoIngresaA( String string) {
        theActorCalled("usuario no logueado").attemptsTo(
                NavegarPorElMenu.hacia("women","Blouses")
        );
    }

    @Entonces("debe ver como resultado {int} elemento adicionado al carrito de compras")
    public void debeVerComoResultadoElementoAgragadoAlCarritoDeCompras(Integer resultadoEsperado) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.thatTheSetOf(RESULTADOS_BUSQUEDA).hasSize(resultadoEsperado)
        );
    }

    @Cuando("un usuario no logueado emtra a {string}")
    public void unUsuarioNoLogueadoEntraA( String string) {
        theActorCalled("usuario no logueado").attemptsTo(
                NavegarPorElMenu.hacia("women","T-shirt")
        );
    }

    @Entonces("debe ver como resultado {int} elemento a al carrito de compras")
    public void debeVerComoResultadoElementoAdicionadoAlCarritoDeCompras(Integer resultadoEsperado) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.thatTheSetOf(RESULTADOS_BUSQUEDA).hasSize(resultadoEsperado)
        );
    }
}

