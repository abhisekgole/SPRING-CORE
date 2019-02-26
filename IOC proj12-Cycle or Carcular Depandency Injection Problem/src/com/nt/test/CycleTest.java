package com.nt.test;



import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.A;
import com.nt.beans.B;

public class CycleTest {
	public static void main(String args[]) {
		//A a1=null;
		//B b1=null;
	//Create IOC container	
	DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
	XmlBeanDefinitionReader reader= new XmlBeanDefinitionReader(factory);
reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
System.out.println("Cycle");
//a1=factory.getBean("a",A.class);
//b1=factory.getBean("b",B.class);
B b=factory.getBean("b",B.class);
A a=factory.getBean("a",A.class);

	}
}
