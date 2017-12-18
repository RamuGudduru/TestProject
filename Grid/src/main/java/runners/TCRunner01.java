package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features",
		tags={"@Ramu"},
		glue="steps",
		plugin={"pretty","html:Reports/html/","json:Reports/Json/cucumber.json"}
		
		)

public class TCRunner01 {


}
