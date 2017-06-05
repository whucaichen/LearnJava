package com.chance;

/**
 * Created by Chance on 16/08/12.
 */
public class TextUtil {
    public static boolean isEmpty(String url){
        if(url.trim().length()>0){
            return false;
        }else{
            return true;
        }
    }
}