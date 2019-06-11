package dao;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import utils.HibernateUtils;
import utils.Users;

public class IDaoImpl implements IDao {
	
	@Override
	public void save(Users u) {
		Session s= HibernateUtils.openSession();
	     s.beginTransaction();
	     s.save(u);
	     s.getTransaction().commit();
	     s.close();
	}

	@Override
	public void delete(Integer uid) {
		 Session s= HibernateUtils.openSession();
	     s.beginTransaction();
	     Users u=new Users();
	     u.setUid(uid);
	     s.delete(u);
	     s.getTransaction().commit();
	     s.close();
	}

	@Override
	public void update(Users u) {
		 Session s= HibernateUtils.openSession();
	     s.beginTransaction();
	     s.update(u);
	     s.getTransaction().commit();
	     s.close();
	}

	@Override
	public Users findone(Integer uid) {
		 Session s= HibernateUtils.openSession();
	     s.beginTransaction();
	     Users u=(Users)s.get(Users.class,uid);
	     s.getTransaction().commit();
	     s.close();
		return u;
	}

	@Override
	public List<Users> findAll() {
		 Session s= HibernateUtils.openSession();
	     s.beginTransaction();
	     String hql = "FROM Users";
			Query q = s.createQuery(hql);
			List<Users> list = q.list();
	     s.getTransaction().commit();
	     s.close();
		return list;
	}

}
