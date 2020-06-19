import java.util.*;
public class Main
{
    static void logLn(Object o) {System.out.println(o);}
    public static void main(String [] args)
    {
//           int [] grades = {3,4,5};
//           System.out.println(grades.length);
//           System.out.println(stringRep(grades));

        Student stu = new Student();
        stu.setAttribute("ID", 12345);
        stu.setAttribute("Name", "Angela");
        stu.setAttribute("Friend", new String[]{"Alan", "Lyndon", "Smruti", "Omar"});

        String[] friends = (String[]) stu.getAttribute("Friend");

        logLn(Arrays.toString(friends));


    }
}