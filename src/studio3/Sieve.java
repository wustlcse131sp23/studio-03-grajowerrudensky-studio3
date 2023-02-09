package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What n would you like to start with? ");
		int n = in.nextInt() ;
		int j = 0 ; 
		int k = 0 ;
		int m = 0;
		int l = 0 ; 
		
		
		int[ ] a = new int [n];
		
		
		for ( j = 0; j < a.length; j++) 
			a[j]= j  ;
		
		
		
		
		for (k =0 ; k < j ; k++) {
			for (m= 2 ; m<j-1 ; m++) {
				if (a[k] % m == 0 && m!= k ) {
					a[k] = 0 ;
					
		
		}}
		}
		for (l = 0; l < a.length ; l++) {
			if (a[l] != 0)
				System.out.println (a[l]) ;}
		
		
		
		//System.out.println(a[j-1]) ; 
		
		//return a ; 
		
				
				
				
		//for ()
		
		
		

	}

}
