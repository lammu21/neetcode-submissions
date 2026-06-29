class Solution {
    public int[] twoSum(int[] nums, int target) {
        
       Map<Integer,Integer> indices = new HashMap<>();

       for(int i = 0 ;i<nums.length; i++)
       {
          indices.put(nums[i],i);
       }

       for(int i=0;i < nums.length;i++)
       {
        int diff = target - nums[i];

          if(indices.containsKey(diff) && indices.get(diff)!= i)
          {
            return new int [] {i,indices.get(diff)};
          }
       }
       return new int [0];

    }
}


// brute force
 //      int [] ans = new int [2];
    //      for(int i = 0;i<nums.length;i++)
    //      {
    //         for(int j = i+1;j<nums.length;j++)
    //         {
    //             if(nums[i]+nums[j]==target)
    //             {
    //                 ans[0]=i;
    //                 ans[1]=j;
    //             }
    //         }
    //      }
    //      return ans;


// Arrays.sort(nums);
//         int [] ans = new int [2];

//          int left = 0,right = nums.length-1;

//          while(left<right)
//          {
//             if(nums[left] + nums[right] > target)
//             {

//                 right--;
//                 //   ans[0]=left;
                
//             }
//             else if(nums[left] + nums[right] < target)
//             {

//                  left++;
//             }
//             else {
//                 ans[0] = left;
//                   ans[1]=right;
//                   break;
                
//             }

            
           
//          }
//          return ans;
        
//     }

