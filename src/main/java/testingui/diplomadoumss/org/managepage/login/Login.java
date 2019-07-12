package testingui.diplomadoumss.org.managepage.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;

public class Login extends BasePage {

    @FindBy(xpath = "//input[@name='email' and @type='text']")
    private WebElement emailTextField;

    @FindBy(xpath = "//input[@name='password' and @type='password']")
    private WebElement passwordTextField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement buttonSubmit;

    public void setUserName(String email) {
        emailTextField.sendKeys(email);
    }

    public void setUserPassword(String password) {
        passwordTextField.sendKeys(password);
    }

    public void pressButtonLogin() {
        buttonSubmit.click();
    }

}
