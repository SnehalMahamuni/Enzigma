package nakodr_TestCases;
import java.io.IOException;
import org.testng.annotations.Test;
import baseClass.BaseClass;
import pom.PageObjectModel;

public class SignupPageValidation extends BaseClass
{
	@Test
	public void testCase2() throws IOException, InterruptedException
	{
		PageObjectModel pom = new PageObjectModel(driver);
		pom.signup();
		pom.Email();
		pom.clickCheckBox();
		pom.clickProceed();
		pom.Code();
		// Hard wait for verification code
		Thread.sleep(20000);
		pom.getVCode();
		pom.EnterfirstName();
		pom.EnterlastName();
		pom.Enterpassword();
		pom.EnterRegister();
	}
}
