package com.lab.app.serviceI;

import java.util.List;



import com.lab.app.model.User;

public interface UserServiceI {

	User saveUserData(User l);

	List<User> getUserAllData();

	void deleteUserData(Integer userId);

	User updateUserData(Integer userId,User u);

	

}
