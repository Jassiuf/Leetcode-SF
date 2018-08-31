class Solution {
    public void nextPermutation(int[] nums) {
        int L = nums.length, i;
        boolean desc = true;
        for (int k = 0; k < L - 1; k++) {
            if (nums[k] < nums[k+1]) {
                desc = false;
                break;
            }
        }
        if (desc ) {
            rev(nums, 0, L -1);
            System.out.println("Already descending");
        } else {                    
            for (i = L -1; i > 0; i--) {
                if (nums[i-1] < nums[i]) {
                    desc = false;
                    break;
                }
            }

                int m = i - 1;
                int j = i;
                while(j < L && nums[m] < nums[j])
                    j++;       

                int temp = nums[j-1];
                nums[j-1] = nums[m];
                nums[m] = temp;           
                rev(nums, i, L - 1);    
        } 
    
    }
    
    public void rev(int[] n, int s, int e) {
        while (s < e) {
            int temp = n[s];
            n[s] = n[e];
            n[e] = temp;
            s++;
            e--;
        }
    }
}