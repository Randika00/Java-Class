package oopfinal;

import java.util.ArrayList;

public class GenericPersonDemo {

	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<>(); 
		
		    students.add(new Student("STD1111", 6));
	        students.add(new Student("STD2222", 7));
	        students.add(new Student("STD3333", 12));
	        students.add(new Student("STD4444", 11));
	        students.add(new Student("STD5555", 10));
		
		
		
		
		ArrayList<Student> lecturers = new ArrayList<>();
		
		
		
		
		GenericPerson<Student> g = new GenericPerson<>();
		g.displayElement(students);
		
		
		
		
	}

}
