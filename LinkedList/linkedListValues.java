import java.util.List;
import java.util.ArrayList;

class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class linkedListValues {
  public static List<String> linkedListValues1(Node<String> head) {
    List<String> result = new ArrayList<>();
    Node<String> currentNode = head;
    while (currentNode != null) {
      result.add(currentNode.val);
      currentNode = currentNode.next;
    }
    return result;
  }

public static int sumList(Node<Integer> head) {
    int sum=0;
    Node<Integer> currentNode = head;
    while(currentNode != null){
      sum = sum+ currentNode.val;
      currentNode = currentNode.next;
      
    }
    return sum;
  }

  public static void main(String[] args) {
    // Node<String> a = new Node<>("A");
    // Node<String> b = new Node<>("B");
    // Node<String> c = new Node<>("C");
    // Node<String> d = new Node<>("D");

    Node<Integer> a = new Node<>(2);
    Node<Integer> b = new Node<>(8);
    Node<Integer> c = new Node<>(3);
    Node<Integer> d = new Node<>(-1);
    Node<Integer> e = new Node<>(7);

    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;
    //List<String> values = linkedListValues1(a);
    //System.out.println(values); 
    System.out.println("Sum of the values are "+ sumList(a));
  }
}
