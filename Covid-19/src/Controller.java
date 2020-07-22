import java.awt.EventQueue;
import java.awt.Point;

enum luogo{
	provincia,
	regione,
	paese,
	continente;
}

public class Controller {
	
	public luogo tipoLuogo = null;
	public Point posizioneFinestra;

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//Crea Main frame
					Controller controller = new Controller();
					FrameSelezioneTipoLuogo frameSelezioneTipoLuogo = new FrameSelezioneTipoLuogo(controller);
					frameSelezioneTipoLuogo.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
	
	public void tipoLuogoSelezionato() {
		
		FrameSelezioneTipoQuery frameSelezioneTipoQuery = new FrameSelezioneTipoQuery(this);
		frameSelezioneTipoQuery.setVisible(true);
		
	}
	
	public void tipoQuerySingoloSelezionato() {
		
		FrameTipoQuerySingolo frameTipoQuerySingolo = new FrameTipoQuerySingolo(this);
		frameTipoQuerySingolo.setVisible(true);
		
	}
	
	public void tipoQueryConfrontoSelezionato() {
		
		FrameTipoQueryConfronto frameTipoQueryConfronto = new FrameTipoQueryConfronto(this);
		frameTipoQueryConfronto.setVisible(true);
		
	}
	
	public void tipoQueryConfrontoDataSelezionato() {
		
		FrameTipoQueryConfrontoData frameTipoQueryConfrontoData = new FrameTipoQueryConfrontoData(this);
		frameTipoQueryConfrontoData.setVisible(true);
		
	}
	
}