package com.pradnya.myApp.dao;

import com.pradnya.myApp.entity.MyAppRegDetails;

public interface DetailsDAO {
	public void save(MyAppRegDetails details);
	
	public MyAppRegDetails getByEmail(String email);

}
