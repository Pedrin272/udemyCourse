package nelioFixacao.arrays;

public class Employee {
	private String name;
	private Integer id;
	private Double salary;
	public Employee(String name, Integer id, Double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Integer getId() {
		return id;
	}
	@Override
	public String toString() {
		return "|id=" + id + ", employee " + name + ", salary=" + salary + "|";
	}
	
}
