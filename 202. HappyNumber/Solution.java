class Solution {
    public boolean isHappy(int n) {
        int slow, fast;
        slow = fast = n;
        do{
            slow = digitSum(slow);
            fast = digitSum(fast);
            fast = digitSum(fast);
        }while(slow != fast);
        if(slow == 1){
            return true;
        }
        else{
            return false;
        }
    }
    
    public int digitSum(int n){
        int sum = 0;
        while(n > 0){
            int temp = n % 10;
            sum += temp * temp;
            n = n/10;
        }
        return sum;
    }
}