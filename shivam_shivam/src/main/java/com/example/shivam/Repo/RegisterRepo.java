package com.example.shivam.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.shivam.model.User;

public interface RegisterRepo extends JpaRepository<User,Long>{
	public User findByEmail( String email);

	

	

}
