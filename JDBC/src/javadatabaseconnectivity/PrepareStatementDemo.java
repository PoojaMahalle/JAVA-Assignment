package javadatabaseconnectivity;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PrepareStatementDemo {
	
	static Connection conn;
	
	void showTables()
	{
		try {
			PreparedStatement pstmt = conn.prepareStatement("show tables");
			ResultSet rs= pstmt.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void displayData()
	{
		try {
			PreparedStatement pstmt = conn.prepareStatement("select * from student");
		    ResultSet rs = pstmt.executeQuery();
		    while(rs.next())
		    {
		    	//int id= rs.getInt(1);
		    	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4)+" "+rs.getInt(5));
		    }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void insertData(int id,String name,int marks,int deptid,int spid)
	{
		try {
			PreparedStatement pstmt= conn.prepareCall("Insert into student values(?,?,?,?,?)");
		    pstmt.setInt(1, id);
		    pstmt.setString(2, name);
		    pstmt.setInt(4, marks);
		    pstmt.setInt(5, deptid);
		    pstmt.setInt(5, spid);
		    
		    int i=pstmt.executeUpdate();
		    if(i!=0)
		    	System.out.println("record inserted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void updateStudentData(int marks,int id)
	{
		try {
			PreparedStatement pstmt= conn.prepareCall("Update student set smarks=? where sid=?");
			pstmt.setInt(1, marks);
			pstmt.setInt(2, id);
			
			int i=pstmt.executeUpdate();
		    if(i!=0)
		    	System.out.println("record updated");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void deleteStudentData(int id)
	{
		try {
			PreparedStatement pstmt= conn.prepareCall("Delete from student where sid=?");
			pstmt.setInt(1, id);
			
			int i=pstmt.executeUpdate();
		    if(i!=0)
		    	System.out.println("record deleted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void deleteStudentData1(int id)
	{
		try {
			PreparedStatement pstmt= conn.prepareCall("delete s from student s inner join department d on s.did=d.did where d.did=?");
			pstmt.setInt(1, id);
			
			int i=pstmt.executeUpdate();
		    if(i!=0)
		    	System.out.println("record deleted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the database name: ");
		String database = sc.next();
		
		conn=PrepareJdbcConnection.getconnection1(database);
		
		PrepareStatementDemo pse = new PrepareStatementDemo();
		//pse.displayData();
//		
//		System.out.println("Enter the student info(id,name,department_id,sport_id)");
//		int i=sc.nextInt();
//		String n=sc.next();
//		int m=sc.nextInt();
//		int d=sc.nextInt();
//		int s=sc.nextInt();
//		
//		pse.insertData(i, n, m, d, s);
//		
//		pse.showTables();
		
		//pse.updateStudentData(80, 1);
		//pse.deleteStudentData(2);
		
		pse.deleteStudentData1(101);
		

	}

}
