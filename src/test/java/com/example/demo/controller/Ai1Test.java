package com.example.demo.controller;

import org.junit.Test;

public class Ai1Test {

    @Test
    public void show() {
        Ai1 ai = new Ai1();
        String[] str = {"ha","bb","cc"};
        ai.show(str);
        String[] str1 = {"hah","bb","cc"};
        String message = "版本提交第一次";
        ai.show(str1);
    }
}