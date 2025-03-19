package com.mehedi.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.webautomation.bd.BaseDriver;

public class AlertsExample extends BaseDriver{
	@BeforeSuite
	public void openUrl() {
		drive.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
	}
	
	@Test (priority=0)
	public void alertsExa() throws InterruptedException {
		WebElement button = drive.findElement(By.xpath("/html/body/main/div/div/div[2]/div[1]/button"));
		button.click();
		Thread.sleep(3000);
		Alert alert = drive.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
		
	}
	@Test (priority=1)
	public void alertsExa2() throws InterruptedException {
		WebElement button = drive.findElement(By.xpath("/html/body/main/div/div/div[2]/div[3]/button"));
		button.click();
		Thread.sleep(3000);
		Alert alert = drive.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
		button.click();
		Thread.sleep(3000);
		alert.dismiss();
		Thread.sleep(3000);
	}
	@Test (priority=2)
	public void alertsExa3() throws InterruptedException {
		WebElement button = drive.findElement(By.xpath("/html/body/main/div/div/div[2]/div[4]/button"));
		button.click();
		Thread.sleep(3000);
		Alert alert = drive.switchTo().alert();
		alert.sendKeys("Hello Mehedi");
		Thread.sleep(3000);
		alert.accept();
		Thread.sleep(3000);
		
	}
	@Test (priority=3)
	public void alertExa4() throws InterruptedException {
		WebElement button = drive.findElement(By.xpath("/html/body/main/div/div/div[2]/div[2]/button"));
		button.click();
		Thread.sleep(7000);
		Alert alert = drive.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
	}

}
