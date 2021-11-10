package Assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StdExample {
	public static void main(String[] args) {
	    Student Student1 = new Student("sai",500);
	    Student Student2 = new Student("kalyan",300);
	    Student Student3 = new Student("Bhavana",900);
	    Student Student4 = new Student("Tharak",100);
        List<Student> listStudent = Arrays.asList(Student1, Student2, Student3, Student4);
 
        System.out.println("Before sorting:");
        System.out.println(listStudent);
 
        Comparator<Student> descstdmarksComp = (Student s1, Student s2) -> (int) (s2.getmarks()-s1.getmarks());
 
        Collections.sort(listStudent, descstdmarksComp);
 
        System.out.println("\nAfter sorting by descending Marks:");
        System.out.println(listStudent);
	}
}
