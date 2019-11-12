package com.stringformat;

public class FormatUsername {

    public static void main(String []a ) {
        String name = "张三风";

        String format = format(name);
//        String format = String.format("%" + "*" + (name.length() - 2) + "s", name) + name.charAt(name.length() - 1);

        System.out.println(format);
    }

    public static String format(String name) {

        String result = "";
        for (int i = 0; i < name.length() - 1; i++) {
            result += "*";
        }

        return result + name.charAt(name.length() - 1);
    }
}
