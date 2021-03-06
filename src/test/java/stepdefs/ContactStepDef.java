package stepdefs;

import java.util.List;
import java.util.Map;

import base.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class ContactStepDef extends TestBase{
    LoginPage loginPage;
    @Given("User is on login page")
    public void user_is_on_login_page() {
        initialize();
    }
    
    @When("User enters login credential")
    public void user_enters_login_credential(DataTable userCred) {
        loginPage = new LoginPage();
        List<Map<String, String>> data = userCred.asMaps();
        String strUser = data.get(0).get("username");
        String strPwd = data.get(0).get("password");
        loginPage.login(strUser, strPwd);
    }
    
    @Then("User navigates to Home Page")
    public void user_navigates_to_home_page() {
        
    }
    
    @Then("User Clicks Contact link")
    public void user_clicks_contact_link() {
        
    }
}
