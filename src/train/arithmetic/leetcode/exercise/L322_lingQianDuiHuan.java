package train.arithmetic.leetcode.exercise;

// 凑零钱
public class L322_lingQianDuiHuan {
	static int ans ;
	static int[] memo;
	public static void main(String[] args) {
		int[] coins = {1,2,5};
		int amount = 11;
		
		System.out.println(coinChange(coins,amount));
		
	}

	
	
	// 动态规划
	private static int coinChange(int[] coins, int amount) {
		if (coins.length == 0) {
			return -1;
		}
		
		int[] dp = new int[amount+1];
		
		dp[0] = 0;
		dp[1] = 1;
		
		for (int i = 1; i <= amount ; i++) {
			int min = Integer.MAX_VALUE;
			for (int j = 0; j < coins.length; j++) {
				if (i - coins[j] >= 0) {
					min = Math.min(min, dp[i-coins[j]]+1);
				}
			}
			dp[i] = min;
		}
		
		return dp[amount] ==  Integer.MAX_VALUE ? -1:dp[amount];
	}




	//记忆化搜索 ~ 递归
	public static int coinChange2(int[] coins, int amount) {
		if (coins.length == 0) return -1;
		
		memo = new int[amount];
		
		return findmemo(coins,amount);
	}

	
	private static int findmemo(int[] coins, int amount) {
		
		if (amount < 0) {
			return -1;
		}
		if (amount == 0 ) {
			return 0;
			
		}
		
		if(memo[amount-1] != 0){
            return memo[amount-1];
        }
		
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < coins.length; i++) {
			int res = findmemo(coins,amount-coins[i]);
			if (res >= 0 && res < min) {
				min = res+1;
			}
		}
		
		
		memo[amount-1] = (min == Integer.MAX_VALUE ? -1 : min);
        return memo[amount-1];
	}


	//回溯 ~ 递归
//	public static int coinChange1(int[] coins, int amount) {
//		if (coins.length == 0 ) return -1;
//		ans = Integer.MAX_VALUE;
//		
//		findway(coins,amount,0);
//		
//		if (ans == Integer.MAX_VALUE) {
//			return -1;
//		}
//		
//		return ans;
//	}

//	private static void findway(int[] coins, int amount, int num) {
//		if (amount < 0) {
//			return;
//		}
//		if (amount == 0 ) {
//			ans = Math.min(ans, num);
//			
//		}
//		
//		for (int i = 0; i < coins.length; i++) {
//			findway(coins,amount-coins[i],num+1);
//		}
//		
//	}
}
