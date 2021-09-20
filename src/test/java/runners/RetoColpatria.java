package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;
import util.BeforeSuite;
import util.DataToFeature;

import java.io.IOException;

/**
 * Runner del feature
 */

@CucumberOptions(features = "src/test/resources/feature/reto.feature",
        glue = "stepDefinitions",
        tags = {"@Test"},
        snippets = SnippetType.CAMELCASE)
@RunWith(RunnerPersonalizado.class)

public class RetoColpatria {
    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("./src/test/resources/feature/reto.feature");
    }
}
