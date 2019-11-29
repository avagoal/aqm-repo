package Application.Controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

	@RequestMapping("/home")     
    public String home(){
		System.out.println("open page");
		return "Dashboard";
    }
	
	
	@GetMapping("/")
	public String home2() {

		return "home";
	}
}
