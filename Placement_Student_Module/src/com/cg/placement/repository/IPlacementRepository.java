package com.cg.placement.repository;

import com.cg.placement.entities.Placement;

public interface IPlacementRepository {
	public Placement addPlacement(Placement student);

	public Placement updatePlacement(Placement student);

	public Placement searchPlacement(int id);

	public Placement cancelPlacement(Placement placement);

	public abstract void beginTransaction();

	public abstract void commitTrasaction();

	void cancelPlacement(int id);

}
