package Utilis;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDriver {
	
	private static SeleniumDriver seleniumDriver;
	
	private static WebDriver driver;
	
	private static WebDriverWait waitDriver;
	
	public static Properties Config = new Properties();
	
	public static Properties OR = new Properties();
	
	private FileInputStream fis;
	
	private SeleniumDriver() {
		
		try {
			fis = new FileInputStream("./src/main/resources/properties/Config.properties");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		try {
			Config.load(fis);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		try {
			fis = new FileInputStream("./src/main/resources/properties/OR.properties");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		try {
			OR.load(fis);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		if(Config.getProperty("browser").equals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(Config.getProperty("browser").equals("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(Config.getProperty("browser").equals("edge")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		waitDriver = new WebDriverWait(driver,Duration.ofSeconds(Integer.parseInt(Config.getProperty("ExplicitWait"))));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(Config.getProperty("ImplicitWait"))));
		
	}
	
	public static WebDriver getDriver(){
		return driver;
	}
	
	public static void setupDriver() {
		if (seleniumDriver == null) {
			seleniumDriver = new SeleniumDriver();
		}
	}
	
	public static void openPage(String url) {
		
		driver.get(url);
	}
	
	public static void tearDown() {
		if(seleniumDriver != null) {
			driver.close();
			driver.quit();
		}
		
		seleniumDriver = null;
	}
}
