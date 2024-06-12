package Test;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actionkeyword {
	private static WebDriver driver;
	//private static String URL ="https://demo.guru99.com/test/newtours/index.php";
	private static String URL ="https://courses.ultimateqa.com/users/sign_in";	//
public static void openBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PratikPatil\\Documents\\chromedriver\\chromedriver-win64\\chromedriver.exe");
     driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
}

public static void goToURL() {
	 driver.get(URL);
}

public static void enterUserName() {
	LoginPage  RGPage=new LoginPage(driver);
	RGPage.setuserName("tt@gmail.com");	
}

public static void enterPassword() {
	LoginPage  RGPage=new LoginPage(driver);
	RGPage.setpassword("Test@1234");
}

public static void rememberme() {
	LoginPage  RGPage=new LoginPage(driver);
	RGPage.clickrememberme();	
}
public static void submit() {
	LoginPage  RGPage=new LoginPage(driver);
	RGPage.clickRegnBtn();	
}

}