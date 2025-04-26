class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        int res=0;
        //if divisor is zero
        if(dividend == Integer.MIN_VALUE && divisor==-1)
        return Integer.MAX_VALUE;
        long ldividend = (Math.abs((long)dividend));
        long ldivisor = (Math.abs((long)divisor));

        while(ldividend >= (ldivisor))
        {
            int shifts=0;
            while(ldividend >= (ldivisor << shifts))
            {
                shifts++;
            }
            shifts--;
            res+=(1<< shifts);
            ldividend = ldividend -(ldivisor << shifts);
        }
        if((dividend >0 && divisor>0) || (dividend <0 && divisor<0)) return res;
        return -res;
    }
}

//tc: O(log^2 n)
//sc: O(1)