import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;

import java.util.ArrayList;
import java.util.Scanner;

@Data
public class Student {
    private String name;
    private int age;
    private int rollno;



    public Student(String name, int age,int rollno){
        this.name = name;
        this.age = age;
        this.rollno = rollno;
        }



    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Rollno:"+ rollno ;
    }

    public static void main(String[] args) throws JsonProcessingException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter no of students: ");
        int size = sc.nextInt();
        ArrayList<Student> studs = new ArrayList<Student>();

        for(int itr = 0; itr < size; itr++){
            System.out.println("Please enter student details: ");
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Rollno: ");
            int rollno = sc.nextInt();


            studs.add(new Student(name,age,rollno));

        }
        ObjectMapper mapper = new ObjectMapper();
        String Json = mapper.writeValueAsString(studs);
        System.out.println(Json);




    }
}
