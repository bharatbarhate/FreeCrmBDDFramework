package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="D:\\Workspace\\FreeCrmBDDFramework\\src\\main\\resources\\features\\hooking.feature"
,glue= {"stepDefinations"},
format= {"pretty","html:target","json:target/json-output","junit:junit_xml/xml-output"},
monochrome= true,
strict = true,
dryRun = false
)//json:target/cucumber.json
public class HookingRunner {


}