package com.careerhack.advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropDown {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver;
		 
	      WebDriverManager.chromedriver().setup();
	      driver = new ChromeDriver();
	      driver.get("https://the-internet.herokuapp.com/dropdown");
	      driver.manage().window().maximize();

	      
	      WebElement dropdown= driver.findElement(By.xpath("//select[@id='dropdown']"));
	      
	      Select s = new Select(dropdown);
	      
	      //selectByIndex
	      //selectByVisibleText
	      //selectByValue
	      
	      s.selectByIndex(1);
	      Thread.sleep(3000);
	      s.selectByVisibleText("Option 2");
	      Thread.sleep(3000);
	      s.selectByValue("1");
	}

}
