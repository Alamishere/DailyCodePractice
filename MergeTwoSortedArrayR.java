package DailyCodePractice;


public class MergeTwoSortedArrayR {
    public ListNode MergeTwoList(ListNode list1, ListNode list2){
        if(list1 !=null && list2 != null) {
            if (list1.value < list2.value) {
                list1.next = MergeTwoList(list1.next, list2);
                return list1;
            } else {
                list2.next = MergeTwoList(list1, list2.next);
                return list2;
            }
        }
        if(list1== null)
            return list2;
        return list1;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MergeTwoSortedArrayR solution = new MergeTwoSortedArrayR();

        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        System.out.print("Test 1 - Merge [1,2,4] and [1,3,4]: ");
        ListNode result1 = solution.MergeTwoList(list1, list2);
        printList(result1);

        ListNode list3 = new ListNode(2, new ListNode(5, new ListNode(8)));
        ListNode list4 = new ListNode(1, new ListNode(3, new ListNode(7, new ListNode(10))));
        System.out.print("Test 2 - Merge [2,5,8] and [1,3,7,10]: ");
        ListNode result2 = solution.MergeTwoList(list3, list4);
        printList(result2);

        ListNode list5 = null;
        ListNode list6 = new ListNode(0, new ListNode(1, new ListNode(2)));
        System.out.print("Test 3 - Merge empty list and [0,1,2]: ");
        ListNode result3 = solution.MergeTwoList(list5, list6);
        printList(result3);

        ListNode list7 = new ListNode(5);
        ListNode list8 = null;
        System.out.print("Test 4 - Merge [5] and empty list: ");
        ListNode result4 = solution.MergeTwoList(list7, list8);
        printList(result4);
    }
}