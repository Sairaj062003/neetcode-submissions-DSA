/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        ListNode node = head;
        
        int count = 0;

        while(node.next != null){
            
            node = node.next;
            count++;
        }
         int num = count / 2;
         int i =0;
          ListNode startnode = head;
          

        while (i<num){

             ListNode prev = null;
             node = head ;


             while(node.next != null){
                prev=node;
                node = node.next;
                 
            }
            ListNode temp = startnode.next;
            startnode.next = node;
            node.next= temp;
           
            prev.next = null;
            startnode = temp;
            i++;
        }

     
        
    }
}
