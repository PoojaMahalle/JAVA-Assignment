package javadatabaseconnectivity;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class CallableStatementDemo {
	
	static Connection conn;
	
	void functionCall(int id) throws SQLException
	{
	   CallableStatement cstmt = conn.prepareCall("{?=call FunctionName(?)}");
	   cstmt.registerOutParameter(1, Types.VARCHAR);
	   cstmt.setInt(2, id);
	   cstmt.execute();
	   String s=cstmt.getNString(1);
	   System.out.println(s);
	}
	
	void procedureCall()
	{
//		try {
//			CallableStatement cstmt = conn.prepareCall("{call DeptEmpCount()}");
//		    ResultSet rs=cstmt.executeQuery();
//		    
//		    System.out.println("DeptID EmpCount");
//		    while(rs.next())
//		    {
//		    	System.out.println(rs.getInt(1)+" "+rs.getInt(2));
//		    }
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try {
			CallableStatement cstmt= conn.prepareCall("{call EmpNameSalary(?,?,?,?)}");
		    cstmt.registerOutParameter(2, Types.VARCHAR);
		    cstmt.registerOutParameter(3, Types.DECIMAL);
		    cstmt.registerOutParameter(4, Types.DATE);
		    cstmt.setInt(1, 100);
		    cstmt.execute();
		    String name = cstmt.getString(1);
		    double salary= cstmt.getDouble(2);
		    Date date= cstmt.getDate(3);
		    System.out.println(name+" "+salary+" "+date);
		    
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {


		conn=PrepareJdbcConnection.getconnection1("newcourse");
		
		CallableStatementDemo cs = new CallableStatementDemo();
//		Scanner sc= new Scanner(System.in);
//		System.out.println("enter the id of the employee: ");
//		int id=sc.nextInt();
		
		//cs.functionCall(id);
		cs.procedureCall();
		
		

	}

}
