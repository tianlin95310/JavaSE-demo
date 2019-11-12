package com;

import java.util.Locale;

public class locale {
    public static void main(String[] a){
        Locale locale1 = new Locale("zh", "CN", "afsasf");
        Locale locale2 = Locale.getDefault();
        Locale locale3 = new Locale("zh-CN");
        System.out.println(locale1.toString());
        System.out.println(locale1.toLanguageTag());
        System.out.println(locale2.toString());
        System.out.println(locale2.toLanguageTag());

        System.out.println(locale3.toString());
        System.out.println(locale3.toLanguageTag());
    }
}
