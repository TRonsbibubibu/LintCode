package top.trons.lintcode.codinginterviews.blankreplace;

/**
 * Created by trons on 16-4-10.
 */
class Solution {
    /**
     * @param string: An array of Char
     * @param length: The true length of the string
     * @return: The true length of new string
     */
    public int replaceBlank(char[] string, int length) {
        if(length == 0)
            return 0;
        int num = 0;
        for(char s: string){
            if(s == ' ')
                num++;
        }
        int newLength = length + num*2;
        int j = 1;
        for(int i = length-1;i>=0;i--){
            if (string[i] != ' '){
                string[newLength-j] = string[i];
                j++;
            }else{
                string[newLength-j] = '0';j++;
                string[newLength-j] = '2';j++;
                string[newLength-j] = '%';j++;
            }
        }
        return newLength;
    }

    /**
     * 题目写了"你可以假设该字符串有足够的空间来加入新的字符"
     * @param args
     */
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "Mr John Smith";
        char[] chars = new char[100];
        char[] string = s.toCharArray();
        for(int i=0;i<string.length;i++){
            chars[i] = string[i];
        }
        System.out.println(solution.replaceBlank(chars,s.length()));
    }
}
