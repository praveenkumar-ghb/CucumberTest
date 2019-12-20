package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\a08019dirp_c2c.04.02\\eclipse-workspace\\CucumberProject\\src\\main\\java\\features\\Login.feature",
glue="sepDefinition",
dryRun=true,
plugin= {"json:/tager/cucumber.json"})
public class Runnerclass {

}
