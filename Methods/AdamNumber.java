class AdamNumber
{
    public static void main(String[]args)
    {
        System.out.println(isAdam(12));
    }
    
    public static boolean isAdam(int num)
    {
        int sq=num*num;
        int n1=reverse(num);
        int sq1=n1*n1;
        
        
        return sq==reverse(sq1);
    }
    
    public static int reverse(int num)
    {
        int rev=0;
        while(num!=0)
        {
            int last=num%10;
            rev=rev*10+last;
            num/=10;
        }
        return rev;
    }
}