package org.javabase.apps.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.javabase.apps.entity.Issue;
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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@Controller
public class HomeController {
	
	private static final Logger log = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
    UserService userservice;
	
	@Autowired
	IssueService issueservice;
   
    @Autowired
    HttpSession response;
	
	@RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

    	if (principal instanceof UserDetails) {
    		String username = ((UserDetails) principal).getUsername();
    		User user = userservice.getUserByUsername(username);
    	    response.setAttribute("user", user);
    	}
		log.info("Welcome home! ");
		return "home";
	}
	
	@ResponseBody
	@RequestMapping(value = { "/issue/load"}, method = RequestMethod.GET)
	public Map<String, Object> loadIssue(){
		Map<String, Object> response= new HashMap<String, Object>();
		
		List<Issue> issue= issueservice.getAllIssue();
		
		response.put("Success", true);
		response.put("code", "200");
		response.put("data", issue);
		response.put("message", "insert sucessfull");
		return response;
		
	}
	@ResponseBody
	@RequestMapping(value = { "/issue/create"}, method = RequestMethod.POST)
	public Map<String, Object> createIssue(@RequestBody Issue issue){
		Map<String, Object> response= new HashMap<String, Object>();
		issue.setCreatedate(new Date());
		issue.setState("Active");
		if (issueservice.insertIssue(issue)) {
			return loadIssue();
		}else {
			response.put("error", true);
			response.put("code", "404");
			response.put("message", "insert unsucessfull");
			
			return response;
		}
		
	}
}
