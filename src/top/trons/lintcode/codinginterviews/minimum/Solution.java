package top.trons.lintcode.codinginterviews.minimum;

/**
 * Created by trons on 16-4-13.
 */
public class Solution {
    /**
     * @param num: a rotated sorted array
     * @return: the minimum number in the array
     */

    public int findMin(int[] num) {
        if(num.length == 1)
            return num[0];
        int start = 0;
        int end = num.length-1;
        while (start + 1 < end){
            int mid = start + (end - start)/2;
            if(num[mid] >= num[end]){
                start = mid;
            }else{
                end = mid;
            }
        }
        if(num[start] < num[end])
            return num[start];
        else
            return num[end];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] data = {4,5,6,7,0,1,2};
        System.out.println(solution.findMin(data));
    }
}
