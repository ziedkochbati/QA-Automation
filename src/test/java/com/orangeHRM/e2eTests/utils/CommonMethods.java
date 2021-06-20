package com.orangeHRM.e2eTests.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gargoylesoftware.htmlunit.AbstractPage;

public class CommonMethods {

	public static WebDriver driver;
	public static Properties prop;
	private WebElement userName;
	private WebElement userPassword;
	private WebElement btnSave;
	private WebElement admin_module;
	public CommonMethods() {
		driver = Setup.driver;
		
	}

	protected static final Logger logger = LoggerFactory.getLogger(AbstractPage.class);

	public void scrollerButtom() {
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)", "");
	}

	public void openApplicationWithConfigFile(String url) throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("src/test/resources/configs/config.properties");

		prop.load(fis);
		driver.get(prop.getProperty(url));

	}

	public void openWebSiteWithConfigFile(String url) throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("src/test/resources/configs/config.properties");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notification");

		prop.load(fis);
		driver.get(prop.getProperty(url));
		

	}

	public void selectDropDownListByVisibleText(WebElement element, String text) {
		Select dropDownValue = new Select(element);
		dropDownValue.selectByVisibleText(text);
	}
	

	public void dragAndDrop(WebElement element1, WebElement element2) {
		Actions actions = new Actions(driver);
		WebElement from = element1;
		WebElement to = element2;
		actions.dragAndDrop(from, to).perform();
	}

	public void doubleClick(WebElement element) {
		Actions actions = new Actions(driver);
		WebElement btnDoubleClick = element;
		actions.doubleClick(btnDoubleClick).perform();
	}
	public void checkBox(WebElement element) {
		driver.findElement(By.id("AvecCGU")).click();
	}
	public void mouseHover(WebElement element) {
		Actions action = new Actions(driver);
		WebElement elementMousseHover = element;
		action.moveToElement(elementMousseHover).perform();
	}

	public void clickElement(WebElement admin_module) {
		admin_module.click();
	}

	public void clickElement1(WebElement btnAdd) {
		btnAdd.click();
	}
	public void clickSignInButton(WebElement signin) {
		signin.click();
	}

	public void saisir(WebElement element, String name) {
		element.sendKeys(name);
	}

	public void filluserPassword(String password) {
		userPassword.sendKeys(password);
	}
	public void saisirconfirmPassword(WebElement element, String Password) {
		element.sendKeys(Password);
	}
	public void clickButtonSave(WebElement btnSave){
		btnSave.click();
	}
	public void clickButtonSearch(WebElement searchBtn){
		searchBtn.click();
	}

	public void insertValue(WebElement element, String  searchSystemUser_userName) {
		element.sendKeys(searchSystemUser_userName);
	}
	public void write(WebElement element, String name) {
		element.sendKeys(name);
	}
	public void typeEmailAdresse(WebElement element, String EmailAdresse) {
		element.sendKeys(EmailAdresse);
	}
	public void typeMobileNumber(WebElement element, String MobileNumber) {
		element.sendKeys(MobileNumber);
	}
	public void writePassword(WebElement element, String password) {
		element.sendKeys(password);
	}
	public void clickButtonCreateAccount(WebElement button){
		button.click();
	}
	public void typeEmail(WebElement element, String Email) {
		element.sendKeys(Email);
	}
	
	public void clickContinueButton(WebElement button){
		button.click();
	}
	public void clickcompteButton(WebElement buttoncompte){
		buttoncompte.click();
	}
	public void clickAcceptButton(WebElement Acceptbutton){
		Acceptbutton.click();
	}
	public void clickCreateAnAccountButton(WebElement CreateAnAccountButton){
		CreateAnAccountButton.click();
	}
	public void saisiremail(WebElement element, String email) {
		element.sendKeys(email);
	}
	public void clickFollowingButton(WebElement FollowingButton){
		FollowingButton.click();
	}
	public void clickButtonsir(WebElement sirButton){
		sirButton.click();
	}
	public void typeFirstName(WebElement element, String FirstName) {
		element.sendKeys(FirstName);
	}
	public void writelastName(WebElement element, String LastName) {
		element.sendKeys(LastName);
	}
	public void fillPassword(WebElement element, String password) {
		element.sendKeys(password);
	}
	public void clickButtonValidate(WebElement ValidateButton){
		ValidateButton.click();
	}
	
}