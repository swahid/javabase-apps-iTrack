package org.javabase.apps.entity;
// Generated Oct 6, 2016 10:25:57 PM by Hibernate Tools 4.3.1


import static javax.persistence.GenerationType.IDENTITY;

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
public class Comments  implements java.io.Serializable {

	 private static final long serialVersionUID = 7178622376109062175L;
	
	 private Integer commentid;
     private Issue issue;
     private Integer userid;
     private String commentor;
     private String title;
     private String description;
     private String commentdate;

    public Comments() {
    }

    public Comments(Issue issue, Integer userid, String commentor, String title, String description, String commentdate) {
       this.issue = issue;
       this.userid = userid;
       this.commentor = commentor;
       this.title = title;
       this.description = description;
       this.commentdate = commentdate;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="commentid", unique=true, nullable=false)
    public Integer getCommentid() {
        return this.commentid;
    }
    
    public void setCommentid(Integer commentid) {
        this.commentid = commentid;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="issueid")
    public Issue getIssue() {
        return this.issue;
    }
    
    public void setIssue(Issue issue) {
        this.issue = issue;
    }

    
    @Column(name="userid")
    public Integer getUserid() {
        return this.userid;
    }
    
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    
    @Column(name="commentor", length=45)
    public String getCommentor() {
        return this.commentor;
    }
    
    public void setCommentor(String commentor) {
        this.commentor = commentor;
    }

    
    @Column(name="title", length=45)
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    
    @Column(name="description")
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    
    @Column(name="commentdate", length=45)
    public String getCommentdate() {
        return this.commentdate;
    }
    
    public void setCommentdate(String commentdate) {
        this.commentdate = commentdate;
    }




}


