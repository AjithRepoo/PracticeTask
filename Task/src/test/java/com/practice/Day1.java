package com.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElements;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1 extends Class2 {
	
	public static WebDriver driver;
	
	public void task1(WebDriver driver,String value) {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("Webdriver.chrome.driver","C:\\Users\\66986\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.amazon.in/");
	WebElement findElement = driver.findElement(By.xpath("//div[@class='navLeftFooter nav-sprite-v1']"));
	//System.out.println(findElement.findElements(By.tagName("a")).size());
	for (int i = 1; i <findElement.findElements(By.tagName("a")).size(); i++) {
		
		
		String chord = Keys.chord(Keys.CONTROL,Keys.ENTER);
		
		findElement.findElements(By.tagName("a")).get(i).sendKeys(chord);
		
		
	}
	
	  System.out.println("Pass");
	  
	}
	  

	public void task2(WebDriver driver) {
		
 System.out.println("Ajith");
	}

}
