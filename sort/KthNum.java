package sort;

//K번째 수
import java.util.*;

class KthNum {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int index = 0;

        //commands에서 배열 차례로 가져오기 [2,5,3] / [4, 4, 1] / [1, 7, 3]
        //가져온 배열의 첫번째 값은 i, 두번째는 j, 3번째는 k
        //array 자르고 정렬하기
        //k에 해당하는 값 answer 배열에 넣어주기
        for(int a = 0; a < commands.length; a++){
            int i = commands[a][0];
            int j = commands[a][1];
            int k = commands[a][2];

            int[] newArray = new int[j-i+1]; //int[1]
            int c = 0;

            for(int b = i-1; b <= j-1; b++){ //b=3, b < 3
                newArray[c] = array[b];
                c++;
            }

            Arrays.sort(newArray);

            answer[index] = newArray[k-1];
            index++;
        }

        return answer;
    }
}