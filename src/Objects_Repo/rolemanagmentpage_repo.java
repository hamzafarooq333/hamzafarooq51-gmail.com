package Objects_Repo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class rolemanagmentpage_repo {


public WebDriver driver;



public rolemanagmentpage_repo(WebDriver driver) {
	
	
this.driver=driver;
	
	
}

By add_newrole_button=By.xpath("//button[@class='btn-danger btn btn-secondary']");

By roles_tab=By.xpath("//div[@role='tab']");

By delete_role_button= By.xpath("//form[@class='ant-form ant-form-horizontal']/span/span/i");


By no_delete_confirmation_button=By.xpath("//button[@class='ant-btn ant-btn-sm']");
By yes_delete_confirmation_button=By.xpath("//button[@class='ant-btn ant-btn-primary ant-btn-sm']");

By cross_icon_onpopup=By.cssSelector(".ant-modal-close-x");
By role_title=By.xpath("//input[@placeholder='Title of New Role']");

By checkboxes=By.xpath("//div[@class='ant-checkbox-group'] //input[@type='checkbox']");

By create_button=By.xpath("//button[@htmltype='submit']");

By empty_title_error=By.cssSelector(".ant-form-explain");



public WebElement add_newrole_button() {
	
	return driver.findElement(add_newrole_button);	
}


public List<WebElement> roles_tab() {
	
	return driver.findElements(roles_tab);
	
}


public WebElement delete_role_button() {
	
	return driver.findElement(delete_role_button);
	
}

public WebElement no_delete_confirmation_button() {
	
	return driver.findElement(no_delete_confirmation_button);
	
}


public WebElement yes_delete_confirmation_button() {
	
	return driver.findElement(yes_delete_confirmation_button);
	
}



public WebElement cross_icon_onpopup() {
	
	return driver.findElement(cross_icon_onpopup);
	
}



public WebElement role_title() {
	
	return driver.findElement(role_title);
	
}


public List<WebElement> checkboxes() {
	
	return driver.findElements(checkboxes);
	
}

public WebElement create_button() {
	
	return driver.findElement(create_button);
	
}

public WebElement empty_title_error() {
	
	return driver.findElement(empty_title_error);
	
}

}
