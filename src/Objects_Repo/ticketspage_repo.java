package Objects_Repo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ticketspage_repo {

public WebDriver driver;

public ticketspage_repo(WebDriver driver) {
	this.driver=driver;
	
}


By searchfield=By.xpath("//input[@type='text']");

By search_button=By.xpath("//div[@class='input-group-prepend']/button");

By event_category_dropdown=By.id("categories");

By recordsnames=By.xpath("//table[@class='table table-bordered table-striped table-hover']/tbody/tr/td/a");





public WebElement searchfield() {
	
	return driver.findElement(searchfield);
	
}


public WebElement search_button() {
	
	return driver.findElement(search_button);
	
}

public WebElement event_category_dropdown() {
	
	return driver.findElement(event_category_dropdown);
	
}


public List<WebElement> recordsnames() {
	
	return driver.findElements(recordsnames);
	
}



}
