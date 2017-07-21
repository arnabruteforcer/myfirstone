class GfG
{
    int atoi(String str)
    {
      int num = 0;
      int sign=1;
	  for( int i =0; i<str.length(); i++ )
        {
            if( Character.isDigit(str.charAt(i)) ) //returns true if each character is a digit
            num=num*10+Integer.parseInt(str.substring(i,i+1));     
             
            else if(i==0 && str.charAt(i)== '+') 
                  sign=1;
            
            else if(i==0 && str.charAt(i) == '-') 
                  sign=-1;      
             
             else
            return -1;
            
        }     //end of for loop
        
        num=num*sign;
        
        return num;
    } //end of function
} //end of class
