package sort;

import java.util.*;

class MaxNum {
    public String solution(int[] numbers) {
        String answer = "";

        String[] str = new String[numbers.length];

        //int배열 String 배열로 변환
        for(int i = 0; i < numbers.length; i++){
            str[i] = Integer.toString(numbers[i]);
            //str[i] = String.valueOf(numbers[i])
        }

        //내림차순 정렬
        Arrays.sort(str, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                return (s2 + s1).compareTo(s1 + s2);
            }
        });
        //Arrays.sort(str, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));

        //0값이 중복일 경우 ex) {0, 0, 0}
        if(str[0].equals("0")) return "0";

        //문자열을 더해준다
        for(String s : str) answer += s;

        return answer;
    }
}
