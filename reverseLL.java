public class reverseLL {
  static class Node<T> {
    T val;
    Node<T> next;

    public Node(T val) {
      this.val = val;
      this.next = null;
    }
  }

  static class Source {
    public static <T> Node<T> reverseList(Node<T> head) {
      Node<T> current = head;
      Node<T> prev = null;
      while (current != null) {
        Node<T> next = current.next;
        current.next = prev;
        prev = current;
        current = next;
      }
      return prev;
    }

    public static <T> void printList(Node<T> head) {
      Node<T> cur = head;
      while (cur != null) {
        System.out.print(cur.val + (cur.next != null ? " -> " : ""));
        cur = cur.next;
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Node<Integer> head = new Node<>(1);
    head.next = new Node<>(2);
    head.next.next = new Node<>(3);
    head.next.next.next = new Node<>(4);

    System.out.print("Original: ");
    Source.printList(head);

    Node<Integer> reversed = Source.reverseList(head);

    System.out.print("Reversed: ");
    Source.printList(reversed);
  }
}

