package com.cg.placement.repository;

import javax.persistence.EntityManager;

import com.cg.placement.entities.Placement;

public class PlacementRepositoryImpl implements IPlacementRepository {

	private EntityManager entityManager;

	public PlacementRepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public Placement addPlacement(Placement placement) {
		entityManager.persist(placement);
		return placement;
	}

	@Override
	public Placement updatePlacement(Placement placement) {
		entityManager.merge(placement);
		return placement;
	}

	@Override
	public Placement searchPlacement(int id) {
		Placement placement = entityManager.find(Placement.class, id);
		return placement;
	}

	@Override
	public void cancelPlacement(int id) {
		Placement placement = entityManager.find(Placement.class, id);
		entityManager.remove(placement);

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
	public Placement cancelPlacement(Placement placement) {
		entityManager.remove(placement);
		return placement;
	}

}
