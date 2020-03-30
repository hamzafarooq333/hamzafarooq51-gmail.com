package Objects_Repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage_repo {


public WebDriver driver;

public loginpage_repo(WebDriver driver) {
	
	
	this.driver=driver;
	
}


By emailfield=By.xpath("//*[@id='loginform']/div[1]/input");

By passwordfield=By.xpath("//*[@id='loginform']/div[2]/input");

By loginButton=By.xpath("//*[@id='loginform']/div[3]/div/button");

By errormsg=By.xpath("//*[@id='loginform']/div[4]/div");





public WebElement emailfield() {
	
	return driver.findElement(emailfield);
	
}


public WebElement passwordfield() {
	
	return driver.findElement(passwordfield);
	
}



public WebElement loginButton() {
	
	return driver.findElement(loginButton);
	
}

public WebElement errormsg() {
	
	return driver.findElement(errormsg);
	
}

}
