import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@CucumberOptions annotation is used to provide additional configuration to the runner, similar to property files or settings for a test

//in features we have to add the source and afterthat package name and it wille execute all the features package files
//step definitions can be used by attribute by glue but by glue we have to add only the package name

//by default the readability of output is encoding 64 whne we make monochrome = true. we can see the plain English language

//@CucumberOptions(features="src/test/java/features", glue = "stepDefinitions",monochrome = true, tags = "not @Regression")


@CucumberOptions(features="src/test/java/features", glue= "stepDefinitions", monochrome= true, dryRun = true,
plugin = {"pretty", "html:target/cucumber.html"} )

public class TestRunner extends AbstractTestNGCucumberTests {

}