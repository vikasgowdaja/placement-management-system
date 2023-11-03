package com.cg.placement.repository;

import javax.persistence.EntityManager;

import com.cg.placement.entities.Admin;
import com.cg.placement.entities.User;

public class UserRepositoryImpl implements IUserRepository {

	// Step 1: Start JPA LifeCycle
	private EntityManager entityManager;

	public UserRepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	// Create operation - Repo/DAO
	@Override
	public User addNewUser(User user) {
		entityManager.persist(user);
		return user;
	}

	@Override
	public User updateUser(User user) {
		entityManager.merge(user);
		return user;
	}

	@Override
	public void deleteUser(int id) {
		User user = entityManager.find(User.class, id);
		entityManager.remove(user);
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

	@Override
	public void commitTrasaction() {
		entityManager.getTransaction().commit();
	}

	@Override
	public User deleteUser(User user) {
		entityManager.remove(user);
		return user;
	}


	@Override
	public Admin addAdmin(Admin admin) ////////////////////////////////////////////////////
	{
		entityManager.persist(admin);
		return admin;
	}

}
