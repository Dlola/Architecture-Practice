
//CUCUMBER JUNIT RUNNER

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty",
"html:target/cucumber" }, 
features = "C:\\Users\\damil\\Desktop\\AUTOMATION\\practiceSpace\\sageBDDformat\\src\\test\\java\\featureFiles" )


public class runner {

}
