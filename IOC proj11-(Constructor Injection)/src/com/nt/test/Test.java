package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Faculity;
import com.nt.beans.Marks;
import com.nt.beans.Student;
public class Test {
 public static void main(String[] args) {
	 Student s;
	 Marks m;
	 Faculity f;
	 BeanFactory factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
	 s=factory.getBean("st",Student.class);
	 m=factory.getBean("mk",Marks.class);
	 f=factory.getBean("fa",Faculity.class);
	 System.out.println(s);
	 System.out.println(m);
	 System.out.println(f);
	 
	 
	
}
}
