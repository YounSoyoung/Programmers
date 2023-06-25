package stackAndQueue;

//기능 개발

import java.util.*;

class FunctionDevelopmet {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> workDay = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < speeds.length; i++){
            int n = 100 - progresses[i];
            if(n % speeds[i] == 0){
                q.add(n / speeds[i]);
            }
            else q.add(n / speeds[i] + 1);
        }


        //7 3 9
        int a = q.poll();
        int cnt = 1;

        while(!q.isEmpty()){
            if(q.peek() <= a){
                cnt++;
                q.poll();
            }
            else{
                workDay.add(cnt);
                cnt = 1;
                a = q.poll();
            }
        }
        workDay.add(cnt);

        int[] answer = new int[workDay.size()];

        for(int i = 0; i < answer.length; i++){
            answer[i] = workDay.get(i);
        }


        return answer;
    }
}
