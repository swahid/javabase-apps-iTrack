/**
 * 
 */
package org.javabase.apps.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@Entity
@Table(name="role")
public class Role implements Serializable{

	private static final long serialVersionUID = 7406695508037970942L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="roleid")
	private int roleId;
	
	@Column(name = "rolename")
	private String roleName;
	
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	
}
