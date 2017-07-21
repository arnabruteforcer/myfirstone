import java.io.*;   //we sort the arrays and take the sum from 0            to n-1 and for max 1 to n....
 
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        long minsum=0,maxsum=0;
        long[] a = new long[n];
        
        for(int i=0;i<n;i++)
        a[i]=s.nextLong();    
        
       mergesort(a,0,n-1);     //sorting the array is non decreasing order....
     
       for(int i=0;i<n-1;i++)
        minsum+=a[i];
        
       for(int i=1;i<n;i++)
        maxsum+=a[i];
        
      System.out.print(minsum+" "+maxsum);
        
         
    }
    
    
    public static void mergesort(long[] A,int low, int high)
    {
        if(low<high)
        {
        int mid=(low+high)/2;
        
        mergesort(A,low,mid);
        mergesort(A,mid+1,high);
        merge(A,low,mid,high);
        }
    }
    
    
    public static void merge(long[] A,int low,int mid,int high)
    {
        int n1= mid-low+1;
        int n2 = high-mid;
        
        final long sentinel = 10000000000008L;
        
        long[] left = new long[n1+1]; // 1 wxtra for the sentinel
        long[] right =  new long[n2+1]; // 1 wxtra for the sentinel
        
        for(int i=0;i<n1;i++)
           left[i]=A[i+low];
           
          left[n1]=sentinel; 
           
         for(int i = 0;i<n2;i++)
          right[i]=A[mid+1+i];
        
        right[n2]=sentinel;
        
        int i=0,j=0;
        
        for(int k= low; k<=high; k++)
        {
            
             if(left[i]<right[j])
             {
                 A[k]=left[i];
                 i++;  
             }
             
             else
             {
               A[k]=right[j];
               j++;
             }
        }
        
        
    } //end of merge function
    
    
} //end of class....

// time complexity of O(nlogn) for merge sort and space of O(n) //for out of space sorting