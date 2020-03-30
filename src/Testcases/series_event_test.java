package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Objects_Repo.eventspage_repo;
import Objects_Repo.landingpage_repo;
import Objects_Repo.recurring_eventpage_repo;
import Objects_Repo.seriespage_repo;

public class series_event_test {

	
	public WebDriver driver;
	public eventspage_repo eventspageObj;
	public landingpage_repo landingpageObj;
	public recurring_eventpage_repo recurringeventspageObj;
	public seriespage_repo seriespageObj;
	
	
	series_event_test(WebDriver driver) {

		this.driver = driver;
		this.eventspageObj = new eventspage_repo(driver);
		this.landingpageObj = new landingpage_repo(driver);
        this.recurringeventspageObj=new recurring_eventpage_repo(driver);
        this.seriespageObj=new seriespage_repo(driver);
	}

	public void clickevents_tab() throws InterruptedException {

		Thread.sleep(7000);
		landingpageObj.events_sidemenulist().click();

	}
	
	public void waiting() {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	public void add_series_events() throws InterruptedException {
		random_string_generator r = new random_string_generator();
		
		waiting();
		eventspageObj.Addnewevent_Button().click();

		int size = eventspageObj.events_cards().size();
		int choose_event;
		
		
		for ( choose_event = 0; choose_event < size; choose_event++) {

			if (choose_event == 1) {

				eventspageObj.events_cards().get(choose_event).click();
				break;

			}

		}

		eventspageObj.event_title_field().sendKeys("event"+r.randomString(4));
		//Thread.sleep(7000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy('0','300')");
		
		waiting();

		
		
		eventspageObj.categoriesdropdown().click();
		waiting();
	
		
		//	driver.findElement(By.xpath("//*[@id=\'rc-tree-select-list_2\']/ul/li[1]/span[2]/span")).click();
		//eventspageObj.event_title_field().click();
		// eventspageObj.categoriesdropdown().sendKeys(Keys.chord(Keys.TAB,Keys.ARROW_DOWN));;
		//eventspageObj.event_title_field().sendKeys(Keys.chord(Keys.TAB, Keys.TAB, Keys.ENTER, Keys.DOWN, Keys.ENTER));

		//eventspageObj.event_title_field().click();
		// eventspageObj.categoriesdropdown().sendKeys(Keys.chord(Keys.TAB,Keys.ARROW_DOWN));;
//		eventspageObj.event_title_field()
//				.sendKeys(Keys.chord(Keys.TAB, Keys.TAB, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER));
		
		//Thread.sleep(3000);

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
		
//		int event_type=driver.findElements(By.xpath("//select[@name='ticketClassType']")).size();
//		for(int i=0;i<event_type;i++) {
//			
//			if(i==0) {
//				
//				
//				Select s=new Select(driver.findElements(By.xpath("//select[@name='ticketClassType']")).get(i));
//				s.selectByVisibleText("PASS");
//				
//			}
//			
//			
//		}

		
		eventspageObj.savebutton().click();
		waiting();
		eventspageObj.nextbutton().click();
		
		waiting();
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']")).click();
		
		
		
		
		waiting();
		int schedulde_fields_size = seriespageObj.datepickers().size();

		for (int i = 0; i < schedulde_fields_size; i++) {

			if (i == 0) {

				seriespageObj.datepickers().get(i).click();
				seriespageObj.currentdates().click();

				JavascriptExecutor js3 = (JavascriptExecutor) driver;

				js3.executeScript("window.scrollBy('0','200')");
				waiting();
				seriespageObj.select_date().click();
				//driver.findElement(By.xpath("//td[@class='rdtTimeToggle']")).click();

				int textcount1 = seriespageObj.time_texts().size();
						//driver.findElements(By.xpath("//div[@class='rdtCount']")).size();
				int buttoncount1 = seriespageObj.arrow_buttons().size();
						
						//driver.findElements(By.xpath("//span[@class='rdtBtn']")).size();

				for (int a = 0; a < textcount1; a++) {
					if (a == 0) {
						String actual = seriespageObj.time_texts().get(a).getText();

						if (!(actual.equalsIgnoreCase("10"))) {

							for (int c = 0; c < buttoncount1; c++) {

								if (c == 0) {
									int k = 0;
									while (k < 10) {
										
										seriespageObj.arrow_buttons().get(c).click();
										//driver.findElements(By.xpath("//span[@class='rdtBtn']")).get(c).click();
										k++;
									}
									
									//seriespageObj.datepickers().get(i).sendKeys(Keys.TAB);
									//break;

								}
								
								
								if(c==4) {
									waiting();
									eventspageObj.arrow_buttons().get(c).click();	
									seriespageObj.datepickers().get(i).click();
									
									
								}	
							
							
							}
						}

					}

				}

			}

			if (i == 1) {
				waiting();
				//seriespageObj.datepickers().get(i).sendKeys(Keys.TAB);;
				//Thread.sleep(2000);
				//seriespageObj.datepickers().get(i).click();
				seriespageObj.currentdates().click();

//				JavascriptExecutor js3= (JavascriptExecutor) driver;
//				
//				js3.executeScript("window.scrollBy('0','200')");
				waiting();
				seriespageObj.select_date().click();

				int textcount1 =seriespageObj.time_texts().size();
						//driver.findElements(By.xpath("//div[@class='rdtCount']")).size();
				int buttoncount1 = seriespageObj.arrow_buttons().size();
						//driver.findElements(By.xpath("//span[@class='rdtBtn']")).size();

				for (int a = 0; a < textcount1; a++) {
					if (a == 3) {
						String actual = seriespageObj.time_texts().get(a).getText();
								//driver.findElements(By.xpath("//div[@class='rdtCount']")).get(a).getText();

						if (!(actual.equalsIgnoreCase("11"))) {

							for (int c = 0; c < buttoncount1; c++) {

								if (c == 6) {
									int k = 0;
									while (k < 11) {
										seriespageObj.arrow_buttons().get(c).click();
										//driver.findElements(By.xpath("//span[@class='rdtBtn']")).get(c).click();
										k++;
									}
									
									//break;

								}

								
								if(c==10) {
									waiting();
									eventspageObj.arrow_buttons().get(c).click();	
									seriespageObj.datepickers().get(i).click();
									
								}
								
							}
						}

					}

				}

			}

			if (i == 2) {
				//driver.findElement(By.xpath("//html")).click();
				//eventspageObj.selectvenue().click();
				waiting();
				//seriespageObj.datepickers().get(i).click();
				seriespageObj.currentdates().click();

//				JavascriptExecutor js3= (JavascriptExecutor) driver;
//				
//				js3.executeScript("window.scrollBy('0','200')");
				waiting();
				seriespageObj.select_date().click();

				int textcount1 = seriespageObj.time_texts().size();
						//driver.findElements(By.xpath("//div[@class='rdtCount']")).size();
				int buttoncount1 = seriespageObj.arrow_buttons().size();
						//driver.findElements(By.xpath("//span[@class='rdtBtn']")).size();

				for (int a = 0; a < textcount1; a++) {
					if (a == 6) {
						String actual = seriespageObj.time_texts().get(a).getText();
								//driver.findElements(By.xpath("//div[@class='rdtCount']")).get(a).getText();

						if (!(actual.equalsIgnoreCase("9"))) {

							for (int c = 0; c < buttoncount1; c++) {

								if (c == 12) {
									int k = 0;
									while (k < 9) {
										seriespageObj.arrow_buttons().get(c).click();
										//driver.findElements(By.xpath("//span[@class='rdtBtn']")).get(c).click();
										k++;
									}
								
								//	break;

								}
								
								if(c==16) {
									waiting();
									eventspageObj.arrow_buttons().get(c).click();
									seriespageObj.datepickers().get(i).click();
									
								}
							}
						}

					}

				}

			}

			if (i == 3) {
				//driver.findElement(By.xpath("//html")).click();
				//eventspageObj.selectvenue().click();
				waiting();
				//seriespageObj.datepickers().get(i).click();
				seriespageObj.currentdates().click();

//				JavascriptExecutor js3= (JavascriptExecutor) driver;
//				
//				js3.executeScript("window.scrollBy('0','200')");
				waiting();
				seriespageObj.select_date().click();

				int textcount1 = seriespageObj.time_texts().size();
						//driver.findElements(By.xpath("//div[@class='rdtCount']")).size();
				int buttoncount1 = seriespageObj.arrow_buttons().size();
						//driver.findElements(By.xpath("//span[@class='rdtBtn']")).size();

				for (int a = 0; a < textcount1; a++) {
					if (a == 9) {
						String actualhrs = seriespageObj.time_texts().get(a).getText();
								//driver.findElements(By.xpath("//div[@class='rdtCount']")).get(a).getText();
						String actualmins =seriespageObj.time_texts().get(a+1).getText();
								//driver.findElements(By.xpath("//div[@class='rdtCount']")).get(a + 1).getText();

						if (!((actualhrs.equalsIgnoreCase("9")) && (actualmins.equalsIgnoreCase("20")))) {

							for (int c = 0; c < buttoncount1; c++) {

								if (c == 18) {
									int k = 0;
									while (k < 9) {
										
										seriespageObj.arrow_buttons().get(c).click();
										//driver.findElements(By.xpath("//span[@class='rdtBtn']")).get(c).click();
										k++;
										//break;
									}
								}
								if (c == 20) {
									int p = 0;
									while (p < 20) {
										seriespageObj.arrow_buttons().get(c).click();
										//driver.findElements(By.xpath("//span[@class='rdtBtn']")).get(c).click();
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
		
		seriespageObj.add_slot_button().click();			
		seriespageObj.series_event_title().sendKeys(r.randomString(5));
		seriespageObj.series_event_agenda().sendKeys(r.randomString(5));
	


		
		
		
		
		waiting();
		JavascriptExecutor js10 = (JavascriptExecutor) driver;

		js10.executeScript("window.scrollBy('0','400')");
		
		waiting();
		Select s=new Select(seriespageObj.selectvenue());
		s.selectByVisibleText("Emporium");
		
		int seatbuttons=recurringeventspageObj.seatstype().size();
				
				//driver.findElements(By.xpath("//button[@class='btn btn-secondary']")).size();
		
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
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
WebElement moveto_imagesection=driver.findElement(By.xpath("//div[@class='col']/h3"));
		js3.executeScript("arguments[0].scrollIntoView(true);",moveto_imagesection);
		
		waiting();
		eventspageObj.uploadimage().sendKeys("C:\\Users\\Hamza Farooq\\Desktop\\Office work\\Testing data\\pexels-photo-302769.jpeg");
		
		WebDriverWait d = new WebDriverWait(driver, 10);

		d.until(ExpectedConditions.invisibilityOf(eventspageObj.uploadimage()));
		
		
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("arguments[0].scrollIntoView(true);",seriespageObj.lastsave_button());	
		
		
		waiting();
		seriespageObj.lastsave_button().click();
		
		
		//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(seriespageObj.publish_event_button())).click();
		waiting();

		seriespageObj.publish_event_button().click();
		
		
		
		
//		Thread.sleep(5000);
//		recurringeventspageObj.nextbutton().click();
//		
//		Thread.sleep(2000);
//		recurringeventspageObj.pass_title().sendKeys(r.randomString(5));
//		
//		recurringeventspageObj.pass_count().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.BACK_SPACE),"5");
//		
//		
//		Thread.sleep(3000);
//		JavascriptExecutor js6 = (JavascriptExecutor) driver;
//
//		js6.executeScript("window.scrollBy('0','100')");	
//		
//		recurringeventspageObj.pass_count().sendKeys(Keys.chord(Keys.TAB,Keys.DOWN,Keys.ENTER));
////		recurringeventspageObj.select_slot_dropdown().click();
////		recurringeventspageObj.select_slot_dropdown().sendKeys(Keys.chord(Keys.DOWN,Keys.ENTER));
//	
//		Select sa=new Select(recurringeventspageObj.select_class());
//		sa.selectByIndex(0);
//		Thread.sleep(3000);
//		
//		JavascriptExecutor js7 = (JavascriptExecutor) driver;
//
//		js7.executeScript("window.scrollBy('0','100')");
//		
//		recurringeventspageObj.pass_price().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.BACK_SPACE),"100");
//	
//		Thread.sleep(3000);
//		recurringeventspageObj.save_pass_button().click();
//	
//	}	
//	

	



	
	}
	
	
}
