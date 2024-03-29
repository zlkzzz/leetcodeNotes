import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param numbers int整型一维数组 
     * @return int整型
     */
    public int duplicate (int[] numbers) {
        if(numbers==null || numbers.length==0)
            return -1;
        Arrays.sort(numbers);
        if(numbers[0]<0 || numbers[numbers.length-1]>=numbers.length)
            return -1;
        for(int i=0;i<numbers.length-1;i++){
            if(numbers[i]==numbers[i+1]){
                return numbers[i];
            }
        }
        return -1;
    }
}