package com.lab.app.serviceImpl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lab.app.model.User;
import com.lab.app.repository.UserRepository;
import com.lab.app.serviceI.UserServiceI;
@Service
public class UserServiceImpl implements UserServiceI
{
	@Autowired
	UserRepository ur;

	@Override
	public User saveUserData(User l) {
		
		return ur.save(l);
	}

	@Override
	public List<User> getUserAllData() {
		List<User> li=ur.findAll();
		return li;
	}

	@Override
	public void deleteUserData(Integer userId) {
		ur.findById(userId);
		
	}

	@Override
	public User updateUserData(Integer userId,User u) {
		Optional<User> op = ur.findById(userId);
		if(op.isPresent())
		{
			User user=op.get();
			if(u.getUserName()!=null)
			{
				user.setUserName(u.getUserName());
			}
			if(u.getUserContact()!=null)
			{
				user.setUserContact(u.getUserContact());
			}
			if(u.getUserAddress()!=null)
			{
				user.setUserAddress(u.getUserAddress());
			}return ur.save(user);
		}else {
			return null;
		}
		
	}

	
	
	
	
}
