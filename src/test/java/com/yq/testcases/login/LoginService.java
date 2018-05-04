package com.yq.testcases.login;

import com.yq.testcases.GainService;

/**
 * Created by king on 2018/4/14.
 */
public interface LoginService extends GainService<LoginView> {

    /**
     * 输入指定的用户名
     * @param email
     */
    void type_email(String email);

    /**
     * 输入指定的密码
     * @param pwd
     */
    void type_password(String pwd);

    /**
     * 点击提交按钮
     */
    void click_submit();

    /**
     * 验证错误提示
     * @param alert
     */
    void check_alert(String alert);
}
