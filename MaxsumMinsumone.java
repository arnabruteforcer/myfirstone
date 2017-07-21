import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        long num,min=10000000000007l,max=-1l,minsum=0,maxsum=0;
        
        for(int i =0;i<n;i++)
        {
            num=s.nextLong();
            
            min=(num<min)?num:min;  
            max=(num>max)?num:max;
         
            minsum=maxsum+=num;
        }
        
        minsum=minsum-max;
        maxsum=maxsum-min;
        
     System.out.print(minsum+" "+maxsum);
        
         
    }   //t(n)= O(n)  space = O(1)
}
