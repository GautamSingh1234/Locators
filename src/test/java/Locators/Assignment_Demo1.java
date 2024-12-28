package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment_Demo1
{
	public WebDriver driver;
	@BeforeTest
	
	public void  SetUp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();		
	}
	
	@Test
	public void Searching_Functionality() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.name("search"));
		search.sendKeys("Laptop");
		
		Thread.sleep(2500);
		driver.findElement(By.xpath("//button[@class='btn btn-light btn-lg']")).click();

	}
	
	
	@Test
	
	public void Check_the_Logo() throws InterruptedException
	{
	
		Thread.sleep(4000);
		driver.findElement(By.id("//span[normalize-space()='My Account']")).click();
		
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[@class='dropdown-item'][normalize-space()='Register']")).click();
		
		String page_text=driver.findElement(By.xpath("//h1[normalize-space()='Register Account']")).getText();
		
		String page_title="Register Account";
		
		
		if(page_title.equals(page_text))
		{
			System.out.println("Do Register ");
			
		}
		else
		{
			System.out.println("cant find ");
		}
	
			
	}
	
	

	@AfterTest
	
	public void close_connection() throws InterruptedException
	{
		Thread.sleep(10000);
		driver.quit();
	}	
}
