package com.mehedi.action_select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.webautomation.bd.BaseDriver;

public class ActionSelect extends BaseDriver {
	
	@BeforeSuite
	public void openUrl() {
		drive.get("https://www.daraz.com.bd/#?");
	}
    @Test
	public void action_Select() throws InterruptedException{
		WebElement shop_all = drive.findElement(By.xpath("//*[@id=\"0\"]/span"));
		shop_all.click();
		
		Actions action = new Actions(drive);
		
		WebElement cata = drive.findElement(By.xpath("//*[@id=\"topActionHeader\"]/div[2]/div/div/div[1]/span"));
		action.moveToElement(cata).perform();
		Thread.sleep(1000);
		
		WebElement tv_Home = drive.findElement(By.xpath("//*[@id=\"Level_1_Category_No7\"]/div/span"));
		action.moveToElement(tv_Home).perform();
		Thread.sleep(1000);
		
		WebElement tele = drive.findElement(By.xpath("//*[@id=\"topActionHeader\"]/div[2]/div/div/div[2]/div/ul/ul[4]/li[7]/a/span"));
		action.moveToElement(tele).perform();
		Thread.sleep(1000);
		
		WebElement Sam_tele = drive.findElement(By.xpath("//*[@id=\"topActionHeader\"]/div[2]/div/div/div[2]/div/ul/ul[4]/li[7]/ul/li[3]/a/span"));
		action.moveToElement(Sam_tele).perform();
		Sam_tele.click();
		Thread.sleep(3000);
		}
	
}
