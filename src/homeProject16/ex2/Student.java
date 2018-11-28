package homeProject16.ex2;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String name;
    private String group;
    private int course;
    private double[] marks;

    public Student(String name, String group, int course, double... marks) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.marks = marks;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double[] getMarks() {
        return marks;
    }

    public void setMarks(double[] marks) {
        this.marks = marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course &&
                Objects.equals(name, student.name) &&
                Objects.equals(group, student.group) &&
                Arrays.equals(marks, student.marks);
    }

    @Override
    public int hashCode() {

        int result = Objects.hash(name, group, course);
        result = 31 * result + Arrays.hashCode(marks);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
}