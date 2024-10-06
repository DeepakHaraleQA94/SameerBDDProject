package RunnerClasses;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "C:\\Users\\Sarvadnya\\eclipse-workspace\\SameerBDD\\src\\main\\java\\FeatureFile\\login.feature",
		glue = {"Steps"},
		publish = true,
		plugin = {"pretty"}
		)

public class LoginRunner extends AbstractTestNGCucumberTests {

}
