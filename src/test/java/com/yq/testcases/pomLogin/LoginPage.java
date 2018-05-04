package com.yq.testcases.pomLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class LoginPage {
    WebDriver driver;


    @FindBy(css = ".form-control[placeholder=Email]")
    WebElement email_input ;

    @FindBy(css = ".form-control[placeholder=Password]")
    WebElement pwd_input;

    @FindBy(css = "[type=submit].btn")
    WebElement submit_btn;

    @FindBy(css = ".alert.alert-danger.fade.show[role=alert]")
    WebElement alert_text;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver ,this);
    }

    public LoginPage type_email(String text) {
        email_input.click();
        email_input.sendKeys(text);
        return this;
    }
    public LoginPage type_password(String text) {
        pwd_input.click();
        pwd_input.sendKeys(text);
        return this;
    }
    public LoginPage click(WebElement element) {
        element.click();
        return this;
    }

    public LoginPage check_alert(String alert) {
        assertThat(alert_text.getText(), equalTo(alert));
        return this;
    }
}
