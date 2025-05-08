public class MQnoSix {

    static class Employee {
        String name;
        double salary;
        int yearsOfExperience;

        public Employee(String name, double salary, int yearsOfExperience) {
            this.name = name;
            this.salary = salary;
            this.yearsOfExperience = yearsOfExperience;
        }

        public void calculateBonus() {
            double bonus = (yearsOfExperience > 5) ? 0.2 * salary : 0.1 * salary;
            System.out.println(name + "'s Bonus: " + bonus);
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Hari", 50000, 6);
        Employee emp2 = new Employee("Khatri", 45000, 4);
        Employee emp3 = new Employee("Ramu", 70000, 8);

        emp1.calculateBonus();
        emp2.calculateBonus();
        emp3.calculateBonus();
    }
}
