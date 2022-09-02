package StepDefination;

import SeleniumCode.AT01_LoginToGGWeb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class SD01_LoginToGGweb {
    @Given("open browser and enter url and navigate to GG website")
    public void open_browser_and_enter_url_and_navigate_to_gg_website() throws IOException {
        AT01_LoginToGGWeb.Nav();
    }
    @Then("from homepage click on Account link and system should navigate to login screen")
    public void from_homepage_click_on_account_link_and_system_should_navigate_to_login_screen() throws IOException {
        AT01_LoginToGGWeb.ClickOnLogin();
    }
    @Then("Enter username")
    public void enter_username() throws IOException {
        AT01_LoginToGGWeb.EnterLogins();
    }
}
