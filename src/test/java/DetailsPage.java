import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetailsPage {
    private final WebDriver driver;

    // Локатор заголовка страницы
    @FindBy(xpath = "//h1[contains(text(), 'Подробнее о сервисе')]")
    private WebElement detailsPageTitle;

    // Конструктор
    public DetailsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Метод для получения заголовка страницы
    public String getDetailsPageTitle() {
        return detailsPageTitle.getText();
    }
}
