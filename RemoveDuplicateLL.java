public class RemoveDuplicateLL{

     public static void main(String []args){
        Node head = new Node(5);
        head.insertAtEnd(6);
        head.insertAtEnd(7);
        head.insertAtEnd(7);
        head.insertAtEnd(8);
        head.insertAtEnd(8);
        head.insertAtEnd(8);
        head.insertAtEnd(9);
        head.insertAtEnd(7);
        head.display();
        
        System.out.println("after removal");
        
        head.removeDuplicate();
        head.display();
     }
     
}

class Node
{
    int data;
    Node next = null;
    
    Node(int val)
    {
     data = val;   
    }
    
    void insertAtEnd(int val)
    {
        Node n = new Node(val);
        Node ptr = this;
        
        while(ptr.next!=null)
        ptr=ptr.next;
        
        ptr.next=n;
    }
    
    void display()
    {
        Node ptr = this;
        
        while(ptr!=null)
        {
        System.out.print(" " +ptr.data);
        ptr=ptr.next;
        }
    }
    
    
    void removeDuplicate()
    {
        
      Node head = this;
      Node previous = head;
      Node current = head.next;
      
      while(current!=null)            //current node is set to next next to head 
      {
          Node runner = head;         // runner is being set as head as it will check for previous duplicates
          
          while(runner!=current)            
          {
              if(runner.data==current.data)         //if there is a duplicte 
              {
                Node temp = current.next;    
                previous.next=temp;           //set the next to previous node as next node to current node removing the dupliacte    
                current = temp;               //if the next pointer is duplicate 
                break;
              }
              runner=runner.next;           //updating the runner
          }                                    // end of runner data
          
          if(runner==current)              //no dups found  
          {
          previous=current;      
          current=current.next;      
          }
          
       } //end of outer loop
      
      
    } //end of function
    
    
 } //end of class....

     
     
