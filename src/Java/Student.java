package Java;

import java.util.*;

// Student class
public class Student implements Comparable<Student> {
    String name;
    int age;
    String year;

    // Constructor
    public Student(String name, int age, String year) {
        this.name = name;
        this.age = age;
        this.year = year;
    }

    // Override compareTo method to define sorting logic
    @Override
    public int compareTo(Student other) {
        // First, compare by age
        //if (this.age != other.age) {
            return Integer.compare(this.age, other.age);
        //}
        // If ages are equal, compare by year
        //return this.year.compareTo(other.year);
    }

    // Override toString for printing
    @Override
    public String toString() {
        return name + ", " + age + ", " + year;
    }

    public static void main(String[] args) {
        // List of students
        List<Student> students = new ArrayList<>();
        students.add(new Student("Raj", 21, "second year"));
        students.add(new Student("Ramesh", 22, "third year"));
        students.add(new Student("Priya", 19, "first year"));

        // Sorting the list of students
        Collections.sort(students);

        // Output sorted list
        for (Student student : students) {
            System.out.println(student);
        }
    }
}



