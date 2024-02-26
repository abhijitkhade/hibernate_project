package hibernate.demo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class TestDemo {
	
	public static void main(String[] args) {
		
		
		
		Configuration cfg= new Configuration();
		
		 cfg.configure();
		 
		 SessionFactory sf= cfg.buildSessionFactory();
		 
		 
		 SessionFactory sf2= new Configuration().configure().buildSessionFactory();
		 
		 
		 System.out.println(sf);
		 System.out.println(sf2);
		 
		 System.out.println("session factory object created");
	}
	
	

}
