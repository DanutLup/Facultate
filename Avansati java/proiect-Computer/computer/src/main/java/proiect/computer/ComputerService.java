package proiect.computer;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComputerService implements IComputerService {
    private final ComputerRepository computerRepository;

    public ComputerService(ComputerRepository computerRepository) {
        this.computerRepository = computerRepository;
    }
    private void productCodeValidator(String productCode){
        Optional<Computer> computerOptional=computerRepository.getComputerByProductCode(productCode);
        if(computerOptional.isPresent()){
            throw new IllegalStateException(String.format("Produsul cu codul %s exista deja", productCode));
        }
    }
    @Override
    public List<Computer> getAllComputers(){
        return computerRepository.findAll();
    }
    @Override
    public Computer getAComputer(Long id){
        return computerRepository.findById(id)
                .orElseThrow(()->new ComputerNotFoundException(id));
    }
    @Override
    public Computer addComputer(Computer computer){
        productCodeValidator(computer.getProductCode());
        return computerRepository.save(computer);
    }
    @Override
    public Computer updateComputer(Computer newComputer, Long id){
        productCodeValidator(newComputer.getProductCode());
        return computerRepository.findById(id)
                .map(computer -> {
                    computer.setProductCode(newComputer.getProductCode());
                    computer.setType(newComputer.getType());
                    computer.setProcessor(newComputer.getProcessor());
                    computer.setMemory(newComputer.getMemory());
                    return computerRepository.save(computer);
                })
                .orElseGet(()->{
                    newComputer.setId(id);
                    return computerRepository.save(newComputer);
                });
    }
    @Override
    public void deleteComputer(Long id){
        computerRepository.deleteById(id);
    }
}
