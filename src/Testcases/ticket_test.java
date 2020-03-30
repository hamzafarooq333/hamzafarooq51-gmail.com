package Testcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import Objects_Repo.landingpage_repo;
import Objects_Repo.ticketspage_repo;

public class ticket_test {


public WebDriver driver;

public ticketspage_repo tpObj;
public landingpage_repo landingpageobj;

public ticket_test(WebDriver driver) {
	
	this.driver=driver;
	this.tpObj=new ticketspage_repo(driver);
	this.landingpageobj=new landingpage_repo(driver);
	
}


public void searching() throws InterruptedException {
	
	Thread.sleep(3000);
	landingpageobj.tickets_sidemenulist().click();
	
	

	

	Thread.sleep(5000);
	tpObj.searchfield().sendKeys(tpObj.recordsnames().get(2).getText());
	Thread.sleep(3000);
	tpObj.searchfield().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.BACK_SPACE));	

	
	
	
	
}

public void eventcategorychange() throws InterruptedException {
	
	Thread.sleep(3000);
	landingpageobj.tickets_sidemenulist().click();
	
	Select s=new Select(tpObj.event_category_dropdown());
	
s.selectByIndex(4);
		
	
}


}
