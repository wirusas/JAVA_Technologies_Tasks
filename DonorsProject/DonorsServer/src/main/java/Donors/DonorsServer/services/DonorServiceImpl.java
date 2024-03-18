package Donors.DonorsServer.services;

import Donors.DonorsServer.models.Donor;
import Donors.DonorsServer.repositories.DonorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
@Service
public class DonorServiceImpl implements DonorService{
    public DonorServiceImpl(DonorRepository donorRepository) {
        this.donorRepository = donorRepository;
    }

    @Autowired
    DonorRepository donorRepository;
    @Override
    public List<Donor> getAllDonors() {
        return donorRepository.findAll();
    }

    @Override
    public Donor createDonor(Donor newDonor) {
        return donorRepository.save(newDonor);
    }

    @Override
    public Donor getDonorById(Long id) {
        Optional<Donor> donorOptional = donorRepository.findById(id);
        return donorOptional.orElseThrow(() -> new RuntimeException("Donor not found with id: " + id ));
    }

    @Override
    public Donor deleteDonor(Long id) {
        Optional<Donor> donorOptional = donorRepository.findById(id);
        if(donorOptional.isPresent()){
            Donor donorToDelete = donorOptional.get();
            donorRepository.delete(donorToDelete);
            return donorToDelete;
        }

        return null;
    }

    @Override
    public Donor updateDonor(Long id, Donor newDonor) {
        Optional<Donor> optionalDonor = donorRepository.findById(id);
        if (optionalDonor.isPresent()){
            Donor donorToUpdate = optionalDonor.get();
            donorToUpdate.setAge(newDonor.getAge());
            donorToUpdate.setGender(newDonor.getGender());
            donorToUpdate.setName(newDonor.getName());
            donorToUpdate.setBloodGroup(newDonor.getBloodGroup());
            donorToUpdate.setSurname(newDonor.getSurname());
            return donorRepository.save(donorToUpdate);
        }
        return null;
    }
}
