/**
 * 
 */
package org.javabase.apps.mapper;

import java.util.List;

import org.javabase.apps.entity.Comments;

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
public interface CommentsMapper {
	
	public List<Comments> selectAll();
	public List<Comments> getCommnetsByIssueId(int IssueId);
	public boolean insert(Comments comments);

}
