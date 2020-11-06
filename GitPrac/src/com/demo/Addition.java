package com.demo;

public class Addition {

	public void sum(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public void sumStr(String s1,String s2)
	{
		String s3=s1+s2;
		System.out.println(s3);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition a=new Addition();
		a.sum(10, 20);
		a.sumStr("A","BCD");

	}

}
