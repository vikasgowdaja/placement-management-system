package com.cg.placement.repository;

import com.cg.placement.entities.Certificate;

public interface ICertificateRepository {
	
	public Certificate addCertificate(Certificate certificate);
	public Certificate updateCertificate(Certificate certificate);
	public Certificate searchCertificateById(int id);
//	public Certificate searchCertificateByYear(int year);
	public Certificate cancelCertificate(Certificate certificate);
	

	
	public abstract void beginTransaction();
	public abstract void commitTrasaction();
	void cancelCertificate(int id);

	

}
