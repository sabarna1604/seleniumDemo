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

import com.sun.jna.platform.FileUtils;


public class exampforjenkins {
	
	public static String you_email = "deva@bigdatatraining.in";
	
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
        WebDriver driver=new FirefoxDriver();	
		
		WebDriverBackedSelenium selenium = new WebDriverBackedSelenium(driver,"https://www.google.co.in/");
		
		driver.manage().window().maximize();
		
		selenium.open("https://www.google.co.in/");
		
		selenium.waitForPageToLoad("30000");
		
		
		
	}

}
