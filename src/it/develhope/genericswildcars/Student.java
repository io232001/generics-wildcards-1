package it.develhope.genericswildcars;
import java.util.List;
public class Student
{
    private String studentName;
    private String studentSurname;
    private double marksAverage;

    public Student(String name, String surname, double average) {
        this.studentName = name;
        this.studentSurname = surname;
        this.marksAverage = average;
    }
    public static double getAverageMark(List<? extends Number> listOfMarks)
    {
        double sum = listOfMarks.get(0).doubleValue() + listOfMarks.get(1).doubleValue();
        return sum / 2;
    }
    @Override
    public String toString() {
        return "Student Name: " + this.studentName + " " + this.studentSurname + ", Average Marks: " + this.marksAverage;
    }
}
