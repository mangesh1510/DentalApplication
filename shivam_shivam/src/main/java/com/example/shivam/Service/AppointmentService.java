package com.example.shivam.Service;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shivam.Repo.AppointmentRepository;
import com.example.shivam.model.Appointment;

@Service
public class AppointmentService {
	
	    private AppointmentRepository repository;
	    
	  public AppointmentService(AppointmentRepository repository) {
	        this.repository = repository;
	    }


	    public List<Appointment> getAllAppointments() {
	        return repository.findAll();
	    }

	    public Appointment saveAppointment(Appointment appointment) {
	        return repository.save(appointment);
	    }

	    public void deleteAppointment(Long id) {
	        repository.deleteById(id);
	    }
}
