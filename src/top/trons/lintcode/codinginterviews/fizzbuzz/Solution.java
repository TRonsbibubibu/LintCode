package top.trons.lintcode.codinginterviews.fizzbuzz;

import java.util.ArrayList;

/**
 * Created by trons on 16-4-10.
 */
class Solution {
    /**
     * param n: As description.
     * return: A list of strings.
     */
    public ArrayList<String> fizzBuzz(int n) {
        ArrayList<String> results = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                results.add("fizz buzz");
            } else if (i % 5 == 0) {
                results.add("buzz");
            } else if (i % 3 == 0) {
                results.add("fizz");
            } else {
                results.add(String.valueOf(i));
            }
        }
        return results;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.fizzBuzz(15));
    }
}
