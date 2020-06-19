import java.util.*;


class Student
{
    private Map<String, Object> attr;

    public Student(){ attr = new HashMap<>();}

    public void setAttribute(String key, Object value){attr.put(key, value);}
    public Object getAttribute(String key){return attr.get(key);}

    @Override
    public String toString(){return super.toString();}
}

