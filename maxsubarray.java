import java.io.*;
import java.util.*;

public class maxsubarray{

     public static void main(String []args){
        
        Scanner s = new Scanner (System.in);
        
        
    System.out.print("entr the no of terms");
    int n = s.nextInt();
    
    int a[] = new int[n];
    
    System.out.println("enter the terms");
    
    for(int i =0;i<n;i++)
    a[i]=s.nextInt();
    
    MaxSubArray m = MaxSubArray.findMax(a,0,n-1);
    System.out.println("left index=" + m.lindex);
    System.out.println("right index=" + m.rindex);
    System.out.println("sum=" + m.sum);
    
     }
}

class MaxSubArray{
    
    int lindex;
    int rindex;
    int sum;
    
    public static MaxSubArray findMax(int a[],int low,int high)
    {
        
        
        if(low==high)
        {
          MaxSubArray m = new MaxSubArray();    
          m.lindex=low;
          m.rindex=high;
          m.sum=a[high];
          return m;
        }
        
        else
        {
            int mid = (low+high)/2;
            
            MaxSubArray l = findMax(a,low,mid);
            MaxSubArray r = findMax(a,mid+1,high);
            
            MaxSubArray c = crossMax(a,low,mid,high);

             if(l.sum>=r.sum && l.sum>=c.sum)
              return l;
              
             else if (r.sum>=l.sum && r.sum>=c.sum)
             return r;
               
              else
              return c;
        }
        
        
    }
    
    public static MaxSubArray crossMax(int a[],int low,int mid,int high)
    {
      int lmax=-999999,rmax=-999999;
      int sum = 0,l=-1,r=-1;
      
      for(int i=mid; i>=low; i--)
        {
            sum+=a[i];
            
            if(sum>lmax)
            {
            lmax=sum;
            l=i;
            }
        }
        
        sum=0;
        
        for(int i=mid+1; i<=high; i++)
        {
            sum+=a[i];
            
            if(sum>rmax)
            {
            rmax=sum;
            r=i;
            }
        }
        
        MaxSubArray c = new MaxSubArray();
        c.lindex=l;
        c.rindex=r;
        c.sum=lmax+rmax;
        
        return c;
    }
    
    
} //end of class MaxSubArray











