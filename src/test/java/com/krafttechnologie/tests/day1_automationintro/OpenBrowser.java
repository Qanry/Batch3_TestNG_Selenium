package com.krafttechnologie.tests.day1_automationintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
    public static void main(String[] args) {
        //make selenium ready to talk with chrome
        WebDriverManager.chromedriver().setup();

        //create a driver object
        //driver --> represent a free browser
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.krafttechnologie.com");

        //driver.get("https://www.amazon.com");
        //WebDriver driver1=new ChromeDriver();
        //driver1.get("https://www.amazon.com");

        driver.manage().window().maximize();

        //how to get title
        System.out.println("driver.getTitle() = " + driver.getTitle());

        String actual = driver.getTitle();
        String expected = "Kraft Technologie | Yazılım ve Bilişim Eğitimleri – Uzaktan Canlı Eğitim";
        if (actual.equals(expected)) {
            System.out.println("pass");
        } else {
            System.out.println("Fail");
        }


    }













}
