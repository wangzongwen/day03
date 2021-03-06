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
	
	@Test
	public void demo4(){
		String string="Java string-split#test";
		//如果一个字符串中有多个分隔符，可以用"|"作为连字符
		String[] split = StringUtils.split(string, "|-|#");
		for (String string2 : split) {
			System.out.println(string2);
		}
	}
}
