package com.cdac.tester;
import java.sql.*;
import static com.cdac.utils.DBUtils.*;

public class TestStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//open cn
			openConnection();
			Connection cn = getConnection();
			//create JDBC statement
			/*
			 * connection i/f method
			 * public Statement createStatement() throws SQLException
			 */
			Statement st = cn.createStatement();
			//execute the query n get ResultSet - selected rows and columns
			/*
			 * Method of Statement i/f
			 * public ResultSet executeQuery(String sql) throws SQLException
			 */
			try(ResultSet rst = st.executeQuery("select * from users")){
				//RST - cursor - before the 1st row
				/*
				 * ResultSet Methods
				 * public boolean next() throws SQLException
				 * 
				 */
				while(rst.next())
					System.out.printf("ID %d Name %s %s Email %s" +  " Pwd %s Dob %s Voting Status %b Role %s %n", rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getDate(6),rst.getBoolean(7),rst.getString(8));
			}//JVM - rst.close();
			closeConnection();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
