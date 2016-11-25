package org.javabase.apps.controller.projects;

import javax.servlet.http.HttpSession;

import org.javabase.apps.service.IssueService;
import org.javabase.apps.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@Controller
@RequestMapping(value = "/projects")
public class ProjectsController {
	
	private static final Logger log = LoggerFactory.getLogger(ProjectsController.class);
	
	@Autowired
    UserService userservice;
	
	@Autowired
	IssueService issueservice;
   
    @Autowired
    HttpSession response;
	
	@RequestMapping(method = RequestMethod.GET)
	public String home() {
		
		log.info("Welcome projects! ");
		return "projects/projects";
	}
	
}
