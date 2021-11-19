package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase{
	
	//Locate all the elements available in Login Page
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement pwd;
	
	@FindBy(xpath ="//div[text()='Login']")
	WebElement loginBtn;
	
	@FindBy(xpath ="//atext()='Forgot your password?']")
	WebElement forgotPwd;
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	//List of Actions
	//Login
	
	public void login(String strUser, String strPwd) {
		username.sendKeys(strUser);
		pwd.sendKeys(strPwd);
		loginBtn.click();
	}
	
	//forgot
    //login to classic crm
    //sign up


}
