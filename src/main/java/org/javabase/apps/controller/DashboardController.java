package org.javabase.apps.controller;

import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.javabase.apps.entity.User;
import org.javabase.apps.service.IssueService;
import org.javabase.apps.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@Controller
@RequestMapping(value ="/dashboard")
public class DashboardController {
	
	private static final Logger log = LoggerFactory.getLogger(DashboardController.class);
	
	@Autowired
    UserService userservice;
	
	@Autowired
	IssueService issueservice;
   
    @Autowired
    HttpSession response;
	
	@RequestMapping(method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

    	if (principal instanceof UserDetails) {
    		String username = ((UserDetails) principal).getUsername();
    		User user = userservice.getUserByUsername(username);
    	    response.setAttribute("user", user);
    	}
		log.info("Welcome Dashboard! ");
		return "dashboard";
	}
	
}
