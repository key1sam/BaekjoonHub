// 다시 풀어보기

import java.util.*;

class Solution {
    
    static int answer = 1;
    
    public int solution(String[][] clothes) {
        
        HashMap<String,  Integer> clotheHash = new HashMap<>();
        for(String[] clothe : clothes){
            if(clotheHash.containsKey(clothe[1])){ // 이미 옷의 종류가 추가된 경우
                int tmp = clotheHash.get(clothe[1]);
                clotheHash.put(clothe[1], tmp + 1);
            }else{
                clotheHash.put(clothe[1], 2); // 해당 옷을 입은경우, 안 입은 경우해서 2가지이다.
            }
        }
        
        for(String k : clotheHash.keySet()){
            answer *= clotheHash.get(k);
        }
        
        answer -= 1;
        
        return answer;
    }
}