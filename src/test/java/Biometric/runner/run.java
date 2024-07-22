package Biometric.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Biometric/features",
        glue	= "Biometric.stepDef",
        plugin	= {"html:target/HTML_report.html"}
)

public class run
{

}