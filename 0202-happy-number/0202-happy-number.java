class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do{
            slow = sumSquaredDigits(slow);
            fast = sumSquaredDigits(sumSquaredDigits(fast));
            if (slow == 1) return true;
        }while(slow != fast);

        return false;
    }
   
    private int sumSquaredDigits(int num){
        int sum = 0;
        while (num != 0){
            sum += (num % 10) * (num%10);
            num /= 10;
        }
        return sum;
    }
}