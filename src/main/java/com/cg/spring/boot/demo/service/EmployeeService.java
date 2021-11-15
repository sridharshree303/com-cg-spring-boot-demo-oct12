package com.cg.spring.boot.demo.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spring.boot.demo.Exception.EmployeeNotFoundException;
import com.cg.spring.boot.demo.controller.EmployeeController;
import com.cg.spring.boot.demo.model.Employee;
import com.cg.spring.boot.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	private static final Logger LOG = LoggerFactory.getLogger(EmployeeController.class);

	@Autowired
	private EmployeeRepository empRepository;

	public List<Employee> getAllEmployees() {
		LOG.info("Service getAllEmployees");
		return empRepository.findAll();
	}

//	public Employee getEmployeeById(int eid) {
//		Log.info("getEmployeeById");
//		return empRepository.findById(eid).get();
//	}

//	public Employee getEmployeeById(int eid) {
//		Optional<Employee> empOpt = empRepository.findById(eid);
//		if (!empOpt.isEmpty())
//			return empOpt.get();
//		return null;
//	}

	public Employee getEmployeeById(int eid) {
		LOG.info("getEmployeeById");
		Optional<Employee> empOpt = empRepository.findById(eid);
		if (empOpt.isPresent()) {
			LOG.info("Employee is available.");
			return empOpt.get();
		} else {
			LOG.info("Employee is NOT available.");
			throw new EmployeeNotFoundException(eid + " this employee is not found.");
		}
	}

	public Employee addEmployee(Employee employee) {
		LOG.info("Service addEmployee");
		if (!empRepository.existsById(employee.getEid())) {
			LOG.info("New Employee is Added");
			return empRepository.save(employee);
		}else {
		  LOG.info("Employee Data is already exists");
		  throw new EmployeeNotFoundException("Employee already exists");
		}
	}

//	public Employee updateEmployee(Employee employee) {
//		LOG.info("Service updateEmployee");
//		
//		if (empRepository.existsById(employee.getEid()))
//			return empRepository.save(employee);
//		LOG.info(employee.getEid() + " does not exist.");
//		return null;
//	}

	public Employee updateEmployee(Employee employee) {
		LOG.info("Service updateEmployee");
		if (empRepository.existsById(employee.getEid())) {
			LOG.info("Employee Data is Updated");
			return empRepository.save(employee);
		}else {
		LOG.info(employee.getEid() + " Emplyoee data is Not updated");
		throw new EmployeeNotFoundException("Employee Data is not updated");
		}
	}

//	public int deleteEmployeeById(int eid) {
//		LOG.info("Service deleteEmployeeById");
//		if (empRepository.existsById(eid)) {
//			empRepository.deleteById(eid);
//			return eid;
//		}
//		LOG.info(eid + " does not exist.");
//		return 0;
//	}
	public Employee deleteEmployeeById(int eid) {
		LOG.info("Service deleteEmployeeById");
		Optional<Employee> empOpt = empRepository.findById(eid);
		if(empOpt.isPresent()) {
			LOG.info("Employee is Available");
			empRepository.deleteById(eid);
			return empOpt.get();
		}else {
			LOG.info("Employee is not available");
			throw new EmployeeNotFoundException(eid + " this employee is not found.");
		}
	}
}

//	private List<Employee> empList = new ArrayList<>();
//
//	{
//		empList.add(new Employee(101, "Sonu", 10.5));
//		empList.add(new Employee(102, "Monu", 15.5));
//		empList.add(new Employee(103, "Tonu", 12.5));
//	}
//
//	public List<Employee> getAllEmployees() {
//		System.out.println("Service getAllEmployees");
//		return empList;
//	}
//	
//	public Employee getEmployeeById(int eid) {
//		System.out.println("Service getEmployeeById");
//		return empList.stream().filter(e -> eid == e.getEid()).findAny().orElse(null);
//	}                     // if u add or.else()  then it will show null instead of error
//                          // give out of range 104
//	
//	public Employee addEmployee(Employee employee) {
//		empList.add(employee);
//		return employee;
//	}
