package fr.ensai.running.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.ensai.running.model.Athlete;
import fr.ensai.running.service.AthleteService;

@RestController
@RequestMapping("/api")
public class ApiRestController {

    @Autowired
    private AthleteService athleteService;

    /**
     * Get all athletes
     */
    @GetMapping("/athlete")
    public List<Athlete> allAthletes() {

        return athleteService.findAll();
    }

    @GetMapping("/add/{id}")
    public Athlete getAthleteById(Long id) {

        return athleteService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAthleteById(Long id) {

        athleteService.deleteById(id);
    }

    @PutMapping("/save")
    public Athlete createAthlete(Athlete athlete) {

        return athleteService.save(athlete);
    }

}
