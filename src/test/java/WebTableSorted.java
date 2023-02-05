import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTableSorted {

	public static void main(String[] args) {
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		
		// click on the column
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		// capture all webelments into list
		List<WebElement> elementslist = driver.findElements(By.xpath("//tr/td[1]"));
		
		// capture text of all webelement into new list
		//List<String> originallist = elementslist.stream().map(s -> s.getText()).collect(Collectors.toList());
		
		// sort in the list of step 3 ->sorted list
		//List<String> sortedList = originallist.stream().sorted().collect(Collectors.toList());
		
		// compare original list vs sorted list
	//	Assert.assertTrue(originallist.equals(sortedList));
		
		List<String> price;
		
		
		// scan the name column with getText ->Rice-> print the price of the Rice
		do
		{
			List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));

	 price= rows.stream().filter(s->s.getText().contains("Rice"))
				.map(s->getPriceVeggie(s)).collect(Collectors.toList());
				
		price.forEach(a->System.out.println(a));
				
		if(price.size()<1) {
			driver.findElement(By.xpath("//li/a[@aria-label='Next']")).click();
			
		}
		}while(price.size()<1);
		
	}
	

	private static String getPriceVeggie(WebElement s) {
	String priceValue=	s.findElement(By.xpath("following-sibling::td[1]")).getText();
		
		return priceValue;
	}
}

