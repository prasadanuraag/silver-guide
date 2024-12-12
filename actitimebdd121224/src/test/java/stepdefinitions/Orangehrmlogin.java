package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Orangehrmlogin {
	WebDriver d;
	@Given("user enters the url as {string}")
	public void user_enters_the_url_as(String url)
	{
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.get(url);
	}
	@When("he enters the username as {string}")
	public void he_enters_the_username_as(String un)
	{
		d.findElement(By.id("username")).sendKeys(un);
	}
	@And("he enters_the_password_as {string}")
	public void he_enters_the_password_as(String pwd)
	{
		d.findElement(By.name("pwd")).sendKeys(pwd);
	}
	@And("he clicks on login button")
	public void he_clicks_on_login_button()
	{
		d.findElement(By.xpath("//div[text()='Login ']")).click();
	}
    @Then("home page should be displayed")
    public void home_page_should_be_displayed()
    {
    	System.out.println(d.getTitle());
    }
}