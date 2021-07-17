package Blogspot.VolunteerSignUp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Test {
	public static void main(String[]args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","E:\\Software\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://testautomationpractice.blogspot.com/");
		Actions mact=new Actions(driver);
		mact.moveByOffset(0, 100);
		driver.switchTo().frame("frame-one1434677811");
		mact.moveByOffset(0, 100);
		FnLnPhCCEmail pdetails=new FnLnPhCCEmail(driver);
		pdetails.fistName();
		pdetails.lastName();
		pdetails.phoneNumber();
		pdetails.country();
		pdetails.city();
		pdetails.email();
		Thread.sleep(3000);
		driver.close();
	}}

/*mact.moveByOffset(0, 100);
		GenderSelection gselection=new GenderSelection(driver);
		gselection.female();
		gselection.male();

		mact.moveByOffset(0, 100);
		WeekAvailable waval=new WeekAvailable(driver);
		waval.sunday();
		waval.monday();
		waval.saturday();

		mact.moveByOffset(0, 100);
		DaySlot dslot=new DaySlot(driver);
		dslot.selectByV("Afternoon");

		FileUpload fu=new FileUpload(driver);
		fu.imgUpload();
		//driver.close();

 */