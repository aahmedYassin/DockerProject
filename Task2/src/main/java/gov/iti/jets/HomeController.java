package gov.iti.jets;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

	@GetMapping(path="/home")
    public String welcomeMessage() {
     
        return "welcome ahmed yassin";
    }



}