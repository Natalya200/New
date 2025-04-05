import org.example.MainPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


 public class MTSTest {

    private WebDriver driver;
    private MainPage mainPage;

    @BeforeEach
    public void init() {
        driver = new ChromeDriver();
        driver.get("http://mts.by");
        mainPage = new MainPage(driver);
    }

    @Test
    public void testBlockTitle() {
        // Проверка заголовка блока
        String expectedTitle = "Онлайн пополнение без комиссии";
        Assert.assertEquals(expectedTitle, mainPage.getBlockTitle());
    }

    @Test
    public void testPaymentSystemLogos() {
        // Проверка наличия логотипов платёжных систем
        Assert.assertTrue("Логотипы платёжных систем не найдены", mainPage.arePaymentSystemLogosDisplayed());
    }

    @Test
    public void testMoreDetailsLink() {
        // Проверка работы ссылки «Подробнее о сервисе»
        mainPage.clickMoreDetailsLink();
        DetailsPage detailsPage = new DetailsPage(driver);
        String expectedTitle = "Подробнее о сервисе";
        Assert.assertEquals(expectedTitle, detailsPage.getDetailsPageTitle());
    }

    @Test
    public void testEmptyFieldLabels() {
        // Проверка надписей в незаполненных полях для каждого варианта оплаты
        mainPage.selectServiceOption();
        Assert.assertEquals("Номер телефона", mainPage.getPhoneInputPlaceholder());

        mainPage.selectHomeInternetOption();
        Assert.assertEquals("Номер договора", mainPage.getContractNumberPlaceholder());

        mainPage.selectInstallmentOption();
        Assert.assertEquals("Номер договора", mainPage.getContractNumberPlaceholder());

        mainPage.selectDebtOption();
        Assert.assertEquals("Номер договора", mainPage.getContractNumberPlaceholder());
    }

    @Test
    public void testPaymentConfirmationPage() {
        // Проверка корректности отображения данных на странице подтверждения оплаты
        mainPage.selectServiceOption();
        mainPage.enterPhoneNumber("297777777");
        mainPage.enterAmount("10");
        mainPage.clickContinueButton();

        BaseTest paymentConfirmationPage = new BaseTest(driver);

        // Проверка отображения суммы
        Assert.assertEquals("10.00", paymentConfirmationPage.getAmount());

        // Проверка отображения номера телефона
        Assert.assertEquals("297777777", paymentConfirmationPage.getPhoneNumber());

        // Проверка надписей в незаполненных полях для ввода реквизитов карты
        Assert.assertEquals("Номер карты", paymentConfirmationPage.getCardNumberPlaceholder());
        Assert.assertEquals("ММ/ГГ", paymentConfirmationPage.getExpiryDatePlaceholder());
        Assert.assertEquals("CVV", paymentConfirmationPage.getCvvPlaceholder());

        // Проверка наличия иконок платёжных систем
        Assert.assertTrue("Иконки платёжных систем не найдены", paymentConfirmationPage.arePaymentSystemIconsDisplayed());
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}


