package main;

import algoStudyPlan.Solution34;
import algoStudyPlan.Solution704;
import hackerrank.algorithm.SimpleArraySum;
import leetcodeSolutions.*;

import java.util.ArrayList;
import java.util.List;

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
       /* int[] in = {-1,0,3,5,9,12};

       int index =  solution704.search(in,0);*/
       /* Solution34 solution34 = new Solution34();
        //int[] input = {7};
        int[] input = {5,7,7,8,8,10};
        int[] result = solution34.searchRange(input,7);
        System.out.println("[");
        for(int a:result){
            System.out.print(a+",");
        }
        System.out.println("]");*/
       /* Solution4 s4 = new Solution4();
        int[] a = {3};
        int[] b = {-2,-1};
       double result = s4.findMedianSortedArrays(a,b);
        System.out.println("Median: "+result);*/
       /*int sum = SimpleArraySum.simpleArraySum(List.of(1,2,3));
        System.out.println("Sum: "+sum);*/
       /* Solution5 s5 = new Solution5();
        System.out.println( s5.longestPalindrome("abcba"));*/
        /*Solution6 s6 = new Solution6();
       String s = s6.convert("PAYPALISHIRING",4);
        System.out.println(s);*/

        /*Solution7 s7 = new Solution7();
       int a = s7.reverse(1534236469);
        System.out.println(a);*/
       /* Solution8 s8 = new Solution8();
        System.out.println(s8.myAtoi("  0000000000012345678"));*/
        /*Solution9 s9 = new Solution9();
        System.out.println(s9.isPalindrome(1234567899));*/
        /*Solution10 s10 = new Solution10();
        System.out.println(s10.isMatch("ab",".*"));*/
       /* Solution11 s11 = new Solution11();
        //int[] arr = {1,8,6,2,5,4,8,3,7};
        int[] arr = {1,1};
        System.out.println("max area:"+s11.maxArea(arr));*/
      /*  Solution15 s15 = new Solution15();
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.println( s15.threeSum(arr));*/
     /*   Solution16 s16 = new Solution16();
       // int[] arr = {1,2,4,8,16,32,64,128}; //82
      //  int[] arr = {-1,2,1,-4}; //1
        int[] arr = {-1,0,1,1,55} ;//3
        s16.threeSumClosest(arr,3);*/
       /* Solution17 s17 = new Solution17();
        System.out.println(s17.letterCombinations("1"));*/
      //  int[] arr = {1,0,-1,0,-2,2};
        //[-2,-1,-1,1,1,2,2],0
        //nums = [2,2,2,2,2], target = 8
        /*
        * [-3,-2,-1,0,0,1,2,3], 0
        *answer: [[-3,-2,2,3],[-3,-1,1,3],[-3,0,0,3],[-3,0,1,2],[-2,-1,0,3],[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
        * [[-2, -1, 0, 3], [-2, 0, 0, 2], [-3, -1, 1, 3], [-3, 0, 0, 3], [-2, -1, 1, 2], [-3, -2, 2, 3]]
        *  size = 6
         */

/*
        int[] arr = {2,2,2,2,2};
        Solution18 s18 = new Solution18();
        s18.fourSum(arr,8);
*/
        /*
        Input: nums = [0,2,1,5,3,4]
Output: [0,1,2,4,5,3]
         */
/*
        int[] arr = {0,2,1,5,3,4};
        Solution1920 s1920  = new Solution1920();
        s1920.buildArray(arr);
*/

       /* int[] arr = {1,2,1};
        Solution1929 s1920  = new Solution1929();
        s1920.getConcatenation(arr);*/
        /*int[] arr= {1,2,3,4};
        Solution1480 s1480 = new Solution1480();
        s1480.runningSum(arr);*/

        /*
        Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
[[2,8,7],[7,1,3],[1,9,5]]
         */
        /*int[][] arr = {{2,8,7},{7,1,3},{1,9,5}};
        Solution1672 s1672 = new Solution1672();
        s1672.maximumWealth(arr);*/
        Solution1470 s1470 = new Solution1470();
        int[] arr = {1,2,3,4,4,3,2,1};
       // int[] arr = {2,5,1,3,4,7};
        s1470.shuffle(arr,4);

    }
}
