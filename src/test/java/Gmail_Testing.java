import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by jayjo on 8/31/2016.
 */
public class Gmail_Testing {

    WebDriver driver;
    WebDriverWait wait;

    @Before
    public void beforeTesting(){
       driver = new FirefoxDriver();
       wait = new WebDriverWait(driver,30);
    }

    @Test
    public void gmailLoginShouldBeSuccessful(){

    // 1.Go to Gmail website
        driver.get("http://gmail.com");
        
    // 2. Fill in userame
    // 3. Fill in password
    // 4. Click sign in
    // 5. Verify user did sign in
    // 6. Sigh out
    // 7. Verify user did sign out
    }

}
