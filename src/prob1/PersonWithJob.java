package prob1;

public class PersonWithJob extends Person {
	
	private double salary;
	
	public double getSalary() {
		return salary;
	}
	PersonWithJob(String n, double s) {
		super(n);
		salary = s;
	}
	
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false;
		if(!(aPerson instanceof PersonWithJob)) return false;
		PersonWithJob p = (PersonWithJob)aPerson;
		boolean isEqual = this.getName().equals(p.getName()) &&
				this.getSalary()==p.getSalary();
		return isEqual;
	}
	public static void main(String[] args) {
		Person p1 = new PersonWithJob("Joe", 30000);
		Person p2 = new Person("Joe");
		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
//		System.out.println("p2.equals(p1)? " + p2.equals(p1));

		// the reason p1.equals(p2) is because the Parent Person isn't an instance of PersonwithJob. Has the parent can't be an
		// instanceOf the child but rather the child can be an instance of the parent. The parent can't be subsituted with the child.
		// The equals used comes from the child hence the reason why its false but on the other hand as the parent type can be substitute
		// for the child in order words the child is an instance of the parent and both object have the same name hence it returns true for it

	}


}
