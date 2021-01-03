package org.training.tests;

import org.testng.annotations.Test;
import org.training.POMfiles.RegisterPOM;
import org.training.base.DriverInstance;

public class TC_Demo_001_ValidateLoginFeature1 extends DriverInstance {

	@Test
	public void checklogin() throws Exception {

		RegisterPOM signin = new RegisterPOM(driver);
		signin.chooseGender();
		Thread.sleep(1000);
		signin.enterFirstname("Dileep");
		Thread.sleep(2000);
		signin.enterLastName("boini");
		Thread.sleep(2000);
		signin.enterEmail("boinidilip6@gmail.com");
		Thread.sleep(2000);
		signin.enterPassword("dilip123");
		Thread.sleep(2000);
		signin.enterConformPassword("dilip123");
		Thread.sleep(2000);
		signin.registerLogin();
	}
}
