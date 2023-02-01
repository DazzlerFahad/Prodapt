package com.invent.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.invent.entities.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {

	public Registration findByEmail(String email);
	public Registration findByEmailAndPassword(String email, String password);
}
