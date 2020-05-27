package org.oar.emp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import org.oar.emp.dto.Employee;

public class CommonDao
{
	public void saveEmployeeDetails(Employee employee)
	{
		Configuration configuration=new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(Employee.class);
		SessionFactory sessionfactory=configuration.buildSessionFactory();
		Session session=sessionfactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(employee);
		transaction.commit();
		
		
	}
	public Employee getEmployeeDetails(String name)
	{
		Configuration configuration=new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(Employee.class);
		SessionFactory sessionfactory=configuration.buildSessionFactory();
		Session session=sessionfactory.openSession();
		Employee employee=(Employee)session.get(Employee.class, name);
		return employee;
	}
	
	public void deleteByName(String name)
	{
		Configuration configuration=new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(Employee.class);
		SessionFactory sessionfactory=configuration.buildSessionFactory();
		Session session=sessionfactory.openSession();
		Transaction transaction=session.beginTransaction();
		Employee details=getEmployeeDetails(name);
		session.delete(name,details);
		transaction.commit();
	}
	
	public void updateEmployeeDetails(String name,long contact)
	{
		Configuration configuration=new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(Employee.class);
		SessionFactory sessionfactory=configuration.buildSessionFactory();
		Session session=sessionfactory.openSession();
		Transaction transaction=session.beginTransaction();
		Employee e=(Employee)session.get(Employee.class, name);
		if(e!=null)
		{
			e.setCno(contact);
		}
		else
		{
			System.out.println("data does not exist");
		}
		session.save(e);
		transaction.commit();
	}
}





















