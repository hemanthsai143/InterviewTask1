package com.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePage {
	By textBox=By.xpath("//input[@name='q']");
	By searchResult=By.xpath("//div[@class='TbwUpd NJjxre']");
	public WebDriver driver;
	
	public GooglePage(WebDriver driver){
		this.driver=driver;
		
		}
	
	
	public WebElement enterText() {
		return driver.findElement(textBox);
		
	}
	
	public WebElement getSearchResults() {
		return driver.findElement(searchResult);
		
	}


}
