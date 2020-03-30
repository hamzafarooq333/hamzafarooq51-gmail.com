package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import Objects_Repo.landingpage_repo;
import Objects_Repo.rolemanagmentpage_repo;

public class rolemanagment_test {



public WebDriver driver;
public rolemanagmentpage_repo rmObj;
public landingpage_repo landingpageobj;

public rolemanagment_test(WebDriver driver) {
	
	this.driver=driver;
	
	this.rmObj=new rolemanagmentpage_repo(driver);
	this.landingpageobj=new landingpage_repo(driver);



}


public void add_emptyrole_check() throws InterruptedException {
	
	Thread.sleep(3000);
	landingpageobj.rolemanagement_sidemenulist().click();
	rmObj.add_newrole_button().click();
	
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	js.executeScript("arguments[0].scrollIntoView(true);", rmObj.create_button());
	Thread.sleep(2000);
	
	rmObj.create_button().click();
	Thread.sleep(2000);
	

	
	rmObj.role_title().sendKeys(Keys.PAGE_UP);

	
String actual = rmObj.empty_title_error().getText();
Assert.assertEquals(actual, "Please input your role name!");


rmObj.cross_icon_onpopup().click();
}

public void add_role_check() throws InterruptedException {
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	random_string_generator r=new random_string_generator();
	Thread.sleep(3000);
	landingpageobj.rolemanagement_sidemenulist().click();
	rmObj.add_newrole_button().click();

	
	
	
	String title= r.randomString(5);
	rmObj.role_title().sendKeys(title);		
	
	
	int size=rmObj.checkboxes().size();

for(int i=0;i<size;i++) {
	
	rmObj.checkboxes().get(i).click();
	
}


JavascriptExecutor js=(JavascriptExecutor)driver;

js.executeScript("arguments[0].scrollIntoView(true);", rmObj.create_button());
Thread.sleep(2000);

rmObj.create_button().click();

int size1=rmObj.roles_tab().size();

for(int i=0;i<=size1;i++) {
	
	
	String compare=rmObj.roles_tab().get(i).getText();

	//int k=0;
	if( !(compare.equalsIgnoreCase(title)) && (i>9 && i<size1)) {
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
			driver.findElement(By.cssSelector(".ant-tabs-tab-next.ant-tabs-tab-arrow-show")).click();
		
		
	}
	if(i==size1) {
		rmObj.roles_tab().get(i).click();
		break;	
	}
	

	
		
	}


	
}


public void delete_role_check() throws InterruptedException {
	
	Thread.sleep(3000);
	landingpageobj.rolemanagement_sidemenulist().click();
	Thread.sleep(5000);
	int size1=rmObj.roles_tab().size();

	for(int i=0;i<=size1;i++) {
		
		
		//String compare=rmObj.roles_tab().get(i).getText();

		//int k=0;
		if((i>9 && i<size1)) {
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(2000);
				driver.findElement(By.cssSelector(".ant-tabs-tab-next.ant-tabs-tab-arrow-show")).click();
			
			
		}
		if(i==(size1-1)) {
			Thread.sleep(3000);
			rmObj.roles_tab().get(i).click();
			Actions a=new Actions(driver);
			Thread.sleep(9000);
				a.moveToElement(rmObj.delete_role_button()).click().build().perform();
				break;	
			
		}
		

		
			
		}
	
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	//rmObj.add_newrole_button().click();

	//rmObj.delete_role_button().click();
	//rmObj.yes_delete_confirmation_button().click();

	
}

}


