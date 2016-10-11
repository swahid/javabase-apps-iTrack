/**
 * 
 */
package org.javabase.apps.service;

import java.util.List;

import org.javabase.apps.entity.Issue;
import org.javabase.apps.mapper.IssueMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@Service
public class IssueServiceImpl implements IssueService{

	@Autowired
	IssueMapper mapper;
	
	@Override
	public List<Issue> getAllIssue() {
		return mapper.getAllIssue();
	}

	@Override
	public boolean insertIssue(Issue issue) {
		return mapper.insertIssue(issue);
	}

	@Override
	public Issue getIssueById(int id) {
		return mapper.getIssueById(id);
	}

}
