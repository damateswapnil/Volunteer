package Blogspot.VolunteerSignUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WeekAvailable {
	@FindBy(xpath="//label[@for='RESULT_CheckBox-8_0']")
	private WebElement sun;
	@FindBy(xpath="//label[@for='RESULT_CheckBox-8_1']")
	private WebElement mon;
	@FindBy(xpath="//label[@for='RESULT_CheckBox-8_6']")
	private WebElement sat;
	private WebDriver driver;

	public WeekAvailable(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void sunday(){
		sun.click();}

	public void monday() {
		mon.click();}
	
	public void saturday() {
		sat.click();}

}