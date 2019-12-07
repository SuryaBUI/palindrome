package filehandling;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		String arr[]=str.split(" ");
		int s1[]=new int[arr.length];
//		int n=Integer.parseInt(arr[0]);
		for(int i=0;i<arr.length;i++) {
			s1[i]=Integer.parseInt(arr[i]);
		}
		for(int j=1;j<s1.length;j++) {
			int n=s1[j], sum=0;
			int temp = n;
			 while (sum!=temp){
				 
			int r;
			n=temp;  
			  while(n>0){    
			   r=n%10;  //getting remainder  
			   sum=(sum*10)+r;    
			   n=n/10;    
			  } 
			  
			  if(temp==sum)    
			   System.out.print(temp+" ");    
			  else {
				  sum=0;
				  temp++;
			  }
			   
		}
		}
	}

}
