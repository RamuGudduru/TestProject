package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/Features",
		tags={"@siva"},
		glue="stepDefinations",
		plugin={"pretty","html:Reports/html/","json:Reports/Json/cucumber.json"}
		
		)

public class TCRunner02 {


}
