package proiect.computer;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ComputerController {
    private final ComputerService computerService;

    public ComputerController(ComputerService computerService) {
        this.computerService = computerService;
    }

    @GetMapping("/computers")
    public String listComputers(Model model, @Param("id") Long id) {
        try{
            if(id==null){
                model.addAttribute("computers", computerService.getAllComputers());
            }else if(computerService.existsComputer(id)){
                model.addAttribute("computers", computerService.getAComputer(id));

            }
        }catch (Exception e) {
            model.addAttribute("message", e.getMessage());


            model.addAttribute("computers", computerService.getAllComputers());
        }
        return "computers";
    }
    @GetMapping("/computers/new")
    public String createComputerForm(Model model){

        Computer computer=new Computer();
        model.addAttribute("computer", computer);
        return "create_computer";
    }

    @PostMapping("/computers")
    public String saveComputer(@ModelAttribute("computer") Computer computer){
        computerService.addComputer(computer);
        return "redirect:/computers";
    }

    @GetMapping("/computers/edit/{id}")
    public String editComputerForm(@PathVariable Long id, Model model){
        model.addAttribute("computer", computerService.getAComputer(id));
        return "edit_computer";
    }

    @PostMapping("/computers/{id}")
    public String updateComputer(@PathVariable Long id,
                                @ModelAttribute("computer") Computer computer, Model model){
        //get student from db by id
        computerService.updateComputer(computer, id);
        return("redirect:/computers");
    }

    //handler method to handle delete student request
    @GetMapping("/computers/{id}")
    public String deleteStudent(@PathVariable Long id){
        computerService.deleteComputer(id);
        return "redirect:/computers";
    }
}
