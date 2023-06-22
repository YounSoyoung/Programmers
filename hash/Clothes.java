package hash;


import java.util.*;

class Clothes {
    public int solution(String[][] clothes) {

        HashMap<String, Integer> map = new HashMap<>();

        for(String[] c : clothes){
            String type = c[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }

        int answer = 1;

        Iterator<Integer> it = map.values().iterator();
        //값만 가져오고 싶은 경우 -> values()메서드 사용

        while(it.hasNext()){
            answer *= it.next().intValue() + 1;
            //Integer의 값을 int로 가져오기 위해 intValue() 이용
        }


        return answer -1;
    }
}
