package com;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.User;

@Controller
public class Test {

	@Autowired
	private SessionFactory sessionFactory;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@RequestMapping("test")
	public String test() {
//		Session session = sessionFactory.openSession();
//		if(session != null) {
//			Query query = session.createSQLQuery("select *  from company");
//			List<Object[]> list = query.list();
//			if(!CollectionUtils.isEmpty(list)) {
//				for(Object[] obj : list) {
//					System.out.println(obj[1]);
//				}
//			}
//		}
		User user = new User();
		user.setUname("ljo");
		user.setUpwd("123");
		sessionFactory.openSession().save(user);
		return "ok";
	}

}
