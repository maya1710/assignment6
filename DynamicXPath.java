package assignment6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXPath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(" //input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//label[text()='Employee Name']//following::input)[1]")).sendKeys("A");
		Thread.sleep(2000);
		
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//div[@role='listbox']//span"));
		String [] empNames = new String[autoSuggestions.size()];
		
		System.out.println("Following are the auto-suggested employee names");
		for(byte i=0;i<autoSuggestions.size();i++ ) {
			String eName = autoSuggestions.get(i).getText();
			System.out.println(eName);
			if(eName.contains("a")||(eName.contains("A"))) {			
				empNames[i]=eName;			
			
			}
		}
		
		if(empNames.length==autoSuggestions.size()) {
			System.out.println("Auto Suggestions contain the letter A in employee names");
		}
		else {
			System.out.println("Auto Suggestions not matching the letter A in employee names");
		}
		
		driver.quit();
		

	}

}
