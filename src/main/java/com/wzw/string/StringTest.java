package com.wzw.string;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class StringTest {
	
	@Test
	public void demo1(){
		String string="abcedfg";
		String string2 = StringUtils.upperCase(string);
		System.out.println(string);
		System.out.println(string2);
	}
	
	@Test
	public void demo2(){
		String string="  abcedf g  ";
		String string2 = StringUtils.trimToNull(string);
		String string3 = StringUtils.stripToNull(string);
		System.out.println(string);
		System.out.println(string2);
		System.out.println(string3);
	}
	
	@Test
	public void demo3(){
		String string=null;
		boolean blank = StringUtils.isNotBlank(string);
		System.out.println(blank);
	}
}
