package homeProject16.ex2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Artem", "A-1", 3, 1, 2, 3);
        Student student2 = new Student("Artur", "B-1", 4, 4, 5, 3);
        Student student3 = new Student("Artemon", "A-1", 3, 5, 3, 3);

        List<Student> setStudent = new ArrayList<>();
        setStudent.add(student1);
        setStudent.add(student2);
        setStudent.add(student3);
        for (Student s: setStudent) {
           double result = avar(s);
                    if (result >= 3){
                        System.out.println("Next course");
                    } else {
                        System.out.println("Get out");
                    }
        }
    }

    public static double avar(Student s){
    double count = 0;
        double[] marks = s.getMarks();
        for(double d : marks)
        count =+ d;
        return count/marks.length;
    }

    public  static void printStudent(List<Student> students, int course){

    }
    }

