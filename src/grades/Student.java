package grades;

import javax.lang.model.element.Name;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {
//private string Names;
private ArrayList<Integer> grades ;
private String name;

//Scanner scanner = new Scanner(System.in);
//String input = scanner.nextLine();



    public Student(String name) {
    this.name = name;
    this.grades = new ArrayList<>();
}
    // returns the student's name
    public String getName(){
    return name;
    };

//    System.out.println()
    // adds the given grade to the grades property
    public void addGrade(int grade){
        this.grades.add(grade);
    };
    // returns the average of the students grades
    public double getGradeAverage(){
        Integer sum = 0;
        for(Integer grade: grades) {
            sum += grade;
        }
        return sum/grades.size();


    }


}
