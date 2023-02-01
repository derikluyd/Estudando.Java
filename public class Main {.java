public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        public class Student {
            private String name;
            private int age;
            private double grade;
            public class Student {
                private String name;
                private int age;
                private double grade;

                public Student(String name, int age, double grade) {
                    this.name = name;
                    this.age = age;
                    this.grade = grade;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public int getAge() {
                    return age;
                }

                public void setAge(int age) {
                    this.age = age;
                }

                public double getGrade() {
                    return grade;
                }

                public void setGrade(double grade) {
                    this.grade = grade;
                }

                @Override
                public String toString() {
                    return "Student{" +
                            "name='" + name + '\'' +
                            ", age=" + age +
                            ", grade=" + grade +
                            '}';
                }
            }

            public Student(String name, int age, double grade) {
                this.name = name;
                this.age = age;
                this.grade = grade;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public double getGrade() {
                return grade;
            }

            public void setGrade(double grade) {
                this.grade = grade;
            }

            @Override
            public String toString() {
                return "Student{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        ", grade=" + grade +
                        '}';
            import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<Student> students;

    public StudentService() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public double calculateAverageGrade() {
        double sum = 0;
        for (Student student : students) {
            sum += student.getGrade();
        }
        return sum / students.size();
public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        studentService.addStudent(new Student("John Doe", 20, 80.0));
        studentService.addStudent(new Student("Jane Doe", 22, 90.0));

        studentService.displayStudents();
        System.out.println("Average Grade: " + studentService.calculateAverageGrade());
    }
}


            	
            	