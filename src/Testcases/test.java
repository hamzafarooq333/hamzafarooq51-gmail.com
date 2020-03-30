package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("http://192.168.1.161:3000/");
		By emailfield=By.xpath("//*[@id='loginform']/div[1]/input");

		By passwordfield=By.xpath("//*[@id='loginform']/div[2]/input");
		
		By loginButton=By.xpath("//*[@id='loginform']/div[3]/div/button");
		
		

		driver.findElement(emailfield).sendKeys("master");
		
		driver.findElement(passwordfield).sendKeys("123456");
		
		driver.findElement(loginButton).click();
		
		driver.manage().window().maximize();
		
		
		By refund_sidemenulist=By.linkText("Refund");
		
		Thread.sleep(3000);
		driver.findElement(refund_sidemenulist).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='ant-calendar-range-picker-input']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@class='ant-calendar-cell ant-calendar-today ant-calendar-selected-start-date ant-calendar-selected-end-date ant-calendar-selected-day']")).click();
		Thread.sleep(2000);	
	int size=driver.findElements(By.xpath("//div[@class='ant-calendar-range-part ant-calendar-range-right'] //td[@class='ant-calendar-cell']")).size();
	
	for(int i=0;i<size;i++) {
		
		
		if(i==5) {
			
			Thread.sleep(3000);
			
			
		driver.findElements(By.xpath("//div[@class='ant-calendar-range-part ant-calendar-range-right'] //td[@class='ant-calendar-cell']")).get(i).click();
			break;
		}
		
	}
	
	
	}
	
}
