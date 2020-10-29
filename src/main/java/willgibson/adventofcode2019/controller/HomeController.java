package willgibson.adventofcode2019.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(
        @RequestParam(name = "day", required = false, defaultValue = "all") String day,
        Model model
    ) {
        String headingSuffix = day.equals("all") ? "All Days" : "Day " + ("00" + day).substring(day.length());
        model.addAttribute("headingSuffix", headingSuffix);
        return "home";
    }

}
