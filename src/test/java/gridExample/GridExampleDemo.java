package gridExample;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GridExampleDemo {

	public WebDriver driver;
	
	
	
	@BeforeTest
	public void setup() throws IOException {
		
		//Execute test on node - http://192.168.1.24:5566
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		String node = "http://192.168.1.24:5599/wd/hub";
		//String node2 = "http://192.168.1.24:5577/wd/hub";
		driver = new RemoteWebDriver(new URL(node), cap);
	}
	
	
	
	
	
	@Test
	public void HRMLoginTest() throws Exception {
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#btnLogin")).click();
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		
	}
	

}
