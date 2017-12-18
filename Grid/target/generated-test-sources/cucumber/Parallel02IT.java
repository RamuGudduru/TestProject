import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"E:/Workspace/Eclipse/NAB/Grid/src/test/java/features/TC02.feature"},
        plugin = {"json:E:/Workspace/Eclipse/NAB/Grid/target/cucumber-parallel/2.json", "html:E:/Workspace/Eclipse/NAB/Grid/target/cucumber-parallel/2"},
        monochrome = false,
        tags = {"@Ram,@siva,@narmu"},
        glue = {"steps"})
public class Parallel02IT {
}
