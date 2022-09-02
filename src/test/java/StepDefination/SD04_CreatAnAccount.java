package StepDefination;

import SeleniumCode.AT04_CreateAnAccount;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class SD04_CreatAnAccount {
    @Given("user navigates to create an account screen")
    public void user_navigates_to_create_an_account_screen() throws IOException {
        AT04_CreateAnAccount.NavCreatAcc();
    }
    @Then("enters valid {string},{string},{string}")
    public void enters_valid(String FirstName, String LastName, String EmailAddress) {
        AT04_CreateAnAccount.EnterAccDetails(FirstName,LastName,EmailAddress);

    }
}
