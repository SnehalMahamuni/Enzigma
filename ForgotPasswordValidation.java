package nakodr_TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import baseClass.BaseClass;
import pom.PageObjectModel;

public class ForgotPasswordValidation extends BaseClass
{
	PageObjectModel pom = new PageObjectModel(driver);
	
	@Test
	public void testCase3() throws IOException, InterruptedException
	{
		pom.Clickforgotpass();
		pom.Email();
		pom.checkboxRemember();
		
	}
}
