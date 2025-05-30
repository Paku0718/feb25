package com.cdac.dao;
import com.cdac.pojos.User;
import java.sql.*;

public interface UserDao {
//sign in
	// .......signIn(email, password)throws SE
	 User signIn(String eamil, String pwd) throws SQLException;

//add new user
	 String registerUser(User user) throws SQLException;

//update user
	 String changePassword(String email, String oldPwd, String newPwd) throws SQLException;
	 
//delete user
	 String deleteUser(int userId) throws SQLException;
}

