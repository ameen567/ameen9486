package ameen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Join {
	 WebDriver driver;
		@BeforeTest
		public void lauchingBrowser()
		{
			driver=new ChromeDriver();
			driver.get("http://www.way2automation.com/angularjs-protractor/webtables/");
		}
		@Test(priority=1)
		public void Register()
		{   
			driver.findElement(By.xpath("//button[@class='btn btn-link pull-right']")).click();
			driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("FName1");
			driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("LName2");
			driver.findElement(By.xpath("//input[@name='UserName']")).sendKeys("User1");
		}
		@Test(priority=2)
		public void details()
		{
			driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Pass1");
			driver.findElement(By.xpath("//input[@value='15']")).click();
			Select ameen= new Select(driver.findElement(By.id("")));
			ameen.selectByValue("Admin");
		}
		@Test(priority=3)
		public void Title()
		{
			driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("admin@mail.com");
			driver.findElement(By.xpath("//input[@name='Mobilephone']")).sendKeys("082555");
			driver.findElement(By.xpath("//button[@ng-click='close()']")).click();
			
		}
		@AfterTest
		public void close()
		{
			driver.quit();
			
		}
        

}
