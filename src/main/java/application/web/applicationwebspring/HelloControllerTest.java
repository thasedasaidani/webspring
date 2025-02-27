package application.web.applicationwebspring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloControllerTest {

    @Test
    public void testHello() {
        // Arrange: création d'une instance de HelloService
        HelloService service = new HelloService();

        // Création du contrôleur avec le service
        HelloController controller = new HelloController(service);

        // Act: appel de la méthode hello()
        String response = controller.hello();

        // Assert: vérification que la réponse est celle attendue
        assertEquals("Hello World tsd", response);
    }
}
