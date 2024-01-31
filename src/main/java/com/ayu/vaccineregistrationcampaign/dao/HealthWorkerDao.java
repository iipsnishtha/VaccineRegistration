package com.ayu.vaccineregistrationcampaign.dao;

import java.util.List;

import com.ayu.vaccineregistrationcampaign.model.HealthWorker;
import com.ayu.vaccineregistrationcampaign.model.Vaccine;

public interface HealthWorkerDao {
	public Vaccine searchVaccineByName(String name);

	public void updateVaccineDoses(int remainingDoses, String vaccinename);

	public void addHealthWorker(HealthWorker healthWorker);

	public List<HealthWorker> getAllHealthWorkers();

	public HealthWorker findHealthWorkerById(int id);

	public void updateHealthWorker(HealthWorker healthWorker);

	public void deleteHealthWorker(int id);

}
