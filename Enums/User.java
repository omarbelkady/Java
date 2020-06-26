public abstract class User implements Speaks
{
    public enum currentSubs
    {Bronze, Silver, Gold, Platinum };
    public String firstName;	//fieldA
    public String lastName;	//fieldB
    private boolean isVerified = false;
    
    public static void log(Object o)
    {
        System.out.print(o);
    }
    
    public static void logln(Object o)
    {
        System.out.println(o);
    }



    //I can now create a field of the same name of the name
    public currentSubs currentSubs;	//Type is currentSubs and nameoffield is current

    public final void wavingToYou ()
    {
        logln ("Hello y\'all my major is . My name is " + firstName);
    }
}
