package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment_Demo2
{
	public WebDriver driver ;
	
	@BeforeTest
	
	public void Setup()
	{
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
	}
	
	@Test
	public void Search_Product() throws InterruptedException
	{
		
		driver=new ChromeDriver();	
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Laptop");
		Thread.sleep(4000);
		WebElement nav_search_submit=driver.findElement(By.id("nav-search-submit-button"));
		nav_search_submit.click();
		
		// add to cart
		
		Thread.sleep(5000);
		WebElement add_to_cart=driver.findElement(By.xpath("//button[@id='a-autoid-4-announce']"));
		add_to_cart.click();
		
		
		
		// Go to cart 
		Thread.sleep(6000);
		WebElement go_to_cart=driver.findElement(By.id("nav-cart-count"));
		go_to_cart.click();
		
		
		// go to payment 
		
		Thread.sleep(8000);
		WebElement payment=driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']"));
		payment.click();
			
		
	}
	
	
	@AfterTest
	public void close() throws InterruptedException
	{
		Thread.sleep(10000);
		driver.quit();
	}
	

}
