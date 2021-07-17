package Blogspot.VolunteerSignUp;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileUpload {
@FindBy(id="RESULT_FileUpload-10")
private WebElement img;
private WebDriver driver;

public FileUpload(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void imgUpload() {
	//File scr=new File("E:\\Auto Testing\\image011(3).png");
	img.sendKeys("E:\\Auto Testing\\image011(3).png");
}
}
