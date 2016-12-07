/**
 * 
 */
package org.javabase.apps.controller.issue;

import javax.servlet.http.HttpSession;

import org.javabase.apps.entity.Issue;
import org.javabase.apps.service.IssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@Controller
@RequestMapping(value="issue")
public class IssueViewerController {
	
	@Autowired
	private IssueService issueservice;

	@RequestMapping(value="{issueId}", method=RequestMethod.GET)
	public String loadIssue(@PathVariable Integer issueId, HttpSession session){
		Issue issue = issueservice.getIssueById(issueId);
		
		session.setAttribute("issue", issue);
	return "issue/issueViewer";
	}
}
