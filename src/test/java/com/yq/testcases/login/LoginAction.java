package com.yq.testcases.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

/**
 * Created by king on 2018/4/14.
 */
public class LoginAction implements LoginService{
    WebDriver driver ;
    LoginView lv ;

    public LoginAction(WebDriver driver) {
        this.driver = driver;
        this.lv = PageFactory.initElements(driver ,LoginView.class);
    }

    @Override
    public void type_email(String email) {
        lv.email_input.clear();
        lv.email_input.sendKeys(email);
    }

    @Override
    public void type_password(String pwd) {
        lv.pwd_input.clear();
        lv.pwd_input.sendKeys(pwd);
    }

    @Override
    public void click_submit() {
        lv.submit_btn.click();
    }

    @Override
    public void check_alert(String alert) {
        String text = lv.alert_text.getText();
        Assert.assertEquals(text ,alert);
    }
}
