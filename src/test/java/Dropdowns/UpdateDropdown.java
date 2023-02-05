package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//TESTNG is one of the  testing framework

public class UpdateDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());// false

		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());// true
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		//.ui-state-default ui-state-highlight
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) 
		{
		System.out.println("its enabled");
		Assert.assertTrue(true);
		
		
			
			
		}
		else {
			Assert.assertTrue(false);
		}
		
		
		
		
		/* count the number of Checkboxes

		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());// 6
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);

		/*
		 * int i=1; while(i<5) {
		 * 
		 * driver.findElement(By.id("hrefIncAdt")).click(); i++; }
		 */

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());// 1adault
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}

		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());// 5adault
		
	}

}
//58//59/62