package it.develhope.genericswildcars;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Start {

    public static void main(String[] args)
    {
        List<Double> individualMarksListLisa = new ArrayList<>();
        Random rand = new Random();
        individualMarksListLisa.add(rand.nextDouble() * 100);
        individualMarksListLisa.add(rand.nextDouble() * 100);
        List<Integer> projectMarksListJeremy = new ArrayList<>();
        projectMarksListJeremy.add(rand.nextInt(100));
        projectMarksListJeremy.add(rand.nextInt(100));
        double lisaAvg = Student.getAverageMark(individualMarksListLisa);
        double jeremyAvg = Student.getAverageMark(projectMarksListJeremy);
        List<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(new Student("Lisa", "Stuart", lisaAvg));
        listOfStudents.add(new Student("Jeremy", "Green", jeremyAvg));
        for (Student s : listOfStudents)
        {
            System.out.println(s.toString());
        }
    }
}
