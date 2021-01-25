package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarsController {

    @Autowired
    CarService carService;

    @GetMapping("/cars")
    public String getCar(@RequestParam(name = "count", required = false) String count,
                         Model model) {
        int tmp = (count != null) ? Integer.parseInt(count) : 5;
        List<Car> cars = carService.getCars(tmp);
        model.addAttribute("cars", cars);

        return "cars";
    }
}
