package com.organ.donation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/donors")

public class DonorController {

  @Autowired
    private DonorRepository donorRepository;

    @GetMapping
    public List<Donor> getAllDonors() {
        return donorRepository.findAll();
    }

    @PostMapping
    public Donor createDonor(@RequestBody Donor donor) {
        return donorRepository.save(donor);
    }
}
