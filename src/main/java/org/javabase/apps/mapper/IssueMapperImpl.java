/**
 * 
 */
package org.javabase.apps.mapper;

import java.util.List;

import org.hibernate.SessionFactory;
import org.javabase.apps.entity.Issue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@SuppressWarnings("unchecked")
@Repository
public class IssueMapperImpl implements IssueMapper{

	@Autowired
	SessionFactory session;
	
	@Override
	@Transactional(readOnly=true)
	public List<Issue> getAllIssue() {
		
		List<Issue> issueList = session.getCurrentSession().createQuery("from Issue").list();
		return issueList;
	}

	@Override
	@Transactional
	public boolean insertIssue(Issue issue) {
		try {
			session.getCurrentSession().save(issue);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
