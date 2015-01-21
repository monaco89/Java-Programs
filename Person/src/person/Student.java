
package person;

import java.util.ArrayList;
/**
 *
 * @author NickMonaco
 */
public class Student extends Person
{
    private ArrayList<String> courses = new ArrayList<String>();
    private ArrayList<Integer> grades = new ArrayList<Integer>();
    private int numCourses;
    private double total, average;
    
    public Student()
    {
        
    }
    
    public Student(String name, String address)
    {
        super(name, address);
    }
    
    public void addCourseGrade(String course, int grade)
    {
        courses.add(grade, course);
    }
    
    public void printGrades()
    {
        System.out.print(grades);
    }
    
    public double getAverageGrade()
    {
        for(int i = 0; i < numCourses; i++)
        {
             total =+ grades.get(i);
        }
        average = total / numCourses;
        return average;
    }
    
    @Override
    public String toString()
    {
        return "Courses taken" + courses + "\nAverage Grade: " + average; 
    }
}
