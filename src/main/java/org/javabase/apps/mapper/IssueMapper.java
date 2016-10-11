/**
 * 
 */
package org.javabase.apps.mapper;

import java.util.List;

import org.javabase.apps.entity.Issue;

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
public interface IssueMapper {
	
	public List<Issue> getAllIssue();
	public Issue getIssueById(int id);
	public boolean insertIssue(Issue issue);
	

}
