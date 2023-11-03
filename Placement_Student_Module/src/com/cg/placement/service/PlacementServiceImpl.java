package com.cg.placement.service;

import com.cg.placement.entities.Placement;

import com.cg.placement.repository.IPlacementRepository;

import com.cg.placement.repository.PlacementRepositoryImpl;

public class PlacementServiceImpl implements IPlacementService {
	private IPlacementRepository dao;

	public PlacementServiceImpl() {
		dao = new PlacementRepositoryImpl();
	}

	@Override
	public Placement addPlacement(Placement placement) {
		dao.beginTransaction();
		dao.addPlacement(placement);
		dao.commitTrasaction();
		return placement;
	}

	@Override
	public Placement updatePlacement(Placement placement) {
		dao.beginTransaction();
		dao.updatePlacement(placement);
		dao.commitTrasaction();
		return placement;
	}

	@Override
	public Placement searchPlacement(int id) {
		Placement placement = dao.searchPlacement(id);
		return placement;
	}

	@Override
	public Placement cancelPlacement(Placement placement) {
		dao.beginTransaction();
		dao.cancelPlacement(placement);
		dao.commitTrasaction();
		return placement;
	}

}
