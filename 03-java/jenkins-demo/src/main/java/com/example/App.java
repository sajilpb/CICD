package com.example;

import org.apache.commons.lang3.StringUtils;

public class App {

    public static void main(String[] args) {
        String message = "Hello from Jenkins";

        System.out.println(StringUtils.upperCase(message));
    }

    public static String getMessage() {
        return "Hello from Jenkins";
    }
}
