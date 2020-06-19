import java.util.*;


class Student
{
    private final String name;
    private final int id;

    Student(String n, int i)
    {
        name = n;
        id = i;
    }

    // always override hashcode w/ equals 
    @Override
    public boolean equals(Object obj)
    {
        //check if obj is a student or null
        if (!(obj instanceof Student))
            return false;

        // check if the reference is the same
        if (obj == this)
            return true;

        //check the fields
        Student s = (Student) obj;
        return this.id== s.id && this.name.equals(s.name);
    }


    @Override
    public int hashCode()
    {
       int idHash = id^1000 % 31;
       // int nameHash = Objects.hash(name); one way
       int nameHash = name.hashCode();
       return (idHash * nameHash) % 31;
    }

    @Override
    public String toString()
    {
        return "Name: "+ name+"\n ID: "+id+"\n";
    }
}

public class Main
{

    public static void main(String [] args)
    {
//           int [] grades = {3,4,5};
//           System.out.println(grades.length);
//           System.out.println(stringRep(grades));
        Student s = new Student("Angela", 12345);

        System.out.println(s);
        
        // calling Object.equals() we want content comparison override equals C++ equivalent of == and hash
        System.out.println(s.equals(new Student("Angela", 12345)));

        Set<Student> students = new HashSet<>();
        students.add(new Student("Angela", 12345));
        students.add(new Student("Nidhi", 34637));
        students.add(new Student("Kevin", 88846));
        students.add(new Student("Rohan", 11111));

        System.out.println(students.contains(new Student("Angela", 12345)));

    }
}