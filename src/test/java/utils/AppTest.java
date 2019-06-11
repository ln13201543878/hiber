package utils;

import static org.junit.Assert.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;



public class AppTest {

	@Test
	public void test() {
		Configuration cfg=new Configuration();
		cfg.configure("utils/hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		s.beginTransaction();
		Users u=new Users();
		u.setUid(60);
		s.delete(u);
		s.getTransaction().commit();
		s.close();
		
	}

}
