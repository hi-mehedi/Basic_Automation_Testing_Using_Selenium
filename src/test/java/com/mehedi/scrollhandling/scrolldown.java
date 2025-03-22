package com.mehedi.scrollhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.webautomation.bd.BaseDriver;

public class scrolldown extends BaseDriver{
	
	@BeforeSuite 
	public void openUrl() {
		drive.get("https://freshmart.deliverykoi.com/");
	}
	
	@Test (priority = 0)
	public void scrolldwon() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) drive;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(3000);		
	}
	@Test(priority = 1)
	public void scrollup() throws InterruptedException {
		JavascriptExecutor js1 = (JavascriptExecutor) drive;
		js1.executeScript("window.scrollTo(0, 0)");
	    Thread.sleep(3000);
	}
	@Test(priority = 2)
	public void scrollspecific() throws InterruptedException {
	    JavascriptExecutor js2 = (JavascriptExecutor) drive;
	    WebElement location = drive.findElement(By.xpath("//*[@id=\"my-sidebar-context\"]/div[2]/div[2]/section[7]/div/div/div/a/img"));
	    js2.executeScript("arguments[0].scrollIntoView(true);", location);
	    Thread.sleep(3000);
	}



}
