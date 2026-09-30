package doublyLinkedList;

import java.util.Scanner;

class Nodez{
    Nodez prev;
    int data;
    Nodez next;
	Nodez(Nodez prev, int data, Nodez next) {
		this.prev = prev;
		this.data = data;
		this.next = next;
	}
	Nodez(){
		
	}
	
	
	Nodez head = null;
	Nodez tail = null;
	
	void insertData(Scanner in) {
		System.out.println("Enter the number of Data: ");
		int n = in.nextInt();
		for(int i =0;i<n;i++) {
			int val = in.nextInt();
			Nodez obj = new Nodez(null,val,null);
			if(head == null) {
				head = obj;
			}else {
				obj.prev = tail;
				tail.next = obj;
			}
			tail = obj;
		}
		
	}
	
	void displayData() {
		System.out.println("Display Data: ");
		Nodez temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	void displayReverse() {
		System.out.println("Reverse printing: ");
		Nodez temp = tail;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.prev;
		}
	}
	
	void insertInMiddle(Scanner in) {
		System.out.println("Enter value to insert: ");
		int val = in.nextInt();
		System.out.println("Enter position to insert: ");
		int pos = in.nextInt();
		
		Nodez newNode = new Nodez(null,val,null);
		Nodez temp = head;
		if(pos ==1) {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
		
		else {
			for(int i=1;i<=pos-2;i++) {
				temp = temp.next;
			}
			if(temp.next == null) {
				temp.next = newNode;
				newNode.prev = temp;
				tail = newNode;
			}
			else{
				temp.next.prev = newNode;
				newNode.next = temp.next;
				newNode.prev = temp;
				temp.next = newNode;
			}
		}
	}
	
	void deleteANode(Scanner in){
        Scanner n = new Scanner(System.in);
        System.out.println("Enter position: ");
        int pos = n.nextInt();
        Nodez temp=head;
        if(pos==1){
            head=temp.next;
        }
        else{
            for(int i =0;i<pos-2;i++){
            temp = temp.next;
            }
            temp.prev=temp.next.prev;
            temp.next=temp.next.next;
            
        }
    }
    
}

public class DynamicDLL {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Nodez node = new Nodez();
		while(true) {
			System.out.println(" 1.insert data \n 2.display data \n 3.insert in middle \n 4.reverse display \n 5.Delete Data");
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
				node.insertInMiddle(in);
				break;
			}
			case 4: {
				node.displayReverse();
				break;
			}
			case 5:{
				node.deleteANode(in);
				break;
			}
			default:
				System.out.println("Invalid");
			}
		}
		
		
		
	}

}