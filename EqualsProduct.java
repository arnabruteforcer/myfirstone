import java.util.*;
import java.lang.*;
import java.io.*;

class EqualsProduct {
	public static void main (String[] args) {
		
		Scanner s =  new Scanner (System.in);
		
		int testcases = s.nextInt();
		
		while(testcases-->0)
		{
		    boolean flag = false;
		 int n = s.nextInt();
		 int prod =  s.nextInt();
		 
		 int[] a =  new int[n];
		 
		 for(int i =0;i<n;i++)
		 a[i] = s.nextInt();
		 
		 ArrayList<Integer> map = new  ArrayList<Integer>(); //creating a new hashmap
		 
		  for( int i=0; i<n ;i++)
		  {
		      if(a[i]==0)
		      {
		          
		        if(prod==0)
		        {
		         flag=true;
		         break;
		        }
		       
		        else
		         continue;
		          
		      }
		      
		      if(prod%a[i]==0)
		      {
		          if( map.contains(prod/a[i]))
		           {
		           flag=true;
		           break;
		           }
		           
		          else
		          map.add(a[i]);
		           
		      }
		      
		  }
		      
		 if(flag)
		 System.out.println("Yes");
		  
		  else
		  System.out.println("No");
		  
		    
		}
	}
}