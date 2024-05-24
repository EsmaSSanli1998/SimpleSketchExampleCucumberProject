package migros.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = "html:raporlar/CucumberRaporlarim.html",
        features = "src/test/resources/features",
        glue = {"migros/stepdefs", "migros/hooks"},
        tags = "@migrosyemekpassed",
        dryRun = false,
        monochrome = true


)
public class Runner2 {





}
