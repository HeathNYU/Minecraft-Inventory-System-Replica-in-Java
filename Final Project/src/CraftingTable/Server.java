package CraftingTable;

import java.io.*;
import java.net.*;
import java.util.Date;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Server extends JFrame implements Runnable {
	
	// Text area for displaying contents
	private JTextArea ta;
	
	// Number a client
	private int clientNo = 0;
	
	public Server() {
		
		ta = new JTextArea(10,10);
		JScrollPane sp = new JScrollPane(ta);
		this.add(sp);
		this.setTitle("Server for Heath's Minecraft Crafting Table");
		this.setSize(640,480);
		this.setLocationRelativeTo(null);
		Thread t = new Thread(this);
		t.start();
		
	}

	public void run() {
		try {
	      // Create a server socket
	      ServerSocket serverSocket = new ServerSocket(8000);
	      ta.append("Server started at " 
	        + new Date() + '\n');
	  
	      while (true) {
	        // Listen for a new connection request
	        Socket socket = serverSocket.accept();
	  
	        // Increment clientNo
	        clientNo++;
	        
	        ta.append("Starting thread for client " + clientNo +
	            " at " + new Date() + '\n');

	          // Find the client's host name, and IP address
	          InetAddress inetAddress = socket.getInetAddress();
	          ta.append("Client " + clientNo + "'s host name is "
	            + inetAddress.getHostName() + "\n");
	          ta.append("Client " + clientNo + "'s IP Address is "
	            + inetAddress.getHostAddress() + "\n");
	        
	        // Create and start a new thread for the connection
	        new Thread(new HandleAClient(socket, clientNo)).start();
	      }
	    }
	    catch(IOException ex) {
	      System.err.println(ex);
	    }
		  
	}
	
	// Define the thread class for handling new connection
	class HandleAClient implements Runnable {
	  private Socket socket; // A connected socket
	  private int clientNum;
	  
	  /** Construct a thread */
	  public HandleAClient(Socket socket, int clientNum) {
	    this.socket = socket;
	    this.clientNum = clientNum;
	  }

	  /** Run a thread */
	  public void run() {
	    try {
	      // Create data input and output streams
	      DataInputStream inputFromClient = new DataInputStream(
	        socket.getInputStream());
	      DataOutputStream outputToClient = new DataOutputStream(
	        socket.getOutputStream());
	      
	      Connection con = DriverManager.getConnection
				    ("jdbc:sqlite:Inventories.db");
	      
	      ResultSet rs;
	      
	      int inventoryID = 1;
	      
	      // Receive Inventory ID from the client
        	inventoryID = inputFromClient.readInt();
        	
			
			String sql = "SELECT * FROM Inventories WHERE id = " + inventoryID;
			PreparedStatement statement = con.prepareStatement(sql);
			rs = statement.executeQuery();
			
			// Send data back to the client
			for (int i = 1; i < 37; i++) {
				outputToClient.writeInt(rs.getInt("Slot" + String.valueOf(i)));
			}
			
			ta.append("Inventory ID received from client " + this.clientNum + ": " +
					inventoryID + '\n');
			ta.append("Inventory Sent!" + '\n');
			
			statement.close();
			
			while (true) {
				
				for(int i = 0; i < 36; i++) {
	      		
					String sql2 = "UPDATE Inventories SET Slot" + String.valueOf(i + 1) + " = " + inputFromClient.readInt() + " WHERE id = " + inventoryID;
					Statement statement2 = con.createStatement();
					statement2.execute(sql2);
					
					statement2.close();
	      		
	      	}
				
			}
			
	    }
	    catch(IOException ex) {
	      ex.printStackTrace();
	    }
	    catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			}
	  }
	}
	
	/**
	 * The main method is only needed for the IDE with limited
	 * JavaFX support. Not needed for running from the command line.
	 */
	
	public static void createNewTable() {
	      // SQLite connection string
	      String url = "jdbc:sqlite:inventories.db";
	      
	      // SQL statement for creating a new table
	      String sql = "CREATE TABLE IF NOT EXISTS inventories (\n"
	              + "	id integer PRIMARY KEY,\n"
	              + "	slot1 integer,\n"
	              + "	slot2 integer,\n"
	              + "	slot3 integer,\n"
	              + "	slot4 integer,\n"
	              + "	slot5 integer,\n"
	              + "	slot6 integer,\n"
	              + "	slot7 integer,\n"
	              + "	slot8 integer,\n"
	              + "	slot9 integer,\n"
	              + "	slot10 integer,\n"
	              + "	slot11 integer,\n"
	              + "	slot12 integer,\n"
	              + "	slot13 integer,\n"
	              + "	slot14 integer,\n"
	              + "	slot15 integer,\n"
	              + "	slot16 integer,\n"
	              + "	slot17 integer,\n"
	              + "	slot18 integer,\n"
	              + "	slot19 integer,\n"
	              + "	slot20 integer,\n"
	              + "	slot21 integer,\n"
	              + "	slot22 integer,\n"
	              + "	slot23 integer,\n"
	              + "	slot24 integer,\n"
	              + "	slot25 integer,\n"
	              + "	slot26 integer,\n"
	              + "	slot27 integer,\n"
	              + "	slot28 integer,\n"
	              + "	slot29 integer,\n"
	              + "	slot30 integer,\n"
	              + "	slot31 integer,\n"
	              + "	slot32 integer,\n"
	              + "	slot33 integer,\n"
	              + "	slot34 integer,\n"
	              + "	slot35 integer,\n"
	              + "	slot36 integer\n"
	              + ");";
	      
	      // SQL statement for initializing a new inventory
	      String sql2 = "INSERT INTO inventories (\n"
	              + "	slot1,\n"
	              + "	slot2,\n"
	              + "	slot3,\n"
	              + "	slot4,\n"
	              + "	slot5,\n"
	              + "	slot6,\n"
	              + "	slot7,\n"
	              + "	slot8,\n"
	              + "	slot9,\n"
	              + "	slot10,\n"
	              + "	slot11,\n"
	              + "	slot12,\n"
	              + "	slot13,\n"
	              + "	slot14,\n"
	              + "	slot15,\n"
	              + "	slot16,\n"
	              + "	slot17,\n"
	              + "	slot18,\n"
	              + "	slot19,\n"
	              + "	slot20,\n"
	              + "	slot21,\n"
	              + "	slot22,\n"
	              + "	slot23,\n"
	              + "	slot24,\n"
	              + "	slot25,\n"
	              + "	slot26,\n"
	              + "	slot27,\n"
	              + "	slot28,\n"
	              + "	slot29,\n"
	              + "	slot30,\n"
	              + "	slot31,\n"
	              + "	slot32,\n"
	              + "	slot33,\n"
	              + "	slot34,\n"
	              + "	slot35,\n"
	              + "	slot36\n"
	              + ") VALUES (0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 9, 9, 10);";
	      
	      try (Connection conn = DriverManager.getConnection(url);
	              Statement stmt = conn.createStatement()) {
	          // create a new table
	          stmt.execute(sql);
	          // initialize a new inventory
	          //stmt.execute(sql2);
	      } catch (SQLException e) {
	          System.out.println(e.getMessage());
	      }
	  }
	
	public static void main(String[] args) {
		
		createNewTable();
		Server mts = new Server();
	  mts.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  mts.setVisible(true);
	  
	}
	
}
