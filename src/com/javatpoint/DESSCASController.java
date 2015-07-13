package com.javatpoint;

import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.servlet.ModelAndView;  
@Controller  

public class DESSCASController {
	 @RequestMapping("/dessCasRocks")  
	    public ModelAndView helloWorld() {  
	        String message = "TCS DESS CAS ROCKS!!!!";  
	        return new ModelAndView("dessCasRocks", "message", message);  
	    } 
}
