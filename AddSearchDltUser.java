package assignment6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddSearchDltUser {
 
	    public static void main(String[] args) throws InterruptedException {  
	        
	     
	        System.setProperty("webdriver.chrome.driver","path/to/chromedriver.exe"); 
	        
	       
	        WebDriver driver=new ChromeDriver();  
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  
	        
	      
	        WebElement username=driver.findElement(By.id("txtUsername"));
	        username.sendKeys("admin");  
	        WebElement password=driver.findElement(By.id("txtPassword"));  
	        password.sendKeys("admin123");  
	        WebElement loginButton=driver.findElement(By.xpath("//input[@value='LOGIN']"));
	        loginButton.click(); 
	        
	     
	        WebElement welcomeMsg=driver.findElement(By.id("welcome")); 
	        assert welcomeMsg.getText().contains("Welcome") : "Login failed";  
	        
	       
	        WebElement adminTab=driver.findElement(By.id("menu_admin_viewAdminModule"));
	        adminTab.click();  
	        WebElement addUserBtn=driver.findElement(By.id("btnAdd"));
	        addUserBtn.click(); 
	        
	        // Fill the Add User form and click Save button
	        WebElement empName=driver.findElement(By.id("systemUser_employeeName_empName"));
	        empName.sendKeys("Test User");  
	        WebElement userName=driver.findElement(By.id("systemUser_userName"));
	        userName.sendKeys("testuser");  
	        WebElement password1=driver.findElement(By.id("systemUser_password"));
	        password1.sendKeys("test123"); 
	        WebElement confirmPassword=driver.findElement(By.id("systemUser_confirmPassword"));
	        confirmPassword.sendKeys("test123");  
	        WebElement saveBtn=driver.findElement(By.id("btnSave"));
	        saveBtn.click(); 
	        
	    
	        
	        //  added user
	        WebElement searchUserName=driver.findElement(By.id("searchSystemUser_userName"));
	        searchUserName.sendKeys("testuser");
	        WebElement searchBtn=driver.findElement(By.id("searchBtn"));
	        searchBtn.click(); 
	        
	        // Verify if the user is listed in the search results
	        WebElement userNameLink=driver.findElement(By.xpath("//a[text()='testuser']"));
	        assert userNameLink.isDisplayed() : "User search failed";  
	        
	        // Delete User
	        userNameLink.click();  
	        WebElement deleteBtn=driver.findElement(By.id("btnDelete"));
	        deleteBtn.click(); 
	        WebElement okButton=driver.findElement(By.id("dialogDeleteBtn"));
	        okButton.click(); 
	        
	      
	        
	        // Logout from the application
	        WebElement welcomeAdmin=driver.findElement(By.id("welcome"));  
	        welcomeAdmin.click();  
	        WebElement logoutBtn=driver.findElement(By.xpath("//a[text()='Logout']"));
	        logoutBtn.click(); 
	        
	      
	        
	        // Close the browser
	        driver.close();  
	    }  
	}  
	
	