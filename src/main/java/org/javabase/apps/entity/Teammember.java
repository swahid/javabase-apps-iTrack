package org.javabase.apps.entity;
// Generated Oct 6, 2016 10:25:57 PM by Hibernate Tools 4.3.1


import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@Entity
@Table(name="teammember",catalog="itrack")
public class Teammember  implements java.io.Serializable {

	 private static final long serialVersionUID = 3183866023474595412L;
	
	 private Integer teammemberid;
     private Team team;
     private Integer userid;
     private String teamrole;
     private String memberstatus;
     private String active;
     private Date joindate;
     private Date releasedate;
     private String performance;

    public Teammember() {
    }

    public Teammember(Team team, Integer userid, String teamrole, String memberstatus, String active, Date joindate, Date releasedate, String performance) {
       this.team = team;
       this.userid = userid;
       this.teamrole = teamrole;
       this.memberstatus = memberstatus;
       this.active = active;
       this.joindate = joindate;
       this.releasedate = releasedate;
       this.performance = performance;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="teammemberid", unique=true, nullable=false)
    public Integer getTeammemberid() {
        return this.teammemberid;
    }
    
    public void setTeammemberid(Integer teammemberid) {
        this.teammemberid = teammemberid;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="teamid")
    public Team getTeam() {
        return this.team;
    }
    
    public void setTeam(Team team) {
        this.team = team;
    }

    
    @Column(name="userid")
    public Integer getUserid() {
        return this.userid;
    }
    
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    
    @Column(name="teamrole", length=45)
    public String getTeamrole() {
        return this.teamrole;
    }
    
    public void setTeamrole(String teamrole) {
        this.teamrole = teamrole;
    }

    
    @Column(name="memberstatus", length=45)
    public String getMemberstatus() {
        return this.memberstatus;
    }
    
    public void setMemberstatus(String memberstatus) {
        this.memberstatus = memberstatus;
    }

    
    @Column(name="active", length=1)
    public String getActive() {
        return this.active;
    }
    
    public void setActive(String active) {
        this.active = active;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="joindate", length=19)
    public Date getJoindate() {
        return this.joindate;
    }
    
    public void setJoindate(Date joindate) {
        this.joindate = joindate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="releasedate", length=19)
    public Date getReleasedate() {
        return this.releasedate;
    }
    
    public void setReleasedate(Date releasedate) {
        this.releasedate = releasedate;
    }

    
    @Column(name="performance", length=45)
    public String getPerformance() {
        return this.performance;
    }
    
    public void setPerformance(String performance) {
        this.performance = performance;
    }




}


