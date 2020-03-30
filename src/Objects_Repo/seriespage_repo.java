package Objects_Repo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class seriespage_repo {


	public WebDriver driver;

	public seriespage_repo(WebDriver driver) {
		
		
		this.driver=driver;
		
	}


	By Addnewevent_Button=By.xpath("//button[@class='btn btn-secondary']");

	By searchevents_field=By.id("input1-group2");

	By events_cards=By.xpath("//div[@class='card-body']");


	By event_title_field=By.xpath("//input[@placeholder='Event Title']");
	By categoriesdropdown=By.xpath("//span[@class='ant-select-search__field__placeholder']");
	By deletecategoriesicon=By.xpath("//span[@class='ant-select-tree-checkbox-inner']");

	By eventdescriptionfield=By.xpath("//textarea[@placeholder='Event Description']");
	By tagsfield=By.xpath("//input[@placeholder='Add a tag']");

	By emailfield=By.xpath("//input[@type='email']");
	By landlinefield=By.xpath("//input[@name='landline']");
	By mobilefield=By.xpath("//input[@name='mobile']");


	By savebutton=By.xpath("//button[@class='btn color-one btn btn-secondary']");
	By nextbutton=By.xpath("//button[@id='next-button']");


	By selectoption_dropdowns=By.xpath("//select[@class='form-control']");
	By datepickers=By.xpath("//div[@class='rdt']");
	By currentdates=By.xpath("//td[@class='rdtDay rdtToday']");
	By select_date=By.xpath("//td[@class='rdtTimeToggle']");

    By add_slot_button=By.xpath("//div[@class='col-md-6'] //button[@class='btn btn-primary btn-lg']");

    By series_event_title=By.xpath("//input[@name='title']");
	
	By series_event_agenda=By.xpath("//input[@name='agenda']");
	
	
	By time_texts=By.xpath("//div[@class='rdtCount']");
	By arrow_buttons=By.xpath("//span[@class='rdtBtn']");


	By selectvenue=By.xpath("//select[@name='venueId']");
	By uploadimage=By.xpath("//input[@accept='image/*']");


	
	By lastsave_button=By.xpath("//button[@class='margin-bottom-20 btn btn-secondary']");

	By errormsg_OK_button=By.xpath("//button[@class='swal-button swal-button--confirm']");

	By pass_title=By.xpath("//input[@name='passTitle']");

	By pass_count=By.xpath("//input[@name='availablePassCount']");

	By select_slot_dropdown=By.xpath("//div[@class='css-1hwfws3']");

	By select_class=By.xpath("//select[@name='ticketClassId']");

	By pass_price=By.xpath("//input[@name='passPrice']");

	

	By publish_event_button=By.xpath("//button[@class='ant-btn ant-btn-primary ant-btn-sm']");

	By save_pass_button=By.xpath("//button[text()='Save Pass']");
	

	public WebElement Addnewevent_Button() {
		
		return driver.findElement(Addnewevent_Button);
		
	}


	public WebElement searchevents_field() {
		
		return driver.findElement(searchevents_field);
		
	}


	public List<WebElement> events_cards() {
		
		return driver.findElements(events_cards);
		
	}


	public WebElement event_title_field() {
		
		return driver.findElement(event_title_field);
		
	}


	public WebElement categoriesdropdown() {
		
		return driver.findElement(categoriesdropdown);
		
	}


	public List<WebElement> deletecategoriesicon() {
		
		return driver.findElements(deletecategoriesicon);
		
	}

	public WebElement eventdescriptionfield() {
		
		return driver.findElement(eventdescriptionfield);
		
	}

	public WebElement tagsfield() {
		
		return driver.findElement(tagsfield);
		
	}


	public WebElement emailfield() {
		
		return driver.findElement(emailfield);
		
	}



	public WebElement landlinefield() {
		
		return driver.findElement(landlinefield);
		
	}

	public WebElement mobilefield() {
		
		return driver.findElement(mobilefield);
		
	}

	public WebElement savebutton() {
		
		return driver.findElement(savebutton);
		
	}

	public WebElement nextbutton() {
		
		return driver.findElement(nextbutton);
		
	}

	public List<WebElement> selectoption_dropdowns() {
		
		return driver.findElements(selectoption_dropdowns);
		
	}

	public List<WebElement> datepickers() {
		
		return driver.findElements(datepickers);
		
	}

	public WebElement currentdates() {
		
		return driver.findElement(currentdates);
		
	}


	public WebElement select_date() {
		
		return driver.findElement(select_date);
		
	}




	public WebElement add_slot_button() {
		
		return driver.findElement(add_slot_button);
		
	}
	
public WebElement series_event_title() {
		
		return driver.findElement(series_event_title);
		
	}

public WebElement series_event_agenda() {
	
	return driver.findElement(series_event_agenda);
	
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

	public WebElement uploadimage() {
		
		return driver.findElement(uploadimage);
		
	}



	public WebElement errormsg_OK_button() {
		
		return driver.findElement(errormsg_OK_button);
		
	}


	public WebElement lastsave_button() {
		
		return driver.findElement(lastsave_button);
		
	}
	
public WebElement publish_event_button() {
		
		return driver.findElement(publish_event_button);
		
	}

	
}
