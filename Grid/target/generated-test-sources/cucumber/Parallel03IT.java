import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"E:/Workspace/Eclipse/NAB/Grid/src/test/java/features/TC03.feature"},
        plugin = {"json:E:/Workspace/Eclipse/NAB/Grid/target/cucumber-parallel/3.json", "html:E:/Workspace/Eclipse/NAB/Grid/target/cucumber-parallel/3"},
        monochrome = false,
        tags = {"@Ram,@siva,@narmu"},
        glue = {"steps"})
public class Parallel03IT {
}
