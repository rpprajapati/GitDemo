package stepDefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefiantion {

    @Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
       System.out.println("Navigate to Login URL");
       System.out.println("URL is upload");
    }

    @When("^User login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_username_and_password(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(arg1);
        System.out.println(arg2);
        System.out.println("valid credential provided");
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        System.out.println("Validated Home page");
        System.out.println("Login successful");
    }
    @And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are(String arg1) throws Throwable {
        
    	System.out.println(arg1);
    	System.out.println("========================================================================");
    	System.out.println("Cards are display as per UR");
    }

    @Given("^User is on Login page$")
    public void user_is_on_login_page() throws Throwable {
        System.out.println("Login page open");
    }

    @When("^User login in to application with (.+) and (.+)$")
    public void user_login_in_to_application_with_and(String username, String password) throws Throwable {
        System.out.println(username);
        System.out.println(password);
    }

    @Then("^Verify user login (.+)$")
    public void verify_user_login(String result) throws Throwable {
        System.out.println("Login sucessful :"+ result);
        System.out.println("========================================================================");
    }

}