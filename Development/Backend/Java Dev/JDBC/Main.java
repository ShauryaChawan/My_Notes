package myPackage;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		StudentDAO studentDAO = new MySQLStudentDAO();

		// Add new student
		studentDAO.addStudent(new Student(0, "Harry Potter", 21));

		// Get student by ID
		Student student = studentDAO.getStudent(1);
		System.out.println(student);

		// Get all students
		List<Student> students = studentDAO.getAllStudents();
		for (Student std : students) {
			System.out.println(std);
		}

		// Update student
		student.setName("John Doe Updated");
		student.setAge(23);
		studentDAO.updateStudent(student);

		// Delete student
		studentDAO.deleteStudent(3);
	}
}
