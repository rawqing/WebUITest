package com.yq.testcases.pomLogin;

import com.yq.testcases.BaseTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void login_test(){
        LoginPage lp = new LoginPage(driver);
        lp
                .type_email("email@e.com")
                .type_password("123455")
                .click(lp.submit_btn)
                .check_alert("错误的用户名或密码");
    }
}
