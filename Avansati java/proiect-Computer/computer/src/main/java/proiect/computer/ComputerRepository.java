package proiect.computer;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ComputerRepository extends JpaRepository<Computer, Long> {
    Optional<Computer> getComputerByProductCode(String productCode);
}
