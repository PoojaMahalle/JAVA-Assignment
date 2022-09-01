package javadatabaseconnectivity;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBConnectivity1 {
	
	static Connection conn;
	static Statement stmt;
	static ResultSet rs;//forward direction,read-only
	
	void displayStudentData()
	{
		try {
			Statement stmt= conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from student");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString("sname")+" "+rs.getInt(3)+" "+rs.getInt(4)+" "+rs.getInt("spid"));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	
	void displayDepartmentData()
	{
		try {
			Statement stmt= conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from department");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString("dname")+" "+rs.getInt(3)+" "+rs.getString("dhead"));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

	
	void displaySportdataData()
	{
		try {
			Statement stmt= conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from sportsdata");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString("sport_name")+" "+rs.getInt(3));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	

	void insertStudentData(int id,String n,int m,int d,int s)
	{
		try {
			Statement stmt=conn.createStatement();
			String query="insert into student values("+id+",'"+n+"',"+m+","+d+","+s+")";
			//int i=stmt.executeUpdate("insert into student values(23,'Gita',80,101,111)");
			//System.out.println(i);
			
			int i = stmt.executeUpdate(query);
			if(i!=0)
				System.out.println("record inserted");
			else
				System.out.println("Record not inserted...Please check your data");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void updateStudentData()
	{
		try {
			Statement stmt=conn.createStatement();
			int i=stmt.executeUpdate("Update student set smarks=90 where sid=1");
		    if(i!=0)
		    	System.out.println("record updated");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void deleteStudentData()
	{
		try {
			stmt=conn.createStatement();
			int i=stmt.executeUpdate("delete from student where sid=20");
			if(i!=0)
				System.out.println("record deleted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the id,name,marks,department_id,sports_id for the student");
//		int i=sc.nextInt();
//		String n=sc.next();
//		int m=sc.nextInt();
//		int d=sc.nextInt();
//		int s=sc.nextInt();

       conn=JDBConnection.getconnection1();
       JDBConnectivity1 jdbc = new JDBConnectivity1();
       //jdbc.insertStudentData(i,n,m,d,s);
       jdbc.displayStudentData();
       jdbc.displayDepartmentData();
       jdbc.displaySportdataData();
       jdbc.updateStudentData();
       jdbc.deleteStudentData();

	}

}
