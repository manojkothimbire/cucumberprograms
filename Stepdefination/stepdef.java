package Stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdef {
	WebDriver driver;
	@Given("^open the browser$")
	public void open_the_browser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\selenium with jar\\chromedriver-win64\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
			
	}

	@When("^I enter username and password$")
	public void i_enter_username_and_password() throws InterruptedException
	{

		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("Admin");
		Thread.sleep(2000);
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("admin123");
		Thread.sleep(2000);


	}

	@When("^click on login button$")
	public void click_on_login_button() throws InterruptedException {
		WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		Thread.sleep(2000);
	}

	@Then("^sucessfully login$")
	public void sucessfully_login()  {
	   System.out.println("sucessfully login");
	}

	@Then("^logout$")
	public void logout() {
		driver.quit();
	}


}
