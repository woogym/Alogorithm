package Algorithm.Programers.level1;

import java.util.ArrayList;
import java.util.List;

public class Programmers_11 {
    class Solution {
        public String[] solution(String[] todo_list, boolean[] finished) {
            List<String> answer = new ArrayList<>();

            for (int i = 0; i < todo_list.length; i++) {
                if (!finished[i]) {
                    answer.add(todo_list[i]);
                }
            }

            return answer.toArray(new String[0]);
        }
    }
}