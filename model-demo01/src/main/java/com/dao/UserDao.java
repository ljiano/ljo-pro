package com.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dao.repository.DomainRepository;
import com.entity.User;

@Repository
public class UserDao implements DomainRepository<User, Long>{

	@Autowired
	private SessionFactory sessionFactory;
	
	public User load(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public User get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void persist(User entity) {
		// TODO Auto-generated method stub
		
	}

	public Long save(User entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public void saveOrUpdate(User entity) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	public void flush() {
		// TODO Auto-generated method stub
		
	}

}
