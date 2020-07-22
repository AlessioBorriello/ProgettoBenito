import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrameSelezioneTipoQuery extends JFrame {

	private JPanel contentPane;
	private Controller controller;
	private luogo tipoLuogo;

	public FrameSelezioneTipoQuery(Controller controller) {
		
		this.controller = controller;
		tipoLuogo = controller.tipoLuogo;
		
		setTitle("Analisi COVID-19 " + tipoLuogo);
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(controller.posizioneFinestra.x, controller.posizioneFinestra.y, 600, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnSingolo = new JButton("");
		btnSingolo.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
			
				System.out.println("Tipo query 'Singolo' selezionato su luogo " + tipoLuogo);
				controller.posizioneFinestra = getLocation();
				
				controller.tipoQuerySingoloSelezionato();
			
				setVisible(false);
				dispose();
			
			}
		});
		
		JButton btnConfronto = new JButton("");
		btnConfronto.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
			
				System.out.println("Tipo query 'Confronto' selezionato su luogo " + tipoLuogo);
				controller.posizioneFinestra = getLocation();
				
				controller.tipoQueryConfrontoSelezionato();
			
				setVisible(false);
				dispose();
			
			}
		});
		
		JButton btnConfrontoData = new JButton("");
		btnConfrontoData.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
			
				System.out.println("Tipo query 'Confronto Data' selezionato su luogo " + tipoLuogo);
				controller.posizioneFinestra = getLocation();
				
				controller.tipoQueryConfrontoDataSelezionato();
			
				setVisible(false);
				dispose();
			
			}
		});
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnSingolo, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
					.addGap(56)
					.addComponent(btnConfronto, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
					.addComponent(btnConfrontoData, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(72)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnConfronto, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnConfrontoData, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSingolo, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(83, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
