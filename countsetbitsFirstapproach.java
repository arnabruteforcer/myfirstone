import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		int testcases = s.nextInt();
		int n;
		
		while(testcases-->0)
		{
		n =  s.nextInt();
		boolean val = IsSet(n);
		
        if (val==true)
        System.out.println("YES");
        
        else
        System.out.println("NO");
		    
		}
		
	}
	
	public static boolean IsSet(int n)
	{
	    
	    while(n!=0)
	    {
	        if( (n&1)!=1)
	        return false;
	        
	        n=n>>1;
	    }
	    return true;
	}
	
} // o(logn) time required........ for each test case