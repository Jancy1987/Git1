package org.array;

public class TwoDimensionalArray {
	
	public static void main(String[] args) {
		
		int a[][] = new int [2][3];
		
		a[0][0]=5;
		a[0][1]=10;
		a[0][2]=15;
		
		a[1][0]=20;
		a[1][1]=25;
		a[1][2]=30;
		
		int sum=0;
		for(int i=0; i<2;i++) {
			for(int j=0; j<3; j++) {
				sum= sum + a[i][j];
				
			}
			System.out.println(sum);
			}
		}
		
	}



