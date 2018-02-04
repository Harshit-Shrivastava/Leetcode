class Solution {
    public int search(int[] nums, int target) {
        
        //check for empty array
        if(nums.length == 0){
            return -1;
        }
        
        //initialize counters
        int low = 0;
        int n = nums.length;
        int high = n-1;
        
        //get index of smallest value using the concept from binary search
        while(low < high){
            int mid = (low + high)/2;
            if(nums[mid] > nums[high]){
                low = mid + 1;
            }
            else{
                high = mid;
            }
        }
        
        //reinitialize values
        int rot = low;
        low = 0;
        high = n-1;
        
        //binary search, account for rotation
        while(low <= high){
            int mid = (low + high)/2;
            int realMid = (mid + rot)%(n);
            if(nums[realMid] == target){
                return realMid;
            }
            else if(nums[realMid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        
        return -1;
    }
}