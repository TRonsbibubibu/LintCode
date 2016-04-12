package top.trons.lintcode.codinginterviews.getinstance;

/**
 * Created by trons on 16-4-10.
 */
class Solution {
    /**
     * @return: The same instance of this class every time
     */
    private static volatile Solution solution= new Solution();

    private Solution(){
    }

    public static Solution getInstance() {
        return solution;
    }

    /**
     * volatile
     * 确保本条指令不会因编译器的优化而省略，且要求每次直接读值.
     * 多线程并发
     * @param args
     */
    public static void main(String[] args) {
        Solution solution = new Solution();
    }
}
