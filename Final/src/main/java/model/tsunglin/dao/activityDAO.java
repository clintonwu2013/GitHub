package model.tsunglin.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import model.POJO.Activity;
import model.POJO.Member;

@Repository
public class activityDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	
	
	public List<Activity> findUnreviewed() {
		Session session = sessionFactory.getCurrentSession();
		//session.beginTransaction();
		List<Activity> rs = null;
		rs = session.createQuery("from Activity where permission='待審核'  order by aid" , Activity.class).list();

		return rs;
	}
	
	public Activity findByPK(Integer aid) {
		Session session = sessionFactory.getCurrentSession();
		//session.beginTransaction();
		Activity rs = session.get(Activity.class, aid);

		return rs;
	}
	
	public Activity updatePermission(Integer aid, String permission) {
		Session session = sessionFactory.getCurrentSession();
		//session.beginTransaction();
		Activity activity = session.get(Activity.class, aid);
		activity.setPermission(permission);
		
		return activity;
	}
}
