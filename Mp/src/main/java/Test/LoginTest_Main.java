package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class LoginTest_Main {
	
	WebDriver driver;
	private String URL ="https://ultimateqa.com/automation/";
	
	
@BeforeTest
public void Setup() {

	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\PratikPatil\\Documents\\chromedriver\\chromedriver.exe");
	
	ChromeOptions cap = new ChromeOptions();
	cap.setBinary("C:\\Users\\PratikPatil\\Documents\\chromedriver\\chromedriver-win64\\chromedriver.exe");

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PratikPatil\\Documents\\chromedriver\\chromedriver-win64\\chromedriver.exe");
  
	WebDriver driver=new ChromeDriver(cap);


	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	driver.manage().window().maximize();
	//ChromeOptions options=new ChromeOptions();
	//options.addArguments("--remote-allow-origins=*");
	//WebDriver driver = new ChromeDriver(options);	
	// driver=new ChromeDriver();
	// driver.manage().window().maximize();
	// driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 driver.get(URL);
}
		
@Test
public void Reg() throws Throwable {
		
	LoginPage  RGPage=new LoginPage(driver);
	FileInputStream file=new FileInputStream("C:\\Users\\PratikPatil\\Desktop\\Kdd.xlsx");	
	XSSFWorkbook wb=new XSSFWorkbook(file);
	XSSFSheet sheet=wb.getSheet("Sheet1");
	int rowcount = sheet.getLastRowNum();
	int colcount = sheet.getRow(1).getLastCellNum();	
	System.out.println("rowcount : "+rowcount+"");	
	System.out.println("Colcount : "+colcount+"");
	
	RGPage.setuserName("tt@gmail.com");	
	RGPage.setpassword("Test@1234");
	
	RGPage.clickRegnBtn();	
	
}
	
@AfterTest
public void Close() {
	driver.quit();	
}	
}