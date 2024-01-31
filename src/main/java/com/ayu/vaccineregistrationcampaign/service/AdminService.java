package com.ayu.vaccineregistrationcampaign.service;

import java.util.List;

import com.ayu.vaccineregistrationcampaign.model.Admin;
import com.ayu.vaccineregistrationcampaign.model.HealthWorker;
import com.ayu.vaccineregistrationcampaign.model.Vaccine;

@SuppressWarnings("unused")
public interface AdminService {
	public boolean validateAdmin(Admin admin);

	public List<Vaccine> checkVaccines();

	public Vaccine findVaccineById(int id);

	public void saveUpdatedVaccine(Vaccine vaccine);

}
