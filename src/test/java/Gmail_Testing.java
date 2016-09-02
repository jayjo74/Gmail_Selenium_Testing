import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
       driver.manage().window().maximize();
       wait = new WebDriverWait(driver,30);
    }

    @Test
    public void gmailLoginShouldBeSuccessful(){

    // 1.Go to Gmail website
        driver.get("http://gmail.com");

    // 2. Fill in userame
        WebElement inputEmail = driver.findElement(By.cssSelector("input[id='Email']"));
        wait.until(ExpectedConditions.visibilityOf(inputEmail));
        inputEmail.clear();
        inputEmail.sendKeys("iljejo74@gmail.com");

    // 3. Click Next button
        WebElement nextButton = driver.findElement(By.id("next"));
        nextButton.click();

    // 4. Fill in password
//        WebElement inputPassword = driver.findElement(By.id("Passwd"));
//        wait.until(ExpectedConditions.visibilityOf(inputPassword));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Passwd")));
        driver.findElement(By.id("Passwd")).clear();
        driver.findElement(By.id("Passwd")).sendKeys("Anselmo777");
//        inputPassword.sendKeys("Anselmo777");

    // 5. Click sign in
        WebElement SignInButton = driver.findElement(By.cssSelector("input[id='signIn'][class='rc-button rc-button-submit']"));
        SignInButton.click();

    // 5. Verify user did sign in
        WebElement inboxText = driver.findElement(By.partialLinkText("Inbox"));
        wait.until(ExpectedConditions.visibilityOf(inboxText));
        Assert.assertTrue("Inbox is come out",driver.findElements(By.partialLinkText("Inbox")).size()>0);

    // 6. Sigh out
        WebElement userChangeButton = driver.findElement(By.cssSelector("span[class='gb_3a gbii']"));
        userChangeButton.click();

        WebElement sighOutButton = driver.findElement(By.linkText("Sign out"));
//        wait.until(ExpectedConditions.visibilityOf(sighOutButton));
        sighOutButton.click();




    // 7. Verify user did sign out
    }

    @After
    public void afterTesting(){
        driver.quit();
    }

}
