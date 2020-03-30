package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class main extends base {


	public static WebDriver driver;

	
	@BeforeClass
	
	public void initialsetup() {
		
		setup();
		driver=new ChromeDriver();
		
		
	}	
	

	
	
	@Test(priority=1)
	@Parameters("URL")

	public void hiturl(String s) {
		
		driver.get(s);
		driver.manage().window().maximize();
		
	}	
	
	
	@Test(priority=2)
	
	public void logintestcases() throws InterruptedException {
		
		
		login_test lp=new login_test(driver);
		
		//lp.invalidlogin();
	    lp.validlogin();
		
	}

	

	
@Test(priority=3)	
	
public void  events() throws InterruptedException {
	events_test lp=new events_test(driver);
	
	recurring_event_test lp1=new recurring_event_test(driver);
	series_event_test lp2=new series_event_test(driver);
	
	
	lp.clickevents_tab();
	lp.addevents();
//	
//	lp1.clickevents_tab();
//	lp1.add_recurring_events();
//	
//	lp2.clickevents_tab();
//	lp2.add_series_events();

}	

//@Test(priority=4)	
//
//public void  accounts() throws InterruptedException {
//	accounts_tests lp=new accounts_tests(driver);
//lp.emptyform_submitcheck();
//lp.add_accountcheck();
//lp.edit_account_check();
//lp.delete_account_check();
//lp.assign_events_checks();
//}
//
//
//@Test(priority=5)	
//
//public void  rolesManagment() throws InterruptedException {
//	rolemanagment_test lp=new rolemanagment_test(driver);
//
//	lp.add_emptyrole_check();
//	lp.add_role_check();
//	//lp.delete_role_check();
//}
//
//
//
//@Test(priority=6)	
//
//public void  eventscategories() throws InterruptedException {
//	eventcategories_test lp=new eventcategories_test(driver);
//
//	lp.add_empty_category_check();
//	lp.addcategory_check();
//	lp.editcategory_check();
//	lp.deletecategory_check();
//}
//
//
//
//@Test(priority=7)	
//
//public void  tickets() throws InterruptedException {
//	ticket_test lp=new ticket_test(driver);
//
//	lp.searching();
//	lp.eventcategorychange();
//}

	
//	@Test(priority=8)
//
//public void  logout() throws InterruptedException {
//	logout_test lp=new logout_test(driver);
//	lp.logout();
//
//}


}
