import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BaseTest {
    private final WebDriver driver;

    // Локаторы элементов
    @FindBy(id = "amount")
    private WebElement amount;

    @FindBy(id = "phoneNumber")
    private WebElement phoneNumber;

    @FindBy(id = "cardNumber")
    private WebElement cardNumberInput;

    @FindBy(id = "expiryDate")
    private WebElement expiryDateInput;

    @FindBy(id = "cvv")
    private WebElement cvvInput;

    @FindBy(className = "payment-system-icon")
    private List<WebElement> paymentSystemIcons;

    public BaseTest(WebDriver driver) {
        this.driver = driver;
    }

    // Конструктор
    public void PaymentConfirmationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Методы для взаимодействия с элементами
    public String getAmount() {
        return amount.getText();
    }

    public String getPhoneNumber() {
        return phoneNumber.getText();
    }

    public String getCardNumberPlaceholder() {
        return cardNumberInput.getAttribute("placeholder");
    }

    public String getExpiryDatePlaceholder() {
        return expiryDateInput.getAttribute("placeholder");
    }

    public String getCvvPlaceholder() {
        return cvvInput.getAttribute("placeholder");
    }

    public boolean arePaymentSystemIconsDisplayed() {
        return !paymentSystemIcons.isEmpty();
    }
}
