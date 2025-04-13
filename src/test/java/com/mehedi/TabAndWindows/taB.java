package com.mehedi.TabAndWindows;

import java.util.Set;

import org.openqa.selenium.WindowType;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.webautomation.bd.BaseDriver;

public class taB extends BaseDriver {
	@BeforeSuite
	public void openUrl() {
      drive.get("https://www.tutorialspoint.com/selenium/practice/frames.php"); 
	}
	@Test
public void tab() throws InterruptedException {
		
		String parentTab = drive.getWindowHandle();
		
		//Create a New Tab
		drive.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(2000);
		String childTab = drive.getWindowHandle();
		drive.get("https://www.daraz.com.bd/#hp-categories");
		Thread.sleep(2000);
		
		//Switch to Tab
		Set<String> allTabs = drive.getWindowHandles();
		System.out.println("Number of Tab: "+allTabs.size());
		
		drive.switchTo().window(parentTab);
		Thread.sleep(2000);
		drive.switchTo().window(childTab);
		Thread.sleep(2000);
	}

}
