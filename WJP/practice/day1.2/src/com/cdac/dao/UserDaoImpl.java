package com.cdac.dao;
import java.sql.*;
import com.cdac.pojos.User;
import static com.cdac.utils.DBUtils.*;

public class UserDaoImpl implements UserDao, AutoCloseable {
	//dependency -DB connection - DBUtils
	private Connection connection;
	private PreparedStatement pst1;
	private PreparedStatement pst2; // for registration
	private PreparedStatement pst3; // for password update
	private PreparedStatement pst4; // for delete
	
	//def constructor - will be invoked by layer above - Tester (dynamic web comp)
	public UserDaoImpl()throws SQLException {
		// establish db cn
		openConnection();
		connection = getConnection();
		//create PreparedStatement
		String sql1 = "select * from users where email=? and password=?";
		pst1=connection.prepareStatement(sql1);
		
		String sql2 = "insert into users (first_name, last_name, email, password, dob, status, role) values(?,?,?,?,?,?,?)";
		pst2=connection.prepareStatement(sql2);
		
		String sql3 = "update users set password=? where email=? and password=?";
		pst3 = connection.prepareStatement(sql3);
		
		String sql4 = "delete from users where id=?";
		pst4 = connection.prepareStatement(sql4);
		
		System.out.println("user dao create!");
	} 
	
	@Override
	public User signIn(String email, String pwd) throws SQLException{
		//1.set IN params
		pst1.setString(1, email);
		pst1.setString(2, pwd);
		//2. execute query and process RST
		try(ResultSet rst=pst1.executeQuery()){
			if(rst.next()) {
				return new User(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getDate(6),rst.getBoolean(7),rst.getString(8));
			}
			return null;
		}
	}
	
	
	@Override
	public String registerUser(User user) throws SQLException {
		// TODO Auto-generated method stub
		pst2.setString(1, user.getFirstName());
		pst2.setString(2, user.getLastName());
		pst2.setString(3, user.getEmail());
		pst2.setString(4, user.getPassword());
		pst2.setDate(5, user.getDob());
		pst2.setBoolean(6, user.isStatus());
		pst2.setString(7, user.getUserRole());
		
		int rows = pst2.executeUpdate();
		return rows == 1 ? "Registration sucessful" : "Registeration failed"; 
	}
	
	@Override
	public String changePassword(String email, String oldPwd, String newPwd) throws SQLException {
	    pst3.setString(1, newPwd);
	    pst3.setString(2, email);
	    pst3.setString(3, oldPwd);
	    
	    int rows = pst3.executeUpdate();
	    return rows == 1 ? "Password changed successfully" : "Invalid credentials. Password change failed.";
	}
	
	@Override
	public String deleteUser(int userId) throws SQLException {
	    pst4.setInt(1, userId);
	    int rows = pst4.executeUpdate();
	    return rows == 1 ? "User deleted successfully" : "User not found or delete failed.";
	}

	//clean up -close db respurces(PST, DB cn)
	public void close() throws SQLException{
		if(pst1!=null) {
			pst1.close();
			pst1=null;
		}
		closeConnection();
	}
}
