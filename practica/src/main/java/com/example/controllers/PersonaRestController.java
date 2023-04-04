package com.example.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.service.api.PersonaServiceAPI;
import java.util.List;
import com.example.model.Persona;
@RestController
@RequestMapping(value = "/api/v1")

public class PersonaRestController {

    @Autowired
    private PersonaServiceAPI personaServiceApi;

    public List<Persona> getAll(){
        return personaServiceApi.getAll();
    }

	@GetMapping(value = "/find/{id}")
	public Persona find(@PathVariable Long id) {
		return personaServiceApi.get(id);
	}
}
