package com.yq.testcases.login;

import com.yq.testcases.BeasTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by king on 2018/4/14.
 */
public class LoginTest extends BeasTest{

    LoginService la = new LoginAction(driver);


    @DataProvider
    public Object[][] login_data(){
        return new Object[][]{
                {"abcde" ,"1234" ,"登陆错误，账户或密码错误。"}
        };
    }


    @Test(dataProvider = "login_data")
    public void test_login(String email, String pwd ,String alert) {

        la.type_email(email);
        la.type_password(pwd);
        la.click_submit();
        la.check_alert(alert);
    }
}
