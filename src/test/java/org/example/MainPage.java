package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainPage {

    // Локаторы элементов
    @FindBy(xpath = "//h2[contains(text(), 'Онлайн пополнение без комиссии')]")
    private WebElement blockTitle;

    @FindBy(className = "payment-system-logo")
    private List<WebElement> paymentSystemLogos;

    @FindBy(linkText = "Подробнее о сервисе")
    private WebElement moreDetailsLink;

    @FindBy(id = "phoneNumber")
    private WebElement phoneNumberInput;

    @FindBy(id = "continueButton")
    private WebElement continueButton;

    @FindBy(id = "serviceOption")
    private WebElement serviceOption;

    @FindBy(id = "homeInternetOption")
    private WebElement homeInternetOption;

    @FindBy(id = "installmentOption")
    private WebElement installmentOption;

    @FindBy(id = "debtOption")
    private WebElement debtOption;

    @FindBy(id = "amountInput")
    private WebElement amountInput;

    // Конструктор
    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // Методы для взаимодействия с элементами
    public String getBlockTitle() {
        return blockTitle.getText();
    }

    public boolean arePaymentSystemLogosDisplayed() {
        return !paymentSystemLogos.isEmpty();
    }

    public void clickMoreDetailsLink() {
        moreDetailsLink.click();
    }

    public void selectServiceOption() {
        serviceOption.click();
    }

    public void selectHomeInternetOption() {
        homeInternetOption.click();
    }

    public void selectInstallmentOption() {
        installmentOption.click();
    }

    public void selectDebtOption() {
        debtOption.click();
    }

    public void enterPhoneNumber(String phoneNumber) {
        phoneNumberInput.sendKeys(phoneNumber);
    }

    public void enterAmount(String amount) {
        amountInput.sendKeys(amount);
    }

    public void clickContinueButton() {
        continueButton.click();
    }

    public String getPhoneInputPlaceholder() {
        String placeholder = phoneNumberInput.getAttribute("placeholder");
        return placeholder;
    }

    public String getContractNumberPlaceholder() {
        return phoneNumberInput.getAttribute("placeholder");
    }
}
