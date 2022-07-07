package com.crudoperations.repository;

import java.util.List;

import com.crudoperations.model.Branch;

public interface BranchRepo {
	
	public int save(Branch model);
	int update(Branch model);
	Branch findById(int id);
	int deleteById(int id);
	List<Branch> findAll();
	List<Branch>findByBranchName(String branchName);
	
	

}
