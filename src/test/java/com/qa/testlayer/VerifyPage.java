package com.qa.testlayer;

import org.testng.annotations.Test;

import com.qa.Utilitis.screenshots;
import com.qa.pagelayer.Fileupload;
import com.qa.pagelayer.LogInPage;
import com.qa.testbase.Testbase;

public class VerifyPage extends Testbase
{

	@Test
	public void verifypage() throws InterruptedException
	{
		LogInPage login = new LogInPage();
		login.enterEmailAddress("prexo.mis@dealsdray.com");
		login.enterPassword("prexo.mis@dealsdray.com");
		login.clickOnLoginButton();
		
		Fileupload file = new Fileupload();
		file.clickOnOrder1();
		file.clickOnOrder2();
		file.clickOnAddBulkOrder();
		file.clickOnChooseFile();
		file.clickOnImportbtn();
		file.clickOnValidateDataBtn();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
		screenshots s = new screenshots();
		s.takeScreenShot("validate");
		
		file.clickOnSubmitBtn();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		s.takeScreenShot("Submited");
	}
}
