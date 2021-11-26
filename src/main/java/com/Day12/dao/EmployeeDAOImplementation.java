package com.Day12.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Day12.models.Employee;


//Repository dependency...we can inject this bean in EmployeeServiceImplementation with @Autowired
@Repository
public class EmployeeDAOImplementation implements EmployeeDAO {

	//@Autowired meaning: 
	//The Spring framework enables automatic dependency injection
	//inject SessionFactory bean from <bean
    //class="org.springframework.orm.hibernate5.LocalSessionFactoryBean"
	@Autowired
	private SessionFactory sessionFactory; //with autowired we do not have to create new object
	
	@Override
	public void addEmployee(Employee employee) {
		Session session = sessionFactory.getCurrentSession();
		session.save(employee);
	}

	@Override
	public void updateEmployee(Employee employee) {
		Session session = sessionFactory.getCurrentSession();
		session.update(employee);
	}

	@Override
	public Employee getEmployeeById(int id) {
		Session session = sessionFactory.getCurrentSession();
		Integer wrappedId = id;
		Employee employee = (Employee)session.get(Employee.class, wrappedId);
		
		if(employee != null) {
			return employee;
		}else {
			return null;
		}
	}

	@Override
	public void removeEmployee(int id) {
		Session session = sessionFactory.getCurrentSession();
		Integer wrappedId = id;
		Employee employee = (Employee)session.get(Employee.class, wrappedId);
		
		if(employee != null) {
			session.delete(employee);
		}
	}

	@Override
	public List<Employee> listEmployee() {
		Session session = sessionFactory.getCurrentSession();
		List<Employee> empList = session.createQuery("from Employee").list();
		return empList;
	}

}
