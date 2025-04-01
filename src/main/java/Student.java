
import java.util.*;

public class Student {
    private final String name;
    private final String group;
    private int course;
    private final List<Integer> grades;

    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public double getAverageGrade() {
        if (grades.isEmpty()) return 0.0;
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    // Метод для перевода на следующий курс
    public void promote() {
        course++;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public String toString() {
        return "Студент: " + name + ", Группа: " + group + ", Курс: " + course + ", Оценки: " + grades;
    }

    // Метод для удаления студентов с низким средним баллом
    public static void removeLow(Set<Student> students) {
        students.removeIf(student -> student.getAverageGrade() < 3.0);
    }

    // Метод для печати студентов на заданном курсе
    public static void printStudents(Set<Student> students, int course) {
        System.out.println("Студенты на курсе " + course + ":");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}