package Objects_Repo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class recurring_eventpage_repo {
	
	
	public WebDriver driver;

	public recurring_eventpage_repo(WebDriver driver) {
		
		
		this.driver=driver;
		
	}
	
	
	
	By recurring_event_title=By.xpath("//input[@name='title']");
	
	By recurring_event_agenda=By.xpath("//input[@name='agenda']");
	
	By recurring_event_dates=By.xpath("//input[@placeholder='Datetime']");
	
	By current_date=By.xpath("//td[@class='rdtDay rdtToday']");
	
	By repeat_dropdown=By.xpath("//select[@name='repeatType']");
	
	By recurring_datepickers=By.xpath("//input[@placeholder='Time Picker Here']");
	

By time_texts=By.xpath("//div[@class='rdtCount']");
By arrow_buttons=By.xpath("//span[@class='rdtBtn']");
	
By selectvenue=By.xpath("//select[@name='venueId']");

By seatstype=By.xpath("//button[@class='btn btn-secondary']");
By seatscheckboxes=By.xpath("//div[@class='seats-box']");


By tickets_prices=By.xpath("//input[@name='ticketClassPrice']");

By uploadimage=By.xpath("//input[@accept='image/*']");



By pass_title=By.xpath("//input[@name='passTitle']");

By pass_count=By.xpath("//input[@name='availablePassCount']");

By select_slot_dropdown=By.xpath("//div[@class='css-1hwfws3']");

By select_class=By.xpath("//select[@name='ticketClassId']");

By pass_price=By.xpath("//input[@name='passPrice']");

By lastsave_button=By.xpath("//div[@class='col-md-6'] //button[@class='btn btn-secondary']");

By publish_event_button=By.xpath("//button[@class='ant-btn ant-btn-primary ant-btn-sm']");

By savebutton=By.xpath("//button[@class='btn color-one btn btn-secondary']");
By nextbutton=By.xpath("//button[@id='next-button']");

By save_pass_button=By.xpath("//button[text()='Save Pass']");

	public WebElement recurring_event_title() {
		
		return driver.findElement(recurring_event_title);
		
	}
	
	
	
	public WebElement recurring_event_agenda() {
		
		return driver.findElement(recurring_event_agenda);
		
	}
	
	
	public List<WebElement> recurring_event_dates() {
		
		return driver.findElements(recurring_event_dates);
		
	}
	
	
	public WebElement current_date() {
		
		return driver.findElement(current_date);
		
	}
	
	public WebElement repeat_dropdown() {
		
		return driver.findElement(repeat_dropdown);
		
	}

	
	
	public List<WebElement> recurring_datepickers() {
		
		return driver.findElements(recurring_datepickers);
		
	}
	

	public List<WebElement> time_texts(){
		
		return driver.findElements(time_texts);
	}


	public List<WebElement> arrow_buttons(){
		
		
		return driver.findElements(arrow_buttons);
	}
	
	
	
	public WebElement selectvenue() {
		
		return driver.findElement(selectvenue);
		
	}
	
	public List <WebElement> seatstype() {
		
		return driver.findElements(seatstype);
		
	}
	
public List <WebElement> seatscheckboxes() {
		
		return driver.findElements(seatscheckboxes);
		
	}
	
	
public List <WebElement> tickets_prices() {
	
	return driver.findElements(tickets_prices);
	
}


	public WebElement uploadimage() {
		
		return driver.findElement(uploadimage);
		
	}
	
	
	
	public WebElement pass_title() {
		
		return driver.findElement(pass_title);
		
	}
	
	
	public WebElement pass_count() {
		
		return driver.findElement(pass_count);
	
	}
	
	
public WebElement select_slot_dropdown() {
		
		return driver.findElement(select_slot_dropdown);
	
	}
	
	

public WebElement select_class() {
	
	return driver.findElement(select_class);

}

public WebElement pass_price() {
	
	return driver.findElement(pass_price);

}

public WebElement lastsave_button() {
	
	return driver.findElement(lastsave_button);
	
}


public WebElement publish_event_button() {
	
	return driver.findElement(publish_event_button);
	
}




public WebElement savebutton() {
	
	return driver.findElement(savebutton);
	
}

public WebElement nextbutton() {
	
	return driver.findElement(nextbutton);
	
}
	

public WebElement save_pass_button() {
	
	return driver.findElement(save_pass_button);
	
}


}
