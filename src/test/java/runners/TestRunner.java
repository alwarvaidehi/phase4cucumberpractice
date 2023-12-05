package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions( 
		
		features={"C:\\Users\\Vanak\\eclipse-workspace\\CucumberTest\\src\\test\\java\\features\\Login.feature",
				"C:\\Users\\Vanak\\eclipse-workspace\\CucumberTest\\src\\test\\java\\features\\Search.feature"},
		
				
		glue = {"stepDefination"},
				dryRun=false,
		plugin = { "html:target/report.html",
				"json:target/cucumber.json",
				
				"pretty"  ,
				
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/"	
				}	
				
		//		tags ="@all"
		
		
		
		
		)	



public class TestRunner {


}
