package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    public static WebDriver driver = null;
    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World");
        System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //open the webpage
        driver.navigate().to("https://www.google.com");
        driver.manage().window().maximize();
        String title = driver.getTitle();

        if(title.equalsIgnoreCase("Google.com"))
            System.out.println("Title Matches");
        else
            System.out.println(title);
    }
}
