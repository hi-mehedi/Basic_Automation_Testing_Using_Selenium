package com.webautomation.bd;

import org.testng.annotations.Test;

public class OpenUrl extends BaseDriver{
    @Test
	public void open() throws InterruptedException {
            	drive.get("https://github.com/hi-mehedi");
            	Thread.sleep(5000);
            }
}
