package model.tsunglin.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import model.POJO.Mail;
@Repository
public class MailDAO {
	@Autowired
	SessionFactory sessionFactory;
	public boolean insert(Mail mail) {
		Session session = sessionFactory.getCurrentSession();
		
		Serializable flag = session.save(mail);
		
		if(flag !=null) {
			return true;
		}
		
		return false;
		
	}

}
