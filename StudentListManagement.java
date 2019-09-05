package hw4;

import hw4.SinglyLinkedList.Node;
import java.util.Scanner;


/**
 * Contains: Main, checkMenuInput,userEnterString 
 * @author alexgeronimo
 */
public class StudentListManagement {

    /**
     * Check if input is integer, catch exception, wait for correct input before returning to main
     * @param in
     * @return 
     */
    public static int checkMenuInput(Scanner in){
        String menu_in = in.next();
        try {
            int menu_int = Integer.parseInt(menu_in);
            return menu_int;
        }
        
        catch (NumberFormatException ex) {
            System.out.println("Please enter '1', '2', '3', '4', '5', or '6' to exit." + "\n");}
            System.out.println("Choose an Option:\n"+ "1. Add a student\n"
            + "2. Remove a student\n"+ "3. Update student GPA\n"+ "4. Display student information\n"
            + "5. Display all students\n" + "6. Exit");
            int menu_int_again = checkMenuInput(in);
            return menu_int_again; 
    }
    
    /**
     * Check if input is integer, catch exception, wait for correct input before returning to main
     * @param in
     * @return integer
     */
    public static int userEnterInt(String in){
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter " + in + ":");
            String string_in = input.nextLine().trim();
            int check_int = Integer.parseInt(string_in);
            return check_int;
        }
        
        catch (NumberFormatException ex) {
            System.out.println("Please enter an integer" + "\n");
            int check_int_again = userEnterInt(in);
            return check_int_again;
        }
    }
    
    /**
     * Prompt user to enter full name
     * @return String user input 
     */
    public static String userEnterString(String string){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter " + string + ":");
        String string_in = in.nextLine().trim();
        return string_in;
    }
    
    /**
     * Check if input is double, catch exception, wait for correct input before returning to main
     * @param in
     * @return double
     */
    public static double userEnterDouble (String in){
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter " + in + ":");
            String string_in = input.nextLine().trim();
            double check_double = Double.parseDouble(string_in);
            return check_double;
        }
        
        catch (NumberFormatException ex) {
            System.out.println("Please enter an double (ie. 3.14):\n");
            double check_double_again = userEnterDouble(in);
            return check_double_again;
        }
    }
    
    /**
     * 
     * @param list
     * @param s
     * @param sID
     * @return False if student ID found
     */
    public static boolean check_sID (SinglyLinkedList<Student> list, Student s, String sID){
        boolean bool = true; 
        Node<Student> node = list.head;
        while (node.getNext() != null){
            node = node.getNext();
            Student s_node = node.getElement();
            if (s_node.getStudentID().equals(sID)){
                System.out.println("Error: Student " + s.getName() + " already exists"
                + "\nRetruning to main menu...\n");
                bool = false;
                break;
            }
        }
        return bool;
    }
    
    public static SinglyLinkedList <Student> copyStudentList (SinglyLinkedList <Student> studentList){
        
        SinglyLinkedList<Student> studentListCopy = new SinglyLinkedList<>();
        if (studentList.size > 0){
           Node <Student> pnt = studentList.head;
           Student new_s = new Student(pnt.getElement().getName(), pnt.getElement().getEmail(),
           pnt.getElement().getAge(), pnt.getElement().getStudentID(), pnt.getElement().getMajor()
           , pnt.getElement().getGpa());
           studentListCopy.addFirst(new_s);
           while (pnt.getNext() != null){
               pnt = pnt.getNext();
               new_s = new Student(pnt.getElement().getName(), pnt.getElement().getEmail(),
                pnt.getElement().getAge(), pnt.getElement().getStudentID(), pnt.getElement().getMajor()
                , pnt.getElement().getGpa());
               studentListCopy.addLast(new_s);
           }
        }
        return studentListCopy;
    }
    
}
