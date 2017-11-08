class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        if(nums.length < 4){
            return res;
        }
        
        int length = nums.length;
        
        //array has no order, sort and get some order in the array
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length-3; i++){
            if(nums[i] + nums[i+1]+ nums[i+2] + nums[i+3] > target){
                //first candidate itself larger, search finished
                break;
            }
            
            if(nums[i] + nums[length -3] + nums[length-2] + nums[length-1] < target){
                //first candidate too small
                continue;
            }
            
            if(i > 0 && (nums[i] == nums[i-1])){
                //prevents duplicates in res
                continue;
            }
            
            for(int j = i + 1; j < length -2; j++){
                if(nums[i] + nums[j+2] + nums[j+1] + nums[j] > target){
                    //second candidate too large
                    break;
                }
                
                if(nums[i] + nums[j] + nums[length-2] + nums[length-1] < target){
                    //second candidate too small
                    continue;
                }
                
                if(j > i + 1 && nums[j] == nums[j-1]){
                    //prevent duplicate results from getting into the result
                    continue;
                }
                
                int low = j+1;
                int high = length -1;
                while(low<high){
                    int sum = nums[i] + nums[j] + nums[low] + nums[high];
                    if(sum == target){
                        res.add(Arrays.asList(nums[i], nums[j], nums[low], nums[high]));
                        while((low < high) && (nums[low] == nums[low+1])){
                            //skip duplicates in the array over low
                            low++;
                        }
                        
                        while((low < high) && (nums[high] == nums[high-1])){
                            //skip duplicates in the array over high
                            high--;
                        }
                        low++;
                        high--;
                    }
                    else if(sum < target){
                        low++;
                    }
                    else{
                        high--;
                    }
                }
            }
        }
        return res;
    }
}