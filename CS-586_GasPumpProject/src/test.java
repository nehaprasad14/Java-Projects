
	import java.io.*;
	import java.util.*;

	public class test {

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        int arr[][] = new int[6][6];
	        int sum[] = new int[16];
	        int sum1 = 0;
	        Scanner read = new Scanner(System.in);
	        
	        for(int i=0 ; i<6 ; i++){
	            for(int j=0 ; j<6 ; j++){
	                arr[i][j] = read.nextInt();
	            }
	        }
	        
	        int m=0;
	        int n=2;
	        int k=0;
	        int l=2;
	        int p=0;
	        while(m<4){
	              while(k<4){
	                    for(int i=m ; i<=n ; i++){
	                      for(int j=k ; j<=l ; j++){
	                       // sum1 = sum1 + arr[i][j]; 
	                          if(sum1==0){
	                             sum1 = (arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]); 
	                              System.out.println(sum1);  
	                          }
	                            
	                      }                        
	                   } 
	                  
	                    // System.out.println(sum1);  
	                      k++;
	                      l++; 
	                     sum[p] = sum1;
	                     sum1=0;
	                     p++;
	              }
	            
	            k=0;
	            l=2;
	            m++;
	            n++;
	           
	        }
	        
	        int max = sum[0];

	        for (int i = 1; i < 16; i++) {
	            if (sum[i] > max) {
	              max = sum[i];
	            }
	        }
	        
	        System.out.println(max);
	        
	    }
	}


