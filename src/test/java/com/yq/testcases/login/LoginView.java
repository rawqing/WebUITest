package com.yq.testcases.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by king on 2018/4/14.
 */
public class LoginView {

    @FindBy(css = ".form-control[placeholder=Email]")
    WebElement email_input ;

    @FindBy(css = ".form-control[placeholder=Password]")
    WebElement pwd_input;

    @FindBy(css = "[type=submit].btn")
    WebElement submit_btn;

    @FindBy(css = ".alert.alert-danger.fade.show[role=alert]")
    WebElement alert_text;


}
