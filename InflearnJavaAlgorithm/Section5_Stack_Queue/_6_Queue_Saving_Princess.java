package InflearnJavaAlgorithm.Section5_Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _6_Queue_Saving_Princess {
    public static void main(String[] args) {
        _6_Queue_Saving_Princess T = new _6_Queue_Saving_Princess();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(T.solution(n, k));
        System.out.println(T.solution2(n, k));
    }

    public int solution2(int n, int k){
        int answer = 0;
        Queue<Integer> Q = new LinkedList<>();
        for(int i=1; i<=n; i++) Q.offer(i);
        while (!Q.isEmpty()){
            for(int i=1; i<k; i++) Q.offer(Q.poll());
            Q.poll();
            if(Q.size() == 1) answer = Q.poll();
        }
        return answer;
    }

    public int solution(int n, int k){
        Queue<Integer> princes = new LinkedList<>();
        for(int i=1; i<n+1; i++) princes.offer(i);

        int count = 0;
        while (true){
            int prince = princes.remove();

            count += 1;
            if (count != k) princes.offer(prince);
            else {
                count = 0;
                if (princes.size() == 1)
                    return princes.poll();
            }
        }
    }
}
