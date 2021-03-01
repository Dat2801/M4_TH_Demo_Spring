package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/students")
public class StudentController {
    @GetMapping("/list")
    public String listStudent(ModelMap modelMap) {
        modelMap.addAttribute("ten", "Vu Huu Dat");
        return "list";
    }
    @GetMapping("")
    public ModelAndView index(){
        ModelAndView modelAndView= new ModelAndView("list");
        modelAndView.addObject("ten","Dat TB");
        return modelAndView;
    }
}
