public class Employee implements Comparable<Employee>{
	public String name;
	public String ssNumb;
	public String gender;
	
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}

}
