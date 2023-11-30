package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import io.cucumber.java.bs.A;
import lippia.web.constants.CheckOutConstants;
import lippia.web.constants.MenuConstants;
import lippia.web.constants.MyAccountConstants;
import org.testng.Assert;

import static com.crowdar.core.actions.ActionManager.isPresent;

public class MyAccountService {

    public static void sendEmail(String usuario){
        WebActionManager.setInput(MyAccountConstants.INPUT_EMAIL,usuario);
    }

    public static void sendPassword(String contrasenia){
        WebActionManager.setInput(MyAccountConstants.INPUT_PASSWORD,contrasenia);
    }

    public static void clickLogin(){
        WebActionManager.click(MyAccountConstants.CLICK_LOGIN_BUTTON);
    }

    public static void validarEmail(String email){
        String nombre = WebActionManager.getElement(MyAccountConstants.EMAIL_NAME).getText();
        Assert.assertEquals(email, nombre, "El nombre de usuario o email no es correcto");
        System.out.println(nombre);
    }
    public static void validarContrasenia(String error){
        String lostPassword = WebActionManager.getElement(MyAccountConstants.LOST_PASSWORD_NAME).getText();
        Assert.assertEquals(error, lostPassword, "El error no funciona correctamente");
    }

    public static void logoutMyAccount(){
        WebActionManager.click(MyAccountConstants.LOGOUT_BUTTON);
    }
    public static void backPage() {
        DriverManager.getDriverInstance().navigate().back();
    }

    public static void validateFormMyAccount(){
        Assert.assertTrue(isPresent(MyAccountConstants.LOGIN_FORM));
    }

    //register
    public static void sendEmailRegister(String email){
        WebActionManager.setInput(MyAccountConstants.INPUT_REGISTER_EMAIL, email);
    }
    public static void sendPassRegister(String contrasenia){
        WebActionManager.setInput(MyAccountConstants.INPUT_REGISTER_PASS, contrasenia);
    }
    public static void clickRegister(){
        WebActionManager.click(MyAccountConstants.REGISTER_BUTTON);
    }

    public static void validateMessageRegister(String error){
        String errorMessage = WebActionManager.getElement(MyAccountConstants.REGISTER_MESSAGE_ERROR).getText();
        Assert.assertEquals(error, errorMessage, "El error no funciona correctamente");
    }

    //MYACCOUNT
    public static void validateLogin(){
        String loginMessage = WebActionManager.getElement(MyAccountConstants.LOGIN_VALIDATE).getText();
        Assert.assertEquals(loginMessage,"crowdar.academy.2023","no se logeo correctamente");
    }

    public static void clickAccountDetails(){
        WebActionManager.click(MyAccountConstants.CLICK_DETAILS_BUTTON);
    }

    public static void validateChangePassword(){
        Assert.assertTrue(isPresent(MyAccountConstants.INPUT_CURRENT_PASSWORD));
    }


}
