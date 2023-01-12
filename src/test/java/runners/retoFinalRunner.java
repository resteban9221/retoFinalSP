package runners;
//runner
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

        glue = "steps",
        features ="src/test/com.retoFinalSP.resources/Features",
        snippets = SnippetType.CAMELCASE,
        monochrome = true,
        dryRun = false,
        tags = "@flujo1"

)

public class retoFinalRunner {
}
