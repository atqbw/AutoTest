package com.course.utils;

import com.course.model.InterfaceName;

import java.util.Locale;
import java.util.ResourceBundle;

public class ConfigFile {
    private static ResourceBundle bundel = ResourceBundle.getBundle("application", Locale.CHINA);
    public static String getUrl(InterfaceName name){
        String address = bundel.getString("test.url");
        String uri = "";
        String testUrl;
        if(name == InterfaceName.GETUSERLIST){
            uri = bundel.getString("getUserList.uri");
        }
        if(name == InterfaceName.LOGIN){
            uri = bundel.getString("login.uri");
        }
        if(name == InterfaceName.UPDATEUSERINFO){
            uri = bundel.getString("updateUserInfo.uri");
        }
        if(name == InterfaceName.GETUSERINFO){
            uri = bundel.getString("getUserInfo.uri");
        }
        if(name == InterfaceName.ADDUSERINFO){
            uri = bundel.getString("addUser.uri");
        }
        if(name == InterfaceName.GETUSERLIST){
            uri = bundel.getString("getUserList.uri");
        }

        testUrl = address + uri;
        return testUrl;





    }
}
