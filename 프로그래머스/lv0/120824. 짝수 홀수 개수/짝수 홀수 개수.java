class Solution {
    public int[] solution(int[] num_list) {
        int odd = 0;
        int even = 0;
        
        for(int number: num_list) {
            if (number % 2 == 0) {even ++;}
            else { odd ++;}           
        }
        
        return new int[] {even, odd};        
    }
}