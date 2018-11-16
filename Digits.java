import java.util.ArrayList;

public class Digits
{
    private ArrayList<Integer> digitList;
    
    public Digits()
     {
         
     }
    
    public Digits(int num)
     {
         digitList = new ArrayList<Integer>();
         
         int x=num; //not touching num
         
         if(num==0)
           digitList.add( new Integer(0) );
         
         
         while(x>0)
         {
             int n=(x%10);
             digitList.add(0,new Integer(n));
             x=x/10;
                 
         }
           System.out.println(digitList);
     }
     
     public boolean isStrictlyIncreasing()
    {
        for(int i=0; i<digitList.size()-1; i++)
        {
            if(digitList.get(i)>digitList.get(i+1))
            {
                return false;
            }
            
        }
        return true;
    } 
}