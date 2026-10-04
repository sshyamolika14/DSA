class Solution {
    public int minimumSwaps(int[] nums) {
        int n =nums.length;
        int zeroCounts = 0;
        int swaps =0;
        for(int i=0; i<n; i++){
            if(nums[i] == 0){
            zeroCounts++;}
            }
        for(int i=n-zeroCounts;i<n;i++){
            if (nums[i] != 0) 
            swaps++;
        }
            return swaps;
            
        }
    }

    