import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

@Data
@AllArgsConstructor
class Student2 {
     String firstName;
     String secondName;

    public Student2(String firstName, String secondName){
        this.firstName = firstName;
        this.secondName = secondName;
    }
//
//    public String toString()
//    {
//
//        // Returning attributes of Student
//        return this.firstName + " " + this.secondName ;
//    }
}

class Sortbyname implements Comparator<Student2> {

    // Method
    // Sorting in ascending order of name
    public int compare(Student2 a, Student2 b)
    {

        return a.firstName.compareTo(b.firstName);
    }
}

public class Namesort_comparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter no of students: ");
        int size = sc.nextInt();
        ArrayList<Student2> studs = new ArrayList<Student2>();

        for (int itr = 0; itr < size; itr++) {
            System.out.println("Please enter student details: ");
            sc.nextLine();
            System.out.print("FirstName: ");
            String firstName = sc.next();
            System.out.print("SecondName: ");
            String secondName = sc.next();

            studs.add(new Student2(firstName,secondName));
        }

        // Adding entries in above List
        // using add() method


        System.out.println("\nUnsorted");

        // Iterating over entries to print them
        for (Student2 std : studs) {
            System.out.println(std);
        }

        studs.sort(new Sortbyname());

        // Display message on console for better readability
        System.out.println("\nSorted by name");

        // // Again iterating over entries to print them
        for (Student2 std : studs) {
            System.out.println(std);
        }
    }
}


