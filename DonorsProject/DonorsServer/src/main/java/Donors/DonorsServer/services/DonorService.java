package Donors.DonorsServer.services;

import Donors.DonorsServer.models.Donor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface DonorService {
    List<Donor> getAllDonors();

    Donor createDonor(Donor newDonor);

    Donor getDonorById(Long id);

    Donor deleteDonor(Long id);

    Donor updateDonor(Long id, Donor newDonor);
}
