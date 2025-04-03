package com.example.shivam.Controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.shivam.Service.AppointmentService;
import com.example.shivam.model.Appointment;



@RestController 
@RequestMapping("/api")
public class AppointmentController {
	
    private AppointmentService service;
	
	 public AppointmentController(AppointmentService service) {
	        this.service = service;
	    }


    // GET all appointments
    @GetMapping("/appointments")
    public List<Appointment> getAllAppointments() {
        return service.getAllAppointments();
    }

    // POST (Save an appointment)
    @PostMapping("/register")
    public Appointment saveAppointment(@RequestBody Appointment appointment) {
        return service.saveAppointment(appointment);
    }

    // DELETE an appointment by ID
    @DeleteMapping("/delete/{id}")
    public void deleteAppointment(@PathVariable Long id) {
        service.deleteAppointment(id);
    }

}
