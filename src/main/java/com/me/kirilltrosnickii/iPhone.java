package com.me.kirilltrosnickii;

public class iPhone implements Smartphones, IOS {
    @Override
    public void call() {
        System.out.println("iPhone: Making a call...");
    }

    @Override
    public void sms() {
        System.out.println("iPhone: Sending a text message...");
    }

    @Override
    public void internet() {
        System.out.println("iPhone: Browsing the web...");
    }

    @Override
    public void runApp(String appName) {
        System.out.println("iPhone: Running app " + appName + " on iOS.");
    }
}
