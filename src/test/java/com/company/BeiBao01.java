package com.company;

import org.junit.Test;

public class BeiBao01 {


    /*
    * 根据之前已经引出的状态转移方程，我们再来理解一遍，对于编号为 i 的物品：

如果选择它，那么，当前背包的最大价值等于” i 号物品的价值“ 加上 ”减去 i 号物品占用的空间后剩余的背包空间所能存放的最大价值“，即dp[i][k] = value[i] + dp[i-1][k-weight[i]]；

如果不选择它，那么，当前背包的价值就等于前 i-1 个物品存放在背包中的最大价值，即 dp[i][k] = dp[i-1][k]

dp[i][k] 的结果取两者的较大值，即：

dp[i][k] = max(value[i] + dp[i-1][k-weight[i]], dp[i-1][k])
    *
    * */

    public int maxValue(int[] weight, int[] value, int W) {
        //这里假定传入的weight和values数组长度总是一致的
        int n = weight.length;
        if (n == 0) return 0;

        int[][] dp = new int[n + 1][W + 1];
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= W; k++) {
                // 存放 i 号物品（前提是放得下这件物品）
                int valueWith_i = (k - weight[i - 1] >= 0) ? (value[i - 1] + dp[i - 1][k - weight[i - 1]]) : 0;
                // 不存放 i 号物品
                int valueWithout_i = dp[i - 1][k];
                dp[i][k] = Math.max(valueWith_i, valueWithout_i);
                System.out.println("i = " + i + " k = " + k);
                System.out.println("dp[" + i + "][" + k + "]=" + dp[i][k]);
            }
        }

        return dp[n][W];
    }

    @Test
    public void main() {
        BeiBao01 obj = new BeiBao01();
        int[] w = {1, 4, 3};
        int[] v = {15, 30, 20};
        int W = 4;
        System.out.println(obj.maxValue(w, v, W));
    }
}