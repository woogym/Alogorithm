package Algorithm.Programers.level0;

public class P181835 {
    class Solution {
        public int[] solution(int[] arr, int k) {
            int[] answer = new int[arr.length];

            if (k % 2 == 0) {
                for (int i = 0; i < answer.length; i++) {
                    answer[i]  = arr[i] + k;
                }
            } else {
                for (int i = 0; i < answer.length; i++) {
                    answer[i] = arr[i] * k;
                }
            }

            return answer;
        }
    }
}