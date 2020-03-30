package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Objects_Repo.eventspage_repo;
import Objects_Repo.landingpage_repo;
import Objects_Repo.recurring_eventpage_repo;

public class recurring_event_test {

	public WebDriver driver;
	public eventspage_repo eventspageObj;
	public landingpage_repo landingpageObj;
	public recurring_eventpage_repo recurringeventspageObj;
	
	
	
	recurring_event_test(WebDriver driver) {

		this.driver = driver;
		this.eventspageObj = new eventspage_repo(driver);
		this.landingpageObj = new landingpage_repo(driver);
        this.recurringeventspageObj=new recurring_eventpage_repo(driver);
	}

	public void clickevents_tab() throws InterruptedException {

		Thread.sleep(4000);
		landingpageObj.events_sidemenulist().click();

	}
	
	public void waiting() {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	public void add_recurring_events() throws InterruptedException {
		random_string_generator r = new random_string_generator();
	
		waiting();
		eventspageObj.Addnewevent_Button().click();

		int size = eventspageObj.events_cards().size();
		int choose_event;
		
		
		for ( choose_event = 0; choose_event < size; choose_event++) {

			if (choose_event == 2) {

				eventspageObj.events_cards().get(choose_event).click();
				break;

			}

		}

		eventspageObj.event_title_field().sendKeys("event"+r.randomString(4));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy('0','300')");
		waiting();
		
		
		eventspageObj.categoriesdropdown().click();
		
		waiting();
		

		int size1 = eventspageObj.deletecategoriesicon().size();
		for (int i = 0; i < size1; i++) {

			if (i == 0) {

				eventspageObj.deletecategoriesicon().get(i).click();
				break;
			}

		}

		JavascriptExecutor js1 = (JavascriptExecutor) driver;

		js1.executeScript("window.scrollBy('0','300')");

		eventspageObj.eventdescriptionfield().sendKeys("this is for testing purpose", r.randomString(5));
		eventspageObj.tagsfield().sendKeys(Keys.chord(r.randomString(3), Keys.ENTER));
		eventspageObj.emailfield().sendKeys(r.randomString(5) + "@" + r.randomString(4) + ".com");
		eventspageObj.landlinefield().sendKeys("042" + r.randomNumber(7));

		eventspageObj.mobilefield().sendKeys("03" + r.randomNumber(9));

		eventspageObj.savebutton().click();
		waiting();
		

		eventspageObj.nextbutton().click();
		waiting();
	
		
		int event_type=driver.findElements(By.xpath("//select[@name='ticketClassType']")).size();
		for(int i=0;i<event_type;i++) {
			
			if(i==0) {
				
				
				Select s=new Select(driver.findElements(By.xpath("//select[@name='ticketClassType']")).get(i));
				s.selectByVisibleText("PASS");
				
			}
			
			
		}

		
		eventspageObj.savebutton().click();
		
		waiting();

		eventspageObj.nextbutton().click();
		
		
		recurringeventspageObj.recurring_event_title().sendKeys(r.randomString(5));
		recurringeventspageObj.recurring_event_agenda().sendKeys(r.randomString(5));
	
		JavascriptExecutor js2 = (JavascriptExecutor) driver;

		js2.executeScript("window.scrollBy('0','300')");
		
		
		int dates=recurringeventspageObj.recurring_event_dates().size();

		for(int i=0;i<=dates;i++) {
			
			if(i==0) {
				
				
				recurringeventspageObj.recurring_event_dates().get(i).click();	
				
				waiting();

				recurringeventspageObj.current_date().click();
			}
			
			if(i==1) {
				recurringeventspageObj.recurring_event_dates().get(i).click();
				recurringeventspageObj.recurring_event_dates().get(i).sendKeys("2020-01-15");
	
			}
			
			
		}
		
		
		
	Select s11=new Select(recurringeventspageObj.repeat_dropdown());	
		s11.selectByIndex(0);
		
		
		
		

//		JavascriptExecutor js4 = (JavascriptExecutor) driver;
//
//		js4.executeScript("window.scrollBy('0','300')");
		
		
		
//		int size2 = eventspageObj.selectoption_dropdowns().size();
//
//		for (int i = 0; i < size2; i++) {
//
//			if (i == 0) {
//
//				WebElement first = eventspageObj.selectoption_dropdowns().get(i);
//				Select s = new Select(first);
//				s.selectByValue("false");
//
//			}
//
//			if (i == 1) {
//
//				WebElement second = eventspageObj.selectoption_dropdowns().get(i);
//				Select s = new Select(second);
//				Thread.sleep(3000);
//				s.selectByValue("false");
//				break;
//
//			}
//
//		}

		JavascriptExecutor js11 = (JavascriptExecutor) driver;

		js11.executeScript("window.scrollBy('0','300')");

		int schedulde_fields_size = recurringeventspageObj.recurring_datepickers().size();

		for (int i = 0; i < schedulde_fields_size; i++) {

			if (i == 0) {

				recurringeventspageObj.recurring_datepickers().get(i).click();

				

				int textcount1 = recurringeventspageObj.time_texts().size();
						//driver.findElements(By.xpath("//div[@class='rdtCount']")).size();
				int buttoncount1 = recurringeventspageObj.arrow_buttons().size();
						
						//driver.findElements(By.xpath("//span[@class='rdtBtn']")).size();

				for (int a = 0; a < textcount1; a++) {
					if (a == 0) {
						String actual = recurringeventspageObj.time_texts().get(a).getText();

						if (!(actual.equalsIgnoreCase("10"))) {

							for (int c = 0; c < buttoncount1; c++) {

								if (c == 0) {
									int k = 0;
									while (k < 10) {
										
										recurringeventspageObj.arrow_buttons().get(c).click();
										
										k++;
									}


								}
								
								if(c==4) {
									
									waiting();
								
									eventspageObj.arrow_buttons().get(c).click();	
									
									
								}	

							}
						}

					}

				}

			}

			if (i == 1) {
			
				waiting();
			
				recurringeventspageObj.recurring_datepickers().get(i).click();
				
				//recurringeventspageObj.currentdates().click();

//				JavascriptExecutor js3= (JavascriptExecutor) driver;
//				
//				js3.executeScript("window.scrollBy('0','200')");
				
				
				waiting();
				

				int textcount1 =recurringeventspageObj.time_texts().size();
						//driver.findElements(By.xpath("//div[@class='rdtCount']")).size();
				int buttoncount1 = recurringeventspageObj.arrow_buttons().size();
						//driver.findElements(By.xpath("//span[@class='rdtBtn']")).size();

				for (int a = 0; a < textcount1; a++) {
					if (a == 3) {
						String actual = recurringeventspageObj.time_texts().get(a).getText();
								//driver.findElements(By.xpath("//div[@class='rdtCount']")).get(a).getText();

						if (!(actual.equalsIgnoreCase("11"))) {

							for (int c = 0; c < buttoncount1; c++) {

								if (c == 6) {
									int k = 0;
									while (k < 11) {
										recurringeventspageObj.arrow_buttons().get(c).click();
										//driver.findElements(By.xpath("//span[@class='rdtBtn']")).get(c).click();
										k++;
									}

						

								}
								if(c==10) {
									waiting();
									eventspageObj.arrow_buttons().get(c).click();			
									
								}
							}
						}

					}

				}

			}

			if (i == 2) {
				

				
				waiting();
				recurringeventspageObj.recurring_datepickers().get(i).click();
				

				
				
				int textcount1 = recurringeventspageObj.time_texts().size();
				
				int buttoncount1 = recurringeventspageObj.arrow_buttons().size();
					

				for (int a = 0; a < textcount1; a++) {
					if (a == 6) {
						String actual = recurringeventspageObj.time_texts().get(a).getText();
								

						if (!(actual.equalsIgnoreCase("9"))) {

							for (int c = 0; c < buttoncount1; c++) {

								if (c == 12) {
									int k = 0;
									while (k < 9) {
										recurringeventspageObj.arrow_buttons().get(c).click();
										
										k++;
									}


								}
								
								if(c==16) {
									waiting();
									eventspageObj.arrow_buttons().get(c).click();		
									
								}
								
						

							}
						}

					}

				}

			}

			if (i == 3) {
	
				waiting();
				recurringeventspageObj.recurring_datepickers().get(i).click();

				
				
				int textcount1 = recurringeventspageObj.time_texts().size();
				
				int buttoncount1 = recurringeventspageObj.arrow_buttons().size();
				

				for (int a = 0; a < textcount1; a++) {
					if (a == 9) {
						String actualhrs = recurringeventspageObj.time_texts().get(a).getText();
							
						String actualmins =recurringeventspageObj.time_texts().get(a+1).getText();
					

						if (!((actualhrs.equalsIgnoreCase("9")) && (actualmins.equalsIgnoreCase("20")))) {

							for (int c = 0; c < buttoncount1; c++) {

								if (c == 18) {
									int k = 0;
									while (k < 9) {
										
										recurringeventspageObj.arrow_buttons().get(c).click();
									
										k++;
										//break;
									}
								}
								if (c == 20) {
									int p = 0;
									while (p < 20) {
										recurringeventspageObj.arrow_buttons().get(c).click();
										
										p++;
									}
								}

								if(c==22) {
									waiting();
									eventspageObj.arrow_buttons().get(c).click();
									
									
								}
							
							
							}

						}

					}

				}
			}
	

		
		
		
		
		}
		waiting();
		JavascriptExecutor js10 = (JavascriptExecutor) driver;

		js10.executeScript("window.scrollBy('0','400')");
		
		waiting();
		Select s=new Select(eventspageObj.selectvenue());
		s.selectByVisibleText("Emporium");
		
		int seatbuttons=recurringeventspageObj.seatstype().size();
				
			
		
		for(int i=0;i<=seatbuttons;i++) {
			
			String matched=recurringeventspageObj.seatstype().get(i).getText();
				
				if(matched.equalsIgnoreCase("BUSINESS")) {
					
					
					recurringeventspageObj.seatstype().get(i).click();
					break;
				}
				
			}
			
		waiting();
		JavascriptExecutor js9 = (JavascriptExecutor) driver;

		js9.executeScript("window.scrollBy('0','200')");
		
		int seatsize=recurringeventspageObj.seatscheckboxes().size();
				
		

		
		for(int i=0;i<seatsize;i++) {
	
	
	if(i<10) {
		
		recurringeventspageObj.seatscheckboxes().get(i).click();
		
	}
	
}
		
		int ticket_prices=recurringeventspageObj.tickets_prices().size();




		for(int i=0;i<ticket_prices;i++) {




			recurringeventspageObj.tickets_prices().get(i).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.BACK_SPACE),"100");;



		}
		
		
		
		
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
        WebElement moveto_imagesection=driver.findElement(By.xpath("//div[@class='col']/h3"));
		js3.executeScript("arguments[0].scrollIntoView(true);",moveto_imagesection);
		
		
		eventspageObj.uploadimage().sendKeys("C:\\Users\\Hamza Farooq\\Desktop\\Office work\\Testing data\\pexels-photo-302769.jpeg");
	
