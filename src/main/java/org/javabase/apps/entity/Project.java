package org.javabase.apps.entity;
// Generated Oct 6, 2016 10:25:57 PM by Hibernate Tools 4.3.1


import static javax.persistence.GenerationType.IDENTITY;

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
public class Project  implements java.io.Serializable {

	 private static final long serialVersionUID = -8490140357995462757L;
	
	 private Integer projectid;
	 private Team team;
	 private String proejcttitle;
	 private String projectdescription;
	 private String projectcreator;
	 private Date startdate;
	 private Date submitdate;
	 private Date closedate;
	 private Date reviewdate;
	 private Date aprovaldate;
	 private Date testingdate;
	 private Integer buildversion;
	 private Set<Issue> issues = new HashSet<Issue>(0);

    public Project() {
    }

    public Project(Team team, String proejcttitle, String projectdescription, String projectcreator, Date startdate, Date submitdate, Date closedate, Date reviewdate, Date aprovaldate, Date testingdate, Integer buildversion, Set<Issue> issues) {
       this.team = team;
       this.proejcttitle = proejcttitle;
       this.projectdescription = projectdescription;
       this.projectcreator = projectcreator;
       this.startdate = startdate;
       this.submitdate = submitdate;
       this.closedate = closedate;
       this.reviewdate = reviewdate;
       this.aprovaldate = aprovaldate;
       this.testingdate = testingdate;
       this.buildversion = buildversion;
       this.issues = issues;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="projectid", unique=true, nullable=false)
    public Integer getProjectid() {
        return this.projectid;
    }
    
    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="teamid")
    public Team getTeam() {
        return this.team;
    }
    
    public void setTeam(Team team) {
        this.team = team;
    }

    
    @Column(name="proejcttitle", length=45)
    public String getProejcttitle() {
        return this.proejcttitle;
    }
    
    public void setProejcttitle(String proejcttitle) {
        this.proejcttitle = proejcttitle;
    }

    
    @Column(name="projectdescription")
    public String getProjectdescription() {
        return this.projectdescription;
    }
    
    public void setProjectdescription(String projectdescription) {
        this.projectdescription = projectdescription;
    }

    
    @Column(name="projectcreator", length=45)
    public String getProjectcreator() {
        return this.projectcreator;
    }
    
    public void setProjectcreator(String projectcreator) {
        this.projectcreator = projectcreator;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="startdate", length=19)
    public Date getStartdate() {
        return this.startdate;
    }
    
    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="submitdate", length=19)
    public Date getSubmitdate() {
        return this.submitdate;
    }
    
    public void setSubmitdate(Date submitdate) {
        this.submitdate = submitdate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="closedate", length=19)
    public Date getClosedate() {
        return this.closedate;
    }
    
    public void setClosedate(Date closedate) {
        this.closedate = closedate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="reviewdate", length=19)
    public Date getReviewdate() {
        return this.reviewdate;
    }
    
    public void setReviewdate(Date reviewdate) {
        this.reviewdate = reviewdate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="aprovaldate", length=19)
    public Date getAprovaldate() {
        return this.aprovaldate;
    }
    
    public void setAprovaldate(Date aprovaldate) {
        this.aprovaldate = aprovaldate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="testingdate", length=19)
    public Date getTestingdate() {
        return this.testingdate;
    }
    
    public void setTestingdate(Date testingdate) {
        this.testingdate = testingdate;
    }

    
    @Column(name="buildversion")
    public Integer getBuildversion() {
        return this.buildversion;
    }
    
    public void setBuildversion(Integer buildversion) {
        this.buildversion = buildversion;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="project")
    public Set<Issue> getIssues() {
        return this.issues;
    }
    
    public void setIssues(Set<Issue> issues) {
        this.issues = issues;
    }




}


