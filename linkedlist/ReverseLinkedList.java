/**
 * @author 乐牙
 * @date 2021/07/01 9:11 PM
 */
public class ReverseLinkedList {

    public static void main(String[] args) {

        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);

        ListNode newList = new Solution().reverseList(listNode);

        print(newList);
    }

    private static void print(ListNode listNode) {
        ListNode cur = listNode;
        while (cur != null) {
            System.out.print(cur.val);
            System.out.print("-->");
            cur = cur.next;
        }
        System.out.println();
    }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null; //前指针节点
        ListNode curr = head; //当前指针节点
        //每次循环，都将当前节点指向它前面的节点，然后当前节点和前节点后移
        while (curr != null) {
            ListNode nextTemp = curr.next; //临时节点，暂存当前节点的下一节点，用于后移
            curr.next = prev; //将当前节点指向它前面的节点
            prev = curr; //前指针后移
            curr = nextTemp; //当前指针后移
        }

        return prev;
    }
}
