// Example:
// Input: nums = [10,9,2,5,3,7,101,18]
// Output: 4

class LongestIncreasingSubsequence {
    int max=0;
    public int lengthOfLIS(int[] nums) {

        int n=nums.length;
        Set<Integer> set= new HashSet<>();
        for(int num: nums)
            set.add(num);
        int m=set.size();
        int[] arr= new int[m];
        int i = 0;
        for (int x : set)
            arr[i++] = x;
        Arrays.sort(arr);
        return lcs(nums,arr,n,m);
    }

    int lcs(int[] x, int[] y, int n, int m)
    {
        if(m==0) return n+1;
        if(n==0) return m+1;

        int dp[][]= new int[n+1][m+1];

        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=m;j++)
            {
                if(i==0 || j==0) dp[i][j]=0;
                else
                {
                    if(x[i-1]==y[j-1])
                        dp[i][j]=1+dp[i-1][j-1];
                    else 
                        dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }
}
