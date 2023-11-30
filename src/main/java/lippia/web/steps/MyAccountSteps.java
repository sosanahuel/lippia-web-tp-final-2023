package lippia.web.steps;

import com.crowdar.core.PropertyManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.HomeService;
import lippia.web.services.MyAccountService;

public class MyAccountSteps {

    @When("the user clicks on MyAccount")
    public void the_user_clicks_on_MyAccount() {
        HomeService.clickMyAccount();
    }
    @When("enters the (.*) or (.*) incorrect")
    public void enters_the_email_or_password_incorrect(String email, String password) {
        MyAccountService.sendEmail(email);
        MyAccountService.sendPassword(password);
        MyAccountService.clickLogin();
    }
    @Then("the login should fail due to (.*)")
    public void the_login_should_fail_due_to_error(String error) {
        switch (error) {
            case "Lost your password?":
                MyAccountService.validarContrasenia(error);
                break;
            case "not found email address":
                MyAccountService.validarEmail(error);
                break;
            default:
                System.out.println("email and password not found");
        }
    }

    @When("enters the correct (.*) and (.*)")
    public void enters_the_email_and_password_correct(String email, String password) {
        MyAccountService.sendEmail(email);
        MyAccountService.sendPassword(password);
        MyAccountService.clickLogin();
    }

    @And("the user logs out")
    public void the_user_logs_out() {
        MyAccountService.logoutMyAccount();
    }

    @And("presses the back button")
    public void presses_the_back_button() {
        MyAccountService.backPage();
    }

    //REGISTER
    @When("the user enters (.*) or (.*) empty in registration")
    public void the_user_enters_email_or_password_empty_in_registration(String email, String contrasenia) {
        MyAccountService.sendEmailRegister(email);
        MyAccountService.sendPassRegister(contrasenia);
    }

    @And("clicks on the button register")
    public void clicks_on_the_button_register() {
        MyAccountService.clickRegister();
    }


    @Then("the user should receive a message of (.*)")
    public void the_user_should_receive_a_message_of(String error) {
        MyAccountService.validateMessageRegister(error);
    }

    //MYACCOUNT
    @And("enters valid username and password")
    public void enters_valid_username_and_password() {
        MyAccountService.sendEmail(PropertyManager.getProperty("email-my-account"));
        MyAccountService.sendPassword(PropertyManager.getProperty("pass-my-account"));
    }

    @And("clicks on the button login")
    public void clicks_on_the_button_login() {
        MyAccountService.clickLogin();
    }

    @And("the user logs in successfully")
    public void the_user_logs_in_successfully() {
        MyAccountService.validateLogin();
    }

    @When("the user clicks on Account details")
    public void the_user_clicks_on_Account_details() {
        MyAccountService.clickAccountDetails();
    }

    @Then("the user can see the details where they can change the password")
    public void the_user_can_see_the_details_where_they_can_change_the_password() {
        MyAccountService.validateChangePassword();
    }

    @When("the user clicks on the button logout")
    public void the_user_clicks_on_the_button_logout() {
        MyAccountService.logoutMyAccount();
    }

    @Then("the user successfully exits the site")
    public void the_user_successfully_exits_the_site() {
        MyAccountService.validateFormMyAccount();
    }
}
