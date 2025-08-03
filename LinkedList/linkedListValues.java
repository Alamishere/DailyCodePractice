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

  public static void main(String[] args) {
    Node<String> a = new Node<>("A");
    Node<String> b = new Node<>("B");
    Node<String> c = new Node<>("C");
    Node<String> d = new Node<>("D");

    a.next = b;
    b.next = c;
    c.next = d;
    List<String> values = linkedListValues1(a);
    System.out.println(values); 
  }
}
