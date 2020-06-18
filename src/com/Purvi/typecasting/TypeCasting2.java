package com.Purvi.typecasting;

public class TypeCasting2 {

	public static void main(String[] args) {
		//create in type create
		
		int num=10;
		System.out.println("The integer value:"+ num);
		
		//convert into string type value
		String data = String.valueOf(num);	
		System.out.println("The String value:"+ data);
		
		//create string value
		String str = "102";
		System.out.println("The String value:"+ str);
		
		//convert String value into int type
		int inum = Integer.parseInt(str);
		System.out.println("The integer value:"+ inum);
		
		//convert String value into double type
				double dnum = Double.parseDouble(str);
				System.out.println("The double value:" + dnum);

	}

}
