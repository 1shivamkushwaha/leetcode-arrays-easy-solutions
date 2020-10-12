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
        
        //creating new array
        int n = count(head);
        int[] arr= new int[n];

        //inserting the values
         for(int i=0; i <n;i++)
          {
              arr[i]=slow.val;
              slow=slow.next;
          }

          for(int i=0; i <n;i++)
            {
                int max=i;
                for(int j=i; j <n;j++)
                {
                    if(arr[max]<arr[j])
                    {
                        max=j;
                        break;
                    }
                }
          
              //swap
                if(max==i)
                {
                    arr[i]=0;
                }
                else
                {
                    arr[i]=arr[max];
                }
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
