/**
 * 
 */
package org.javabase.apps.service;

import java.util.List;

import org.javabase.apps.entity.Comments;
import org.javabase.apps.mapper.CommentsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@Service
public class CommentsServiceImpl implements CommentsService{
	
	@Autowired
	CommentsMapper commentsmapper;

	@Override
	@Transactional(readOnly=true)
	public List<Comments> selectAll() {
		return commentsmapper.selectAll();
	}

	@Override
	@Transactional
	public boolean insert(Comments comments) {
		return commentsmapper.insert(comments);
	}

	@Override
	@Transactional(readOnly=true)
	public List<Comments> getCommnetsByIssueId(int IssueId) {
		return commentsmapper.getCommnetsByIssueId(IssueId);
	}

}
