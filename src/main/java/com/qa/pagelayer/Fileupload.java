package com.qa.pagelayer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.testbase.Testbase;

public class Fileupload extends Testbase
{

	public Fileupload()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[@class='MuiBox-root css-d0uhtl']")
	private WebElement order;
	
	public void clickOnOrder1()
	{
		order.click();
		
	}
	
	@FindBy(linkText = "Orders")
	private WebElement orders_btn;
	
	public void clickOnOrder2()
	{
		orders_btn.click();
		
	}
	@FindBy(xpath = "//button[@class='MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButtonBase-root  css-vwfva9']")
	private WebElement add_bulk_order;
	
	public void clickOnAddBulkOrder()
	{
		add_bulk_order.click();
		
	}
	
	@FindBy(xpath = "//input[@class='MuiOutlinedInput-input MuiInputBase-input MuiInputBase-inputSizeSmall css-1imb3v5']")
	private WebElement choose_file;
	
	public void clickOnChooseFile()
	{
		choose_file.sendKeys("C:\\Users\\admin\\Downloads\\demo-data.xlsx");
		
	}
	@FindBy(xpath = "//button[@class='MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButtonBase-root  css-6aomwy']")
	private WebElement import_btn;
	
	public void clickOnImportbtn()
	{
		import_btn.click();
		
	}
	@FindBy(xpath = "//button[@class='MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButtonBase-root  css-6aomwy']")
	private WebElement validate_data_btn;
	
	public void clickOnValidateDataBtn()
	{
		validate_data_btn.click();
		
	}
	
	@FindBy(xpath = "//button[@class='MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButtonBase-root  css-6aomwy']")
	
	private WebElement submit_btn;
	
	public void clickOnSubmitBtn()
	{
		submit_btn.click();
		
	}
}
