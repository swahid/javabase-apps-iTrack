/**
 * 
 */
package org.javabase.apps.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name="role")
public class Role implements Serializable{

	private static final long serialVersionUID = 7406695508037970942L;

    private Integer roleid;
    private String rolename;
    private int userid;
    private String email;
    private Date expDate;
    private String firstName;
    private Boolean isactive;
    private Boolean isnonexpired;
    private Boolean isnonlocked;
    private String lastName;
    private String password;
    private String phone;
    private Date regdate;
    private String username;
	private Set<User> users = new HashSet<User>(0);

   public Role() {
   }

	
   public Role(String rolename, int userid) {
       this.rolename = rolename;
       this.userid = userid;
   }
   public Role(String rolename, int userid, String email, Date expDate, String firstName, Boolean isactive, Boolean isnonexpired, Boolean isnonlocked, String lastName, String password, String phone, Date regdate, String username, Set<User> users) {
      this.rolename = rolename;
      this.userid = userid;
      this.email = email;
      this.expDate = expDate;
      this.firstName = firstName;
      this.isactive = isactive;
      this.isnonexpired = isnonexpired;
      this.isnonlocked = isnonlocked;
      this.lastName = lastName;
      this.password = password;
      this.phone = phone;
      this.regdate = regdate;
      this.username = username;
      this.users = users;
   }
  
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   @Column(name="roleid", unique=true, nullable=false)
   public Integer getRoleid() {
       return this.roleid;
   }
   
   public void setRoleid(Integer roleid) {
       this.roleid = roleid;
   }

   @Column(name="rolename", nullable=false, length=45)
   public String getRolename() {
       return this.rolename;
   }
   
   public void setRolename(String rolename) {
       this.rolename = rolename;
   }

   
   @Column(name="userid", nullable=false)
   public int getUserid() {
       return this.userid;
   }
   
   public void setUserid(int userid) {
       this.userid = userid;
   }

   
   @Column(name="email")
   public String getEmail() {
       return this.email;
   }
   
   public void setEmail(String email) {
       this.email = email;
   }

   @Temporal(TemporalType.TIMESTAMP)
   @Column(name="expDate", length=19)
   public Date getExpDate() {
       return this.expDate;
   }
   
   public void setExpDate(Date expDate) {
       this.expDate = expDate;
   }

   
   @Column(name="firstName")
   public String getFirstName() {
       return this.firstName;
   }
   
   public void setFirstName(String firstName) {
       this.firstName = firstName;
   }

   
   @Column(name="isactive")
   public Boolean getIsactive() {
       return this.isactive;
   }
   
   public void setIsactive(Boolean isactive) {
       this.isactive = isactive;
   }

   
   @Column(name="isnonexpired")
   public Boolean getIsnonexpired() {
       return this.isnonexpired;
   }
   
   public void setIsnonexpired(Boolean isnonexpired) {
       this.isnonexpired = isnonexpired;
   }

   
   @Column(name="isnonlocked")
   public Boolean getIsnonlocked() {
       return this.isnonlocked;
   }
   
   public void setIsnonlocked(Boolean isnonlocked) {
       this.isnonlocked = isnonlocked;
   }

   
   @Column(name="lastName")
   public String getLastName() {
       return this.lastName;
   }
   
   public void setLastName(String lastName) {
       this.lastName = lastName;
   }

   
   @Column(name="password")
   public String getPassword() {
       return this.password;
   }
   
   public void setPassword(String password) {
       this.password = password;
   }

   
   @Column(name="phone")
   public String getPhone() {
       return this.phone;
   }
   
   public void setPhone(String phone) {
       this.phone = phone;
   }

   @Temporal(TemporalType.TIMESTAMP)
   @Column(name="regdate", length=19)
   public Date getRegdate() {
       return this.regdate;
   }
   
   public void setRegdate(Date regdate) {
       this.regdate = regdate;
   }

   
   @Column(name="username")
   public String getUsername() {
       return this.username;
   }
   
   public void setUsername(String username) {
       this.username = username;
   }

   @OneToMany(fetch=FetchType.LAZY, mappedBy="role")
   public Set<User> getUsers() {
       return this.users;
   }
   
   public void setUsers(Set<User> users) {
       this.users = users;
   }
	
}
