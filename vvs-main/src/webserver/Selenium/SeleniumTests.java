package Selenium;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import junit.framework.Assert;

public class SeleniumTests {

	
	public static void main(String[] args) {
// TODO Auto-generated method stub

//setting the driver executable
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/matea/Downloads/chromedriver.exe");
		
//Initiating your chromedriver
		WebDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:/Users/matea/Downloads/chromedriver.exe");
//Applied wait time
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//maximize window
		driver.manage().window().maximize();
//open browser with desired URL
		driver.get("file://C://Users//matea//Desktop//vvs-main//bin//html//index.html");
		if (driver.getPageSource().contains("Hello world!")) {
			System.out.println("Textul este vizibil");
		} else {
			System.out.println("Textul nu este vizibil");
		}
		if (driver.getPageSource().contains("The quick brown fox jumps over the lazy dog")) {
			System.out.println("Textul este vizibil");
		} else {
			System.out.println("Textul nu este vizibil");
		}
		if (driver.getPageSource().contains("Ionel")) {
			System.out.println("Textul este vizibil");
		} else {
			System.out.println("Textul nu este vizibil");
		}

//closing the browser
//driver.close();

	}

}