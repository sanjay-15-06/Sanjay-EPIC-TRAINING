package linkedList;

import java.util.Scanner;

class Node7{
    int data;
    Node7 next;
    Node7 head = null,tail=null;
    
    Node7(int data,Node7 add){
        this.data=data;
        this.next = add;
    }
    
    Node7(){
        
    }
    
    
    void insertData(Scanner in){
        System.out.println("Enter the no of Data: ");
            int n = in.nextInt();
            for(int i=0;i<n;i++){
                int val = in.nextInt();
                Node7 obj = new Node7(val,null);
                if(head==null){
                    head = obj;
                    tail=obj;
                }
                else{
                    tail.next = obj;
                    tail=obj;
                }
            }
    }
    
    void displayData(){
        	Node7 temp = head;
    		while(temp!=null){
		    System.out.println(temp.data);
		    temp=temp.next;
		}
    }
//    void displayData1(){
//    	Node7 temp = tail;
//		for(int i =tail.data;i>=head.data;i--){
//	    System.out.println(temp.data);
//	    temp.next=head.next;
//	}

    
    void insertANode(Scanner in){
        System.out.println("Enter the value: ");
        int val = in.nextInt();
        System.out.println("Enter the position: ");
        int pos = in.nextInt();
        
        Node7 newNode = new Node7(val,null);

        if(pos==1){
            newNode.next = head;
            head = newNode;
        }
        else{
            Node7 temp = head;
        for(int i=0;i<pos-2;i++){
            temp=temp.next;
        
         if(tail==temp){
               tail = newNode;
           }
        }
        newNode.next = temp.next;
        temp.next = newNode;
          
        }
        
        System.out.println("Head: "+head.data);
        System.out.println("Tail: "+tail.data);
    }
    
    void deleteData(Scanner in) {
    	System.out.println("Enter the position: ");
    	int pos= in.nextInt();
        
        if(pos==1) {
        	head=head.next;
        	return;
        }
        Node7 temp = head;
        for(int i=0;i<pos-2;i++){
        	temp = temp.next;
        }
        if(temp.next.next == null){
            tail = temp;
        }
        temp.next = temp.next.next;
        
        System.out.println("Head: "+head.data);
        System.out.println("Tail: "+tail.data);
    }

    
}

public class LinkedListMain {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
	    Node7 node = new Node7();
	    while(true) {
			System.out.println(" 1.insert data \n 2.display data \n 3.insert in middle \n 4.Delete Data");
			int n = in.nextInt();
			switch (n) {
			case 1: {
				node.insertData(in);
				break;
			}
			case 2: {
				node.displayData();
				break;
			}
			case 3: {
				node.insertANode(in);
				break;
			}
			case 4: {
				node.deleteData(in);
				break;
			}
			default:
				System.out.println("Invalid");
			}
		}

	}

}
