import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
      
    	int preNum = -1;
    	ArrayList<Integer> arrList = new ArrayList<>();
    	for (int i = 0; i < arr.length; i++ ) {
    		if (preNum != arr[i]) {
    			arrList.add(arr[i]);
    			preNum = arr[i];
    		}
    		else {
    			continue;
    		}
    	}
    	
    	int[] array = new int[arrList.size()];
    	for (int i = 0; i < array.length; i++) {
    		array[i] = arrList.get(i);
    	}
    	
    	return array;
    }
}