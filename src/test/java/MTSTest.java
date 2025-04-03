import java.util.List;
import java.util.Objects;
import org.junit.After;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Objects;
    class TestMTS {
        private WebDriver driver;
        WebDriverWait wait;
        private final String URL = "http://mts.by";
        final String BLOCK_TITLE = "Онлайн пополнение без комиссии";
        final String LINK_TEXT = "Подробнее о сервисе";
        final String PHONE_NUMBER = "297777777";

        @BeforeEach
        public void setup() {
            driver = new ChromeDriver();
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
            Assert.assertTrue("Ссылка не ведёт на страницу с подробной информацией", Objects.requireNonNull(driver.getCurrentUrl()).contains("service-details"));
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

