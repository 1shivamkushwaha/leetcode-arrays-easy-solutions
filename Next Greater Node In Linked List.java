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
    public int[] nextLargerNodes(ListNode head) {
        
        
        ListNode slow = head;
        ListNode temp = head;
        
        while(slow!=null)
        {
            int max= slow.val;
            ListNode fast = slow;
            while(fast!=null)
            {
                if(max<fast.val)
                {
                    max=fast.val;
                    break;
                }
                fast =fast.next;
                
            }
            
            if(max==slow.val)
            {
                slow.val=0;
            }
            else
            {
                slow.val=max;
            }
            slow=slow.next;
            
        }
        
        
        //creating new array
        int n = count(head);
        int[] arr= new int[n];

        //inserting the values
         for(int i=0; i <n;i++)
          {
              arr[i] = temp.val;
              temp = temp.next;
          }            
        return arr;
    }
    
    static int count(ListNode head)
    {
        ListNode temp = head;
        int count =0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        return count;
    }
}
