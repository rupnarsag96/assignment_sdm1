package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class assignment {
	 public static WebDriver wd=new ChromeDriver();
  @Test
  @Parameters ({"v1","v2"})
  public void login(String v1 ,String v2) throws InterruptedException {
	  Thread.sleep(1000);
	  wd.findElement(By.name("username")).sendKeys(v1);
	  Thread.sleep(1000);
		wd.findElement(By.name("password")).sendKeys(v2);
		Thread.sleep(1000);
		wd.findElement(By.name("login")).click();
		Thread.sleep(1000);

	  
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	 
		wd.get("https://parabank.parasoft.com/parabank/index.htm");
		wd.manage().window().maximize();
		String s= wd.getTitle();
		System.out.println(s);
		
		WebElement w=wd.findElement(By.name("username"));
		w.sendKeys("sagar");
		
		String s1= w.getAttribute("value");
		System.out.println(s1);
		
		String s2= wd.getCurrentUrl();
		System.out.println(s2);
		


  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(1000);
	  wd.quit();
	  
}
}
