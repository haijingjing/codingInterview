import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;


//3数组重重复的数字
public class DuplicateInArray {
    //method 1: use hashset
    public int findNumber1(int[] data){
        HashSet<Integer> set = new HashSet<>();
        for(int num: data){
            if(set.contains(num)){
                return num;
            }else {
                set.add(num);
            }
        }
        return -1;
    }

    //method 2: change array to find
    public int findNumber2(int[] data){
        for(int i = 0; i < data.length; i++){
            if(i != data[i]){
                if(data[i] == data[data[i]]){
                    return data[i];
                }else {
                    swap(data, i);
                }
            }
        }
        return -1;
    }

    private void swap(int[] data, int i) {
        int temp = data[i];
        data[i] = data[temp];
        data[temp] = temp;
    }

    //method 3: do not change array

    /**
     * You must not modify the array (assume the array is read only).
     * You must use only constant, O(1) extra space.
     * Your runtime complexity should be less than O(n2).
     */
    public int findNumber3(int[] data){
        int start = 1;
        int end = data.length - 1;
        while (end >= start){
            if(start == end) return start;
            int mid = (end - start)/2 + start;
            int count = countRange(data, start, mid);
            if(count > (mid -start) + 1){
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }

    private int countRange(int[] data, int start, int mid) {
        int count = 0;
        Collections.binarySearch(new ArrayList<>(),5);
        for(int i = 0; i < data.length; i++){
            if(data[i] >= start && data[i] <= mid){
                count ++;
            }
        }
        return count;
    }

    @Test
    public void binarySearch(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);
        int m = Collections.binarySearch(list,5);
        System.out.println(m);
    }



}
