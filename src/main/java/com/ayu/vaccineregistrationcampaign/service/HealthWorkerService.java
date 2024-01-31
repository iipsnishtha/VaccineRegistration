package com.ayu.vaccineregistrationcampaign.service;

import java.util.List;

import com.ayu.vaccineregistrationcampaign.model.HealthWorker;
import com.ayu.vaccineregistrationcampaign.model.Vaccine;

@SuppressWarnings("unused")
public interface HealthWorkerService {
	public boolean addHealthWorker(HealthWorker healthWorker);

	public List<HealthWorker> getAllHealthWorkers();

	public HealthWorker findHealthWorkerById(int id);

	public boolean updateHealthWorker(HealthWorker healthworker);

	public void deleteHealthWorker(int id);

}
