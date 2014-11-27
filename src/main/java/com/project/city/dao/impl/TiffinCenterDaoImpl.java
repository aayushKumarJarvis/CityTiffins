package com.project.city.dao.impl;

import java.util.List;

import org.hibernate.Query;

import com.project.city.dao.TiffinCenterDao;
import com.project.city.model.TiffinCenterData;
import com.project.city.util.CustomHibernateDAOSupport;

public class TiffinCenterDaoImpl extends CustomHibernateDAOSupport implements TiffinCenterDao {

	public void saveNewTiffinCenter(TiffinCenterData tiffinCenter) {
		getHibernateTemplate().save(tiffinCenter);
		getHibernateTemplate().flush();
	}

	public void deleteTiffinCenter(long tiffinCenterId) {
		TiffinCenterData data = getTiffinCenter(tiffinCenterId);
		getHibernateTemplate().delete(data);
		getHibernateTemplate().flush();
	}

	public void editTiffinCenter(TiffinCenterData tiffinCenter) {
		getHibernateTemplate().save(tiffinCenter);
		getHibernateTemplate().flush();
	}

	public TiffinCenterData getTiffinCenter(long tiffinCenterId) {
		Query query = getSession().createQuery("from TiffinCenterData tiffinCenter where id = :tiffinCenterId");
		query.setLong("tiffinCenterId", tiffinCenterId);
		return (TiffinCenterData)query.uniqueResult();
	}

	public List<TiffinCenterData> getAllTiffinCenters() {
		@SuppressWarnings("unchecked")
		List<TiffinCenterData> tiffinCenterList = (List<TiffinCenterData>) getHibernateTemplate().find(
				"from TiffinCenterData");
		return tiffinCenterList;
	}

	public List<TiffinCenterData> getAllTiffinCenters(String city) {
		@SuppressWarnings("unchecked")
		List<TiffinCenterData> tiffinCenterList = (List<TiffinCenterData>) getHibernateTemplate().find(
				"from TiffinCenterData where city = '" + city + "'");
		return tiffinCenterList;
	}

	public List<TiffinCenterData> getAllTiffinCenters(String city, String location){
		@SuppressWarnings("unchecked")
		List<TiffinCenterData> tiffinCenterList = (List<TiffinCenterData>) getHibernateTemplate().find(
				"from TiffinCenterData where city = '" + city + "' and location = '" + location + "'");
		return tiffinCenterList;
	}

	public void setNoOfHits(long tiffinCenterId, String location){
		
	}

	public long getNumberOfHits(long tiffinCenterId){
		return 0;
	}

	public long getNumberOfHits(long tiffinCenterId, String location){
		return 0;
	}

}
