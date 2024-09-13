package com.ivoyant.code_coverage;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppLoginTest {
    AppLogin appLogin= new AppLogin();
    @Test
    void login_test1(){
        boolean status = appLogin.login("admin", "admin");
        assertEquals(status,true);
    }
    @Test
    void login_test2(){
        boolean status = appLogin.login("admin123", "123");
        assertEquals(status,false);
    }

}
