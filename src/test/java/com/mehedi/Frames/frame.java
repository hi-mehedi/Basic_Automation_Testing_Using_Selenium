package com.mehedi.Frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.webautomation.bd.BaseDriver;

public class frame extends BaseDriver {
	@BeforeSuite
	public void openUrl() {
		drive.get("https://www.tutorialspoint.com/selenium/practice/frames.php");
	}
	@Test
	public void countFrame() {
		List<WebElement> frames =  drive.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
	}
	@Test (priority = 1)
	public void switchToFrame() throws InterruptedException {
		drive.get("https://www.tutorialspoint.com/selenium/practice/nestedframes.php");
		
		drive.switchTo().frame("frame1");
		WebElement text = drive.findElement(By.xpath("//h1[contains(text(),'New Tab')]"));
		System.out.println(text.getText());
		drive.switchTo().defaultContent();
		
		WebElement button = drive.findElement(By.xpath("//body/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h2[1]/button[1]"));
		button.click();
		
		Thread.sleep(3000);

		

	}
}
