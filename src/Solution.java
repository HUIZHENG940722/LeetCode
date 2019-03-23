import bean.ListNode;

/**
 * LeetCode网上的答案
 */
class Solution {
    /**
     * 1.两数之和
     * @param nums 数组
     * @param target 目标值
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * 2.两数相加
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //目标链的头链
        ListNode head=new ListNode(0);
        //目标链的当前值和进位值
        int sum=0,bit=0;
        //l1和l2链的索引、目标链的索引
        ListNode mL1=l1,mL2=l2,curr=head;
        while (mL1!=null||mL2!=null){
            sum=mL1.val+mL2.val+bit;
            bit=sum/10;
            curr.next=new ListNode(sum%10);
            curr=curr.next;
        }
        //控制结尾是否进位
        if (bit>0){
            curr.next=new ListNode(bit%10);
        }
        return head.next;
    }


}