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
@Table(name="team",catalog="itrack")
public class Team  implements java.io.Serializable {

	private static final long serialVersionUID = -122946710453087335L;
	
	private Integer teamid;
    private String teamname;
    private String teamstatus;
    private String teamleader;
    private String teamcoleader;
    private String teamcreator;
    private Date createdate;
    private Integer maxsize;
    private Integer minsize;
    private Set<Project> projects = new HashSet<Project>(0);
    private Set<Teammember> teammembers = new HashSet<Teammember>(0);

    public Team() {
    }

    public Team(String teamname, String teamstatus, String teamleader, String teamcoleader, String teamcreator, Date createdate, Integer maxsize, Integer minsize, Set<Project> projects, Set<Teammember> teammembers) {
       this.teamname = teamname;
       this.teamstatus = teamstatus;
       this.teamleader = teamleader;
       this.teamcoleader = teamcoleader;
       this.teamcreator = teamcreator;
       this.createdate = createdate;
       this.maxsize = maxsize;
       this.minsize = minsize;
       this.projects = projects;
       this.teammembers = teammembers;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="teamid", unique=true, nullable=false)
    public Integer getTeamid() {
        return this.teamid;
    }
    
    public void setTeamid(Integer teamid) {
        this.teamid = teamid;
    }

    
    @Column(name="teamname", length=45)
    public String getTeamname() {
        return this.teamname;
    }
    
    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    
    @Column(name="teamstatus", length=45)
    public String getTeamstatus() {
        return this.teamstatus;
    }
    
    public void setTeamstatus(String teamstatus) {
        this.teamstatus = teamstatus;
    }

    
    @Column(name="teamleader", length=45)
    public String getTeamleader() {
        return this.teamleader;
    }
    
    public void setTeamleader(String teamleader) {
        this.teamleader = teamleader;
    }

    
    @Column(name="teamcoleader", length=45)
    public String getTeamcoleader() {
        return this.teamcoleader;
    }
    
    public void setTeamcoleader(String teamcoleader) {
        this.teamcoleader = teamcoleader;
    }

    
    @Column(name="teamcreator", length=45)
    public String getTeamcreator() {
        return this.teamcreator;
    }
    
    public void setTeamcreator(String teamcreator) {
        this.teamcreator = teamcreator;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="createdate", length=19)
    public Date getCreatedate() {
        return this.createdate;
    }
    
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    
    @Column(name="maxsize")
    public Integer getMaxsize() {
        return this.maxsize;
    }
    
    public void setMaxsize(Integer maxsize) {
        this.maxsize = maxsize;
    }

    
    @Column(name="minsize")
    public Integer getMinsize() {
        return this.minsize;
    }
    
    public void setMinsize(Integer minsize) {
        this.minsize = minsize;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="team")
    public Set<Project> getProjects() {
        return this.projects;
    }
    
    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="team")
    public Set<Teammember> getTeammembers() {
        return this.teammembers;
    }
    
    public void setTeammembers(Set<Teammember> teammembers) {
        this.teammembers = teammembers;
    }




}


