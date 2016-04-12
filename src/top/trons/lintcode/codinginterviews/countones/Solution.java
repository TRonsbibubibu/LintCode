package top.trons.lintcode.codinginterviews.countones;

/**
 * Created by trons on 16-4-10.
 */
class Solution {
    /**
     * @param num: an integer
     * @return: an integer, the number of ones in num
     */
    public int countOnes(int num) {
        String string = Integer.toBinaryString(num);
        char[] k = string.toCharArray();
        int number = 0;
        for (char s:k){
            if(s == '1'){
                number++;
            }
        }
        return number;
    }

    /**
     * 很无语,LintCode的样例写错了
     * @param args
     */
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countOnes(32));
        System.out.println(solution.countOnes(5));
        System.out.println(solution.countOnes(1023));
    }
}
