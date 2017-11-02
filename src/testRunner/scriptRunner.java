package testRunner;


import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@Cucumber.Options(features= {"src\\feature"},glue= {"src\\stepDefinition"})

public class scriptRunner 
{

}
