package Runner;




import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/main/resources/Features", glue="StepDefn", monochrome= true)
public class Run1 extends AbstractTestNGCucumberTests{
	
}
