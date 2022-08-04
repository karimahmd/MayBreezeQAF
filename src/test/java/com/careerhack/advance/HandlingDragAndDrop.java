package com.careerhack.advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDragAndDrop {

	public static void main(String[] args) {
		

		 WebDriver driver;
		 
	      WebDriverManager.chromedriver().setup();
	      driver = new ChromeDriver();
	      driver.get("https://the-internet.herokuapp.com/checkboxes");
	      driver.manage().window().maximize();

	      WebElement  newWindows= driver.findElement(By.xpath("//a[text()='Click Here']"));
	      
	}

}
