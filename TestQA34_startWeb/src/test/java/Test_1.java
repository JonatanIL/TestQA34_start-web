import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class Test_1 {
    WebDriver wd;

    @Test
    public void start1() {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();

        wd.navigate().to("https://trello.com"); // with history
        wd.navigate().back();
        wd.navigate().forward();
        wd.close();//close app
        wd.quit(); //close browser

    }

    @Test
    public void start3() {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();
        wd.navigate().to("https://trello.com"); // with history

        //openLoginForm
        WebElement login= wd.findElement(By.cssSelector("[href='/login']"));
        login.click();

        //fill in login form
        WebElement emailTextbox =wd.findElement(By.cssSelector("#user"));
        emailTextbox.click();
        emailTextbox.clear();
        emailTextbox.sendKeys("jonataneitan@gmail.com");

        //confirm email
        WebElement confirmLoginbutton=wd.findElement(By.cssSelector("#login"));
        confirmLoginbutton.click();

        //view psw
        WebElement icon= wd.findElement(By.cssSelector(".css-pxzk9z"));
        icon.click();

        //fill in valid password
        WebElement passwordTextbox=wd.findElement(By.cssSelector("#password"));
        passwordTextbox.click();
        passwordTextbox.clear();
        passwordTextbox.sendKeys("JonatanEitan1986");

        //click loginButton
        WebElement logButton= wd.findElement(By.cssSelector("#login-submit"));
        logButton.click();

    }
    @Test
    public void test4(){
        //tag
        WebElement el=wd.findElement(By.tagName("a"));
        WebElement els =wd.findElement(By.cssSelector("a"));
        WebElement els2 =wd.findElement(By.cssSelector("div"));

        //id
        WebElement el2=wd.findElement(By.id("skip-target"));
        WebElement els22= wd.findElement(By.cssSelector("#login-form"));

        //class
        WebElement el3=wd.findElement(By.className("BigNavstyles__InnerHeader-sc-1mttqq7-2 kuxyBF"));
        WebElement el4=wd.findElement(By.className("kuxyBF"));
        WebElement elc12= wd.findElement(By.cssSelector(".BigNavstyles__InnerHeader-sc-1mttqq7-2 kuxyBF"));
        WebElement elc13= wd.findElement(By.cssSelector(".kuxyBF"));
        //link
        WebElement el5=wd.findElement(By.linkText("Log in"));
        WebElement el55=wd.findElement(By.cssSelector("[href='/login']"));
        WebElement el555=wd.findElement(By.cssSelector("[href='/signup']"));
        WebElement el55545=wd.findElement(By.cssSelector("[data-testid='bignav']"));

        //starts/contains-ends(css)
        WebElement el5525=wd.findElement(By.cssSelector("[aria-label='Trello']"));
        WebElement el51=wd.findElement(By.cssSelector("[aria-label$='lo']"));//ends
        WebElement el455545=wd.findElement(By.cssSelector("[aria-label ^='Tr']"));//starts
        WebElement el555745=wd.findElement(By.cssSelector("[aria-label *='rell']"));//contains




    }
    @Test
    public void start2(){
        List<WebElement> elm=wd.findElements(By.cssSelector("div"); //find list of elements by tag css selector
        System.out.println(elm.size());

    }
//.logo_link-logo Trello
    @Test
    public void openTab(){
        WebElement tab= wd.findElement(By.cssSelector("[data-testid='bignav-tab']"));
        tab.click();
        tab.click();

    }
    @Test
    public void logOut(){
        WebElement avatar=wd.findElement(By.cssSelector("[data-test-id ='header-member-menu-button']"));
        avatar.click();
        WebElement logOut1= wd.findElement(By.cssSelector("[data-test-id='header-member-menu-logout']"));
        logOut1.click();
        WebElement logout2=wd.findElement(By.cssSelector("[data-testid='logout-button']"));
        logout2.click();

    }
}
