package Donors.DonorsServer.repositories;

import Donors.DonorsServer.models.Donor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonorRepository extends JpaRepository<Donor, Long> {
}
