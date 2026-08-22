class Solution {
    /**
     * @param {string} text1
     * @param {string} text2
     * @return {number}
     */
    longestCommonSubsequence(text1, text2) {
        let len_1 = text1.length
        let len_2 = text2.length
        let dp = Array.from(Array(len_2 + 1), () => Array(len_1 + 1).fill(0))

        for (let i = len_2 - 1; i >= 0; i--) {
            for (let j = len_1 - 1; j >= 0; j--) {
                if (text1.charAt(j) === text2.charAt(i)) {
                    dp[i][j] = 1 + dp[i + 1][j + 1]
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j + 1])
                }
            }
        }

        return dp[0][0]
    }
}
