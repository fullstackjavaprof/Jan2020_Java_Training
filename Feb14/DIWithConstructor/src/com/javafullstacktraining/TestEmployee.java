package com.javafullstacktraining;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.*;

public class TestEmployee {

	public static void main(String[] args) {
		  
	Resource resource=new ClassPathResource("applicationContext.xml");  
        BeanFactory factory=new XmlBeanFactory(resource);  
		 
		  Employee employee1=(Employee)factory.getBean("eObj1");  
	      employee1.show();  
	        
	      Employee employee2=(Employee)factory.getBean("eObj2");  
	      employee2.show();
	  
	      /*
	      Employee e1=new Employee(15,"ramu");
	      e1.show();
	      
	      Employee e2=new Employee();
	      e2.setId(16);
	      e2.setName("kumar");
	      e1.show();
	      
	      */
		
     /*	
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        
        Employee employee1=(Employee)applicationContext.getBean("eObj1");  
	      employee1.show();  
	        
	      Employee employee2=(Employee)applicationContext.getBean("eObj2");  
	      employee2.show();
      */
	}

}
