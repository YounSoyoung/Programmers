package stackAndQueue;

import java.util.*;

//같은 숫자는 싫어

public class checkSameNum {
    public int[] solution(int [] arr) {
        List<Integer> ans = new ArrayList<>();

        int value = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != value){
                ans.add(arr[i]);
                value = arr[i];
            }
        }

        int[] answer = new int[ans.size()];

        for(int i = 0; i < answer.length; i++){
            answer[i] = ans.get(i);
        }

        return answer;
    }
}
