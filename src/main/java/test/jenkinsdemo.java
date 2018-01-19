package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverBackedSelenium;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

import com.sun.jna.platform.FileUtils;


public class jenkinsdemo {
	
		
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
        WebDriver driver=new FirefoxDriver();	
        
        WebDriverBackedSelenium selenium = new WebDriverBackedSelenium(driver,"https://www.google.co.in/");
        
        driver.get("http://google.in");
       
        selenium.waitForPageToLoad("30000");
        
        String Expectedtitle = "Google";
        String Actualtitle = driver.getTitle();
        
        System.out.println("Before Assetion " + Expectedtitle + Actualtitle);
        Assert.assertEquals(Actualtitle, Expectedtitle);
        System.out.println("After Assertion " + Expectedtitle + Actualtitle + " Title matched ");
        driver.quit();   
				
	}

}
