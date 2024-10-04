class Solution {
    public long dividePlayers(int[] skill) {
        int n=skill.length;
        Arrays.sort(skill);
        int targetSum = skill[0]+skill[n-1];
        long chemistry = 0;
        
        int left = 0, right = n - 1;
        int count = 0;
        while (left < right) {
            int pairSum = skill[left] + skill[right];
            if (pairSum == targetSum) {
                chemistry += (long) skill[left] * (long)skill[right];
                left++;
                right--;
                count += 2;
            } else if (pairSum < targetSum) {
                left++;
            } else {
                right--;
            }
        }
        if (count < n) {
            return -1;
        }

        return chemistry;
    }
}
