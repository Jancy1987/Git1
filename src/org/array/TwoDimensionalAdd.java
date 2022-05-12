package org.array;

public class TwoDimensionalAdd {
	public static void main(String[] args) {
		int s [][]  = new int [3][3]; // datatype variable [][]= new datatype [][]
		
s[0][0]=10;
s[0][1]=10;
s[0][2]=10;
		
		
s[1][0]=1;
s[1][1]=1;
s[1][2]=1;

s[2][0]=0;
s[2][1]=0;
s[2][2]=2;

int sum=0;

for(int i=0; i<s.length;i++) {
	for(int j=0; j<s.length; j++) {
		sum = sum + s[i][j];
	}
	System.out.println(sum);
}

}
	
	}


