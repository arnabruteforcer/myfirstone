import java.io.*;
import java.util.*;

public class HelloWorld{

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
        
        System.out.println("enter value to be deleted");
        int num = sc.nextInt();
        
        head=head.deletenode(num);
        head.display();
        
        System.out.println("enter value to be deleted");
         num = sc.nextInt();
        
        head=head.deletenode(num);
        head.display();
        
        System.out.println("enter value to be deleted");
         num = sc.nextInt();
        
        head=head.deletenode(num);
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
 
 Node deletenode(int d)
 {
 Node n = this;
 
  if(n.data == d)   //calling tfrom the head node rrturning the next to hed node   
   return n.next;
 
     while(n.next!=null)
     {
        if(n.next.data==d)
        {
          n.next=n.next.next;
          return this;
         }
         n=n.next;
      }
      
      return this; 
 
 
 } //end of deletenode
 
 

 
 } //end of node class......
    
    
    
    

