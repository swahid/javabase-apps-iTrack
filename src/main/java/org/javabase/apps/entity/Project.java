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
@Table(name="project",catalog="itrack")
public class Project implements Serializable {

	private static final long serialVersionUID = -8490140357995462757L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "projectid", unique = true, nullable = false)
	private Integer projectId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "teamid")
	private Team team;
	
	@Column(name = "proejcttitle", length = 45)
	private String proejctTitle;
	
	@Column(name = "projectdescription")
	private String projectDescription;
	
	@Column(name = "projectcreator", length = 45)
	private String projectCreator;
	
	@Column(name = "buildversion", length = 10)
	private String buildversion;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "project")
	private Set<Issue> issues = new HashSet<Issue>(0);
	
	@Column(name = "projectkey", length = 45)
	private String projectKey;
	
	@Column(name = "projectcategory", length = 45)
	private String projectCategory;
	
	@Column(name = "projectlead", length = 45)
	private String projectLead;
	
	@Column(name = "projectleadid")
	private Integer projectLeadId;
	
	@Column(name = "projecttype", length = 45)
	private String projectType;
	
	@Column(name = "projecturl", length = 45)
	private String projectUrl;
	
	@Column(name = "projectclosed", length = 10)
	private String projectClosed;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "startdate")
	private Date startDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "submitdate")
	private Date submitDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "closedate")
	private Date closeDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "expecteddate")
	private Date expectedDate;

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public String getProejctTitle() {
		return proejctTitle;
	}

	public void setProejctTitle(String proejctTitle) {
		this.proejctTitle = proejctTitle;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	public String getProjectCreator() {
		return projectCreator;
	}

	public void setProjectCreator(String projectCreator) {
		this.projectCreator = projectCreator;
	}

	public String getBuildversion() {
		return buildversion;
	}

	public void setBuildversion(String buildversion) {
		this.buildversion = buildversion;
	}

	public Set<Issue> getIssues() {
		return issues;
	}

	public void setIssues(Set<Issue> issues) {
		this.issues = issues;
	}

	public String getProjectKey() {
		return projectKey;
	}

	public void setProjectKey(String projectKey) {
		this.projectKey = projectKey;
	}

	public String getProjectCategory() {
		return projectCategory;
	}

	public void setProjectCategory(String projectCategory) {
		this.projectCategory = projectCategory;
	}

	public String getProjectLead() {
		return projectLead;
	}

	public void setProjectLead(String projectLead) {
		this.projectLead = projectLead;
	}

	public Integer getProjectLeadId() {
		return projectLeadId;
	}

	public void setProjectLeadId(Integer projectLeadId) {
		this.projectLeadId = projectLeadId;
	}

	public String getProjectType() {
		return projectType;
	}

	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}

	public String getProjectUrl() {
		return projectUrl;
	}

	public void setProjectUrl(String projectUrl) {
		this.projectUrl = projectUrl;
	}

	public String getProjectClosed() {
		return projectClosed;
	}

	public void setProjectClosed(String projectClosed) {
		this.projectClosed = projectClosed;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getSubmitDate() {
		return submitDate;
	}

	public void setSubmitDate(Date submitDate) {
		this.submitDate = submitDate;
	}

	public Date getCloseDate() {
		return closeDate;
	}

	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}

	public Date getExpectedDate() {
		return expectedDate;
	}

	public void setExpectedDate(Date expectedDate) {
		this.expectedDate = expectedDate;
	}

}


