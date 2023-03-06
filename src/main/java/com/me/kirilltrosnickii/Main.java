package com.me.kirilltrosnickii;

public class Main {
    public static void main(String[] args) {

        Smartphones iphone = new iPhone();
        iphone.call();
        iphone.sms();
        iphone.internet();
        ((IOS) iphone).runApp("FaceTime");

        Smartphones android = new Android();
        android.call();
        android.sms();
        android.internet();
        ((LinuxOS) android).linuxSupport();
    }


}
