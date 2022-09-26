package Package2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest3 {
	WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {
	    driver = new ChromeDriver();
	}
	
	@AfterClass
	public void afterClass() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    driver.quit();
	}
	
@Test
public void verifySearchButton() {

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    driver.get("https://www.amazon.ca/");

    //driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Table");

}
}