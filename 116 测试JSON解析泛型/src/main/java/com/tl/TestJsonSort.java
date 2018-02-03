package com.tl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

class Peo
{
	public String bString;
	public String cString;
	public String string;
	public String aString;
	
}
public class TestJsonSort
{

	public static void main(String[] args)
	{
		// 1.2.0会默认排序

		// 其它版本的不会
		String raw = "{\"cString\":\"haha\",\"bString\":\"xixi\",\"aString\":\"heiehei\",\"string\":\"hehe\"}";
		Peo peo = new Peo();
		peo.cString = "heiehei";
		peo.string = "hehe";
		peo.aString = "haha";
		peo.bString = "xixi";
		
		String json = JSON.toJSONString(peo);
		System.out.println(json);
		
		JSONObject rawObj = JSONObject.parseObject(raw);
		
		System.out.println(JSON.toJSON(rawObj));
	}

}
