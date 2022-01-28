package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PFCT_chapter08_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int[] dp = new int[num+1];

        dp[1] = 1;
        dp[2] = 3;

        for(int i = 3; i <= num; i++)
            dp[i] = (dp[i-1] + 2*dp[i-2]) % 796796;

        System.out.println(dp[num]);
        br.close();
    }
}
