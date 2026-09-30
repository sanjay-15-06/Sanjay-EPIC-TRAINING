package circularLinkedList;


import java.util.Scanner;

class Nodez {

    int data;
    Nodez prev, next;

    Nodez head = null, tail = null;

    public Nodez(int data, Nodez prev, Nodez next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    Nodez() {
    }

    // 1. INSERT DATA
    public void insertData(Scanner in) {

        System.out.println("Enter the no of data: ");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("Enter the val: ");
            int val = in.nextInt();

            Nodez obj = new Nodez(val, null, null);

            if (head == null) {

                head = obj;
                tail = obj;

                // Circular connection
                head.next = head;
                head.prev = head;

            } else {

                obj.prev = tail;
                obj.next = head;

                tail.next = obj;
                head.prev = obj;

                tail = obj;
            }
        }
    }


    // 2. DISPLAY DATA
    public void displayData() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        System.out.println("Display Data: ");

        Nodez temp = head;

        do {
            System.out.println(temp.data);
            temp = temp.next;

        } while (temp != head);
    }


    // 3. INSERT IN MIDDLE / POSITION
    public void insertInMiddle(Scanner in) {

        if (head == null) {
            System.out.println("List is empty. Insert data first.");
            return;
        }

        System.out.println("Enter value to insert: ");
        int val = in.nextInt();

        System.out.println("Enter position to insert: ");
        int pos = in.nextInt();

        Nodez newNode = new Nodez(val, null, null);

        // Insert at first position
        if (pos == 1) {

            newNode.next = head;
            newNode.prev = tail;

            head.prev = newNode;
            tail.next = newNode;

            head = newNode;

            return;
        }

        Nodez temp = head;

        for (int i = 1; i < pos - 1; i++) {

            temp = temp.next;

            if (temp == head) {
                System.out.println("Invalid position");
                return;
            }
        }

        newNode.next = temp.next;
        newNode.prev = temp;

        temp.next.prev = newNode;
        temp.next = newNode;

        if (temp == tail) {
            tail = newNode;
        }
    }


    public void displayReverse() {

        if (tail == null) {
            System.out.println("List is empty");
            return;
        }

        System.out.println("Reverse printing: ");

        Nodez temp = tail;

        do {
            System.out.println(temp.data);
            temp = temp.prev;

        } while (temp != tail);
    }


    public void deleteANode(Scanner in) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        System.out.println("Enter position: ");
        int pos = in.nextInt();

        if (head == tail) {

            if (pos == 1) {
                head = null;
                tail = null;
            } else {
                System.out.println("Invalid position");
            }

            return;
        }

        if (pos == 1) {

            head = head.next;

            head.prev = tail;
            tail.next = head;

            return;
        }

        Nodez temp = head;

        for (int i = 1; i < pos; i++) {

            temp = temp.next;

            if (temp == head) {
                System.out.println("Invalid position");
                return;
            }
        }

        if (temp == tail) {

            tail = tail.prev;

            tail.next = head;
            head.prev = tail;

        } else {

            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
    }
}


public class DoublyCircularLL {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Nodez node = new Nodez();

        while (true) {

            System.out.println("\n1. Insert Data\n2. Display Data\n3. Insert in Middle\n4. Reverse Display\n5. Delete Data\n6.Exit");

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

                case 5: {
                    node.deleteANode(in);
                    break;
                }

                case 6: {
                    return;
                }

                default:
                    System.out.println("Invalid");
            }
        }
    }
}

