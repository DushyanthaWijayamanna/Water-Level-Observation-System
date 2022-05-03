/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


class Node {

    public int data;
    public Node next;

}

class linkedList {

    public Node head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;

        if (head == null) {
            head = node;

        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;

            }
            n.next = node;

        }
    }

    public void catchWaterLevel() {

        Node node = head;

        while (node.next != null) {
        
            node = node.next;

        }
       
        displayResult(node.data);
        

    }
    
    public void showAllWaterLevelsToday(){
    
    
    
    
    Node node=head; 
    System.out.print("Today Water Levels[ ");
    while(node.next!=null)
    {
       
        System.out.print(node.data+" ");
        node=node.next;
    }
        System.out.print(node.data);
        System.out.println(" ]");
    
    
    
    
    }
    
    public void findMaxWaterLevel(){
    
    Node node=head;
    int max;
    if(head==null){
    
        System.out.println("Application Was Not Run Today");
    
    }
    else{
    
     max=head.data;
     
     while(node!=null){
      if(max<node.data){
      
        max=node.data;
      
      }
      node=node.next;
     
     
     
     }
     System.out.println("Today Maximum Water level : "+ max);
    
    
    
    }
   
      
    
    
    
    
    
    
    }
    public void findMinimumWaterLevel(){
    
      Node node=head;
      int min;
      
      if(head==null){
      
       System.out.println("Application Was Not Run Today");
      
      }
      else{
      
      min=head.data;
      
      while(node!=null){
      
          if(min>node.data){
          
           min=node.data;
          }
      
        node=node.next;
      }
      
      System.out.println("Today Minimum Water level : "+ min);
      
      }
    
    
    
    }
    
     

   

    private void displayResult(int value) {
        System.out.println("Water Level : " + value);
        if (value >=75) {
            System.out.println("High water Level");
            System.out.println("Alarm On");
            System.out.println("Sluice Gates On");
            System.out.println("");
            
        }
        else{
        
            System.out.println("Low water Level");
            System.out.println("Alarm Off");
            System.out.println("Sluice Gates Off");
            System.out.println("");
           
        
        
        }
    }

}

class controllRoom {

    public void operations() {
        
        Scanner scn=new Scanner(System.in);

        linkedList newlinkedList = new linkedList();
        Random rnd = new Random();
        
        
        System.out.println("Enter Water Level Calculation Count:-");
        
        int count=scn.nextInt();
        
        System.out.println("Starting...........");
        try{Thread.sleep(4000);}catch(Exception ex){}
        System.out.println(" ");
        
        
        for(int i=0;i<count;i++)
        {
        
        
          int waterLevel = rnd.nextInt(101);
           newlinkedList.insert(waterLevel);           
           newlinkedList.catchWaterLevel();
           try{Thread.sleep(4000);}catch(Exception ex){}
        
        
        }
        
        newlinkedList.showAllWaterLevelsToday();
        newlinkedList.findMaxWaterLevel();
        newlinkedList.findMinimumWaterLevel();
        
        

        //while (true) {

            

       //}
      

    }

}

public class demo {

    public static void main(String[] args) {
        System.out.println("Water level observation System");
        System.out.println("");
        System.out.println("*********************************");

        controllRoom cr = new controllRoom();
        cr.operations();

    }

    
}
