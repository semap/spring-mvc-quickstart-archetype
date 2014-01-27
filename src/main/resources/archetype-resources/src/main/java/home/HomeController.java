package ${package}.home;

import java.security.Principal;

import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import ${package}.log.Log;


@Controller
public class HomeController {
	
	@Log
	private Logger log;

	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Principal principal) {
		log.debug("homeController");
		return principal != null ? "home/homeSignedIn" : "home/homeNotSignedIn";
	}
}
