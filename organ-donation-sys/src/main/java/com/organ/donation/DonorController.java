package com.organ.donation;
import com.organ.donation.Donor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/donors")

public class DonorController {
    private List<Donor> donors = new ArrayList<>();

    @GetMapping
    public List<Donor> getAllDonors() {
        return donors;
    }

    @PostMapping
    public Donor createDonor(@RequestBody Donor donor) {
        donors.add(donor);
        return donor;
    }
}
