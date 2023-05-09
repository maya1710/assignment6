package assignment6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsXpathCSSselector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		
		WebElement element= driver.findElement(By.xpath("username"));
		
		driver.findElement(By.xpath("//input[@name='username']"));
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Username')]"));
		
		driver.findElement(By.cssSelector("input[name='username']"));
		
		driver.findElement(By.cssSelector("input[placeholder='Username']"));
		
		driver.findElement(By.cssSelector("input[class='oxd-input oxd-input--active']"));
		
		//password
		
		
		WebElement element1= driver.findElement(By.xpath("passowrd"));
		
		driver.findElement(By.xpath("input[@placeholder='Password']"));
		
		driver.findElement(By.xpath("//input[contains(@type,'password') and @name='password']"));
		
		driver.findElement(By.cssSelector("input[type='password']"));
		
		driver.findElement(By.cssSelector("input[name*='password']"));
		
		driver.findElement(By.cssSelector("input[name^='pass']"));
		
		
		// for login
		
		WebElement element2= driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
		
		driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
		
		driver.findElement(By.xpath("//div[contains(@class,'login-action')]//button"));
		
		driver.findElement(By.cssSelector("button[type='submit']"));
		
		driver.findElement(By.cssSelector("button.oxd-button"));
		
		driver.findElement(By.cssSelector(".oxd-form button"));
		
		
		
		
		
	
		

	}

}
