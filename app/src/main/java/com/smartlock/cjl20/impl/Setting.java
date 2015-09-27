package com.smartlock.cjl20.impl;

/**
 * Created by cjl20 on 2015/9/27.
 * PROJECT_NAME by SmartLock
 */
public class Setting {

    public static String IP = "192.168.1.102";
    public static int PORT = 11311;

    public static void SetAddress(String ip, int port) {
        IP = ip;
        PORT = port;
    }
}
