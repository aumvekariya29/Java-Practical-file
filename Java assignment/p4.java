//THIS PROGRAM PREPARED BY AUM VEKARIYA 21ce150

import java.util.*;

class QueueExapmle {
    private ArrayList<Integer> arr;
    private int size;

    Scanner sc = new Scanner(System.in);

    QueueExapmle(){
        System.out.println("Enter elements for Queue: ");
        size = 8;
        arr = new ArrayList<Integer>(size);
        for (int i=0;i<size;i++) {
            int a = sc.nextInt();
            arr.add(a);
        }
    }

    QueueExapmle(int size){
        System.out.println("Enter elements for Queue: ");
        this.size = size;
        arr = new ArrayList<Integer>(size);
        for (int i=0;i<size;i++) {
            int a = sc.nextInt();
            arr.add(a);
        }
    }

    public void enqueue(int v){
        arr.add(v);
    }

    public int dequeue(){
        arr.remove(3);
        return arr.get(3);
    }

    public boolean empty(){
        return arr.isEmpty();
    }

    public int getSize() {
        return size;
    }

    public void display(){
        System.out.println(arr);
    }
}

class StackExample {
    private ArrayList<Integer> arr;
    private int size;

    Scanner sc = new Scanner(System.in);

    StackExample(){
        System.out.println("Enter the elements for Stack: ");
        size = 8;
        arr = new ArrayList<Integer>(size);
        int a[] = new int[size];
        for (int i=size-1;i>=0;i--) {
            a[i] = sc.nextInt();
        }
        for (int i : a) {
            arr.add(i);
        }
    }

    StackExample(int size){
        System.out.println("Enter elements for Stack: ");
        this.size = size;
        arr = new ArrayList<Integer>(size);
        int a[] = new int[size];
        for (int i=size-1;i>=0;i--) {
            a[i] = sc.nextInt();
        }
        for (int i : a) {
            arr.add(i);
        }
    }

    public void enqueue(int v){
        arr.add(0, v);
    }

    public int dequeue(){
        arr.remove(3);
        return arr.get(3);
    }

    public boolean empty(){
        return arr.isEmpty();
    }

    public int getSize() {
        return size;
    }

    public void display(){
        System.out.println(arr);
    }
}
public class p4{
    public static void main(String[] args) {
        StackExample s = new StackExample();
        QueueExapmle q = new QueueExapmle();

        s.display();
        q.display();

        s.enqueue(20);
        q.enqueue(20);

        s.display();
        q.display();

        System.out.println(s.dequeue());
        System.out.println(q.dequeue());

        s.display();
        q.display();

        s.getSize();
        q.getSize();
    }
}

