class Solution
{
    //Function to return list containing first n fibonacci numbers.
    public static long[] printFibb(int n) 
    {
        //Your code here
        
         if (n <= 0) 
         return new long[0];
        if (n == 1) 
        return new long[]{1};
        long arr[]=new long[n];
        
            long a=1;
            long b=1;
             arr[0]=a;
            arr[1]=b;
        for(int i=2;i<n;i++)
        {
           
            long c=a+b;
            a=b;
            b=c;
            arr[i]=c;
        }
        return arr;
    }
}
