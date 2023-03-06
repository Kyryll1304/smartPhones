package com.me.kirilltrosnickii;

public class Android implements Smartphones, LinuxOS {
    @Override
    public void call() {
        System.out.println("Making a call with Android...");
    }

    @Override
    public void sms() {
        System.out.println("Sending an SMS with Android...");
    }

    @Override
    public void internet() {
        System.out.println("Browsing the internet with Android...");
    }

    @Override
    public void linuxSupport() {
        System.out.println("Hello Linux");
    }

}
