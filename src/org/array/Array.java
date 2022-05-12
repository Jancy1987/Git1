package org.array;
//Array:stores multiple values of similar datatypes in a single variable name
//it stores values based on index
//index starts from 0 to n-1

public class Array {
	public static void main(String[] args) {
		int a [] = new int[6]; //Datatype varible = new Datatype [size]
		a[0]=10;
		a[2]=20;
		a[1]=10;
		a[3]=30;
		a[4]=40;
		a[5]=50;
		
		int sum = 1;
			for (int i=0; i<a.length;i++) {
				sum = sum + a[i];
							
					}
			System.out.println(sum);
	}
	private void method() {
		// TODO Auto-generated method stub
		System.out.println("Add to Golden");

	}

}

