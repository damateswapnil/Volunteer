package Blogspot.VolunteerSignUp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class FnLnPhCCEmail {
	@FindBy(xpath="//input[@id='RESULT_TextField-1']")
	private WebElement fn;
	@FindBy(xpath="//input[@id='RESULT_TextField-2']")
	private WebElement ln;
	@FindBy(xpath="//input[@id='RESULT_TextField-3']")
	private WebElement pn;
	@FindBy(xpath="//input[@id='RESULT_TextField-4']")
	private WebElement coun;
	@FindBy(xpath="//input[@id='RESULT_TextField-5']")
	private WebElement cit;
	@FindBy(xpath="//input[@id='RESULT_TextField-6']")
	private WebElement mail;
	public FnLnPhCCEmail(WebDriver driver) {
		PageFactory.initElements(driver, this);}
	public void fistName() {
		fn.sendKeys("abcd");
		fn.clear();}
	public void lastName() {
		ln.sendKeys("efgh");}
	public void phoneNumber() {
		pn.sendKeys("1234567895");}
	public void country() {
		coun.sendKeys("India");}
	public void city() {
		cit.sendKeys("Pune");}
	public void email() {
		mail.sendKeys("abcdefght@gmail.com");}}