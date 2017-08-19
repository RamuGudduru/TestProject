package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features={"Features/ParameterHandling.feature"},
		glue={"stepDefinations"},

		plugin = { "json:target/cucumber-regression-Facebook-parameter handling.json",
                "pretty","html:target"
				}
		)
public class FacebookParameterHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
