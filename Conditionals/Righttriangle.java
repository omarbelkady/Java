public class Righttriangle
{
    public static void main (String[] args) {
    
        for(int i=10; i>=0;i--)
        {
            for(int o=i;o>=0;o--)
            {
                if(o==5)
                {
                    continue;
                }
                
                System.out.print(o + "");
            }
            System.out.println();
        }
        
    }
}
