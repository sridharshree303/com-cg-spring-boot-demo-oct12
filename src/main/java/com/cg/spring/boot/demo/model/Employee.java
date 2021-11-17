package com.cg.spring.boot.demo.model;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "emp_table")
public class Employee implements Serializable {

	private static final long serialVersionUID = -9165581216674129315L;

	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;

	@Column
	private String firstName;

	@Column
	private double salary;

	@ManyToOne
	@JoinColumn(name = "did")
	private Department department;
	
	@ManyToOne
	@JoinColumn(name = "uid")
	private AppUser appuser;

	public Employee() {
		super();
	}

	public Employee(int eid, String firstName, double salary) {
		super();
		this.eid = eid;
		this.firstName = firstName;
		this.salary = salary;
	}

	public Employee(int eid, String firstName, double salary, Department department) {
		super();
		this.eid = eid;
		this.firstName = firstName;
		this.salary = salary;
		this.department = department;
	}
	
	public Employee(int eid, String firstName, double salary, Department department,AppUser appuser) {
		super();
		this.eid = eid;
		this.firstName = firstName;
		this.salary = salary;
		this.department = department;
		this.appuser = appuser;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", firstName=" + firstName + ", salary=" + salary + ", department=" + department
				+" , appuser = "+appuser +"]";
	}

}
