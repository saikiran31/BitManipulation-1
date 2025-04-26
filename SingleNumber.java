class SingleNumber{
    public int singleNumber(int[] nums) {
        int res=0;
        for(int num: nums)
        {
            res^=num;
        }
        return res;
        
    }
}

//tc:O(n)
//sc:O(1)