		waiting();
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("arguments[0].scrollIntoView(true);",recurringeventspageObj.lastsave_button());	
		
		recurringeventspageObj.lastsave_button().click();
		Thread.sleep(2000);
		recurringeventspageObj.publish_event_button().click();
	
	
		
		waiting();
		recurringeventspageObj.nextbutton().click();
		

		waiting();
		recurringeventspageObj.pass_title().sendKeys(r.randomString(5));
		
		recurringeventspageObj.pass_count().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.BACK_SPACE),"5");
		
		
		waiting();
		JavascriptExecutor js6 = (JavascriptExecutor) driver;

		js6.executeScript("window.scrollBy('0','100')");	
		
		
		recurringeventspageObj.select_slot_dropdown().click();
		
		waiting();
		Actions a=new Actions(driver);
		
		a.moveToElement(recurringeventspageObj.select_slot_dropdown()).sendKeys(Keys.chord(Keys.DOWN,Keys.ENTER)).build().perform();

		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//recurringeventspageObj.select_slot_dropdown().sendKeys(Keys.chord(Keys.DOWN,Keys.ENTER));
	
		Select sa=new Select(recurringeventspageObj.select_class());
		sa.selectByIndex(0);
		waiting();
		
		JavascriptExecutor js7 = (JavascriptExecutor) driver;

		js7.executeScript("window.scrollBy('0','100')");
		
		recurringeventspageObj.pass_price().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.BACK_SPACE),"100");
	
		waiting();
		recurringeventspageObj.save_pass_button().click();
	
	}	
	

	




}
