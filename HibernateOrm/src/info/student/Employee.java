package info.student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMP_TBLE",schema="BMS")
public class Employee
{
	
	
	@Id
	@Column(name="ENO")
	private Integer Eno;
	
	@Column(name="NAME")
	
	private String name;
	@Column(name="salary")
	private Double salary;
	
	
	
	
	
	public Integer getEno() {
		return Eno;
	}
	public void setEno(Integer eno) {
		Eno = eno;
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

}
