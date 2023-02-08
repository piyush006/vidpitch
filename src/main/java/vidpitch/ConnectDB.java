package vidpitch;

import java.awt.Image;
import java.sql.*;

import javax.swing.ImageIcon;

public class ConnectDB {
	
	
	private static final String String = null;
	Connection con;
	static PreparedStatement pst;
	ResultSet rs;
	
	
	
	public static void main(String[] args) {
		
		
		try
		   {
		    
		    Connection con;
		    Class.forName("org.postgresql.Driver");
		    con = DriverManager.getConnection("jdbc:postgresql://111.118.241.68:32329/videoms", "videomsusr", "6f916c8e048160549759");   
		    pst=con.prepareStatement("select * from video_data");  
		    ResultSet rs = pst.executeQuery();
		    while(rs.next()) {
		    	
		    	int value = rs.getInt("id");
		    	
		    	
		    	System.out.println(value);
		    	
		    	
		    	
		    }
		    
		    
		  }
		catch(Exception e1)
		  {
		System.out.println(e1.toString());
		  }
		
	}
	
	
				

	//textField.setText("");
					
	}	
	   
