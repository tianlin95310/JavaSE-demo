package com.my;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommonData {
    public static void main(String[] a) {
        Pattern p = Pattern.compile("^((1))\\d{10}$");
        Matcher m = p.matcher("1399876566");
        System.out.println(m.matches());
    }
}
