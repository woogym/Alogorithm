package Algorithm.Programers.level1;

// n번째 원소까지
public class Programmers_15 {
    class Solution {
        public int[] solution(int[] num_list, int n) {
            int[] answer = new int[n];

            for (int i = 0; i < answer.length; i++) {
                answer[i] = num_list[i];
            }

            return answer;
        }
    }
}