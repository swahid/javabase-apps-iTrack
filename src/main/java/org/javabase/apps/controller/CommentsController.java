/**
 * 
 */
package org.javabase.apps.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.javabase.apps.entity.Comments;
import org.javabase.apps.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
@RequestMapping(value="issue")
public class CommentsController {
	
	@Autowired
	private CommentsService commentsservice;
	
	@ResponseBody
	@RequestMapping(value="{issueId}", method=RequestMethod.POST)
	private Map<String, Object> addComments(@RequestBody Comments entity){
		Map<String, Object> response= new HashMap<String, Object>();

		entity.setCommentsDate(new Date());
		if (commentsservice.insert(entity)) {
			
			response.put("Success", true);
			response.put("code", "200");
			response.put("data", entity);
			response.put("message", "insert sucessfull");
			return response;
		}else {
			response.put("Error", true);
			response.put("code", "400");
			response.put("message", "Comments Not Save");
			return response;
		}
	}
}
