package exol;

import java.io.*;

public class exol {

	public static void main(String[] args) {
		char c = " ";
		System.out.print("请输入一个字符：")；
		try{
			c = (char)System.in.readc();
		}catch(IOException e){

		}
		System.out.println("您输入的字符为："+c);		
	}
}
