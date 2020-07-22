import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.time.LocalDateTime;

public class Query {
	
	String URL = "jdbc:oracle:thin:@192.168.1.101:444:BEN"; //URL del database
	String PASSWORD = "333Benito375";
	String UTENTE = "BEN";
	
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