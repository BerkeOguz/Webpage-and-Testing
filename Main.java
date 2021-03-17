/**
 * BILKENT UNIVERSITY
 * 2020-2021 SPRING SEMESTER
 * CS458 - PROJECT 1
 * Authors: Ibrahim Eren Tilla  21702537
 *          Berke Oguz          21601100
 */

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static WebDriver driver = null;

    /**
     * MAIN FUNCTION
     */
    public static void main(String[] args) throws InterruptedException {
        // CHOOSE YOUR BROWSER
        // Chrome: chrome()
        // Firefox: firefox()
        // Edge: edge()
        // Please note that this browser selection is sort of another testing segment

        chrome();
        //firefox();
        //edge();

        // ================ TESTS ================
        // Please comment/uncomment the code lines in the respective code blocks
        // And then run the program again

        // TEST 1 - EMPTY CREDENTIALS TEST
        //test1();

        // TEST 2 - WRONG CREDENTIALS TEST
        //test2();

        // TEST 3 - SIGN-IN WITH CORRECT CREDENTIALS TEST
        //test3();

        // TEST 4 - HIDE/SHOW PASSWORD BUTTON TEST
        //test4();

        // TEST 5 - "FORGOT MY PASSWORD" FUNCTIONALITY TEST
        //test5();

        // TEST 6 - "REMEMBER ME" CHECKBOX TEST
        //test6();
    }

    // SIGN UP FUNCTION
    public static void signUp(String email , String password) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.id("signUpPageButton")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("signEmail")).sendKeys(email);
        Thread.sleep(1000);
        driver.findElement(By.name("signPassword")).sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(By.id("signUpButton")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("backToLogin")).click();
        Thread.sleep(1000);
    }

    // SIGN IN FUNCTION
    public static void signIn(String email , String password) throws InterruptedException
    {
        Thread.sleep(1000);
        driver.findElement(By.name("indexEmail")).sendKeys(email);
        Thread.sleep(1000);
        driver.findElement(By.name("indexPassword")).sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(By.id("signInButton")).click();
        Thread.sleep(1000);
    }

    // SHOW/HIDE PASSWORD BUTTON FUNCTION
    public static void showHidePassword(String email , String password) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.name("indexEmail")).sendKeys(email);
        Thread.sleep(1000);
        driver.findElement(By.name("indexPassword")).sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(By.id("passwordOn")).click();
        Thread.sleep(1500);
        driver.findElement(By.id("passwordOff")).click();
        Thread.sleep(1000);
    }

    // FORGOT PASSWORD HYPERLINK FUNCTION
    public static void forgotPassword() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.id("forgotPassword")).click();
        Thread.sleep(1000);
    }

    // REMEMBER ME CHECKBOX TEST FUNCTION
    public static void rememberMe() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.id("rememberMe")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("rememberMe")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("rememberMe")).click();
        Thread.sleep(1000);
    }

    public static void test1() throws InterruptedException {
        signUp("", "");
        signIn("", "");
    }

    public static void test2() throws InterruptedException {
        signUp("example@user.xyz", "123456");
        signIn("wrong@credentials.com", "654321");
    }

    public static void test3() throws InterruptedException {
        signUp("correct@credentials.com", "123456");
        signIn("correct@credentials.com", "123456");
    }

    public static void test4() throws InterruptedException {
        showHidePassword("abc@example.com", "SHOW_PASSWORD");
    }

    public static void test5() throws InterruptedException {
        forgotPassword();
    }

    public static void test6() throws InterruptedException {
        rememberMe();
    }

    public static void chrome(){
        System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();

        //open the webpage
        driver.navigate().to("https://cs458project1.erentilla.repl.co/");
        driver.manage().window().maximize();
        String title = driver.getTitle();
    }
    public static void edge(){
        System.setProperty("webdriver.edge.driver", ".\\drivers\\msedgedriver.exe");
        driver = new EdgeDriver();

        //open the webpage
        driver.navigate().to("https://cs458project1.erentilla.repl.co/");
        driver.manage().window().maximize();
        String title = driver.getTitle();
    }
    public static void firefox(){
        System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();

        //open the webpage
        driver.navigate().to("https://cs458project1.erentilla.repl.co/");
        driver.manage().window().maximize();
        String title = driver.getTitle();
    }
}