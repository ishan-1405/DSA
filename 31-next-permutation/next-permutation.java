class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot = -1;
        // Check for the pivot in the array
        for(int i=n-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                pivot = i;
                break;
            }
        }

        //check if array is in descending order
        if(pivot==-1){
            reverse(nums, 0, n-1);
            return;
        }

        // Check for the element to swap with pivot and then swapping it
        for(int i=n-1; i>pivot; i--){
            if(nums[i]>nums[pivot]){
                int temp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = temp;
                break;
            }
        }

        // reverse the array after pivot
        reverse(nums, pivot+1, n-1);
    }

    static void reverse(int[] nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}