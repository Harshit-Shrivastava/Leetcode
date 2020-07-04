class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;

        for (int bill : bills) {

            if (bill == 5) {
                //$5 bill
                five ++;

            } else if (bill == 10) {

                //$10 bill, return $5
                if (five == 0) {
                    return false;
                } else {
                    five--;
                    ten++;
                }
            } else {

                //$20 bill, return either a $10 and a $5 or 3 $5 bills
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                } else if (five >= 3) {
                    five-=3;
                } else {
                    return false;
                }
            }

        }
        return true;
    }
}
