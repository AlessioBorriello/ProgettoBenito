import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.time.LocalDateTime;

public class Query {
	
	String URL = "jdbc:oracle:thin:BEN/333Benito375@localhost:1521:XE"; //URL del database
				//jdbc:oracle:thin:scott/tiger@myhost:1521:orcl
				//jdbc:oracle:<drivertype>:<user>/<password>@<database>
	String PASSWORD = "333Benito375";
	String UTENTE = "SYSTEM";
	
	private int attributo;
	
	public boolean queryEsempio() {
		
		System.out.println("FUNZIONA!");
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String q = "SELECT *"
					+ "FROM PROVINCE"; //Inizializzo query
			
			String connectionURL = URL; //URL di connessione
	
	        Connection con = DriverManager.getConnection(connectionURL);  //Crea connessione
	        System.out.println("FUNZIONA! 3");
			Statement st = con.createStatement(); //Creo statement
			st.executeUpdate(q); //Eseguo la query contenuta in stringa q
			System.out.println("FUNZIONA! 2");
			con.close(); //Chiudi connessione
			st.close(); //Chiudi statement
			return true; //Operazione riuscita
		
		}catch(Exception e) { //Error catching
			System.out.println(e);
			return false; //Operazione fallita
		}
		
		
	}
	
}