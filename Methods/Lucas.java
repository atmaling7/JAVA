class Lucas
{
    public static  void main(String[]args)
    {
        int n=10;
        int n1=2;
        int n2=1;
        int n3;
        
        if(n>1)
        {
            System.out.println(n1);
            System.out.println(n2);
            
            for(int i=2; i<n; i++)
            {
                n3=n2;
                n2=n2+n1;
                n1=n3;
                
                System.out.println(n2);
            }
        }
    }
}