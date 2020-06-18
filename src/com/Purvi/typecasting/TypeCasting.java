package com.Purvi.typecasting;

public class TypeCasting {

	public static void main(String[] args) {
		//create in type create
		
		int num=10;
		System.out.println("The integer value:"+ num);
		
		//convert into double type  widening or implicit type conversion
		double data = num;
		System.out.println("The double  value:"+ data);
		
		//create double type
		double dnum = 10.99;
		System.out.println("The double  value:"+ dnum);
		
		//narrowing or explict type conversion
		
		int inum = (int)dnum;
		System.out.println("The int   value:"+ inum);
				
		

	}

}
