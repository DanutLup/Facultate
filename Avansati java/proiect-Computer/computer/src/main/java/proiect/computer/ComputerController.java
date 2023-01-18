package proiect.computer;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ComputerController {
    private final ComputerService computerService;

    public ComputerController(ComputerService computerService) {
        this.computerService = computerService;
    }
    @GetMapping("/computers")
    List<Computer> getAllComputers(){
        return computerService.getAllComputers();
    }
    @GetMapping("/computers/{id}")
    Computer getAComputer(@PathVariable Long id){
        return computerService.getAComputer(id);
    }
    @PostMapping("/computers")
    Computer addComputer(@RequestBody Computer computer){
        return computerService.addComputer(computer);
    }
    @PutMapping("/computers/{id}")
    Computer updateComputer(@RequestBody Computer newComputer, @PathVariable Long id){
        return computerService.updateComputer(newComputer, id);
    }
    @DeleteMapping("/computers/{id}")
    void deleteComputer(@PathVariable Long id){
         computerService.deleteComputer(id);
    }
}
