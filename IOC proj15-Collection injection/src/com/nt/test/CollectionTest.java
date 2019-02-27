package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Airtel;
import com.nt.beans.College;
import com.nt.beans.Faculty;
import com.nt.beans.FruitStore;
import com.nt.beans.ShowRoom;

public class CollectionTest {
     public static void main(String[] args) {
		//create IOC container
 		DefaultListableBeanFactory factory= new DefaultListableBeanFactory();
 		XmlBeanDefinitionReader reader= new XmlBeanDefinitionReader(factory);
 		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
 		
 		Airtel ar=factory.getBean("airtel",Airtel.class);
 		College cg=factory.getBean("clg",College.class);
 		ShowRoom show=factory.getBean("sh",ShowRoom.class);
 		Faculty faculty=factory.getBean("fclt",Faculty.class);
 		FruitStore fruits=factory.getBean("fruit",FruitStore.class);

 		System.out.println(ar);
 		System.out.println(cg);
 		System.out.println(show);
 		System.out.println(faculty);
 		System.out.println(fruits);
	}
}
