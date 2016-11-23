package org.javabase.apps.entity;
// Generated Oct 6, 2016 10:25:57 PM by Hibernate Tools 4.3.1


import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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

	private Integer commentid;
	private Issue issue;
	private Integer userId;
	private String commentor;
	private String title;
	private String description;
	private Date commentdate;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "commentid", unique = true, nullable = false)
	public Integer getCommentid() {
		return this.commentid;
	}

	public void setCommentid(Integer commentid) {
		this.commentid = commentid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "issueid")
	public Issue getIssue() {
		return this.issue;
	}

	public void setIssue(Issue issue) {
		this.issue = issue;
	}

	@Column(name = "commentor", length = 45)
	public String getCommentor() {
		return this.commentor;
	}


	public void setCommentor(String commentor) {
		this.commentor = commentor;
	}
	
	@Column(name = "title", length = 45)
	public String getTitle() {
		return this.title;
	}

	@Column(name = "userid")
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "description")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCommentdate() {
		return commentdate;
	}

	public void setCommentdate(Date commentdate) {
		this.commentdate = commentdate;
	}

}


