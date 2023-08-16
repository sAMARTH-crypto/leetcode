public class Solution {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        //storing the lenght of the individual linked list
        int lenA = getListLength(headA);
        int lenB = getListLength(headB);

    //here both while loops are making the length of the lists equal to each other
        if(headA == null && headB == null){return null;}


        while(lenA>lenB){
            lenA--;
            headA = headA.next;
        }

        while(lenB>lenA){
            lenB--;
            headB = headB.next;
        }

        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
        }

        return headA;


    }

     private int getListLength(ListNode node) {
        int length = 0;
        while (node != null) {
            length++;
            node = node.next;
        }
        return length;
    }
}
