package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	private CarService carService;

	@Autowired
	public HelloController(CarService carService) {
		this.carService = carService;
	}

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("I'm Spring MVC application");
		messages.add("5.2.0 version by sep'19 ");
		model.addAttribute("messages", messages);
		return "index";
	}

	@GetMapping(value = "/cars")
	public String printCar(ModelMap model,
						   @RequestParam(value = "count", required = false) Integer count) {
		if (count == null) {
			count = carService.getAllCars().size();
		}
		List<Car> cars = carService.getCars(count);
		model.addAttribute("cars", cars);
		return "cars";
	}
}