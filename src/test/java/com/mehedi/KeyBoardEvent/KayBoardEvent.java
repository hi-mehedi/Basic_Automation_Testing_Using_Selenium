package com.mehedi.KeyBoardEvent;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.webautomation.bd.BaseDriver;

public class KayBoardEvent extends BaseDriver {
	@BeforeSuite
	public void openUrl() {
		drive.get("https://demoqa.com/automation-practice-form");
	}
	@Test
	public void  copyPaste() throws InterruptedException {
		Actions action = new Actions (drive);
		WebElement firstname = drive.findElement(By.xpath("//*[@id=\"firstName\"]"));
		Thread.sleep(2000);
		firstname.sendKeys("Mehedi");

		// Select
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		//Copy
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		Thread.sleep(2000);
		
		//Tab 
        action.sendKeys(Keys.TAB);
        action.build().perform();
        Thread.sleep(2000);
        
        //Paste
        action.keyDown(Keys.CONTROL);
        action.sendKeys("v");
        action.keyUp(Keys.CONTROL);
        action.build().perform();
        Thread.sleep(2000);
        
		
        //Without TAB to paste another field, I paste this subjects
        WebElement Subjects = drive.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]"));
        JavascriptExecutor js2 = (JavascriptExecutor) drive;
	    js2.executeScript("arguments[0].scrollIntoView(true);",Subjects);
	    Thread.sleep(2000);
        Subjects.click();
        action.keyDown(Keys.CONTROL);
        action.sendKeys("v");
        action.keyUp(Keys.CONTROL);
        action.build().perform();
        Thread.sleep(2000);
        
        
        
	}
}
