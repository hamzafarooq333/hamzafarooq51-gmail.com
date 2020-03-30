package Testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Objects_Repo.accountspage_repo;
import Objects_Repo.landingpage_repo;

public class accounts_tests {

public WebDriver driver;
public accountspage_repo accountspageobj;
public landingpage_repo landingpageobj;

public random_string_generator r;
public accounts_tests(WebDriver driver) {
	
	
	this.driver=driver;
	
	this.accountspageobj=new accountspage_repo(driver);
	this.landingpageobj=new landingpage_repo(driver);

}

public void emptyform_submitcheck() throws InterruptedException {
	Thread.sleep(5000);
	landingpageobj.accounts_sidemenulist().click();
	Thread.sleep(3000);
	accountspageobj.addaccount_button().click();
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	js.executeScript("arguments[0].scrollIntoView(true);",accountspageobj.submit_button());

	accountspageobj.submit_button().click();

	
JavascriptExecutor js1=(JavascriptExecutor)driver;
	
	js1.executeScript(" return document.body.scrollIntoView('Add Account')");
	
String Actual_error=accountspageobj.namefield_error().getText();
Assert.assertEquals(Actual_error, "Name required");

}


public void add_accountcheck() throws InterruptedException {
	
 random_string_generator r=new random_string_generator();
	Thread.sleep(4000);
	landingpageobj.accounts_sidemenulist().click();
	Thread.sleep(3000);
	accountspageobj.addaccount_button().click();
	
	Select s= new Select(accountspageobj.selectrole());
	s.selectByIndex(4);
	
	accountspageobj.username().sendKeys(r.randomString(5));
	accountspageobj.password().sendKeys(r.randomNumber(7));
	accountspageobj.email().sendKeys(r.randomString(3)+"@"+r.randomString(3)+".com");
	accountspageobj.name().sendKeys(r.randomString(5));
	
JavascriptExecutor js1=(JavascriptExecutor)driver;
	js1.executeScript("window.scrollBy('0','300')");
	
	Thread.sleep(3000);
	Select s1= new Select(accountspageobj.gender());
	s1.selectByValue("FEMALE");
	
	accountspageobj.ssn().sendKeys(r.randomNumber(9));
	
	accountspageobj.dob().sendKeys("20011992");
	
	accountspageobj.dateof_joining().sendKeys("10041998");
	
	accountspageobj.contactNumber().sendKeys(r.randomNumber(11));
	
	accountspageobj.address().sendKeys(r.randomString(5)+" "+r.randomNumber(3));
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	js.executeScript("arguments[0].scrollIntoView(true);",accountspageobj.submit_button());

	accountspageobj.submit_button().click();

	

}




public void edit_account_check() throws InterruptedException {
	
	 random_string_generator r=new random_string_generator();
	Thread.sleep(3000);
	landingpageobj.accounts_sidemenulist().click();
	Thread.sleep(2000);
JavascriptExecutor js=(JavascriptExecutor)driver;
	
	js.executeScript("return document.body.scrollIntoView('Accounts')");

	
	int size=accountspageobj.editsicons_on_accounts_listing().size();
	
	for(int i=0;i<size;i++) {
		
		
		if(i==1) {
			
			accountspageobj.editsicons_on_accounts_listing().get(i).click();
			break;
			
		}
		
		
	}
	
	Select s= new Select(accountspageobj.selectrole());
	s.selectByIndex(3);
	
	accountspageobj.username().sendKeys(r.randomString(5));
	
	accountspageobj.name().sendKeys(r.randomString(5));
	
	
	JavascriptExecutor js1=(JavascriptExecutor)driver;
	
	js1.executeScript("arguments[0].scrollIntoView(true);",accountspageobj.submit_button());

	accountspageobj.submit_button().click();

	
}



public void delete_account_check() throws InterruptedException {
	
	 //random_string_generator r=new random_string_generator();
	Thread.sleep(3000);	
JavascriptExecutor js=(JavascriptExecutor)driver;
	
	js.executeScript("return document.body.scrollIntoView('Accounts')");
	Thread.sleep(3000);
	landingpageobj.accounts_sidemenulist().click();
	int size=accountspageobj.deleteicons_on_accounts_listing().size();

for(int i=0;i<size;i++) {
	
	
	if(i==1) {
		
		accountspageobj.deleteicons_on_accounts_listing().get(i).click();
		
		accountspageobj.delete_confirm_button().click();
		break;
		
	}
	
}





}


public void assign_events_checks() throws InterruptedException {
	
	
	Thread.sleep(3000);
	landingpageobj.accounts_sidemenulist().click();
	
	accountspageobj.assignevent_button().click();
	
	accountspageobj.select_user_dropdown_on_assign_eventpage().click();
	Thread.sleep(5000);
	
	Actions s= new Actions(driver);
	s.sendKeys(accountspageobj.select_user_dropdown_on_assign_eventpage(), Keys.chord(Keys.DOWN,Keys.DOWN,Keys.ENTER)).build().perform();
	
	Thread.sleep(2000);
	
	accountspageobj.select_event_dropdown_on_assign_eventpage().click();
	
Thread.sleep(5000);
	
	Actions s1= new Actions(driver);
	s1.sendKeys(accountspageobj.select_event_dropdown_on_assign_eventpage(), Keys.chord(Keys.DOWN,Keys.DOWN,Keys.ENTER)).build().perform();
	
	
	//accountspageobj.select_user_dropdown_on_assign_eventpage().sendKeys(Keys.ENTER);
//	Thread.sleep(3000);
//	accountspageobj.select_event_dropdown_on_assign_eventpage().click();
//	Thread.sleep(10000);
//	accountspageobj.select_event_dropdown_on_assign_eventpage().sendKeys(Keys.chord(Keys.DOWN,Keys.DOWN,Keys.ENTER));
//
	accountspageobj.assign_button().click();
	
}



}