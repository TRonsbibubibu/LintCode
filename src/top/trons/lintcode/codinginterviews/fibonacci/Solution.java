package top.trons.lintcode.codinginterviews.fibonacci;

import java.util.HashMap;

/**
 * Created by trons on 16-4-10.
 */
class Solution {
    /**
     * @param n: an integer
     * @return an integer f(n)
     */
    private HashMap<Integer, Integer> hashMap = new HashMap();
    public int fibonacci(int n) {
        if(n == 1){
            hashMap.put(1, 0);
            return hashMap.get(1);
        }
        if(n == 2){
            hashMap.put(2, 1);
            return hashMap.get(2);
        }
        if(hashMap.containsKey(n)){
            return hashMap.get(n);
        }else{
            int value = fibonacci(n -1) + fibonacci(n -2);
            hashMap.put(n, value);
            return hashMap.get(n);
        }
    }

    /**
     * 普通的递归会造成运行时间过长,用空间换时间
     * @param args
     */
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.fibonacci(1));
        System.out.println(solution.fibonacci(2));
        System.out.println(solution.fibonacci(10));
    }
}
