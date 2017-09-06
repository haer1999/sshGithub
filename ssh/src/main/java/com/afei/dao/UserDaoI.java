package com.afei.dao;

import java.io.Serializable;

import com.afei.model.User;

public interface UserDaoI {
	Serializable save(User user); 
}
