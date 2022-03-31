package main;

import algoStudyPlan.Solution704;
import leetcodeSolutions.Solution1;
import leetcodeSolutions.Solution1_1;
import leetcodeSolutions.Solution2;
import leetcodeSolutions.Solution3;

public class Result {
    public static void main(String[] args) {
//        Solution1_1 s1 = new Solution1_1();
//        int[] input = {3,2,3};
//        int[] result=s1.twoSum(input,6);
//        for(int i=0;i<result.length;i++){
//            System.out.println(result[i]);
//        }

//        Solution2 s2 = new Solution2();
//        ListNode lList = new ListNode();
//        lList.head = new ListNode(1);
//        ListNode secondeNode = new ListNode(2);
//        ListNode thirdNode = new ListNode(3);
//        lList.head.next = secondeNode;
//        secondeNode.next = thirdNode;
//        s2.addTwoNumbers()
      /*  Solution3 s3 = new Solution3();
       int l =  s3.lengthOfLongestSubstring("dvdf");
        System.out.println("l: "+l);*/
        Solution704 solution704 = new Solution704();
        int[] in = {-1,0,3,5,9,12};

       int index =  solution704.search(in,0);
        System.out.println(index);
    }
}
