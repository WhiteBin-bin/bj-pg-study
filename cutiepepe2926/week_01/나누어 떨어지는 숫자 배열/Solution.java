import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {

        int[] answer;

        List<Integer> temp = new ArrayList<>();

        for (int a : arr) {

            if (a % divisor == 0) {
                temp.add(a);
            }

        }

        if (temp.size() == 0) {

            answer = new int[]{-1};

        }
        else {

            Collections.sort(temp);

            answer = new int[temp.size()];

            int idx = 0;

            for (int t : temp) {
                answer[idx++] = t;
            }

        }

        return answer;

    }
}