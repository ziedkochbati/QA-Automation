package com.orangeHRM.e2eTests.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.e2eTests.pageObjects.AuthenticationPage;
import com.orangeHRM.e2eTests.utils.CommonMethods;
import com.orangeHRM.e2eTests.utils.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthenticationStepDefinition {
	public WebDriver driver;
	private AuthenticationPage authenticationPage = new AuthenticationPage();
	private CommonMethods commonMethods = new CommonMethods();
	public AuthenticationStepDefinition (){
		driver = Setup.driver;
		PageFactory.initElements(driver, AuthenticationPage.class);
	}
	@Given("^Je me connect a l'application OrangeHRM$")
	public void jeMeConnectALApplicationOrangeHRM() throws Throwable {
		commonMethods.openApplicationWithConfigFile("url");
	}
	@When("^Je saisie Username \\\"([^\\\"]*)\\\"$")
	public void jeSaisieUsername(String name) throws Throwable {
		authenticationPage.fillUserName(name);
	}
	@When("^Je saisie Password \\\"([^\\\"]*)\\\"$")
	public void jeSaisiePassword(String password) throws Throwable {
		authenticationPage.fillUserPassword(password);
	}
	@When("^Je clique sur le boutton login$")
	public void jeCliqueSurLeBouttonLogin() throws Throwable {
		authenticationPage.clickBtnLogin();
	}
	@Then("^Je me redirige vers le compte admin$")
	public void jeMeRedirigeVersLeCompteAdmin() throws Throwable {
	}
}
