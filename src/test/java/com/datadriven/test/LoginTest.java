package com.datadriven.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	WebDriver driver;

	@Test
	public void openBrowser() throws InterruptedException {

		// launch an application
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/");
		System.out.println("navigated on url");

		// perform action on elements
		WebElement dropdown = driver.findElement(By.xpath("//span[text()='My Account']"));
		dropdown.click();
		System.out.println("clicked on dropdown");

		WebElement loginOption = driver.findElement(By.xpath("//a[text()='Register']"));
		loginOption.click();
		System.out.println("clicked on register");

		driver.quit();

	}

}
