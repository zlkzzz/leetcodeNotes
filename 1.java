import java.util.*;


public class Solution {
    /**
     * �����е����������������������Ѿ�ָ���������޸ģ�ֱ�ӷ��ط����涨��ֵ����
     *
     * 
     * @param numbers int����һά���� 
     * @return int����
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