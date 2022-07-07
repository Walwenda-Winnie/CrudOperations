package com.crudoperations.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.crudoperations.model.Branch;
import com.crudoperations.repository.BranchRepo;

@Repository
public class BranchImpl implements BranchRepo{

	@Autowired
	JdbcTemplate jdbcTemplate;
	@Autowired
	Environment env;
	
	@Override
	public int save(Branch model) {

	String sql="INSERT into branch (branchName,branchCode,branchEmail) value (?,?,?)";	
	Object[] param=new Object[] {model.getBranchName(),model.getBranchCode(),model.getBranchEmail()};
		return jdbcTemplate.update(sql,param);
	}
	
	@Override
	  public int update(Branch model) {
	    return jdbcTemplate.update("UPDATE branch SET branchName=?, branchCode=?,branchEmail=?, modifiedBy=? WHERE id=?",
	        new Object[] { model.getBranchName(), model.getBranchCode(),model.getBranchEmail(), model.getModifiedBy(),model.getId() });
	}
	
	
	 @Override
	  public Branch findById(int id) {
	    try {
	      Branch model = jdbcTemplate.queryForObject("SELECT * FROM branch WHERE id=?",
	          BeanPropertyRowMapper.newInstance(Branch.class), id);
	      return model;
	    } catch (IncorrectResultSizeDataAccessException e) {
	      return null;
	    }
	  }
	 
	 @Override
	  public int deleteById(int id) {
	    return jdbcTemplate.update("DELETE FROM branch WHERE id=?", id);
	  }
	 
	 @Override
	  public List<Branch> findAll() {
	    return jdbcTemplate.query("SELECT * FROM branch", BeanPropertyRowMapper.newInstance(Branch.class));
	  }

	 @Override
	  public List<Branch> findByBranchName(String branchName) {
	    return jdbcTemplate.query("SELECT * FROM branch WHERE branchName=?",
	        BeanPropertyRowMapper.newInstance(Branch.class), branchName);
	  }

	 
	
}
