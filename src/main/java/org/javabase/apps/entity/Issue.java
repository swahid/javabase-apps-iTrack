package org.javabase.apps.entity;
// Generated Oct 6, 2016 10:25:57 PM by Hibernate Tools 4.3.1


import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@Entity
@Table(name="issue",catalog="itrack")
public class Issue implements Serializable {

	private static final long serialVersionUID = 6277598856708113400L;

	private Integer issueid;
	private Project project;
	private String issuetitle;
	private String issueDescription;
	private String priority;
	private String type;
	private String state;
	private String assignee;
	private Date createdate;
	private String createby;
	private Date fixeddate;
	private String fixedby;
	private String tester;
	private Date testDate;
	private String verifiedby;
	private Date verifiedDate;
	private String istested;
	private String isverified;
	private String ispending;
	private String issubmit;
	private Date submitDate;
	private String submitby;
	private String isfixed;
	private Date submissionDate;
	private String isclosed;
	private String isexpried;
	private Set<Comments> commentses = new HashSet<Comments>(0);

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "issueid", unique = true, nullable = false)
	public Integer getIssueid() {
		return this.issueid;
	}

	public void setIssueid(Integer issueid) {
		this.issueid = issueid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "projectid")
	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	@Column(name = "issuetitle", length = 45)
	public String getIssuetitle() {
		return issuetitle;
	}

	public void setIssuetitle(String issuetitle) {
		this.issuetitle = issuetitle;
	}

	@Column(name = "issueDescription")
	public String getIssueDescription() {
		return issueDescription;
	}

	public void setIssueDescription(String issueDescription) {
		this.issueDescription = issueDescription;
	}

	@Column(name = "priority", length = 45)
	public String getPriority() {
		return this.priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	@Column(name = "type", length = 45)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "state", length = 45)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "assignee", length = 45)
	public String getAssignee() {
		return this.assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createdate", length = 19)
	public Date getCreatedate() {
		return this.createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	@Column(name = "createby", length = 45)
	public String getCreateby() {
		return this.createby;
	}

	public void setCreateby(String createby) {
		this.createby = createby;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fixeddate", length = 19)
	public Date getFixeddate() {
		return this.fixeddate;
	}

	public void setFixeddate(Date fixeddate) {
		this.fixeddate = fixeddate;
	}

	@Column(name = "fixedby", length = 45)
	public String getFixedby() {
		return this.fixedby;
	}

	public void setFixedby(String fixedby) {
		this.fixedby = fixedby;
	}

	@Column(name = "tester", length = 45)
	public String getTester() {
		return this.tester;
	}

	public void setTester(String tester) {
		this.tester = tester;
	}

	@Column(name = "verifiedby", length = 45)
	public String getVerifiedby() {
		return this.verifiedby;
	}

	public void setVerifiedby(String verifiedby) {
		this.verifiedby = verifiedby;
	}

	@Column(name = "istested", length = 1)
	public String getIstested() {
		return this.istested;
	}

	public void setIstested(String istested) {
		this.istested = istested;
	}

	@Column(name = "isverified", length = 1)
	public String getIsverified() {
		return this.isverified;
	}

	public void setIsverified(String isverified) {
		this.isverified = isverified;
	}

	@Column(name = "ispending", length = 1)
	public String getIspending() {
		return this.ispending;
	}

	public void setIspending(String ispending) {
		this.ispending = ispending;
	}

	@Column(name = "issubmit", length = 1)
	public String getIssubmit() {
		return this.issubmit;
	}

	public void setIssubmit(String issubmit) {
		this.issubmit = issubmit;
	}

	@Column(name = "submitby", length = 45)
	public String getSubmitby() {
		return this.submitby;
	}

	public void setSubmitby(String submitby) {
		this.submitby = submitby;
	}

	@Column(name = "isfixed", length = 1)
	public String getIsfixed() {
		return this.isfixed;
	}

	public void setIsfixed(String isfixed) {
		this.isfixed = isfixed;
	}

	@Column(name = "isclosed", length = 1)
	public String getIsclosed() {
		return this.isclosed;
	}

	public void setIsclosed(String isclosed) {
		this.isclosed = isclosed;
	}

	@Column(name = "isexpried", length = 1)
	public String getIsexpried() {
		return this.isexpried;
	}

	public void setIsexpried(String isexpried) {
		this.isexpried = isexpried;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "issue")
	public Set<Comments> getCommentses() {
		return this.commentses;
	}

	public void setCommentses(Set<Comments> commentses) {
		this.commentses = commentses;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "testdate", length = 19)
	public Date getTestDate() {
		return testDate;
	}

	public void setTestDate(Date testDate) {
		this.testDate = testDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "verifieddate")
	public Date getVerifiedDate() {
		return verifiedDate;
	}

	public void setVerifiedDate(Date verifiedDate) {
		this.verifiedDate = verifiedDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "submitdate")
	public Date getSubmitDate() {
		return submitDate;
	}

	public void setSubmitDate(Date submitDate) {
		this.submitDate = submitDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "submissiondate")
	public Date getSubmissionDate() {
		return submissionDate;
	}

	public void setSubmissionDate(Date submissionDate) {
		this.submissionDate = submissionDate;
	}

}


