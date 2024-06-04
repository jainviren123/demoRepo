import lombok.Data;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


class Student3 implements Comparable<Student3> {
    String firstName;
    String secondName;

    public Student3(String firstName, String secondName){
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String toString()
    {

        // Returning attributes of Student
        return this.firstName + " " + this.secondName ;
    }

    @Override
    public int compareTo(Student3 that) {
        return this.firstName.compareTo(that.firstName);
    }
}

@Data
public class Namesort_comparable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter no of students: ");
        int size = sc.nextInt();
        ArrayList<Student3> studs = new ArrayList<Student3>();

        for (int itr = 0; itr < size; itr++) {
            System.out.println("Please enter student details: ");
            sc.nextLine();
            System.out.print("FirstName: ");
            String firstName = sc.next();
            System.out.print("SecondName: ");
            String secondName = sc.next();

            studs.add(new Student3(firstName, secondName));
            System.out.println(studs);
        }
        System.out.println("\nUnsorted");

        // Iterating over entries to print them
        for (Student3 std : studs) {
            System.out.println(std);
        }
        Collections.sort(studs);
        System.out.println("\nSorted by name");

        // // Again iterating over entries to print them
        for (Student3 std : studs) {
            System.out.println(std);
        }
    }
}

