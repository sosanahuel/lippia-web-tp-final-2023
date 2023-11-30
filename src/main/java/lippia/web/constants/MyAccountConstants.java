package lippia.web.constants;

public class MyAccountConstants {
    public static final String INPUT_EMAIL = "xpath://input[@id='username']";
    public static final String INPUT_PASSWORD = "xpath://input[@id='password']";
    public static final String CLICK_LOGIN_BUTTON = "xpath://*[@class='form-row']/input[3]";
    public static final String EMAIL_NAME = "xpath://ul[@class='woocommerce-error']/li";
    public static final String LOST_PASSWORD_NAME = "xpath://*[@class='woocommerce-error']/li/a";
    public static final String LOGOUT_BUTTON = "xpath://a[.='Logout']";
    public static final String LOGIN_FORM = "xpath://*[@class='login']";

    //REGISTER
    public static final String REGISTER_MESSAGE_ERROR= "xpath://*[@class='woocommerce-error']/li[1]";
    public static final String REGISTER_BUTTON = "xpath://input[@name='register']";
    public static final String INPUT_REGISTER_EMAIL = "id:reg_email";
    public static final String INPUT_REGISTER_PASS = "id:reg_password";

    //MYACCOUNT
    public static final String LOGIN_VALIDATE = "xpath://*[@id='page-36']/div/div[1]/div/p[1]/strong";
    public static final String CLICK_DETAILS_BUTTON = "xpath://a[.='Account Details']";

    public static final String INPUT_CURRENT_PASSWORD = "id:password_current";
    public static final String INPUT_NEW_PASSWORD = "id:password_1";
    public static final String INPUT_CONFIRM_NEW_PASSWORD = "id:password_2";
    public static final String BUTTON_SAVE_CHANGES = "xpath://*[@class='woocommerce-Button button']";

}
