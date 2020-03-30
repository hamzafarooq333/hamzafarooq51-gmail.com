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
import Objects_Repo.loginpage_repo;
import Objects_Repo.recurring_eventpage_repo;

public class events_test {

	public WebDriver driver;
	public eventspage_repo eventspageObj;
	public landingpage_repo landingpageObj;

	events_test(WebDriver driver) {

		this.driver = driver;
		this.eventspageObj = new eventspage_repo(driver);
		this.landingpageObj = new landingpage_repo(driver);

	}

	public void clickevents_tab() throws InterruptedException {

		Thread.sleep(4000);
		landingpageObj.events_sidemenulist().click();

	}

	public void waiting() {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	public void addevents() throws InterruptedException {
		random_string_generator r = new random_string_generator();
//		Thread.sleep(3000);
		// new WebDriverWait(driver,
		// 20).until(ExpectedConditions.elementToBeClickable(eventspageObj.Addnewevent_Button())).click();

		waiting();
		eventspageObj.Addnewevent_Button().click();

		int size = eventspageObj.events_cards().size();
		int choose_event;

		for (choose_event = 0; choose_event < size; choose_event++) {

			if (choose_event == 0) {

				eventspageObj.events_cards().get(choose_event).click();
				break;

			}

		}

		eventspageObj.event_title_field().sendKeys("event" + r.randomString(4));
		// Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy('0','300')");
		// Thread.sleep(3000);
		waiting();
		eventspageObj.categoriesdropdown().click();
		waiting();

		// Thread.sleep(3000);

		// driver.findElement(By.xpath("//*[@id=\'rc-tree-select-list_2\']/ul/li[1]/span[2]/span")).click();
		// eventspageObj.event_title_field().click();
		// eventspageObj.categoriesdropdown().sendKeys(Keys.chord(Keys.TAB,Keys.ARROW_DOWN));;
		// eventspageObj.event_title_field().sendKeys(Keys.chord(Keys.TAB, Keys.TAB,
		// Keys.ENTER, Keys.DOWN, Keys.ENTER));

		// eventspageObj.event_title_field().click();
		// eventspageObj.categoriesdropdown().sendKeys(Keys.chord(Keys.TAB,Keys.ARROW_DOWN));;
//		eventspageObj.event_title_field()
//				.sendKeys(Keys.chord(Keys.TAB, Keys.TAB, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER));

		int size1 = eventspageObj.deletecategoriesicon().size();
		for (int i = 0; i < size1; i++) {

			if (i == 5) {

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
		// Thread.sleep(3000);
		waiting();
		eventspageObj.nextbutton().click();
		// Thread.sleep(3000);
		waiting();
		eventspageObj.savebutton().click();
		// Thread.sleep(3000);
		waiting();
		eventspageObj.nextbutton().click();

		int size2 = eventspageObj.selectoption_dropdowns().size();

		for (int i = 0; i < size2; i++) {

			if (i == 0) {

				WebElement first = eventspageObj.selectoption_dropdowns().get(i);
				Select s = new Select(first);
				s.selectByValue("false");

			}

			if (i == 1) {

				WebElement second = eventspageObj.selectoption_dropdowns().get(i);
				Select s = new Select(second);
				Thread.sleep(3000);
				s.selectByValue("false");
				break;

			}

		}

		JavascriptExecutor js2 = (JavascriptExecutor) driver;

		js2.executeScript("window.scrollBy('0','300')");

		int schedulde_fields_size = eventspageObj.datepickers().size();

		for (int i = 0; i < schedulde_fields_size; i++) {

			if (i == 0) {

				eventspageObj.datepickers().get(i).click();
				eventspageObj.currentdates().click();

				JavascriptExecutor js3 = (JavascriptExecutor) driver;

				js3.executeScript("window.scrollBy('0','200')");

				waiting();
				eventspageObj.select_date().click();

				int textcount1 = eventspageObj.time_texts().size();

				int buttoncount1 = eventspageObj.arrow_buttons().size();

				for (int a = 0; a < textcount1; a++) {
					if (a == 0) {
						String actual = eventspageObj.time_texts().get(a).getText();

						if (!(actual.equalsIgnoreCase("10"))) {

							for (int c = 0; c < buttoncount1; c++) {

								if (c == 0) {
									int k = 0;
									while (k < 10) {

										eventspageObj.arrow_buttons().get(c).click();

										k++;
									}

								}

								if (c == 4) {

									waiting();
									eventspageObj.arrow_buttons().get(c).click();

								}

							}
						}

					}

				}

			}

			if (i == 1) {
				eventspageObj.selectvenue().click();

				waiting();
				eventspageObj.datepickers().get(i).click();
				eventspageObj.currentdates().click();

//				JavascriptExecutor js3= (JavascriptExecutor) driver;
//				
//				js3.executeScript("window.scrollBy('0','200')");
				// Thread.sleep(3000);
				waiting();
				eventspageObj.select_date().click();

				int textcount1 = eventspageObj.time_texts().size();

				int buttoncount1 = eventspageObj.arrow_buttons().size();

				for (int a = 0; a < textcount1; a++) {
					if (a == 3) {
						String actual = eventspageObj.time_texts().get(a).getText();

						if (!(actual.equalsIgnoreCase("11"))) {

							for (int c = 0; c < buttoncount1; c++) {

								if (c == 6) {
									int k = 0;
									while (k < 11) {
										eventspageObj.arrow_buttons().get(c).click();

										k++;
									}

								}

								if (c == 10) {

									waiting();
									eventspageObj.arrow_buttons().get(c).click();

								}

							}
						}

					}

				}

			}

			if (i == 2) {
				eventspageObj.selectvenue().click();

				waiting();
				eventspageObj.datepickers().get(i).click();
				eventspageObj.currentdates().click();

//				JavascriptExecutor js3= (JavascriptExecutor) driver;
//				
//				js3.executeScript("window.scrollBy('0','200')");

				waiting();
				driver.findElement(By.xpath("//td[@class='rdtTimeToggle']")).click();

				int textcount1 = eventspageObj.time_texts().size();

				int buttoncount1 = eventspageObj.arrow_buttons().size();

				for (int a = 0; a < textcount1; a++) {
					if (a == 6) {
						String actual = eventspageObj.time_texts().get(a).getText();

						if (!(actual.equalsIgnoreCase("9"))) {

							for (int c = 0; c < buttoncount1; c++) {

								if (c == 12) {
									int k = 0;
									while (k < 9) {
										eventspageObj.arrow_buttons().get(c).click();

										k++;
									}

								}

								if (c == 16) {

									waiting();
									eventspageObj.arrow_buttons().get(c).click();

								}

							}
						}

					}

				}

			}

			if (i == 3) {
				eventspageObj.selectvenue().click();

				waiting();
				eventspageObj.datepickers().get(i).click();
				eventspageObj.currentdates().click();

//				JavascriptExecutor js3= (JavascriptExecutor) driver;
//				
//				js3.executeScript("window.scrollBy('0','200')");

				waiting();
				eventspageObj.select_date().click();

				int textcount1 = eventspageObj.time_texts().size();

				int buttoncount1 = eventspageObj.arrow_buttons().size();

				for (int a = 0; a < textcount1; a++) {
					if (a == 9) {
						String actualhrs = eventspageObj.time_texts().get(a).getText();

						String actualmins = eventspageObj.time_texts().get(a + 1).getText();

						if (!((actualhrs.equalsIgnoreCase("9")) && (actualmins.equalsIgnoreCase("20")))) {

							for (int c = 0; c < buttoncount1; c++) {

								if (c == 18) {
									int k = 0;
									while (k < 9) {

										eventspageObj.arrow_buttons().get(c).click();

										k++;

									}
								}
								if (c == 20) {
									int p = 0;
									while (p < 20) {
										eventspageObj.arrow_buttons().get(c).click();

										p++;
									}
								}

								if (c == 22) {

									waiting();
									eventspageObj.arrow_buttons().get(c).click();

								}

							}

						}

					}

				}
			}

		}

		Select s = new Select(eventspageObj.selectvenue());
		s.selectByVisibleText("Synavos");

		int seatbuttons = eventspageObj.seatstype().size();

		for (int i = 0; i <= seatbuttons; i++) {

			String matched = eventspageObj.seatstype().get(i).getText();

			if (matched.equalsIgnoreCase("BUSINESS")) {

				eventspageObj.seatstype().get(i).click();
				break;
			}

		}

		waiting();
		JavascriptExecutor js9 = (JavascriptExecutor) driver;

		js9.executeScript("window.scrollBy('0','200')");

		int seatsize = eventspageObj.seatscheckboxes().size();

		for (int i = 0; i < seatsize; i++) {

			if (i < 10) {

				eventspageObj.seatscheckboxes().get(i).click();

			}

		}

		int ticket_prices = eventspageObj.tickets_prices().size();

		for (int i = 0; i < ticket_prices; i++) {

			eventspageObj.tickets_prices().get(i).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.BACK_SPACE), "100");
			;

		}

		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		WebElement moveto_imagesection = driver.findElement(By.xpath("//div[@class='col']/h3"));
		js3.executeScript("arguments[0].scrollIntoView(true);", moveto_imagesection);

		waiting();
		eventspageObj.uploadimage()
				.sendKeys("C:\\Users\\Hamza Farooq\\Desktop\\Office work\\Testing data\\pexels-photo-302769.jpeg");

		WebDriverWait d = new WebDriverWait(driver, 10);

		d.until(ExpectedConditions.invisibilityOf(eventspageObj.uploadimage()));

		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("arguments[0].scrollIntoView(true);", eventspageObj.lastsave_button());

		eventspageObj.lastsave_button().click();

		waiting();
		
		eventspageObj.publish_event_button().click();


	}

}
