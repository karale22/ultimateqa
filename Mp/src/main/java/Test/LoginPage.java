package Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
	//2 Method in POM
	
	
			WebDriver driver;
			
			@FindBy(name ="user[email]")   //syntax2
			WebElement userName;
			
			@FindBy(name="user[password]")
			WebElement password;
			
			@FindBy(name="user[remember_me]")
			WebElement rememberme;
					
			@FindBy(xpath="//button[contains(text(),'Sign in')]")
			WebElement submit;
			
			//@findBy(xpath="")
			
			public LoginPage(WebDriver d){
				//this.driver=driver;
				driver = d;
				PageFactory.initElements(d, this); //additional method  //this-variable
			}
			
			
			public void setuserName(String uname) {
				userName.sendKeys(uname);
			}
			
			public void setpassword(String pwd)
			{
				password.sendKeys(pwd);
			}
			
			public void clickrememberme() {
				rememberme.click();			}
			
			public void clickRegnBtn()
			{
				submit.click();
			}


}