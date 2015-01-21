
package person;

import java.util.ArrayList;
/**
 *
 * @author NickMonaco
 */
public class Teacher extends Person
{
    private int numCourses;
    private ArrayList<String> courses = new ArrayList<String>();
    
    public Teacher()
    {
        
    }
    
    public Teacher(String name, String address)
    {
        super(name, address);
    }
    
    @Override
    public String toString()
    {
        return "Teacher";
    }
    
    public boolean addCourse(String course)
    {
        return courses.add(course);
    }
    
    public boolean removeCourse(String course)
    {
        return courses.remove(course);
    }
}
