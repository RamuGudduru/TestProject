import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"E:/Workspace/Eclipse/NAB/Grid/src/test/java/features/TC01.feature"},
        plugin = {"json:E:/Workspace/Eclipse/NAB/Grid/target/cucumber-parallel/1.json", "html:E:/Workspace/Eclipse/NAB/Grid/target/cucumber-parallel/1"},
        monochrome = false,
        tags = {"@Ramu"},
        glue = {"steps"})
public class Parallel01IT {
}
