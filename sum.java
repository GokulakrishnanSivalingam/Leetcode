class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l=nums.length;
        int sum=0;
        int arr[]=new int [2];
        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                sum=nums[i]+nums[j];
                if(target==sum){
                    arr[0]=i;
                    arr[1]=j;
                    return arr;
                }
            }
        }
        return arr;
    }
}
