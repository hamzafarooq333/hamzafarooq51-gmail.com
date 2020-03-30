package Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Objects_Repo.logoutpage_repo;

public class logout_test{

	public static WebDriver driver;
public logoutpage_repo obj;


public logout_test(WebDriver driver) {
	
	this.driver=driver;
	this.obj=new logoutpage_repo(driver);
	
	
}




public void logout() throws InterruptedException {
	
	
	
	Thread.sleep(3000);
	obj.logoutbutton().click();
	
} 		



}
