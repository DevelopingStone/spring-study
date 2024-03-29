// Practice1
// ArrayList 를 이용한 큐 구현

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class MyQueue1 {

  ArrayList list;

  MyQueue1() {
    this.list = new ArrayList();

  }

//    public boolean isEmpty() {
//
//    }

  public void push(int data) {
    list.add(data);

  }

  public Integer pop() {
    int a = (Integer) list.get(0);
    list.remove(0);
    return a;


  }

  public Integer peek() {

    return (Integer) list.get(0);

  }

  public void printQueue() {
    System.out.println(list);

  }
}

public class Practice1 {

  public static void main(String[] args) {

    // Test code
    MyQueue1 myQueue = new MyQueue1();
    myQueue.push(1);
    myQueue.push(2);
    myQueue.push(3);
    myQueue.push(4);
    myQueue.push(5);

    myQueue.printQueue();   // 1, 2, 3, 4, 5

    System.out.println(myQueue.peek()); // 1
    myQueue.printQueue();   // 1, 2, 3, 4, 5

    System.out.println(myQueue.pop());  // 1
    myQueue.printQueue();   // 2, 3, 4, 5

    System.out.println(myQueue.pop());  // 2
    myQueue.printQueue();   // 3, 4, 5

    System.out.println(myQueue.pop());
    System.out.println(myQueue.pop());
    System.out.println(myQueue.pop());
    myQueue.printQueue();
  }
}
