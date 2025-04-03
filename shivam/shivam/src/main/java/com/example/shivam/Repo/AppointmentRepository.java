package com.example.shivam.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.shivam.model.Appointment;
import com.example.shivam.model.User;


@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

}
