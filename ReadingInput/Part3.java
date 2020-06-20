import java.util.*;
import java.io.*;
public class Part3 
{
    public static void readFile(File f) throws IOException
    {
        Scanner s = new Scanner(f);

        //check the file lines
        while (s.hasNextLine())
        {
            String line = s.nextLine();
            
            //logic goes here
            System.out.println(line);
        }

        s.close();
    }
    
    public static void main(String [] args) throws Exception
    {
        readFile(new File("pc.txt"));
    }
}