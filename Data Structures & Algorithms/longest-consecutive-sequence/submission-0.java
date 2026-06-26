class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet <Integer> result = new HashSet<>();

        for(int n:nums)
        {
            result.add(n);
        }
        int max = 0;
        for(int n : result)
        {
            if(!result.contains(n-1))
            {
                int current = n;
                int count =1;

                while(result.contains(current+1))
                {
                    current++;
                    count++;
                }
                 max = Math.max(max,count);
            }
            
        }
       return max;

    }



}
