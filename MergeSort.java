import java.io.*;
import java.util.*;


public class MergeSort
{
     
     public static void main(String []args)
     {
      Scanner s = new Scanner(System.in);
      
      System.out.print("enter the number of elements");
      int n = s.nextInt();
      Mergesort m = new Mergesort(n);          //creating the array'
      
       int start = 0;
       int end = n-1;
       
       System.out.println("before sorting");
       m.display();
       
       m.mergesort(start,end); //sorting the array..
       
       System.out.println("after sorting");
       m.display();

     } //end of main........
     
} //end of MergeSort class


class Mergesort
{
     static int count = 0;
     int[] a;
     int number;
     final int sentinel = 10000000;
     
    Mergesort(int n)   //constructor for initialising the array
    {
        a = new int[n];
        number = n;
        
         Scanner s = new Scanner(System.in);
        System.out.print("enter your elements");
        
      for(int i = 0; i<a.length; i++)
         a[i] = s.nextInt();  //entering the elemnts  
        
    }
    
    
    
    void mergesort(int start,int end)
    {
        if(start<end)
        {
         int mid = (start + end )/2; //finding the mid splitting the array in parts of two 2
         
         mergesort(start,mid);  // recursively calling the first half
         mergesort(mid+1,end);  // calling the second half
         
         merge(start,mid,end);          //merging both the parts ......
            
        } //will continue for atleast 2 elements...
        
    } //end of mergesort function........
    
    
    
    void merge(int start,int mid,int end )
    {
        count++;
        int n1 = mid-start+1;  // number of lements of the first half
        int n2 = end - mid;    //number of elements of the second half
        
        int[] first = new int[n1+1];
        int[] second = new int[n2+1];
        
        
        for(int i=0; i<n1 ;i++)
         first[i] = a[i+start];    //copying inside the first array..... 
         
        first[n1] = sentinel;  //keeping a large element at the end
        
        for(int i = 0; i<n2; i++)
          second[i] = a[ i+mid+1 ];
          
        second[n2] = sentinel;  //keeping a large element at the end the sentinel....
        
        int i =0;
        int j= 0;
        
        System.out.println("before sorting partition array "+ count);
        
        for(int k = start; k<=end; k++) //checking the entries and copying them in sorted order
        System.out.print(a[k] + " ");
        
        for(int k = start; k<=end; k++) //checking the entries and copying them in sorted order
        {
            if(first[i]<=second[j])
            a[k] = first[i++];  //even if an array finishes completely it will be pointing to the sentinel
            
            else
            a[k] = second[j++];
        }
        
        System.out.println("after sorting partition array "+ count);
        
        for(int k = 0; k<number; k++) //checking the entries and copying them in sorted order
        System.out.print(a[k] + " ");
        
        
        
    } //end of merge function .....
    
    
    void display()
    {
        for(int i =0; i<number; i++)
        System.out.print(a[i] + " " );
        
    }
     
}                   //end of class MergeSort    .........
     
     
     
     
     