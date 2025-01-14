package nakodr_TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import baseClass.BaseClass;
import pom.PageObjectModel;

public class LoginPageValidation extends BaseClass
{
	PageObjectModel pom = new PageObjectModel(driver);
	
	@Test
	public void testCase4() throws IOException, InterruptedException
	{
		pom.clickEmail();
		pom.EnteruserEmail();
	}
}

