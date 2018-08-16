package com.my;

public class TestSplit {

	public static void main(String[] args) {
		
		String string = "2_3_";
		
		String[] results = string.split("_");
		
		System.out.println(results.length);

	}

}
