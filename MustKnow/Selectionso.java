import java.util.*;

public class Selectionso {
    public static void Selectionso(int myArr[])
    {
        for(int i=0;i<myArr.length-1;i++)
        {
            int position = i;
            for(int j=i+1;j<=myArr.length-1;j++)
            {
                if(myArr[position] > myArr[j])
                {
                    position = j;
                }
            }
            //perform a swap
            int myTempVar = myArr[position];
            myArr[position] = myArr[i];
            myArr[i] = myTempVar;
        }
    }

    public static void PrintMyArray(int myArr[])
    {
        for(int i=0; i<myArr.length;i++)
        {
            System.out.print(myArr[i]+ " ");
        }
        System.out.println();
    }


    public static void main(String [] args)
    {
        int thisArr [] = {16,12, 7, 19, 30};
        Selectionso(thisArr);
        PrintMyArray(thisArr);
    }+
}