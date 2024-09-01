class Fibonacci
{   

    public static void main(String[] args)
    {
   //System.out.println(nthfibonacci(5));
   nFib(3);
    }

    public static int nthfibonacci(int n)
    {
        int n1=0,n2=1,n3,count=0;

        for(int i=0;i<n;i++)
        {
            n3 = n1+n2;
            count++;
                if (count==n) {
                    break;
                }
            n1=n2;
            n2=n3;
        }

        return n1;
    }

    public static void nFib(int n)
    {
        int count = 0;

        while (true) {
           
            int n1=0,n2=1,n3;

            while(count!=n) {
                n3 = n1+n2;

                count++;

                System.out.println(n1);

                n1=n2;
                n2=n3;
            }
			return;
        }
    }
}