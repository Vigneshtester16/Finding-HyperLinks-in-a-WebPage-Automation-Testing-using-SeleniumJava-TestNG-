
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Findlinks {
	
	public WebDriver driver;
	
	String path = "D:\\chromedriver_win32 (6)\\chromedriver.exe";
			
	String url = "https://www.onlinesbi.sbi/";		
	

	@Test
	public  void A () {
		
		System.setProperty("webdriver.chrome.driver", path);
		
		 driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();

	}
	
	
	@Test	
	public void B () {
		 
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("Total Number of Links are " + links.size() );
		
		for (int i = 0; i<links.size(); i++) {
			
			
		System.out.println("Links are " + links.get(i).getAttribute("href"));	
			
		System.out.println("Links are " + links.get(i).getText() );		
		
}
}
}
