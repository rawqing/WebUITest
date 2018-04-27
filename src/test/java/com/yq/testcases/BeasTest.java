package com.yq.testcases;

import com.yq.feature.Calc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

/**
 * Created by king on 2018/4/14.
 */
public class BeasTest {
    protected Calc calc = null;
    protected WebDriver driver ;

    public BeasTest(){
        System.setProperty("webdriver.gecko.driver", "libs/geckodriver");

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        driver.get("http://rap2.taobao.org/");
        System.out.println("当前打开页面的标题是： "+ driver.getTitle());
    }


    public void getDriver(){


    }

    @AfterClass
    public void teardown(){
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

//    @BeforeMethod
//    public void setUp_class(){
//        System.out.println("before method");
//        calc = new Calc();
//    }
}
