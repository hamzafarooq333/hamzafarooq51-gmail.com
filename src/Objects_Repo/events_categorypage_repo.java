package Objects_Repo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class events_categorypage_repo {

	
	
	WebDriver driver;

public events_categorypage_repo(WebDriver driver) {
	
	this.driver=driver;
	
}

By Add_eventcategory_button=By.xpath("//button[@class='btn btn-primary btn-md']");
By edit_eventcategory_icons=By.xpath("//span[@class='icon-btns-1']");

By delete_eventcategory_icons=By.xpath("//span[@class='icon-btns-2']");


By name_eventfield=By.id("name");
By add_tags_field=By.xpath("//input[@class='ReactTags__tagInputField']");


By uploadimages_buttons=By.xpath("//input[@id='fileToUpload']");

By sumbit_button=By.xpath("//div[@class='flex-buttons col-12']/button");
By cancle_button=By.xpath("//button[@class='color-second btn btn-secondary btn-md']");

By yes_delete_confirmationpopup=By.xpath("//button[@class='color-one btn btn-secondary']");
By no_delete_confirmationpopup=By.xpath("//button[@class='color-second btn btn-secondary']");

public WebElement Add_eventcategory_button() {
	
	return driver.findElement(Add_eventcategory_button);
	
}




public List<WebElement> edit_eventcategory_icons() {
	
	return driver.findElements(edit_eventcategory_icons);
	
}


public List<WebElement> delete_eventcategory_icons() {
	
	return driver.findElements(delete_eventcategory_icons);
	
}

public WebElement name_eventfield() {
	
	return driver.findElement(name_eventfield);
	
}


public WebElement add_tags_field() {
	
	return driver.findElement(add_tags_field);
	
}


public List<WebElement> uploadimages_buttons() {
	
	return driver.findElements(uploadimages_buttons);
	
}

public WebElement sumbit_button() {
	
	return driver.findElement(sumbit_button);
	
}



public WebElement cancle_button() {
	
	return driver.findElement(cancle_button);
	
}


public WebElement yes_delete_confirmationpopup() {
	
	return driver.findElement(yes_delete_confirmationpopup);
	
}

public WebElement no_delete_confirmationpopup() {
	
	return driver.findElement(no_delete_confirmationpopup);
	
}




}
