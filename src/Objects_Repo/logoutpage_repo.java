package Objects_Repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class logoutpage_repo {

	
	
	public WebDriver driver;

	public logoutpage_repo(WebDriver driver) {
		
		
		this.driver=driver;
		
	}
	
	
	By logoutbutton=By.xpath("//span[@class='login-logout white']");
	
	
	
	public WebElement logoutbutton() {
		
		return driver.findElement(logoutbutton);
		
		
	}
	
	
}
