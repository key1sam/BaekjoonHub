// 리스트.get(인덱스)로 값 접근 가능
// 리스트.indexOf(값, 탐색 시작부분(생략가능))으로 인덱스 접근가능
// Arrays.copyOf(배열, 길이)로 얕은 복사 가능

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        int[] person1 = {1,2,3,4,5}; // 5개가 반복
        int[] person2 = {2,1,2,3,2,4,2,5}; // 8개가 반복 
        int[] person3 = {3,3,1,1,2,2,4,4,5,5}; // 10개가 반복
         
        int[] correct = new int[3]; // person 1,2,3의 채점 결과를 저장할 예정
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == person1[i % 5]) {
                correct[0]++;
            }
            
            if (answers[i] == person2[i % 8]) {
                correct[1]++;
            }
            
            if (answers[i] == person3[i % 10]) {
                correct[2]++;
            }
        }
        
        int[] sortedCorrect = Arrays.copyOf(correct, correct.length);
        Arrays.sort(sortedCorrect);
        for (int i = 0; i <= 2; i++) {
            if (sortedCorrect[2] == correct[i]) {
                answer.add(i + 1);
            }
        }
        
        int[] array = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            array[i] = answer.get(i);
        }
        
        return array;
    }
}
