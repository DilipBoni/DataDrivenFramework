package org.training.POMfiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.training.utility.Utility;

public class RegisterPOM {
	WebDriver driver;

	public RegisterPOM(WebDriver driver) {
		this.driver = driver;
	}

	public void chooseGender() throws Exception {
		driver.findElement(By.xpath(Utility.fetchlocaterValue1("Gender_xpath"))).click();
	}

	public void enterFirstname(String FN) throws Exception {
		driver.findElement(By.xpath(Utility.fetchlocaterValue1("Register_FirstName_xpath"))).sendKeys(FN);
	}

	public void enterLastName(String LN) throws Exception {
		driver.findElement(By.xpath(Utility.fetchlocaterValue1("Register_LastName_xpath"))).sendKeys(LN);
	}

	public void enterEmail(String EM) throws Exception {
		driver.findElement(By.xpath(Utility.fetchlocaterValue1("Register_Email_xpath"))).sendKeys(EM);
	}

	public void enterPassword(String PWD) throws Exception {
		driver.findElement(By.xpath(Utility.fetchlocaterValue1("Register_Password_xpath"))).sendKeys(PWD);
	}

	public void enterConformPassword(String CPWD) throws Exception {
		driver.findElement(By.xpath(Utility.fetchlocaterValue1("Register_ConformPassword_xpath"))).sendKeys(CPWD);
	}

	public void registerLogin() throws Exception {
		driver.findElement(By.xpath(Utility.fetchlocaterValue1("Register_RegisterBtn_xpath"))).click();
	}

}
