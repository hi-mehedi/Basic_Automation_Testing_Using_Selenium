package com.mehedi.SelectText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.webautomation.bd.BaseDriver;

public class selectText extends BaseDriver {
	@BeforeSuite
	public void openUrl() {
		drive.get("https://demoqa.com/select-menu");
	}
	@Test
	public void select_Text() throws InterruptedException {
		WebElement selectop = drive.findElement(By.id("oldSelectMenu"));
		Select select = new Select(selectop);
		
		//Select by Index
		select.selectByIndex(2);
		Thread.sleep(2000);
		
		//Select by Value
		select.selectByValue("5");
		Thread.sleep(2000);
		
		//Select By Visible 
		select.selectByVisibleText("Aqua");
	}

}
