import java.io.*;
import java.util.*;

public class SortLinkedlistumap{

     public static void main(String []args){
         
         Scanner sc = new Scanner(System.in);
         
        System.out.println("enter the first node");
        Node head = new Node(5);      //first node is 5 
        
        System.out.println("entr your choice");
        char c = sc.next().charAt(0);
        
        while(c=='y')
        {
            
        System.out.println("enter your value");    
        int num = sc.nextInt();    
        
        head.appendToTail(num);
            
        System.out.println("enter the choice");
        c= sc.next().charAt(0);  //the choice.....
            
        }
        
        head.display();
        
        head.remove_duplicate();
        
        System.out.println("after sorting");
        head.display();
        
     } //end of main...
     
} //end of class helloworld.........


class Node {

 Node next = null;
 int data;

 public Node(int d) { data = d; }
 
  void appendToTail(int d) 
 {
  Node end = new Node(d);
  Node n = this;
 
   while (n.next != null)
      n = n.next; 
     
   n.next = end;
 } //end of append method...
 
 
 
  void display()
  {
     Node n =this;
     while(n!=null)
     {
      System.out.print(" "+n.data);
      n=n.next;
     }
  } //end of display method.....
  
  void remove_duplicate()
 {
  Node current=this;
  Node previous = null;
  
  HashSet<Integer> set =  new HashSet<>();
  
    while(current!=null)
    {
      int val = current.data;
     
      if(set.contains(val))           //value is already present
      previous.next=current.next;        //setting the next element to the           
    
      else
      {
        set.add(val);
        previous = current;
      }    
     current=current.next;
    }                  //end of while loop
   
  }  //end of function
  
} //end of classsssssss...........  
  
  