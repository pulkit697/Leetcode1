class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int n = tokens.length;
        int i = 0;
        int j = n - 1;
        int score = 0;
        int mx = 0;
        while (i <= j) {
            if (power >= tokens[i]) {
                score++;
                power -= tokens[i];
                i++;
            } else {
                if (score <= 0) break;
                score--;
                power += tokens[j];
                j--;
            }
            mx = Math.max(mx, score);
            // System.out.println(score + " " + mx + " : " + power);
        }
        return mx;
    }
}
