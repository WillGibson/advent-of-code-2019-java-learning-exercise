package willgibson.adventofcode2019.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import willgibson.adventofcode2019.OutputData.DayData;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(
        @RequestParam(name = "day", required = false, defaultValue = "all") String day,
        Model model
    ) {
        String headingSuffix = "All Days";
        int startDay = 1;
        int endDay = 2;
        if (!day.equals("all")) {
            headingSuffix = "Day " + twoDigitDay(day);
            startDay = endDay = Integer.parseInt(day);
        }

        List<DayData> answers = new ArrayList<>();
        IntStream.range(startDay, endDay + 1).forEachOrdered(dayNumber -> {
            answers.add(new DayData(twoDigitDay(Integer.toString(dayNumber))).generate());
        });

        model.addAttribute("headingSuffix", headingSuffix);
        model.addAttribute("answers", answers);

        return "home";
    }

    private String twoDigitDay(String day) {
        return ("00" + day).substring(day.length());
    }
}
