/*
// Practice2
// 연결 리스트를 이용한 이진 트리 구성, 순회

class Node {

  char data;
  Node left;
  Node right;

  public Node() {
  }

  public Node(char data, Node left, Node right) {
    this.data = data;
    this.left = left;
    this.right = right;
  }
}

class BinaryTree2 {

  Node head;

  public BinaryTree2() {
  }

  public BinaryTree2(char[] arr) {
    Node[] nodes = new Node[arr.length];
    for (int i = 0; i < arr.length; i++) {
      nodes[i] = new Node(arr[i], null, null);
    }
    for (int i = 0; i < arr.length; i++) {
      int left = 2 * i + 1;
      int right = 2 * i + 2;
      if (left < arr.length) {
        nodes[i].left = nodes[left];
      }
      if (right < arr.length) {
        nodes[i].right = nodes[right];
      }
    }
    this.head = nodes[0];
  }

  public void preOrder(Node node){
    if(node == null){
      return;
    }
  }
}


public class Practice2 {

  public static void main(String[] args) {
    // Test code
    char[] arr = new char[10];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = (char) ('A' + i);
    }

//        BinaryTree2 bt = new BinaryTree2(arr);
//
//        System.out.println("== Preorder ==");
//        bt.preOrder(bt.head);
//        System.out.println();
//
//        System.out.println("== Inorder ==");
//        bt.inOrder(bt.head);
//        System.out.println();
//
//        System.out.println("== Postorder ==");
//        bt.postOrder(bt.head);
//        System.out.println();
//
//        System.out.println("== Levelorder ==");
//        bt.levelOrder(bt.head);
//        System.out.println();
  }
}
*/
