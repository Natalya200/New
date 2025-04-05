import org.example.MainPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

public class MTSTest {
    private WebDriver driver;
    private MainPage mainPage;

    @BeforeEach
    public void setUp() {

        driver = new ChromeDriver();
        driver.get("http://mts.by");

        //  куки
        Cookie cookie = new Cookie("cookieName", "cookieValue");
        driver.manage().addCookie(cookie);

        mainPage = new MainPage(driver);
    }

    @Test
    public void testBlockTitle() {
        // Проверка заголовка блока
        String expectedTitle = "Онлайн пополнение без комиссии";
        assertEquals(expectedTitle, mainPage.getBlockTitle());
    }

    @Test
    public void testPaymentSystemLogos() {
        // Проверка наличия логотипов платёжных систем
        assertTrue(mainPage.arePaymentSystemLogosDisplayed(), "Логотипы платёжных систем не найдены");
    }

    @Test
    public void testMoreDetailsLink() {
        // Проверка работы ссылки «Подробнее о сервисе»
        mainPage.clickMoreDetailsLink();
        DetailsPage detailsPage = new DetailsPage(driver);
        String expectedTitle = "Подробнее о сервисе";
        assertEquals(expectedTitle, detailsPage.getDetailsPageTitle());
    }

    @Test
    public void testEmptyFieldLabels() {
        // Проверка надписей в незаполненных полях для каждого варианта оплаты
        mainPage.selectServiceOption();
        assertEquals("Номер телефона", mainPage.getPhoneInputPlaceholder());

        mainPage.selectHomeInternetOption();
        assertEquals("Номер договора", mainPage.getContractNumberPlaceholder());

        mainPage.selectInstallmentOption();
        assertEquals("Номер договора", mainPage.getContractNumberPlaceholder());

        mainPage.selectDebtOption();
        assertEquals("Номер договора", mainPage.getContractNumberPlaceholder());
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
        assertEquals("10.00", paymentConfirmationPage.getAmount());

        // Проверка отображения номера телефона
        assertEquals("297777777", paymentConfirmationPage.getPhoneNumber());

        // Проверка надписей в незаполненных полях для ввода реквизитов карты
        assertEquals("Номер карты", paymentConfirmationPage.getCardNumberPlaceholder());
        assertEquals("ММ/ГГ", paymentConfirmationPage.getExpiryDatePlaceholder());
        assertEquals("CVV", paymentConfirmationPage.getCvvPlaceholder());

        // Проверка наличия иконок платёжных систем
        assertTrue(paymentConfirmationPage.arePaymentSystemIconsDisplayed(), "Иконки платёжных систем не найдены");
    }

    @AfterEach
    public void tearDown() {
        // Закрытие браузера после тестов
        if (driver != null) {
            driver.quit();
        }
    }
}


