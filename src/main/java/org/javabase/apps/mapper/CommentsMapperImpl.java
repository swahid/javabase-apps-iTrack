/**
 * 
 */
package org.javabase.apps.mapper;

import java.util.List;

import org.hibernate.SessionFactory;
import org.javabase.apps.entity.Comments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@Repository
@SuppressWarnings("unchecked")
public class CommentsMapperImpl implements CommentsMapper{

	@Autowired
	SessionFactory session;
	
	@Override
	public List<Comments> selectAll() {
		List<Comments> list = session.getCurrentSession().createQuery("from Issue").list();
		return list;
	}

	@Override
	public boolean insert(Comments comments) {
		try {
			session.getCurrentSession().save(comments);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Comments> getCommnetsByIssueId(int IssueId) {
		return (List<Comments>) session.getCurrentSession().get(Comments.class, IssueId);
	}

}
