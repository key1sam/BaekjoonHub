// Set을 활용한 아이디어
// Java에는 크게 3가지의 Set이 존재한다.
// HashSet : Set을 구현하는 대표 클래스, 데이터 중복할 수 없고 순서를 보장하지 않는다.
// TreeSet : HashSet 특성 + 오름차순으로 데이터를 정렬한다
// LinkedHashSet : 데이터를 중복해서 저장할 수없고, 입력한 순서대로 데이터를 저장한다
// Set은 인덱스로 객체를 관리하지 않기 때문에 데이터를 검색하기 위해서는 iterator() 메서드로 Iterator(반복자)를 생성하고 데이터를 가져와야 한다. 
import java.util.*;


class Solution {
    public int solution(int[] nums) {
        
        int answer = (nums.length)/2;
        
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        
        if (set.size() >  answer) {
            return answer;
        }
        else {
            return set.size();
        }
    }
}