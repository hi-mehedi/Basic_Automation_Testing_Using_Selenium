package com.navigation.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.webautomation.bd.BaseDriver;

public class NavigationWeb extends BaseDriver{
	
	@BeforeSuite
	public void openUrl() {
		drive.get("https://demoqa.com/automation-practice-form");
	}
	@Test
	public void WebNavigationExa() throws InterruptedException {
		WebElement Navi = drive.findElement(By.xpath("//*[@id=\"app\"]/header/a/img"));
		Navi.click();
		Thread.sleep(3000);
		
		drive.navigate().back();
		Thread.sleep(3000);
		
		drive.navigate().forward();
		Thread.sleep(3000);
		
		drive.navigate().refresh();
		Thread.sleep(3000);



		
	}

}
