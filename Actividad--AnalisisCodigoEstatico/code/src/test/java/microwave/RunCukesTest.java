package microwave;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/microwave/Microwave.feature",
        glue = "src/test/java/microwave/Stepdefs" // Paquete donde se encuentran tus definiciones de pasos
)
public class RunCukesTest {
    public RunCukesTest() {

    }
}
