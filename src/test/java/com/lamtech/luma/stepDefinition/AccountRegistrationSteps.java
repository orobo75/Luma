package com.lamtech.luma.stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccountRegistrationSteps {
    WebDriver driver;
    @Given("^user on register account page$")
    public void userOnRegisterAccountPage() {
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFile\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get ("http://newtours.demoaut.com/mercuryregister.php?osCsid=b850603562a035eb5e95faef11322c33");
        driver.manage().window().maximize();


    }


    @When("^user enters \"([^\"]*)\"$")
    public void userEnters(String FirstName) throws Throwable {

        driver.findElement(By.name("firstName")).sendKeys("Jojn");


    }

    @And("^user  enters the \"([^\"]*)\"$")
    public void userEntersThe(String arg0) throws Throwable {
        driver.findElement(By.name("lastName")).sendKeys("Micheal");

    }

    @And("^user enters their \"([^\"]*)\"$")
    public void userEntersTheir(String arg0) throws Throwable {

    }

    @Then("^user clicks submit$")
    public void userClicksSubmit() {
    }
}
