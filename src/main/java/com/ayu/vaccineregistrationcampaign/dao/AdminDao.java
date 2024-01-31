package com.ayu.vaccineregistrationcampaign.dao;

import java.util.List;

import com.ayu.vaccineregistrationcampaign.model.Admin;
import com.ayu.vaccineregistrationcampaign.model.Vaccine;

public interface AdminDao {
	public Admin validateAdmin(Admin admin);

	public List<Vaccine> checkVaccines();

	public Vaccine findVaccineById(int id);

	public void saveUpdatedVaccine(Vaccine vaccine);

}
