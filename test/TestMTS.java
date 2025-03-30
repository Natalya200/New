import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestMTS {
    private WebDriver driver;
    private WebDriverWait wait;
    private final String URL = "http://mts.by";
    private final String BLOCK_TITLE = "Онлайн пополнение без комиссии";
    private final String LINK_TEXT = "Подробнее о сервисе";
    private final String PHONE_NUMBER = "297777777";

    @Before
    public void setUp() {
        // Установка пути к WebDriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); // Укажите путь к вашему ChromeDriver
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(URL);
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void testBlockTitle() {
        WebElement blockTitle = driver.findElement(By.xpath("//h2[contains(text(), 'Онлайн пополнение без комиссии')]"));
        Assert.assertEquals(BLOCK_TITLE, blockTitle.getText());
    }

    @Test
    public void testPaymentSystemLogos() {
        List<WebElement> logos = driver.findElements(By.xpath("//div[@class='payment-systems']/img"));
        Assert.assertTrue("Логотипы платёжных систем не найдены", logos.size() > 0);
    }

    @Test
    public void testMoreDetailsLink() {
        WebElement link = driver.findElement(By.linkText(LINK_TEXT));
        link.click();
        wait.until(ExpectedConditions.urlContains("service-details"));
        Assert.assertTrue("Ссылка не ведёт на страницу с подробной информацией", driver.getCurrentUrl().contains("service-details"));
    }

    @Test
    public void testContinueButton() {
        // Выбор варианта «Услуги связи»
        WebElement serviceOption = driver.findElement(By.xpath("//label[contains(text(), 'Услуги связи')]"));
        serviceOption.click();

        // Ввод номера телефона
        WebElement phoneInput = driver.findElement(By.id("phone-number"));
        phoneInput.clear();
        phoneInput.sendKeys(PHONE_NUMBER);

        // Нажатие кнопки «Продолжить»
        WebElement continueButton = driver.findElement(By.xpath("//button[contains(text(), 'Продолжить')]"));
        continueButton.click();

        // Проверка перехода на следующую страницу
        wait.until(ExpectedConditions.urlContains("payment-confirmation"));
        Assert.assertTrue("Кнопка «Продолжить» не работает", driver.getCurrentUrl().contains("payment-confirmation"));
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
