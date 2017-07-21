import java.io.*;   //we sort the arrays and take the sum from 0            to n-1 and for max 1 to n....
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int a[] = new int[n];
        int num =-1,count=1,max=-1;
        
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();    
        
       mergesort(a,0,n-1);     //sorting the array is non decreasing order....
     
     int i;
      for(i=0;i<n-1;i++)
        {
            
         if(a[i]==a[i+1])    
            count++;
          else
          {
             if(count>=max)
             {
                max=count;
                num=a[i];
             }
             count=1;
          }
            
        } //end of for loop
        
        if(count>=max)
             {
                max=count;
                num=a[i];
             }
        
        System.out.print(num);
         
    } //end of main function
    
    
    public static void mergesort(int[] A,int low, int high)
    {
        if(low<high)
        {
        int mid=low+(high-low)/2;
        
        mergesort(A,low,mid);
        mergesort(A,mid+1,high);
        merge(A,low,mid,high);
        }
    }
    
    
    public static void merge(int[] a,int low,int mid,int high)
    {
     int sentinel = -1000008;
     int n1 = mid-low+1;
     int n2 = high - mid;
     
     int left[]= new int[n1+1];
     int right[]= new int[n2+1];
        
    for(int i =0;i<n1;i++)
    left[i]= a[low+i];
    
    left[n1]=sentinel;
    
    for(int i =0;i<n2;i++)
    right[i]= a[mid+i+1];
    
    right[n2] = sentinel;
    
    int i=0,j=0,k=0;
    
    for(k=low;k<=high;k++)
    {
      if(left[i]>right[j])
       a[k]=left[i++];
       
       else
       a[k]=right[j++];
        
    }
        
  } //end of merge function
    
    
} //end of class....

// time complexity of O(nlogn) for merge sort and space of O(n) //for out of space sorting