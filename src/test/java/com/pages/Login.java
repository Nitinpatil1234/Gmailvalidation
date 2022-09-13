package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	WebDriverWait wait;
	public WebDriver ldriver;

	public Login(WebDriver driver) {
		ldriver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "identifierId")
	WebElement userNameField;

	@FindBy(xpath = "//*[@id=\"identifierNext\"]/div/button")
	WebElement btnNext;

	@FindBy(xpath = "//*[@id=\"password\"]/div[1]/div/div[1]/input")   
	WebElement passwordField;

	@FindBy(xpath = "//*[@id=\"passwordNext\"]/div/button")
	WebElement btnNextElement;

	@FindBy(xpath = "//div[contains(text(),'Compose')]")
	WebElement btnCompose;

	@FindBy(xpath = "//input[starts-with(@id, \":\")][@role='combobox']")
	WebElement toField;
	
	@FindBy(xpath = "//input[contains(@class,'aoT')]")
	WebElement txtSubject;

	@FindBy(xpath = "//div[contains(@class,'Am Al editable LW-avf tS-tW')]")
	WebElement txtBody;

	@FindBy(xpath = "//div[contains(@class,'T-I J-J5-Ji aoO v7 T-I-atl L3')]")
	WebElement btnsend;

	public void getUsername(String username) throws InterruptedException {
		Thread.sleep(2000);
		userNameField.sendKeys(username);

	}

	public void navigateNext() throws InterruptedException {
		Thread.sleep(2000);
		btnNext.click();
	}

	public void getPassword(String Password) throws InterruptedException {
		Thread.sleep(2000);
		passwordField.sendKeys(Password);
	}

	public void navigateNextButton() throws InterruptedException {
		Thread.sleep(2000);
		btnNextElement.click();
	}


	public void getComposeMail() throws InterruptedException {
		Thread.sleep(2000);
		btnCompose.click();
	}

	public void GetRecepient(String receipent) throws InterruptedException {
		Thread.sleep(2000);
		toField.sendKeys(receipent);
	}

	public void getSubject(String subject) throws InterruptedException {
		Thread.sleep(2000);
		txtSubject.sendKeys(subject);
	}

	public void getBody(String body) throws InterruptedException {
		Thread.sleep(2000);
		txtBody.sendKeys(body);
	}

	public void navigateToSendButton() throws InterruptedException {
		Thread.sleep(2000);
		btnsend.click();
	}
}
