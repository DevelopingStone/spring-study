// Practice2
// 배열을 이용한 기본 큐 직접 구현 (원형 큐)

import java.util.Arrays;

class MyQueue2 {

  int[] array;
  int count = 0;
  int size = 0;
  int position = 0;

  public MyQueue2(int size) {
    this.size = size;
    array = new int[size];

  }

  //    public boolean isEmpty() {
//
//    }
//
//    public boolean isFull() {
//
//    }
//
  public void enqueue(int data) {
    if (count >= size) {
      System.out.println("현재크기 : "+size+" \n사이즈 초과되었습니다.");
      return;
    }
    array[count] = data;
    count++;

  }


  public Integer dequeue() {
    int a = (Integer) (array[position]);
    position++;
    return a;

  }

  public void printQueue() {

    for(int i=position; i<array.length; i++){
      System.out.print(array[i]+", ");
    }
    System.out.println();

  }

}

public class Practice2 {

  public static void main(String[] args) {
    // Test code
    MyQueue2 myQueue = new MyQueue2(5);
    myQueue.enqueue(1);
    myQueue.enqueue(2);
    myQueue.enqueue(3);
    myQueue.enqueue(4);
    myQueue.enqueue(5);
    myQueue.enqueue(6); // Queue is full!


    myQueue.printQueue();   // 1, 2, 3, 4, 5

    System.out.println(myQueue.dequeue());  // 1
    myQueue.printQueue();   // 2, 3, 4, 5

    System.out.println(myQueue.dequeue());  // 2
    myQueue.printQueue();   // 3, 4, 5

        myQueue.enqueue(6);
        myQueue.enqueue(7);
        myQueue.printQueue();   // 3, 4, 5, 6, 7
//
//        System.out.println(myQueue.dequeue());  // 3
//        System.out.println(myQueue.dequeue());  // 4
//        System.out.println(myQueue.dequeue());  // 5
//        myQueue.printQueue();   // 6, 7
//        System.out.println(myQueue.dequeue());  // 6
//        System.out.println(myQueue.dequeue());  // 7
//        myQueue.dequeue();      // Queue is empty!
  }
}
