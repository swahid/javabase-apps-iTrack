/**
 * 
 */
package org.javabase.apps.mapper;

import java.util.List;

import org.javabase.apps.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@Repository
public class UserMapperImpl implements UserMapper{

	@Override
	@Transactional(readOnly=true)
	public List<User> getAllUsers() {
		return null;
	}

	@Override
	@Transactional(readOnly=true)
	public User getUserById(int userId) {
		return null;
	}

	@Override
	@Transactional
	public boolean addUser(User user) {
		return false;
	}

	@Override
	@Transactional
	public void updateUser(User user) {
		
	}

	@Override
	@Transactional
	public void deleteUser(int userId) {
		
	}

	@Override
	@Transactional(readOnly=true)
	public boolean userExists(String username) {
		return false;
	}

}
