package exhaustiveSearch;

import java.util.*;

//모의고사

class MockTest {
    public int[] solution(int[] answers) {

        int[] oneArr = {1, 2, 3, 4, 5};
        int[] twoArr = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] threeArr = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = {0, 0, 0};

        for(int i = 0; i < answers.length; i++){
            if(answers[i] == oneArr[i%5]) score[0]++;
            if(answers[i] == twoArr[i%8]) score[1]++;
            if(answers[i] == threeArr[i%10]) score[2]++;
        }


        int[] temp = new int[3];

        for(int i = 0; i < 3; i++){
            temp[i] = score[i];
        }

        Arrays.sort(temp);

        int max = temp[2];

        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < score.length; i++){
            if(score[i] == max){
                result.add(i+1);
            }
        }

        int[] answer = new int[result.size()];

        for(int i = 0; i < result.size(); i++){
            answer[i] = result.get(i);
        }

        return answer;
    }
}
