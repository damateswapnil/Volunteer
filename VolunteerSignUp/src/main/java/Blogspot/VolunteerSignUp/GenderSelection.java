package Blogspot.VolunteerSignUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GenderSelection {
@FindBy(xpath="//label[@for='RESULT_RadioButton-7_0']")
private WebElement m;
@FindBy(xpath="//label[@for='RESULT_RadioButton-7_1']")
private WebElement f;
private WebDriver driver;

public GenderSelection(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void male() throws InterruptedException {
	boolean sm = m.isSelected();
	if(sm==false) {
		m.click();
		Thread.sleep(2000);}
	}
	
	public void female() throws InterruptedException {
		boolean sf = f.isSelected();
		Thread.sleep(2000);
		if(sf==false) {
			f.click();
		}
}
}
