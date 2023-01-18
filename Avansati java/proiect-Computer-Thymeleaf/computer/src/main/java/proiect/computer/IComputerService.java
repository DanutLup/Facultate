package proiect.computer;

import java.util.List;

public interface IComputerService {
    List<Computer> getAllComputers();

    Computer getAComputer(Long id);

    Computer addComputer(Computer computer);

    Computer updateComputer(Computer newComputer, Long id);

    void deleteComputer(Long id);
}
