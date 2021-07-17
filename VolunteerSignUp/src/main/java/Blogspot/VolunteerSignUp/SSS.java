package Blogspot.VolunteerSignUp;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SSS {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get("https://www.amazon.in/s?k=mobile&ref=nb_sb_noss_2");
		Thread.sleep(3000);
		List<WebElement> k = d.findElements(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]"));
		CustmizeDropdown n =new CustmizeDropdown(k);
		n.getClassValue();
		d.close();


	}
}
