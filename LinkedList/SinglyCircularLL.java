package circularLinkedList;

import java.util.Scanner;



class Node{
	int val;
	Node next;
	Node head = null, tail = null;
	public Node(int val,Node next) {
		this.val = val;
		this.next = next;
	}
	Node(){
		
	}
	
	void insertData(Scanner in) {
		System.out.println("Enter no of Data: ");
		int n = in.nextInt();
		for(int i=0;i<n;i++) {
			int val = in.nextInt();
			Node newNode = new Node(val, next);
			if(head == null) {
				head = newNode;
			}
			else {
				tail.next = newNode;
			}
			tail = newNode;
			tail.next = head;
		}
		
	}
	
	
	void displayData(){
    	Node temp = head;
    	do {
    		System.out.println(temp.val);
    		temp = temp.next;
    	}
		while(temp!=head);
	}
	
	void insertANode(Scanner in) {
		System.out.println("Enter the value: ");
		int val = in.nextInt();
		System.out.println("Enter the Position: ");
		int pos = in.nextInt();
		Node newNode = new Node(val, null);
		
		if(pos==1) {
			newNode.next = head;
			head = newNode;
			tail.next = newNode;
			
		}
		else {
			Node temp = head;
			for(int i=0;i<pos-2;i++) {
				temp = temp.next;
				if(tail == temp) {
					tail = newNode;
					tail.next = head;
				}
			}
			newNode.next = temp.next;
			temp.next = newNode;	
		}
		System.out.println("Head: "+head.val);
	    System.out.println("Tail: "+tail.val);
	}
	
	void deleteANode(Scanner in) {
		System.out.println("Enter pos to delete: ");
		int pos = in.nextInt();
		if(pos==1) {
			head = head.next;
			tail.next = head;
			return;
		}
		else {
			Node temp = head;
	        for(int i=0;i<pos-2;i++){
	        	temp = temp.next;
	        }
	        if(temp.next.next == null){
	            tail = temp;
	        }
	        temp.next = temp.next.next;
	        
	       	
		}
		 System.out.println("Head: "+head.val);
	     System.out.println("Tail: "+tail.val);
	}
	
	
	
}

public class CircularLL {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Node node = new Node();
		while(true) {
			System.out.println(" 1.insert data \n 2.display data \n 3.Insert a node \n 4.Delete A Node");
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
				node.deleteANode(in);
				break;
			}
			default : {
				System.out.println("Invalid");
			}
			}
		}
	}

}
