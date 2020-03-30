package Testcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Objects_Repo.events_categorypage_repo;
import Objects_Repo.landingpage_repo;
import Objects_Repo.rolemanagmentpage_repo;

public class eventcategories_test {


public WebDriver driver;
public events_categorypage_repo ecObj;
public landingpage_repo lpObj;

public eventcategories_test(WebDriver driver) {
	
	this.driver=driver;
	this.ecObj=new events_categorypage_repo(driver);
	this.lpObj=new landingpage_repo(driver);
	
}


public void add_empty_category_check() throws InterruptedException {
	Thread.sleep(3000);
	lpObj.eventcategories_sidemenulist().click();
	ecObj.Add_eventcategory_button().click();
	ecObj.sumbit_button().click();
	
	
}

public void addcategory_check() throws InterruptedException {
	Thread.sleep(3000);
	random_string_generator r=new random_string_generator();
	ecObj.name_eventfield().sendKeys(r.randomString(5));
	
	ecObj.add_tags_field().sendKeys(Keys.chord(r.randomString(3),Keys.ENTER));
	
	int size=ecObj.uploadimages_buttons().size();
	
	for(int i=0;i<=size;i++) {
		
		if(i==0) {
		
			ecObj.uploadimages_buttons().get(i).sendKeys("C:\\Users\\Hamza Farooq\\Desktop\\Office work\\Testing data\\rp.jpeg");
			Thread.sleep(3000);
		}
		
		if(i==1) {
			
			ecObj.uploadimages_buttons().get(i).sendKeys("C:\\Users\\Hamza Farooq\\Desktop\\Office work\\Testing data\\rp.jpeg");
			Thread.sleep(3000);

		}	
		
		
	}
	Thread.sleep(5000);
	ecObj.sumbit_button().click();
	
	
	
	
	
	
}


public void editcategory_check() throws InterruptedException {
	Thread.sleep(3000);
	random_string_generator r=new random_string_generator();
	lpObj.eventcategories_sidemenulist().click();
	
	int size=ecObj.edit_eventcategory_icons().size();
	
	for(int i=0;i<size;i++) {
		
		
		if(i==1) {
			
			ecObj.edit_eventcategory_icons().get(i).click();
			break;
			
		}
		
	}
	
	ecObj.add_tags_field().sendKeys(Keys.chord(r.randomString(3),Keys.ENTER));
	Thread.sleep(3000);
	ecObj.sumbit_button().click();
	
	
	
}

public void deletecategory_check() throws InterruptedException {
	Thread.sleep(3000);

	lpObj.eventcategories_sidemenulist().click();
	
	int size=ecObj.delete_eventcategory_icons().size();
	
	for(int i=0;i<size;i++) {
		
		
		if(i==1) {
			
			ecObj.delete_eventcategory_icons().get(i).click();
			break;
			
		}
		
	}
	
	
	rolemanagmentpage_repo rp=new rolemanagmentpage_repo(driver);
	Thread.sleep(3000);
	ecObj.yes_delete_confirmationpopup().click();
}



}
