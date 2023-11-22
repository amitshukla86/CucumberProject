package stepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;

import Utilis.SeleniumDriver;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Hooks {
	
	public static WebDriver driver;
	
	@Before
	public static void setup() {
		SeleniumDriver.setupDriver();
		
	}
	
	@After
	public static void tearDown(Scenario scenario) {
		
		if(scenario.isFailed()) {
			driver = SeleniumDriver.getDriver();
			byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png","screenshot");
		}
		
		SeleniumDriver.tearDown();
	}
	

//Different examples of hooks and how to use them	
//	@BeforeAll
//	public static void before_all() {
//		
//		System.out.println("BeforeAll Hook");
//		
//	}
//	
//	@AfterAll
//	public static void after_all() {
//		System.out.println("AfterAll hook");
//	}
//	
//	@Before("@Smoke")
//	public static void test() {
//		System.out.println("Tag example");
//	}
//		
//	@Before(order=0)
//	public void setup() {
//		
//		System.out.println("Before Hook");
//		
//	}
//	
//	@Before(order=1)
//	public void setup_new() {
//		
//		System.out.println("Before Hook New");
//		
//	}
//	
//	@After
//	public void tearDown() {
//		System.out.println("After hook");
//	}
//	
//	@BeforeStep
//	public void beforestep() {
//		
//		System.out.println("Before Step");
//		
//	}
//	
//	@AfterStep
//	public void afterstpe() {
//		System.out.println("After Step");
//	}

}
