package org.javabase.apps.entity;
// Generated Oct 6, 2016 10:25:57 PM by Hibernate Tools 4.3.1


import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@Entity
@Table(name="comments",catalog="itrack")
public class Comments implements Serializable {

	private static final long serialVersionUID = 7178622376109062175L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "commentsid", unique = true, nullable = false)
	private Integer commentsId;
	
	@Column(name = "commentsTitle", length = 45)
	private String commentsTitle;
	
	@Column(name = "commentsDescription", length = 500)
	private String commentsDescription;
	
	@Column(name = "commentsUser", length = 45)
	private String commentsUser;
	
	@Column(name = "issueId", length = 20)
	private String issueId;
	
	@Column(name = "userId", length = 20)
	private String userId;
	
	@Column(name = "commentsDate")
	private Date commentsDate;

	public Integer getCommentsId() {
		return commentsId;
	}

	public void setCommentsId(Integer commentsId) {
		this.commentsId = commentsId;
	}

	public String getCommentsTitle() {
		return commentsTitle;
	}

	public void setCommentsTitle(String commentsTitle) {
		this.commentsTitle = commentsTitle;
	}

	public String getCommentsDescription() {
		return commentsDescription;
	}

	public void setCommentsDescription(String commentsDescription) {
		this.commentsDescription = commentsDescription;
	}

	public String getCommentsUser() {
		return commentsUser;
	}

	public void setCommentsUser(String commentsUser) {
		this.commentsUser = commentsUser;
	}

	public String getIssueId() {
		return issueId;
	}

	public void setIssueId(String issueId) {
		this.issueId = issueId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Date getCommentsDate() {
		return commentsDate;
	}

	public void setCommentsDate(Date commentsDate) {
		this.commentsDate = commentsDate;
	}

}


