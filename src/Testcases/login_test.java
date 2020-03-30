package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Objects_Repo.loginpage_repo;
import Objects_Repo.logoutpage_repo;

public class login_test {
	
	public WebDriver driver;
	public loginpage_repo loginpageObj;
	

	
	login_test(WebDriver driver){
		
		
		this.driver=driver;
		this.loginpageObj=new loginpage_repo(driver);
		
	}
	
	
	
	public void invalidlogin() throws InterruptedException {
		

		
	
		
		loginpageObj.emailfield().sendKeys("xyz@abc.com");
	
		loginpageObj.passwordfield().sendKeys("112234");
		loginpageObj.loginButton().click();
		String actual=loginpageObj.errormsg().getText();
		
		if(actual.equalsIgnoreCase("Username or password error!")) {
			
			Assert.assertTrue(true);
			
		}
		
}	
	

		public void validlogin() throws InterruptedException {	
	
		Thread.sleep(3000);
		driver.navigate().refresh();	
		
		Thread.sleep(3000);	
		loginpageObj.emailfield().sendKeys("master");
		loginpageObj.passwordfield().sendKeys("123456");
		loginpageObj.loginButton().click();
			

	
				
			}		
		
		
	


		
		
		
		
	}
	
	
	
	

