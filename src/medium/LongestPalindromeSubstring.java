/*
https://leetcode.com/problems/longest-palindromic-substring/
*/

class Solution {
    public String longestPalindrome(String s) {
		String r = "";
		int n = s.length();
		boolean table[][] = new boolean[n][n];

		int start = 0;
		int maxLength = 1;
		for (int i = 0; i < n - 1; ++i) {
			table[i][i] = true;
			if (s.charAt(i) == s.charAt(i + 1)) {
				table[i][i + 1] = true;
				start = i;
				maxLength = 2;
			}
		}

		for (int k = 3; k <= n; ++k) {
			for (int i = 0; i < n - k + 1; ++i) {
				int j = i + k - 1;
				if ((s.charAt(i) == s.charAt(j)) && table[i + 1][j - 1]) {
					table[i][j] = true;
					if (maxLength < k) {
						maxLength = k;
						start = i;
					}
				}
			}
		}
		//printSubStr(s, start, start+ maxLength-1);
		return s.substring(start, start+ maxLength);
    }
}
