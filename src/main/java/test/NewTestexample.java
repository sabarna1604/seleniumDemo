package test;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTestexample {
private WebDriver driver;      
@Test          
public void testPetClinic() {    
//  driver.get("http://localhost:8090/petclinic/");  
  driver.get("http://google.in");
  String title = driver.getTitle();      
  Assert.assertTrue(title.contains("Google"));   
}    
@BeforeTest  
public void beforeTest() {    
	/* File file = new File("C:\\Users\\admatic\\Downloads\\geckodriver-v0.13.0-win64\\geckodriver.exe");  
	
//  File file = new File("F:\\##JenkinsEssentials\\geckodriver-v0.13.0-win64\\geckodriver.exe");  
  System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());     */   
  driver = new FirefoxDriver();    
}      
@AfterTest  
public void afterTest() {  
  driver.quit();        
}      

}
