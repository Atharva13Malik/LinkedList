import java.util.*;
class Node{
  int val;
  Node next;
  Node(int val){
    this.val=val;
  }
  
  
}
public class Main{
public static void display(Node head){
  Node temp=head;
  while(temp!=null){
   System.out.println(temp.val+" ");
    temp=temp.next;
  }

  System.out.println();
}
public static void main(String args[]0{
  Node a=new Node(10); 
  Node b=new Node(20); 
  Node c=new Node(30); 
  Node d=new Node(40); 
  Node e=new Node(50); 

  a.next=b;
  b.next=c;
  c.next=d;
  d.next=e;
  
}
