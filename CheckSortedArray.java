import java.io.*;
import java.util.*;

public class HelloWorld{

     public static void main(String []args){
         
       Scanner s = new Scanner(System.in);
       
       System.out.print("enter the number of elements");
       int n = s.nextInt();
       
       int[] a = new int[n];
       
       for(int i = 0; i<n; i++)
       a[i] = s.nextInt();
       
       if( arrayIsSorted(a,n) )
        System.out.print("sorted");
       
       else
        System.out.print("not sorted");
     }
     
     static boolean arrayIsSorted(int[] a,int n)
     {
         if(n==1)
          return true;
         
         return(a[n-1]<a[n-2])?false:arrayIsSorted(a,n-1); //if the previous element 
     }
}


