import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.time.LocalDateTime;

public class Query {
	
	String URL = "jdbc:mysql://localhost:3306/progetto?autoReconnect=true&useSSL=false"; //URL del database
	String PASSWORD = "password";
	String UTENTE = "root";
	
	private int attributo;
	
	public boolean queryEsempio() {
		
		try {
			
			String q = ""; //Inizializzo query
			
			String connectionURL = URL; //URL di connessione
	
	        Connection con = DriverManager.getConnection(connectionURL, UTENTE, PASSWORD);  //Crea connessione
			Statement st = con.createStatement(); //Creo statement
			st.executeUpdate(q); //Eseguo la query contenuta in stringa q
			
			con.close(); //Chiudi connessione
			st.close(); //Chiudi statement
			return true; //Operazione riuscita
		
		}catch(Exception e) { //Error catching
			return false; //Operazione fallita
		}
		
		
	}
	
}
