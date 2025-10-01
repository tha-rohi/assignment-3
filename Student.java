package binarysearch;


	public class Student implements Comparable<Student> {
	    public int id;
	    public String name;
	    public double gpa;
	    
	    public Student(int id, String name, double gpa) {
	        this.id = id;
	        this.name = name;
	        this.gpa = gpa;
	    }
	    
	    public int compareTo(Student other) {
	        return Integer.compare(this.id, other.id);
	    }
	    
	    public String toString() {
	        return "Student[ID=" + id + ", Name=" + name + ", GPA=" + gpa + "]";
	    }
	}


