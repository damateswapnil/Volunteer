package Blogspot.VolunteerSignUp;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DaySlot {
	@FindBy(xpath="//select[@id=\"RESULT_RadioButton-9\"]")
	private WebElement sel;
	private WebDriver driver;

	public DaySlot(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void selectByV(String se) {
	 Select opt=new Select(sel);
	List<WebElement> option = opt.getOptions();
	for(WebElement o:option) {
		String opti = o.getText();
	System.out.println("Option::"+opti);
	opt.selectByVisibleText(se);
	}
	}
}
