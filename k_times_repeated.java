import java.util.*;
import java.io.*;

public class HelloWorld{
    
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int i=0,j=0;
        
        int[] a = new int[n];
        
        for(i=0;i<n;i++)
        a[i]=s.nextInt();
        
        int k  = s.nextInt();
        
        int value=countSmallest(a,k);
        System.out.println(value);
        
    } //end of main
    
    
    public static int countSmallest (int[] a,int count)
    {
        TreeMap<Integer,Integer> hm =  new TreeMap<Integer,Integer>();
        
        for(int i= 0;i<a.length;i++)
        {
             if(hm.containsKey(a[i]))
             hm.put(a[i], hm.get(a[i])+1 );
        
            else
          hm.put(a[i],1);
               
        }
        
        
        for(Map.Entry m:hm.entrySet())
        {
            if( m.getValue().equals(new Integer(count)) )
             return (int)m.getKey();
        }
        
        return -1;
        
    }  //end of count smallest
    
} //end of class.....



