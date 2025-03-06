package com.webautomation.bd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriver {
	    protected WebDriver drive;
	    @BeforeSuite
        public void stratBrowser() {
        	String webBrowser = "chrome";
        	 if(webBrowser.equals("chrome")) {
        		 WebDriverManager.chromedriver().setup();
        		 drive = new ChromeDriver();
        		 drive.manage().window().maximize();
        	 }
        	 else if(webBrowser.equals("firefox")) {
        		 WebDriverManager.firefoxdriver().setup();
        		 drive = new FirefoxDriver();
        		 drive.manage().window().maximize();
        	 }
        	 
        	 else {
        		 WebDriverManager.edgedriver().setup();
        		 drive = new EdgeDriver();
        		 drive.manage().window().maximize();
        	 }
        }
	    @AfterSuite
	    public void closeBrowse() {
              drive.close();
	    }
}

