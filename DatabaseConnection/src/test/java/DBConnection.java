import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

	public static void main(String[] args) throws SQLException {
		Connection con= null;
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "deepak123");
			
	System.out.println("Connection Done");
			
		 Statement stm = con.createStatement();
			
			ResultSet rs = stm.executeQuery("select * from actor where actor_id= 5;");
			
			System.out.println(rs);
			
			while (rs.next()) {

				String userName=rs.getString("first_name");
				String lastName=rs.getString("last_name");	
				
				
				System.out.println(userName);
				System.out.println(lastName);
			}
			
		
			
		} 
		
		
		catch (ClassNotFoundException e) {
		
			e.printStackTrace();
			
			System.out.println("Not Done");
		}
		
		finally {
			con.close();
			System.out.println("Closed");
		}
		

	}

}
