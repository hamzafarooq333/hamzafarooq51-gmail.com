package Objects_Repo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class accountspage_repo {


public WebDriver driver;


public accountspage_repo(WebDriver driver) {
	
	
	this.driver=driver;
	
}


By addaccount_button =By.xpath("//button[text()='Add Account']");
By assignevent_button=By.xpath("//button[text()='Assign Event']");



By select_user_dropdown_on_assign_eventpage= By.xpath("//div[@class='ant-select-selection__rendered']");
By select_event_dropdown_on_assign_eventpage=By.xpath("//*[@id='eventSlotIds']/div/div");
By assign_button=By.xpath("//button[@type='primary']");


By editsicons_on_accounts_listing=By.xpath("//span[@class='icon-btns-1']");
By deleteicons_on_accounts_listing=By.xpath("//span[@class='icon-btns-2']");

By delete_confirm_button=By.xpath("//button[@class='color-one btn btn-secondary']");
By delete_cancle_button=By.xpath("//button[@class='color-second btn btn-secondary']");



By selectrole=By.id("role-select");
By username=By.id("username");

By password=By.id("password");
By email=By.id("email");
By name=By.id("name");

By gender=By.xpath("//select[@id='role-gender']");
By ssn=By.id("ssn");
By dob=By.id("dob");
By dateof_joining=By.xpath("//input[@name='dateOfJoining']");
By contactNumber=By.id("contactNumber");
By address=By.id("address");


By submit_button=By.xpath("//button[@class='color-one btn btn-primary btn-md']");
By cancel_button=By.xpath("//button[@class='color-second btn btn-secondary btn-md']");



By namefield_error=By.xpath("//*[@id='main-wrapper']/div[1]/div/div/div/div/div/div/div[2]/form/div[5]/div[2]/p");

public WebElement addaccount_button() {
	
	
	return driver.findElement(addaccount_button);
}


public WebElement assignevent_button() {
	
	
	return driver.findElement(assignevent_button);
}

public WebElement select_user_dropdown_on_assign_eventpage() {
	
	
	return driver.findElement(select_user_dropdown_on_assign_eventpage);
}

public WebElement select_event_dropdown_on_assign_eventpage() {
	
	
	return driver.findElement(select_event_dropdown_on_assign_eventpage);
}




public WebElement assign_button() {
	
	
	return driver.findElement(assign_button);
}




public List<WebElement> editsicons_on_accounts_listing() {
	
	
	return driver.findElements(editsicons_on_accounts_listing);
}


public List<WebElement> deleteicons_on_accounts_listing() {
	
	
	return driver.findElements(deleteicons_on_accounts_listing);
}

public WebElement delete_confirm_button() {
	
	
	return driver.findElement(delete_confirm_button);
}


public WebElement delete_cancle_button() {
	
	
	return driver.findElement(delete_cancle_button);
}




public WebElement selectrole() {
	
	
	return driver.findElement(selectrole);
}

public WebElement username() {
	
	
	return driver.findElement(username);
}



public WebElement password() {
	
	
	return driver.findElement(password);
}

public WebElement email() {
	
	
	return driver.findElement(email);
}

public WebElement name() {
	
	
	return driver.findElement(name);
}

public WebElement gender() {
	
	
	return driver.findElement(gender);
}


public WebElement ssn() {
	
	
	return driver.findElement(ssn);
}

public WebElement dob() {
	
	
	return driver.findElement(dob);
}
public WebElement dateof_joining() {
	
	
	return driver.findElement(dateof_joining);
}

public WebElement contactNumber() {
	
	
	return driver.findElement(contactNumber);
}




public WebElement address() {
	
	
	return driver.findElement(address);
}



public WebElement submit_button() {
	
	
	return driver.findElement(submit_button);
}

public WebElement cancel_button() {
	
	
	return driver.findElement(cancel_button);
}


public WebElement namefield_error() {
	
	
	return driver.findElement(namefield_error);
}



}
