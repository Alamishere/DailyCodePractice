package DailyCodePractice;

 class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


public class MergeTwoSortedArray {
    public ListNode MergeTwoList(ListNode list1, ListNode list2){
        ListNode returnNode = new ListNode(Integer.MIN_VALUE);
        ListNode headNode = returnNode;

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                returnNode.next = list1;
                list1= list1.next;
            }else{
                returnNode.next= list2;
                list2 = list2.next;
            }
            returnNode = returnNode.next;
        }
        if(list1==null){
        returnNode.next=list2;
        } else if(list2 == null){
            returnNode.next= list1;
        }

        return headNode.next;
    }
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        MergeTwoSortedArray solution = new MergeTwoSortedArray();
        
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        System.out.print("Test 1 - Merge [1,2,4] and [1,3,4]: ");
        ListNode result1 = solution.MergeTwoList(list1, list2);
        printList(result1);
        
        ListNode list3 = new ListNode(5, new ListNode(10, new ListNode(15)));
        ListNode list4 = new ListNode(2, new ListNode(3, new ListNode(20)));
        System.out.print("Test 2 - Merge [5,10,15] and [2,3,20]: ");
        ListNode result2 = solution.MergeTwoList(list3, list4);
        printList(result2);
        
        ListNode list5 = null;
        ListNode list6 = new ListNode(0);
        System.out.print("Test 3 - Merge empty list and [0]: ");
        ListNode result3 = solution.MergeTwoList(list5, list6);
        printList(result3);
    }
    
}

