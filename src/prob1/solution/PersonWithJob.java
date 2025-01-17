package prob1.solution;

import java.util.Objects;

public class PersonWithJob {
    private double salary;
    private Person person;

    public PersonWithJob(double salary, String name) {
        this.salary = salary;
        this.person = new Person(name);
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonWithJob that)) return false;
        return Double.compare(salary, that.salary) == 0 && Objects.equals(person, that.person);
    }

    public static void main(String[] args) {
        PersonWithJob p1 = new PersonWithJob( 30000.0,"Joe");
        PersonWithJob p2 = new PersonWithJob( 30000.0,"Joe");
        System.out.println("p1.equals(p2)? " + p1.equals(p2));
        System.out.println("p2.equals(p1)? " + p2.equals(p1));
    }
}
