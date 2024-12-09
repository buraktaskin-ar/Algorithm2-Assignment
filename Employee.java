
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileInputStream;


public class Employee {
    private String name;
    private int id;
    private String department;
    private String position;

    public Employee(String name, int id, String department, String position) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.position = position;
    }
    public Employee(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public static  void main(String[] args) {
            Scanner fileIn = null;

            try {
                fileIn = new Scanner(new FileInputStream("girdiQuiz1.txt"));

            } catch (FileNotFoundException e) {
                System.out.println("File not found");
                System.exit(0);
            }
            String word;

            while (fileIn.hasNextLine()) {
                word = fileIn.nextLine();
                String fields[] = word.split(",");
                if (fields.length>1){
                    Employee employee = new Employee(fields[0], Integer.parseInt(fields[1]), fields[2], fields[3]);
                    System.out.println(employee.toString()); // Employee nesnesini ekrana yazdırır
                }
                else {
                    Employee employee = new Employee();
                    System.out.println(employee.toString());
                }
            }

        }

        public String toString() {
            return " [name=" + name + ", id=" + id + ", department=" + department + ", position=" + position + "]";
       }

    }
