package Donors.DonorsServer.controllers;

import Donors.DonorsServer.models.Donor;
import Donors.DonorsServer.services.DonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/donors")
public class DonorController {
    private final DonorService donorService;
@Autowired
    public DonorController(DonorService donorService) {
        this.donorService = donorService;
    }
    @GetMapping
    public List<Donor> getAllDonors(){
    return donorService.getAllDonors();
    }

    @PostMapping("/add")
    public Donor createDonor(@RequestBody Donor newDonor){
    return donorService.createDonor(newDonor);
    }

    @GetMapping({"/{id}"})
    public Donor getDonorById(@PathVariable Long id){
    return (Donor) donorService.getDonorById(id);
    }
    @DeleteMapping("/{id}")
    public Donor deleteDonorById(@PathVariable Long id){
    return donorService.deleteDonor(id);
    }
    @PutMapping("/{id}")
    public Donor updateDonor(@PathVariable Long id, @RequestBody Donor newDonor){
    return donorService.updateDonor(id, newDonor);
    }

}
