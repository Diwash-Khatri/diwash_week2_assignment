public class MQnoThree {

    static class Student {
        String name;
        int marks;

        public Student(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }

        public void calculateGrade() {
            String grade;
            switch (marks / 10) {
                case 10:
                case 9:
                    grade = "A";
                    break;
                case 8:
                    grade = "B";
                    break;
                case 7:
                    grade = "C";
                    break;
                case 6:
                    grade = "D";
                    break;
                default:
                    grade = "F";
            }
            System.out.println(name + " scored " + marks + " and received grade: " + grade);
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("Mahesh", 92);
        Student student2 = new Student("Ram", 78);
        Student student3 = new Student("Shyam", 54);

        student1.calculateGrade();
        student2.calculateGrade();
        student3.calculateGrade();
    }
}
