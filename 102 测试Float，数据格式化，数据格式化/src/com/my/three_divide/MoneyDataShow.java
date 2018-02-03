package com.my.three_divide;

import java.text.DecimalFormat;

/**
 * Created by tianlin on 2017/7/7.
 * Tel : 15071485690
 * QQ : 953108373
 * Function :
 */

public class MoneyDataShow
{

    public static final DecimalFormat dfDotOne = new DecimalFormat("#,###.0");
    public static final DecimalFormat dfDotTwo = new DecimalFormat("#,###.00");
    public static final DecimalFormat dfInteger = new DecimalFormat("#,###");

    public static void main(String[] args)
	{
		System.out.println(format("1"));
		System.out.println(format("12"));
		System.out.println(format("123"));
		System.out.println(format("1234"));
		System.out.println("===================================");
		System.out.println(format("1010.23"));
		System.out.println(format("0.12"));
		System.out.println(format("10.1"));
		System.out.println(format("1.1"));
		
	}
    public static String format(String content)
    {

        String str = "";

        double value = 0;
        try
        {
            value = Double.parseDouble(content);
        }
        catch (RuntimeException e)
        {
        }

        if(((int)value) == value)
        {
            str = dfInteger.format(value);
        }

        if(content.contains("."))
        {
            String[] dot = content.split("\\.");
            if(dot.length > 1)
            {
            	String dotPart = dot[1];
            
            	if(dotPart.length() == 1)
            	{
            		 if(value < 1 && value >= 0)
                     {
                         str = "0" + dfDotOne.format(value);
                     }
                     else {
                         str = dfDotOne.format(value);
                     }
            	}
            	else if(dotPart.length() > 1)
            	{
            		if(value < 1 && value >= 0)
                    {
                        str = "0" + dfDotTwo.format(value);
                    }
                    else {
                        str = dfDotTwo.format(value);
                    }
            	}
            }
        }
        

        return str;
    }
}
