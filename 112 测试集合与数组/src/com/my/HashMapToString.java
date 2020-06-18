package com.my;

import java.util.Date;
import java.util.HashMap;
import java.util.Set;

public class HashMapToString {

    public static void main(String []args){
        HashMap hashMap = new HashMap();
        hashMap.put("appId", "appId");
        hashMap.put("partnerId", "partnerId");
        hashMap.put("prepayId", "prepayId");
        hashMap.put("nonceStr", "nonceStr");
        hashMap.put("timeStamp", "timeStamp");
        hashMap.put("sign", "sign");

        Set<String> keySets = hashMap.keySet();

        String route = "ASF12412?ts=" + new Date().getTime();
        for (String key : keySets) {
            System.out.println(key);
            route += "&" + key + "=" + hashMap.get(key);
        }

        System.out.println(route);
    }
}
