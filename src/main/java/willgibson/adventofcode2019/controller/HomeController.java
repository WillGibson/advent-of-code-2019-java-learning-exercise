package willgibson.adventofcode2019.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(
        @RequestParam(name = "day", required = false, defaultValue = "allx") String day,
        Model model
    ) {
        model.addAttribute("day", day);
        return "home";
    }

}
