package com.example.ci.config;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SitePropertiesTest {

    @Autowired
    SiteProperties siteProperties;

    @Test
    void test() {
        Assertions.assertEquals("Woo-local", siteProperties.getAuthorName());
        Assertions.assertEquals("Woo@a.com-local", siteProperties.getAuthorEmail());
    }

    @Test
    void test2() {
        Assertions.assertEquals("fail", siteProperties.getAuthorName());
    }
}