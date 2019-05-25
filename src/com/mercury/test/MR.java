package com.mercury.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.google.common.io.Files;


public class MR {

	WebDriver driver;

	// ===============================================================================

	public void browserAppLaunch() throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://newtours.demoaut.com/");
		
	
	}
	public void browserClose()
	{
		
		driver.close();
	}
	
	
	/*
	 * Simple login process
	 */
	
	public void login() throws IOException, AWTException, Exception  {
		
	
		WebElement uName = driver.findElement(By.name("userName"));
		uName.sendKeys("Pomy");

		WebElement psw = driver.findElement(By.name("password"));
		psw.sendKeys("Pomy123");
	
		
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_ENTER);
		
//		Screen screen = new Screen();
//		Pattern btnlogin = new Pattern("./sikuli/btlogin.PNG");
//		screen.click(btnlogin);
	
		
		//WebElement login = driver.findElement(By.name("Login"));
		//login.click();
		
		//WebElement login = driver.findElement(By.xpath("//input[@value='Login']"));
		//login.click();


		
	
		
//		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		Files.copy(src, new File("./screenshots/snap6.jpeg"));
//		
		
		
	
	}
	

}