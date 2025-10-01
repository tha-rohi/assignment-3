package binarysearch;

import java.util.Arrays;

public class Searchdemo {
	    public static void main(String[] args) {
	        
	        // Example 1: Integer Search
	        System.out.println("1. INTEGER SEARCH:");
	        Integer[] numbers = {10, 23, 35, 47, 59, 68, 72, 85, 91, 100};
	        BinarySearchGeneric<Integer> intSearch = new BinarySearchGeneric<>();
	        System.out.println("Array: " + Arrays.toString(numbers));
	        
	        int idx1 = intSearch.search(numbers, 47);
	        intSearch.displayResult(47, idx1);
	        int idx2 = intSearch.search(numbers, 99);
	        intSearch.displayResult(99, idx2);
	        
	        // Example 2: Student Search
	        System.out.println("\n3. CUSTOM OBJECT SEARCH:");
	        Student[] students = {
	            new Student(101, "ROHI", 3.8),
	            new Student(110, "REN", 3.9),
	        };
	        
	        BinarySearchGeneric<Student> studentSearch = new BinarySearchGeneric<>();
	        System.out.println("Students:");
	        for (Student s : students) {
	            System.out.println("  " + s);
	        }
	        
	        Student searchKey = new Student(110, "", 0);
	        int idx5 = studentSearch.search(students, searchKey);
	        System.out.print("\nSearching for ID 110: ");
	        studentSearch.displayResult(searchKey, idx5);
	        if (idx5 != -1) {
	            System.out.println("Details: " + students[idx5]);
	        }
	        
	        System.out.println("\nEND OF DEMO");
	    }
	}
