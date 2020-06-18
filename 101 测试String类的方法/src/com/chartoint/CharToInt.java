package com.chartoint;

public class CharToInt {
    public static void main(String[] args) {
        for (int i = 0; i < 65536; i++) {
            if (i == '哈') {
                System.out.println(String.format("%08x", i));
            }
            if (i == '嘿') {
                System.out.println(String.format("%08x", i));
            }
        }
        System.out.println(cnToUnicode("哈"));
        System.out.println(cnToUnicode("嘿"));
    }

    private static String cnToUnicode(String cn) {
        char[] chars = cn.toCharArray();
        String returnStr = "";
        for (int i = 0; i < chars.length; i++) {
            returnStr += "\\u" + Integer.toString(chars[i], 16);
        }
        return returnStr;
    }
}
