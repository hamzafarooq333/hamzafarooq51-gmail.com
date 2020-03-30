package Objects_Repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingpage_repo {



public WebDriver driver;

public landingpage_repo(WebDriver driver){
	
	this.driver=driver;
	
}


By dashboard_sidemenulist=By.linkText("Dashboards");
By events_sidemenulist=By.linkText("Events");
By tickets_sidemenulist=By.linkText("Tickets");
By accounts_sidemenulist=By.linkText("Accounts");
By rolemanagement_sidemenulist=By.linkText("Role Management");
By scanning_sidemenulist=By.linkText("Scanning");
By coupens_sidemenulist=By.linkText("Coupons");
By refund_sidemenulist=By.linkText("Refund");
By eventcategories_sidemenulist=By.linkText("Event Categories");
By eventvenues_sidemenulist=By.linkText("Event Venues");



By profileicon=By.cssSelector("[class='login-img']");





public WebElement dashboard_sidemenulist() {
	
	return driver.findElement(dashboard_sidemenulist);
	
}


public WebElement profileicon() {
	
	return driver.findElement(profileicon);
	
}


public WebElement events_sidemenulist() {
	
	return driver.findElement(events_sidemenulist);
	
}

public WebElement tickets_sidemenulist() {
	
	return driver.findElement(tickets_sidemenulist);
	
}

public WebElement accounts_sidemenulist() {
	
	return driver.findElement(accounts_sidemenulist);
	
}


public WebElement rolemanagement_sidemenulist() {
	
	return driver.findElement(rolemanagement_sidemenulist);
	
}

public WebElement scanning_sidemenulist() {
	
	return driver.findElement(scanning_sidemenulist);
	
}


public WebElement coupens_sidemenulist() {
	
	return driver.findElement(coupens_sidemenulist);
	
}



public WebElement refund_sidemenulist() {
	
	return driver.findElement(refund_sidemenulist);
	
}

public WebElement eventcategories_sidemenulist() {
	
	return driver.findElement(eventcategories_sidemenulist);
	
}

public WebElement eventvenues_sidemenulist() {
	
	return driver.findElement(eventvenues_sidemenulist);
	
}




}
