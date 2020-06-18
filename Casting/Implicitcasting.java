//When the piece of code gets executed the Java compiler will check for the value stored in the variable x 
//which has a datatype of short. It will allocate 2 bytes of memory for the variable. 
//Then it will find a different memory location and try to allocate memory for the
//another variable which we do not the know the name and this function is anonymous.
//This variable will be an integer, then java will copy the value of x into that memory
//space and it will add the two numbers together. This process is called implicit casting it 
//is also referred to as automatic conversion. 
//Whenever we have a value that can be converted to a bigger data type,
//casting will take place implicitly or automatically.
//Therefore byte can be converted to short and then a short can be automatically converted to an int. 
//Then an int can easily be converted to a long. all the work. 

	
public class Implicitcasting
{
    public static void main(String [] args)
    {
        short x=1;//short = 2 bytes
        int y=x+2;//int = 4 bytes
        System.out.println(y);
    }
}
