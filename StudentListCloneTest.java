package hw4;

import hw4.SinglyLinkedList.Node;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexgeronimo
 */
public class StudentListCloneTest {
    
    public static void main(String[] args) {
        // HW4 - Part 1
        StringPermutation.mainPermutation();
        
        // HW4 - Part 2
        SinglyLinkedList<Student> studentList = new SinglyLinkedList<>();
        
        Student s1 = new Student("Name 1", "email1@aolcom", 21, "001", "major1", 4.0);
        studentList.addFirst(s1);
        Student s2 = new Student("Name 2", "email2@aolcom", 22, "002", "major2", 3.9);
        studentList.addLast(s2);
        Student s3 = new Student("Name 3", "email3@aolcom", 23, "003", "major3", 3.8);
        studentList.addLast(s3);
        Student s4 = new Student("Name 4", "email4@aolcom", 24, "004", "major4", 3.7);
        studentList.addLast(s4);
        Student s5 = new Student("Name 5", "email5@aolcom", 25, "005", "major5", 3.6);
        studentList.addLast(s5);
        
        Node <Student> point = studentList.head;
        point.getElement().printStudent();
        while(point.getNext() != null){
            point = point.getNext();
            point.getElement().printStudent();
        }
        
        SinglyLinkedList <Student> StudentListClone = StudentListManagement.copyStudentList(studentList);
        
        Node <Student> new_point = StudentListClone.head;
        new_point.getElement().printStudent();
        while(new_point.getNext() != null){
            new_point = new_point.getNext();
            new_point.getElement().printStudent();
        }
        
        String sID = StudentListManagement.userEnterString("student ID");
        int new_age = StudentListManagement.userEnterInt("age");
        
        Node<Student> current = studentList.head;

        boolean found = false;
        while (current.getNext() != null){

            if (current.getElement().getStudentID().equals(sID)){
                current.getElement().setAge(new_age);
                found = true;
            }
            if (found == true){break;}
            current = current.getNext();
        }
        
        if (found == false){
            System.out.println("Error: Student ID " + sID + "not found.\n");
        }
        else{
            System.out.println("Student ID " + sID + " age updated to: " + new_age);
        }
        
        point = studentList.head;
        point.getElement().printStudent();
        while(point.getNext() != null){
            point = point.getNext();
            point.getElement().printStudent();
        }
        
        new_point = StudentListClone.head;
        new_point.getElement().printStudent();
        while(new_point.getNext() != null){
            new_point = new_point.getNext();
            new_point.getElement().printStudent();
        }
        
        sID = StudentListManagement.userEnterString("student ID");
        String major = StudentListManagement.userEnterString("major");
        current = studentList.head;
        
        found = false;
        while (current.getNext() != null){

            if (current.getElement().getStudentID().equals(sID)){
                current.getElement().setMajor(major);
                found = true;
            }
            if (found == true){break;}
            current = current.getNext();
        }
        
        if (found == false){
            System.out.println("Error: Student ID " + sID + "not found.\n");
        }
        else{
            System.out.println("Student ID " + sID + " major updated to: " + major);
        }
        
        point = studentList.head;
        point.getElement().printStudent();
        while(point.getNext() != null){
            point = point.getNext();
            point.getElement().printStudent();
        }
        
        new_point = StudentListClone.head;
        new_point.getElement().printStudent();
        while(new_point.getNext() != null){
            new_point = new_point.getNext();
            new_point.getElement().printStudent();
        }
        
        sID = StudentListManagement.userEnterString("student ID");
        double gpa = StudentListManagement.userEnterDouble("gpa");
        current = studentList.head;
        
        found = false;
        while (current.getNext() != null){

            if (current.getElement().getStudentID().equals(sID)){
                current.getElement().setGpa(gpa);
                found = true;
            }
            if (found == true){break;}
            current = current.getNext();
        }
        
        if (found == false){
            System.out.println("Error: Student ID " + sID + "not found.\n");
        }
        else{
            System.out.println("Student ID " + sID + " major updated to: " + gpa);
        }
        
        point = studentList.head;
        point.getElement().printStudent();
        while(point.getNext() != null){
            point = point.getNext();
            point.getElement().printStudent();
        }
        
        new_point = StudentListClone.head;
        new_point.getElement().printStudent();
        while(new_point.getNext() != null){
            new_point = new_point.getNext();
            new_point.getElement().printStudent();
        }
        
    }
    
}
