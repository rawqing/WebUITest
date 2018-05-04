package com.yq.testcases.login;

import com.yq.testcases.BaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by king on 2018/4/14.
 */
public class LoginTest extends BaseTest {

    LoginService la = new LoginAction(driver);
    LoginView lv = la.gainView();

    @DataProvider
    public Object[][] login_data(){
        return new Object[][]{
                {"abcde" ,"1234" ,"登陆错误，账户或密码错误。"}
        };
    }


    @Test(dataProvider = "login_data")
    public void test_login(String email, String pwd ,String alert) {
        lv.email_input.sendKeys(email);
        lv.pwd_input.sendKeys(pwd);

    }
}
