import data.browser.WebDriverBrowser;
import data.user.ApiUserClient;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import static data.browser.WebDriverBrowser.BASE_URL;

public class DataTests {

    public String name = "Igor";
    public String email = "kenko15@mail.ru";
    public String password = "qwerty";
    public String invalidPassword = "123";


    public WebDriver driver;
    public ApiUserClient apiUserClient = new ApiUserClient();

    @Before
    public void setUp() {
        driver = WebDriverBrowser.browserDriverSetUp();
        driver.get(BASE_URL);
    }

    @After
    public void teardown() {
        driver.quit();
        apiUserClient.deleteUser(email, password);
    }
}
