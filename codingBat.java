
public class codingBat
{
   
    public static int codingBat(int n)
    {
        int sum=0;
          
          if(n<7)
            return sum;
           
          if(n%7==0)
            return sum+=codingBat(n%10);
            
          return sum;
          
    }
    
     public static void main(String[] args)
    {
        int counted=0;
         counted = codingBat(71);
         System.out.println(counted);
    }
    

    
    
}
