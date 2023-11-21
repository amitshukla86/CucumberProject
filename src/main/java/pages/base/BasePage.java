package pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilis.SeleniumDriver;

public class BasePage {
	
	public static WebDriver driver;
	public static WebElement mouseOverElement;
	
	public BasePage() {
		
		driver = SeleniumDriver.getDriver();
		System.out.println("object created");
		
	}
	
	public void click(String locator) {
		
		if(locator.endsWith("_Xpath")) {
			driver.findElement(By.xpath(SeleniumDriver.OR.getProperty(locator))).click();
		} else if(locator.endsWith("_Id")) {
			driver.findElement(By.id(SeleniumDriver.OR.getProperty(locator))).click();
		} else if(locator.endsWith("_Css")) {
			driver.findElement(By.cssSelector(SeleniumDriver.OR.getProperty(locator))).click();
		} else if(locator.endsWith("_Link")) {
			driver.findElement(By.linkText(SeleniumDriver.OR.getProperty(locator))).click();
		} else if(locator.endsWith("_Class")) {
			driver.findElement(By.className(SeleniumDriver.OR.getProperty(locator))).click();
		} else if(locator.endsWith("_Name")) {
			driver.findElement(By.name(SeleniumDriver.OR.getProperty(locator))).click();
		}
		
	}
	
	public void type(String locator,String value) {
		
		if(locator.endsWith("_Xpath")) {
			driver.findElement(By.xpath(SeleniumDriver.OR.getProperty(locator))).sendKeys(value);
		} else if(locator.endsWith("_Id")) {
			driver.findElement(By.id(SeleniumDriver.OR.getProperty(locator))).sendKeys(value);
		} else if(locator.endsWith("_Css")) {
			driver.findElement(By.cssSelector(SeleniumDriver.OR.getProperty(locator))).sendKeys(value);
		} else if(locator.endsWith("_Link")) {
			driver.findElement(By.linkText(SeleniumDriver.OR.getProperty(locator))).sendKeys(value);
		} else if(locator.endsWith("_Class")) {
			driver.findElement(By.className(SeleniumDriver.OR.getProperty(locator))).sendKeys(value);
		} else if(locator.endsWith("_Name")) {
			driver.findElement(By.name(SeleniumDriver.OR.getProperty(locator))).sendKeys(value);
		}
		
	}
	
	public void mouseOver(String locator) {
		
		if(locator.endsWith("_Xpath")) {
			mouseOverElement = driver.findElement(By.xpath(SeleniumDriver.OR.getProperty(locator)));
		} else if(locator.endsWith("_Id")) {
			mouseOverElement = driver.findElement(By.id(SeleniumDriver.OR.getProperty(locator)));
		} else if(locator.endsWith("_Css")) {
			mouseOverElement = driver.findElement(By.cssSelector(SeleniumDriver.OR.getProperty(locator)));
		} else if(locator.endsWith("_Link")) {
			mouseOverElement = driver.findElement(By.linkText(SeleniumDriver.OR.getProperty(locator)));
		} else if(locator.endsWith("_Class")) {
			mouseOverElement = driver.findElement(By.className(SeleniumDriver.OR.getProperty(locator)));
		} else if(locator.endsWith("_Name")) {
			mouseOverElement = driver.findElement(By.name(SeleniumDriver.OR.getProperty(locator)));
		}
		
		new Actions(driver).moveToElement(mouseOverElement).perform();
	}
	
	public void getWebsiteFromConfig() {
		
		driver.get(SeleniumDriver.Config.getProperty(SeleniumDriver.Config.getProperty("environment")));
		
	}
	
	public void getWebsiteFromURL(String url) {
		
		driver.get(url);
		
	}
	
	public String getText(String locator) {
		
		String text = null;
		
		if(locator.endsWith("_Xpath")) {
			text = driver.findElement(By.xpath(SeleniumDriver.OR.getProperty(locator))).getText();
			System.out.println(text);
		} else if(locator.endsWith("_Id")) {
			text = driver.findElement(By.id(SeleniumDriver.OR.getProperty(locator))).getText();
		} else if(locator.endsWith("_Css")) {
			text = driver.findElement(By.cssSelector(SeleniumDriver.OR.getProperty(locator))).getText();
		} else if(locator.endsWith("_Link")) {
			text = driver.findElement(By.linkText(SeleniumDriver.OR.getProperty(locator))).getText();
		} else if(locator.endsWith("_Class")) {
			text = driver.findElement(By.className(SeleniumDriver.OR.getProperty(locator))).getText();
		} else if(locator.endsWith("_Name")) {
			text = driver.findElement(By.name(SeleniumDriver.OR.getProperty(locator))).getText();
		}
		
		return text;
	}
	

}
