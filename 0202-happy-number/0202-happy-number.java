class Solution {
    public boolean isHappy(int n) {
        Set<Integer> nums = new HashSet<>();
        while (n != 1 && !nums.contains(n)){
            nums.add(n);
            int sum = 0;
            while (n != 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
        }
        return (n==1);
    }
}