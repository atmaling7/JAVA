class DecimalToHexadecimal
{
    public static void main(String[]args)
    {
        System.out.println(decToHex(123456));
    }
    
    public static  String decToHex(int num)
    {
        String ans="";
        
        
        while(num!=0)
        {
            int rem=num%16;
            if(rem>=0 && rem<=9)
            {
                ans=rem+ans;
            }
            
            else if(rem>9 && rem<16)
            {
                ans =((char)(rem + 55))+ans;
            }
    
            num/=16;
        }
        
        return ans;
    }
    
   
}