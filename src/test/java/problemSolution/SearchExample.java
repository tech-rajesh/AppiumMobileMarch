package problemSolution;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchExample {
	
	
	@Test
	public void dragdropTest1() throws Exception
	
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		
		WebElement ele = driver.findElement(By.xpath("//input[@name='q']"));
		
		
		enterValueIntoTextBox(ele, "iphone");
	}

	
	
	public void enterValueIntoTextBox(WebElement anything, String AnyValue) {
		
		anything.sendKeys(AnyValue);
		
	}
	
	
	
	
}
