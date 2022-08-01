package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage {
    public WebDriver driver;
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"login-form\"]/div[1]/input")
    private WebElement loginField;

    @FindBy(xpath = "//*[@id=\"login-button\"]")
    private WebElement loginBtn;

    @FindBy(xpath = "//*[@id=\"login-form\"]/div[2]/input")
    private WebElement passwdField;

    @FindBy(xpath = "//*[@id=\"otp-code\"]")
    private WebElement codeConfirm;

     @FindBy(xpath = "//*[@id=\"login-otp-button\"]")
    private WebElement loginOtpBtn;

    public void inputLogin(String login) {
        loginField.clear();
        loginField.sendKeys(login);
    }

    public void inputPasswd(String passwd) {
        passwdField.clear();
        passwdField.sendKeys(passwd);
    }

    public void clickLoginBtn() {
        loginBtn.click();
        loginBtn.click();
    }

    public void clickLoginOtpBtn() {
        loginOtpBtn.click();
    }
}
